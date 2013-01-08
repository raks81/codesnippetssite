package com.rr.trackexpense.client.service;

import com.rr.trackexpense.shared.model.Expense;


public interface ITrackExpenseClient {
	void getExpenses();
	
	void deleteExpense(Expense expense);
}
