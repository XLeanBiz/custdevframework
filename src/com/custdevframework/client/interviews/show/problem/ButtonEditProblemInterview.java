package com.custdevframework.client.interviews.show.problem;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.interviews.questions.problem.EditProblemInterviewPage;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Button;

public class ButtonEditProblemInterview extends Button {

	public ButtonEditProblemInterview(final JSONObject interview) {

		this.setText("Edit");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				Home.vpMain.clear();
				Home.vpMain.add(new EditProblemInterviewPage(interview, null));
			}
		});

	}

}
