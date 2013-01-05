package com.rr.trackexpense;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyRange;
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
}
