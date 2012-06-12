package com.custdevframework.client.interviews.questions.problem;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EditProblemInterviewPage extends VerticalPanel {

	public EditProblemInterviewPage(JSONObject interview,
			final JSONObject problemJson) {

		this.setSpacing(20);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		HorizontalPanel hp = new HorizontalPanel();

		hp.add(new EditProblemInterview(interview));

		hp.add(new EditProblemInterviewQuestions(interview, problemJson));

		this.add(hp);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(new ButtonSaveProblemInterview(interview));
	}
}
