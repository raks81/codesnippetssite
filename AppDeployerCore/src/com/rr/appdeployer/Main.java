/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rr.appdeployer;

import java.io.IOException;

/**
 * 
 * @author raks
 */
public class Main {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		if (args.length < 2) {
			showHelp();
			return;
		}

		Thread t = new Thread(new Worker(args[0], args[1]));
		t.start();
	}

	private static void showHelp() {
		System.out.println("Usage: java -jar AppDeployerCore.jar $BRANCH_NAME $APP_SERVER_PORT"); 
	}

}
