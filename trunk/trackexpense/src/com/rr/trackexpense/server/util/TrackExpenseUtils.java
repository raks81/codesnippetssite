package com.rr.trackexpense.server.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import org.datanucleus.util.StringUtils;

import com.rr.trackexpense.server.data.TrackexpenseDAO;
import com.rr.trackexpense.shared.model.Expense;

public class TrackExpenseUtils {
	private static Logger log = Logger.getLogger(TrackExpenseUtils.class
			.getName());

	public static List<Expense> convertToExpense(List<String> strExpenses) {
		List<Expense> expenses = new ArrayList<Expense>();
		for (String sExpense : strExpenses) {
			Expense expense;
			if ((expense = convertToExpense(sExpense)) != null) {
				expenses.add(expense);
			}
		}

		return expenses;
	}

	public static Expense convertToExpense(String sExpense) {
		// Should be in this format:
		// Spent on lunch - 200
		if (sExpense != null) {
			sExpense = sExpense.trim();
			try {
				// sExpense = sExpense.substring(sExpense.indexOf("~") + 1,
				// sExpense.lastIndexOf("~"));
				if (sExpense != null) {
					Date defaultTime = Calendar.getInstance().getTime();
					String spentOn = sExpense.substring(0,
							sExpense.indexOf("-")).trim();
					BigDecimal spentAmount = new BigDecimal(sExpense.substring(
							sExpense.indexOf("-") + 1).trim());
					return new Expense(spentOn, defaultTime, spentAmount);
				}
			} catch (Exception e) {
				log.severe("Could not parse: " + sExpense + "\n"
						+ e.getMessage());
			}
		}
		return null;

	}

	public static void processExpenseAddRequest(String expensesString) {
		List<String> sExpenses = new ArrayList<String>();
		if (!StringUtils.isEmpty(expensesString)) {
			StringTokenizer tokenizer = new StringTokenizer(expensesString,
					"\n");
			while (tokenizer.hasMoreTokens()) {
				sExpenses.add(tokenizer.nextToken());
			}
		}
		List<Expense> expenses = TrackExpenseUtils.convertToExpense(sExpenses);
		TrackexpenseDAO dao = new TrackexpenseDAO();
		dao.storeExpense(expenses);
	}
}
