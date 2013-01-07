package com.rr.trackexpense.client.service;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.rr.trackexpense.client.gui.TrackExpenseGUI;
import com.rr.trackexpense.shared.model.Expense;

public class TrackExpenseClientImpl implements ITrackExpenseClient {

	private TrackExpenseServiceAsync service;
	private TrackExpenseGUI maingui;

	public TrackExpenseClientImpl(String url) {
		System.out.println(url);
		this.service = GWT.create(TrackExpenseService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
		endpoint.setServiceEntryPoint(url);
		maingui = new TrackExpenseGUI(this);
	}

	@Override
	public void getExpenses() {
		this.service.getExpenses(new DefaultCallback());
	}

	public TrackExpenseGUI getMaingui() {
		return maingui;
	}

	private class DefaultCallback implements AsyncCallback {

		@Override
		public void onFailure(Throwable caught) {
			System.out.println("Error!!: " + caught.getMessage());

		}

		@Override
		public void onSuccess(Object result) {
			getMaingui().updateTable((List<Expense>) result);
		}
	}
}
