package com.rr.trackexpense.client.gui;

import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.rr.trackexpense.client.service.TrackExpenseClientImpl;
import com.rr.trackexpense.shared.model.Expense;

public class TrackExpenseGUI extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private TrackExpenseClientImpl serviceImpl;

	public TrackExpenseGUI(TrackExpenseClientImpl serviceImpl) {
		this.serviceImpl = serviceImpl;
		initWidget(vPanel);
		Label label = new Label("Hello!!");
		vPanel.add(label);
		Button btn1 = new Button("Get Expenses");
		btn1.addClickHandler(new Btn1ClickHandler());
		vPanel.add(btn1);
	}

	private class Btn1ClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			serviceImpl.getExpenses();

		}
	}

	public void updateTable(List<Expense> expenses) {
		if (expenses != null && expenses.size() > 0) {
			// Create a grid
			Grid grid = new Grid(expenses.size(), 3);

			// Add images to the grid
			int numRows = grid.getRowCount();
			for (int row = 0; row < numRows; row++) {
				grid.setWidget(row, 0,
						new Label(expenses.get(row).getSpentOn()));
				grid.setWidget(row, 1, new Label(expenses.get(row)
						.getSpentDate().toString()));
				grid.setWidget(row, 2, new Label(expenses.get(row).getAmount()
						.toString()));
			}
			vPanel.add(grid);
		}
	}
}