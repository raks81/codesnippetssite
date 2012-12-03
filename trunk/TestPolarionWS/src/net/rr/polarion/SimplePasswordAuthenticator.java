package net.rr.polarion;

import java.net.PasswordAuthentication;

public class SimplePasswordAuthenticator {

	private final PasswordAuthentication authentication;

	public SimplePasswordAuthenticator(String user, String password) {
		if (user == null || password == null) {
			authentication = null;
		} else {
			authentication = new PasswordAuthentication(user,
					password.toCharArray());
		}
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return authentication;
	}
}
