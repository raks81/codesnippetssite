package com.rr.trackexpense.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.rr.trackexpense.shared.model.Expense;

@RemoteServiceRelativePath("trackexpenseservice")
public interface TrackExpenseService extends RemoteService {
	List<Expense> getExpenses();
	void deleteExpense(Expense expense);
}
