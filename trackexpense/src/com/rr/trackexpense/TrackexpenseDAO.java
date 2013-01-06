package com.rr.trackexpense;

import java.util.ArrayList;
import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.KeyRange;
import com.google.appengine.api.datastore.Query;
import com.rr.trackexpense.model.Expense;

public class TrackexpenseDAO {
	public void storeExpense(Expense expense) {
		// Store the entity
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		KeyRange keys = datastore.allocateIds("expense", 1);
		Key expenseId = keys.iterator().next();
		Entity expenseEntity = new Entity("expense", expenseId);
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
		// Store the entity
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query query = new Query("expense");
		List<Entity> fetchedExpenses = datastore.prepare(query).asList(
				FetchOptions.Builder.withLimit(5));

		if (fetchedExpenses != null) {
			for (Entity fetchedExpense : fetchedExpenses) {
				expenses.add(new Expense(fetchedExpense.getProperty("spentOn"),
						fetchedExpense.getProperty("spentDate"), fetchedExpense
								.getProperty("amount")));
			}
		}
		return expenses;
	}
}
