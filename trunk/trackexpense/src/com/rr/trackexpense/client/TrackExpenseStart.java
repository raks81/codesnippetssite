package com.rr.trackexpense.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.rr.trackexpense.client.gui.TrackExpenseGUI;
import com.rr.trackexpense.client.service.TrackExpenseClientImpl;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TrackExpenseStart implements EntryPoint {

	private TrackExpenseClientImpl serviceImple;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		TrackExpenseClientImpl clientImpl = new TrackExpenseClientImpl(
				GWT.getModuleBaseURL() + "trackexpenseservice");
		RootPanel.get().add(clientImpl.getMaingui());
	}

}
