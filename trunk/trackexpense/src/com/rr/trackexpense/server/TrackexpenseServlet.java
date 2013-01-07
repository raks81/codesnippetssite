package com.rr.trackexpense.server;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rr.trackexpense.server.util.TrackExpenseUtils;

@SuppressWarnings("serial")
public class TrackexpenseServlet extends HttpServlet {

	private static Logger log = Logger.getLogger(TrackexpenseServlet.class
			.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String expenses = req.getParameter("expenses");
		log.info("HTTP Request: " + expenses);
		TrackExpenseUtils.processExpenseAddRequest(expenses);
	}
}
