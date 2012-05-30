package com.custdevframework.client.interviews.list;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.interviews.show.ShowInterview;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class InterviewsListPanel extends VerticalPanel {

	public InterviewsListPanel(JSONArray interviews) {

		this.setSpacing(10);

		for (int i = 0; i < interviews.size(); i++) {

			final JSONObject interviewJson = (JSONObject) interviews.get(i);

			String customerName = ConvertJson.getStringValue(interviewJson,
					"customerName");

			HTML html = new HTML("<a href=#><b>" + customerName + "</b></a>");
			html.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					Home.vpMain.clear();
					Home.vpMain.add(new ShowInterview(interviewJson));
				}
			});

			this.add(html);
		}
	}
}
