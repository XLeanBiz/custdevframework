package com.custdevframework.client.problems.change;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.problems.list.ListProblems;
import com.custdevframework.client.problems.list.ProblemsListPanel;
import com.custdevframework.client.problems.list.ProblemsListbox;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ChangeProblem extends VerticalPanel {

	public ChangeProblem() {

		if (InitializeCustDevFramework.problemsList != null) {

			this.setSpacing(40);

			ProblemsListbox list = new ProblemsListbox(
					ConvertJson
							.convertToString(InitializeCustDevFramework.startupdata
									.get("Problem")));

			list.addChangeHandler(new ChangeHandler() {

				@Override
				public void onChange(ChangeEvent event) {

				}
			});

			this.add(list);

			this.add(new ProblemsListPanel());

		} else {

			ListProblems.list();
		}
	}
}
