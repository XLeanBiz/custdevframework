package com.custdevframework.client.interviews.show.problem;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ShowProblemInterviewPage extends VerticalPanel {

	public ShowProblemInterviewPage(JSONObject interview) {

		this.setSpacing(20);

		this.add(new ButtonEditProblemInterview(interview));

		HorizontalPanel hp = new HorizontalPanel();

		hp.add(new ShowProblemInterview(interview));

		hp.add(new ShowProblemInterviewQuestions(interview));

		this.add(hp);
	}
}
