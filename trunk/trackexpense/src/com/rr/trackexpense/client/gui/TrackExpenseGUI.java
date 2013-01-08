package com.rr.trackexpense.client.gui;

import java.util.Date;
import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.CalendarUtil;
import com.rr.trackexpense.client.service.TrackExpenseClientImpl;
import com.rr.trackexpense.shared.model.Expense;

/**
 * @author raksrao
 * 
 */
public class TrackExpenseGUI extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private Grid grid = new Grid();
	private TrackExpenseClientImpl serviceImpl;
	private Label totalLbl = new Label();

	/**
	 * @param serviceImpl
	 */
	public TrackExpenseGUI(TrackExpenseClientImpl serviceImpl) {
		this.serviceImpl = serviceImpl;
		initWidget(vPanel);
		Button btn1 = new Button("Get Expenses");
		btn1.addClickHandler(new Btn1ClickHandler());
		vPanel.add(btn1);
	}

	private class Btn1ClickHandler implements ClickHandler {
		@Override
		public void onClick(ClickEvent event) {
			if (vPanel.getWidgetIndex(grid) != -1) {
				vPanel.remove(grid);
			}
			if (vPanel.getWidgetIndex(totalLbl) != -1) {
				vPanel.remove(totalLbl);
			}
			serviceImpl.getExpenses();
		}
	}

	public void updateTable(List<Expense> expenses) {
		if (expenses != null && expenses.size() > 0) {
			// Create a grid
			grid = new Grid(expenses.size(), 4);

			// Add images to the grid
			Double total = 0d;
			int numRows = grid.getRowCount();
			int row = 0;
			for (; row < numRows; row++) {
				total += expenses.get(row).getAmount().doubleValue();
				Date spentdate = expenses.get(row).getSpentDate();
				grid.setWidget(row, 0, new Label(DateTimeFormat
						.getShortDateFormat().format(spentdate)));
				if (CalendarUtil.getDaysBetween(new Date(), spentdate) == 0) {
					grid.getWidget(row, 0).setStyleName("bold");
				}
				grid.setWidget(row, 1,
						new Label(expenses.get(row).getSpentOn()));
				grid.setWidget(row, 2, new Label(expenses.get(row).getAmount()
						.toString()));
				Button deleteBtn = new Button("X");
				deleteBtn.addClickHandler(new DeleteExpenseClickHandler(
						expenses.get(row), row));
				grid.setWidget(row, 3, deleteBtn);
			}
			vPanel.add(grid);
			totalLbl = new Label("Total: " + total.toString());
			vPanel.add(totalLbl);
		}
	}

	private class DeleteExpenseClickHandler implements ClickHandler {
		private Expense expense;
		private int row;

		public DeleteExpenseClickHandler(Expense expense, int row) {
			this.expense = expense;
			this.row = row;
		}

		@Override
		public void onClick(ClickEvent event) {
			grid.removeRow(row);
			serviceImpl.deleteExpense(expense);
		}
	}
}
