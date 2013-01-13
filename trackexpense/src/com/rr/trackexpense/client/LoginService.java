package com.rr.trackexpense.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.rr.trackexpense.shared.model.LoginInfo;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
  public LoginInfo login(String requestUri);
}