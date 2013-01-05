package com.rr.trackexpense.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.rr.trackexpense.model.Expense;
import com.rr.trackexpense.util.TrackExpenseUtils;

public class TestExpenseParser {

	@Test
	public void testSimpleExpense() {
		String expString = "Kadle kai - 10";
		Expense expense = TrackExpenseUtils.convertToExpense(expString);
		Assert.assertTrue(expense != null);
		Assert.assertTrue(expense.getSpentOn() != null);
		Assert.assertTrue(expense.getAmount() != null);
		Assert.assertTrue(expense.getSpentDate() != null);
		Assert.assertTrue(expense.getSpentOn().equals("Kadle kai"));
		// Assert.assertTrue(expense.getSpentDate().before(
		// Calendar.getInstance().getTime()));
		Assert.assertTrue(expense.getAmount().compareTo(new BigDecimal("10")) == 0);
	}

	@Test
	public void testDecimalAmount() {
		String expString = "Kadle kai - 10.34";
		Expense expense = TrackExpenseUtils.convertToExpense(expString);
		Assert.assertTrue(expense != null);
		Assert.assertTrue(expense.getSpentOn() != null);
		Assert.assertTrue(expense.getAmount() != null);
		Assert.assertTrue(expense.getSpentDate() != null);
		Assert.assertTrue(expense.getSpentOn().equals("Kadle kai"));
		// Assert.assertTrue(expense.getSpentDate().before(
		// Calendar.getInstance().getTime()));
		Assert.assertTrue(expense.getAmount()
				.compareTo(new BigDecimal("10.34")) == 0);
	}

	@Test
	public void testMissingSpace() {
		String expString = "Kadle kai- 10.34";
		Expense expense = TrackExpenseUtils.convertToExpense(expString);
		Assert.assertTrue(expense != null);
		Assert.assertTrue(expense.getSpentOn() != null);
		Assert.assertTrue(expense.getAmount() != null);
		Assert.assertTrue(expense.getSpentDate() != null);
		Assert.assertTrue(expense.getSpentOn().equals("Kadle kai"));
		// Assert.assertTrue(expense.getSpentDate().before(
		// Calendar.getInstance().getTime()));
		Assert.assertTrue(expense.getAmount()
				.compareTo(new BigDecimal("10.34")) == 0);
	}

	@Test
	public void testNoSpaceAmount() {
		String expString = "Kadlekai-10.34";
		Expense expense = TrackExpenseUtils.convertToExpense(expString);
		Assert.assertTrue(expense != null);
		Assert.assertTrue(expense.getSpentOn() != null);
		Assert.assertTrue(expense.getAmount() != null);
		Assert.assertTrue(expense.getSpentDate() != null);
		Assert.assertTrue(expense.getSpentOn().equals("Kadlekai"));
		// Assert.assertTrue(expense.getSpentDate().before(
		// Calendar.getInstance().getTime()));
		Assert.assertTrue(expense.getAmount()
				.compareTo(new BigDecimal("10.34")) == 0);
	}

	
	@Test
	public void testEmailBody() {
		String expString = "Kadlekai-10.34";
		Expense expense = TrackExpenseUtils.convertToExpense(expString);
		Assert.assertTrue(expense != null);
		Assert.assertTrue(expense.getSpentOn() != null);
		Assert.assertTrue(expense.getAmount() != null);
		Assert.assertTrue(expense.getSpentDate() != null);
		Assert.assertTrue(expense.getSpentOn().equals("Kadlekai"));
		// Assert.assertTrue(expense.getSpentDate().before(
		// Calendar.getInstance().getTime()));
		Assert.assertTrue(expense.getAmount()
				.compareTo(new BigDecimal("10.34")) == 0);
	}
	
	
	
}
