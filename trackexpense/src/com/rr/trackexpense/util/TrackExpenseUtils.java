package com.rr.trackexpense.util;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import javax.mail.MessagingException;

import org.datanucleus.util.StringUtils;

import com.rr.trackexpense.TrackexpenseDAO;
import com.rr.trackexpense.model.Expense;

public class TrackExpenseUtils {
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
		// ~Expense - 100~
		if (sExpense != null && sExpense.contains("~")) {
			sExpense = sExpense.trim();
			try {
				sExpense = sExpense.substring(sExpense.indexOf("~") + 1,
						sExpense.lastIndexOf("~"));
				if (sExpense != null) {

					Date defaultTime = Calendar.getInstance().getTime();

					return new Expense(sExpense.substring(0,
							sExpense.lastIndexOf("-")).trim(), defaultTime,
							new BigDecimal(sExpense.substring(
									sExpense.lastIndexOf("-") + 1).trim()));
				}
			} catch (Exception e) {
				System.out.println("Could not parse: " + sExpense);
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
