package com.rr.trackexpense.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.rr.trackexpense.shared.model.LoginInfo;

public interface LoginServiceAsync {

	void login(String requestUri, AsyncCallback<LoginInfo> callback);

}
