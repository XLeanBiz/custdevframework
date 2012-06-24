package com.custdevframework.client.interviews.list;

import java.util.Date;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.interviews.questions.problem.AddProblemInterviewButton;
import com.custdevframework.client.interviews.show.problem.ShowProblemInterviewPage;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ProblemInterviewsListPanel extends VerticalPanel {

	public ProblemInterviewsListPanel(JSONArray interviews) {

		this.setSpacing(20);

		this.add(new AddProblemInterviewButton());

		for (int i = 0; i < interviews.size(); i++) {

			final JSONObject interviewJson = (JSONObject) interviews.get(i);

			String datetime = ConvertJson.getStringValue(interviewJson,
					"datetime");

			String customerName = ConvertJson.getStringValue(interviewJson,
					"customerName");

			HTML html = new HTML(new Date(new Long(datetime))
					+ " - <a href=#><b>" + " " + customerName + "</b></a>");
			html.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					Home.vpMain.clear();
					Home.vpMain
							.add(new ShowProblemInterviewPage(interviewJson));
				}
			});

			this.add(html);
		}
	}
}
