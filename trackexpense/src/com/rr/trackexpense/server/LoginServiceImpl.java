package com.rr.trackexpense.server;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.rr.trackexpense.client.LoginService;
import com.rr.trackexpense.shared.model.LoginInfo;

public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {

	public LoginInfo login(String requestUri) {
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();

		LoginInfo loginInfo = new LoginInfo();

		if (user != null
				&& ("rakzrao81@gmail.com".equalsIgnoreCase(user.getEmail()) || "divya27rao@gmail.com"
						.equalsIgnoreCase(user.getEmail()))) {
			loginInfo.setLoggedIn(true);
			loginInfo.setEmailAddress(user.getEmail());
			loginInfo.setNickname(user.getNickname());
			loginInfo.setLogoutUrl(userService.createLogoutURL(requestUri));
		} else {
			loginInfo.setLoggedIn(false);
			loginInfo.setLoginUrl(userService.createLoginURL(requestUri));
		}

		return loginInfo;
	}

}