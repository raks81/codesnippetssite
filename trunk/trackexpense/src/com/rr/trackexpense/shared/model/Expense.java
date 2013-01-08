package com.rr.trackexpense.shared.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Transient;

public class Expense implements Serializable {
	private Date spentDate;
	private String spentOn;
	private BigDecimal amount;
	private Long expenseId;

	public Expense() {

	}

	public Expense(String spentOn, Date spentDate, BigDecimal amount) {
		this.spentOn = spentOn;
		this.spentDate = spentDate;
		this.amount = amount;
	}

	public Date getSpentDate() {
		return spentDate;
	}

	public void setSpentDate(Date spentDate) {
		this.spentDate = spentDate;
	}

	public String getSpentOn() {
		return spentOn;
	}

	public void setSpentOn(String spentOn) {
		this.spentOn = spentOn;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Transient
	public Long getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(Long expenseId) {
		this.expenseId = expenseId;
	}

}
