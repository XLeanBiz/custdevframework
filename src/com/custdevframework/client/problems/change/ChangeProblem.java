package com.custdevframework.client.problems.change;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.problems.list.ListProblems;
import com.custdevframework.client.problems.list.ProblemsListPanel;
import com.custdevframework.client.problems.list.ProblemsListbox;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ChangeProblem extends VerticalPanel {

	public static ProblemsListbox list = null;

	public ChangeProblem() {

		if (InitializeCustDevFramework.problemsList != null) {

			this.setSpacing(20);

			HorizontalPanel hp = new HorizontalPanel();

			hp.setSpacing(20);

			list = new ProblemsListbox(
					ConvertJson
							.convertToString(InitializeCustDevFramework.startupdata
									.get("Problem")));

			hp.add(list);

			hp.add(new ButtonSaveProblem());

			this.add(hp);

			this.add(new ProblemsListPanel());

		} else {

			ListProblems.list();
		}
	}
}
