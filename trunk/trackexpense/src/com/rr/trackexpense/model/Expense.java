package com.rr.trackexpense.model;

import java.math.BigDecimal;
import java.util.Date;

public class Expense {
	private Date spentDate;
	private String spentOn;
	private BigDecimal amount;

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

}
