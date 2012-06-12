package com.custdevframework.client.problems.show;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.interviews.questions.problem.EditProblemInterviewPage;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Button;

public class ButtonAddProblemInterview extends Button {

	public ButtonAddProblemInterview(final JSONObject problemJson) {

		this.setText("Interview");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				String problem = ConvertJson.convertToString(problemJson.get("ID"));
				
				JSONObject interview = new JSONObject();
				ConvertJson.setStringValue(interview, problem, "problem");

				Home.vpMain.clear();
				Home.vpMain.add(new EditProblemInterviewPage(interview, problemJson));
			}
		});

	}

}
