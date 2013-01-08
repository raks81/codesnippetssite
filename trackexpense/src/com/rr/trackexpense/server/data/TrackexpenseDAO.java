package com.rr.trackexpense.server.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.SortDirection;
import com.rr.trackexpense.shared.model.Expense;

public class TrackexpenseDAO {

	private static long ID = 1;

	private DatastoreService datastore = DatastoreServiceFactory
			.getDatastoreService();

	public void storeExpense(Expense expense) {
		Entity expenseEntity = new Entity("expense");
		expenseEntity.setProperty("amount", expense.getAmount().doubleValue());
		expenseEntity.setProperty("spentOn", expense.getSpentOn());
		expenseEntity.setProperty("spentDate", expense.getSpentDate());
		datastore.put(expenseEntity);
	}

	public void storeExpense(List<Expense> expenses) {
		if (expenses != null) {
			for (Expense expense : expenses) {
				storeExpense(expense);
			}
		}
	}

	public List<Expense> getExpenses() {
		List<Expense> expenses = new ArrayList<Expense>();
		Query query = new Query("expense");
		query.addSort("spentDate", SortDirection.ASCENDING);
		List<Entity> fetchedExpenses = datastore.prepare(query).asList(
				FetchOptions.Builder.withDefaults());

		if (fetchedExpenses != null) {
			for (Entity fetchedExpense : fetchedExpenses) {
				Expense expense = new Expense(
						(String) fetchedExpense.getProperty("spentOn"),
						(Date) fetchedExpense.getProperty("spentDate"),
						new BigDecimal(
								(Double) fetchedExpense.getProperty("amount")));
				expense.setExpenseId(fetchedExpense.getKey().getId());
				expenses.add(expense);

			}
		}
		return expenses;
	}

	public void deleteExpense(Expense expense) {
		Key key = KeyFactory.createKey("expense", expense.getExpenseId());
		try {
			Entity entity = datastore.get(key);
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		datastore.delete(key);
	}
}
