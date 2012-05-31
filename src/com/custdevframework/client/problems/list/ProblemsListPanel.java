package com.custdevframework.client.problems.list;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.home.Home;
import com.custdevframework.client.problems.edit.AddNewProblemButton;
import com.custdevframework.client.problems.show.ShowProblem;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ProblemsListPanel extends VerticalPanel {

	public ProblemsListPanel() {

		this.setSpacing(20);
		this.setWidth("400px");

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		HTML htmlTitle = new HTML("<b>THE PROBLEMS DATABASE</b>");
		this.add(htmlTitle);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

		this.add(new AddNewProblemButton());

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		for (int i = 0; i < InitializeCustDevFramework.problemsList.size(); i++) {

			final JSONObject problem = (JSONObject) InitializeCustDevFramework.problemsList
					.get(i);

			String name = ConvertJson.getStringValue(problem, "ID");

			HTML html = new HTML("<a href=#><b>" + name + "</b></a>");
			html.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					Home.vpMain.clear();
					Home.vpMain.add(new ShowProblem(problem));
				}
			});

			this.add(html);

		}

	}

}
