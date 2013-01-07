package com.rr.trackexpense.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.rr.trackexpense.shared.model.Expense;

public interface TrackExpenseServiceAsync {
	void getExpenses(AsyncCallback<List<Expense>> callback);
}
