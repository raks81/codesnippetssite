package com.rr.syncdocs;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;
import com.google.gson.Gson;
import com.rr.model.AuthData;
import com.rr.model.User;
import com.rr.syncdocs.util.Constants;
import com.rr.syncdocs.util.HttpUtils;
import com.rr.syncdocs.util.HttpUtils.HttpRequestMethod;

public class GenericOAuth2ResponseProcessor extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Got reaponse:");

		// Get the response (authorization code)
		String authCode = req.getParameter("code");

		// Do a post request to get the access token and request token
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("code", authCode);
		parameters.put("client_id", Constants.CLIENT_ID);
		parameters.put("redirect_uri", Constants.OAUTH2_REDIRECT_URI);
		parameters.put("client_secret", Constants.CLIENT_SECRET);
		parameters.put("grant_type", "authorization_code");
		String response = HttpUtils.doHttpRequest(new URL(
				Constants.GOOGLE_OAUTH2_TOKEN_ENDPOINT), parameters,
				HttpRequestMethod.POST);
		System.out.println(response);

		// Once we have the response use gson to de-serialize the data
		Gson gson = new Gson();
		AuthData authData = gson.fromJson(response, AuthData.class);

		// Get the user info
		String userInfo = HttpUtils.doHttpRequest(new URL(
				Constants.GOOGLE_USERINFO_ENDPOINT + "?access_token="
						+ authData.getAccess_token()), null,
				HttpRequestMethod.GET);
		User user = gson.fromJson(userInfo, User.class);
		user.setAuthData(authData);
		System.out.println(userInfo);

		// Store the entity
		Key userId = KeyFactory.createKey("userId", user.getEmail());
		Entity userEntity = new Entity("User", userId);
		userEntity.setProperty("name", user.getName());
		userEntity.setProperty("refresh_token", user.getAuthData()
				.getRefresh_token());
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		datastore.put(userEntity);

		// Get the entity again

		Query query = new Query("User", KeyFactory.createKey("userId",
				user.getEmail()));
		List<Entity> fetchedUsers = datastore.prepare(query).asList(
				FetchOptions.Builder.withLimit(5));

		if (fetchedUsers != null) {
			for (Entity fetchedUser : fetchedUsers) {
				System.out.println(fetchedUser.getProperty("userId") + " "
						+ fetchedUser.getProperty("name"));
			}
		}

		// Send it to main page
		resp.sendRedirect("/syncdocs");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
