package com.custdevframework.client.interviews.show.persona;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ShowPersonaInterviewPage extends VerticalPanel {

	public ShowPersonaInterviewPage(JSONObject interview) {

		this.setSpacing(20);

		this.add(new ButtonEditPersonaInterview(interview));

		HorizontalPanel hp = new HorizontalPanel();

		hp.add(new ShowPersonaInterview(interview));

		hp.add(new ShowPersonaInterviewQuestions(interview));

		this.add(hp);
	}
}
