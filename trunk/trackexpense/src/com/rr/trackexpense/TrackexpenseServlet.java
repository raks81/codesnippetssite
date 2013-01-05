package com.rr.trackexpense;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.rr.trackexpense.util.TrackExpenseUtils;

@SuppressWarnings("serial")
public class TrackexpenseServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String expenses = req.getParameter("expenses");
		TrackExpenseUtils.processExpenseAddRequest(expenses);
	}
}
