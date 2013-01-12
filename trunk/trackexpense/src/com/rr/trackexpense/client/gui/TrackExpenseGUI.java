package com.rr.trackexpense.client.gui;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.CalendarUtil;
import com.googlecode.gwtTableToExcel.client.TableToExcelClient;
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
	private ListBox monthSelector = new ListBox();
	private TableToExcelClient tableToExcelClient = new TableToExcelClient(grid);

	/**
	 * @param serviceImpl
	 */
	public TrackExpenseGUI(final TrackExpenseClientImpl serviceImpl) {
		this.serviceImpl = serviceImpl;
		initWidget(vPanel);
		Button btn1 = new Button("Get Expenses");
		btn1.addClickHandler(new Btn1ClickHandler());
		vPanel.add(monthSelector);
		// Add a handler to handle drop box events
		monthSelector.addChangeHandler(new ChangeHandler() {
			@Override
			public void onChange(ChangeEvent event) {
				repaintTable();
				serviceImpl.getExpenses();
			}
		});

		vPanel.add(grid);
		vPanel.add(totalLbl);
		vPanel.add(btn1);
		serviceImpl.getExpenses();
	}

	private void repaintTable() {
		if (vPanel.getWidgetIndex(grid) != -1) {
			vPanel.remove(grid);
		}
		if (vPanel.getWidgetIndex(totalLbl) != -1) {
			vPanel.remove(totalLbl);
		}
		if (grid != null) {
			if (tableToExcelClient != null
					&& tableToExcelClient.getExportWidget() != null
					&& vPanel.getWidgetIndex(tableToExcelClient
							.getExportWidget()) != -1) {
				vPanel.remove(tableToExcelClient.getExportWidget());
			}
		}
	}

	private class Btn1ClickHandler implements ClickHandler {
		@Override
		public void onClick(ClickEvent event) {
			repaintTable();
			serviceImpl.getExpenses();
		}
	}

	public void updateTable(List<Expense> expenses) {
		if (expenses != null && expenses.size() > 0) {

			Map<String, List<Expense>> groupedExpenses = getMonthlyGroupedExpenses(expenses);

			if (monthSelector.getItemCount() == 0) {
				for (String month : groupedExpenses.keySet()) {
					monthSelector.addItem(month);
				}
			}

			if (monthSelector.getSelectedIndex() >= 0) {
				List<Expense> monthlyExpense = groupedExpenses
						.get(monthSelector.getValue(monthSelector
								.getSelectedIndex()));
				if (monthlyExpense != null) {
					// Create a grid
					grid = new Grid(monthlyExpense.size(), 4);

					Double total = 0d;
					int numRows = monthlyExpense.size();
					int row = 0;
					for (; row < numRows; row++) {
						total += monthlyExpense.get(row).getAmount()
								.doubleValue();
						Date spentdate = monthlyExpense.get(row).getSpentDate();
						grid.setWidget(row, 0, new Label(DateTimeFormat
								.getShortDateFormat().format(spentdate)));
						if (CalendarUtil.getDaysBetween(new Date(), spentdate) == 0) {
							grid.getWidget(row, 0).setStyleName("bold");
						}
						grid.setWidget(row, 1, new Label(monthlyExpense
								.get(row).getSpentOn()));
						grid.setWidget(row, 2, new Label(monthlyExpense
								.get(row).getAmount().toString()));
						Button deleteBtn = new Button("X");
						deleteBtn
								.addClickHandler(new DeleteExpenseClickHandler(
										monthlyExpense.get(row), row));
						grid.setWidget(row, 3, deleteBtn);
					}
					vPanel.add(grid);
					tableToExcelClient = new TableToExcelClient(grid);
					vPanel.add(tableToExcelClient.getExportWidget());
					totalLbl = new Label("Total: " + total.toString());
					vPanel.add(totalLbl);
				}
			}
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

	private Map<String, List<Expense>> getMonthlyGroupedExpenses(
			List<Expense> allExpenses) {
		if (allExpenses == null)
			return null;
		Map<String, List<Expense>> grpdExpenses = new HashMap<String, List<Expense>>();
		for (Expense expense : allExpenses) {
			String month = DateTimeFormat.getFormat("MM-yyyy (MMM)").format(
					expense.getSpentDate());
			if (grpdExpenses.get(month) == null)
				grpdExpenses.put(month, new ArrayList<Expense>());
			grpdExpenses.get(month).add(expense);
		}
		return grpdExpenses;
	}
}
