package com.rr.syncdocs;

import java.util.HashMap;
import java.util.Map;

import com.rr.syncdocs.util.Constants;
import com.rr.syncdocs.util.Utils;

public class GoogleOAuth2Provider implements IOAuth2Provider {

	@Override
	public String getAccessTokenGetUrl() {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("response_type", "code");
		parameters.put("client_id", Constants.CLIENT_ID);
		parameters.put("redirect_uri", Constants.OAUTH2_REDIRECT_URI);
		parameters.put("scope", Constants.CALENDAR_API + " "
				+ Constants.USER_EMAIL_API + " " + Constants.USER_PROFILE_API);
		parameters.put("state", "/profile");
		parameters.put("access_type", "offline");
		parameters.put("approval_prompt", "force");
		return Constants.GOOGLE_OAUTH2_ENDPOINT + "?"
				+ Utils.mapToQueryString(parameters);
	}

}
