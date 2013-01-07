package com.rr.trackexpense.server.service;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.rr.trackexpense.client.service.TrackExpenseService;
import com.rr.trackexpense.server.data.TrackexpenseDAO;
import com.rr.trackexpense.shared.model.Expense;

public class TrackExpenseImpl extends RemoteServiceServlet implements
		TrackExpenseService {

	@Override
	public List<Expense> getExpenses() {
		TrackexpenseDAO dao = new TrackexpenseDAO();
		return dao.getExpenses();
	}

}
