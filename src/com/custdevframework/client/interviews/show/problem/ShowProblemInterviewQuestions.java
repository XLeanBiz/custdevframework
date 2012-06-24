package com.custdevframework.client.interviews.show.problem;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.utilities.FormField;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ShowProblemInterviewQuestions extends VerticalPanel {

	public ShowProblemInterviewQuestions(JSONObject interview) {

		this.setSpacing(20);
		this.setWidth("600px");

		String problem = ConvertJson.convertToString(interview.get("problem"));
		this.add(FormField.getStringFieldVertical("Problem: ", problem));

		String problemUnderstand = ConvertJson.convertToString(interview
				.get("problemUnderstand"));
		this.add(FormField.getStringFieldVertical(
				"What do you understand from this problem?", problemUnderstand));

		String haveProblem = ConvertJson.convertToString(interview
				.get("haveProblem"));
		this.add(FormField.getStringFieldVertical("Do you have this problem?",
				haveProblem));

		String whyHaveProblem = ConvertJson.convertToString(interview
				.get("whyHaveProblem"));
		this.add(FormField.getStringFieldVertical("Why?", whyHaveProblem));

		String problemRate = ConvertJson.convertToString(interview
				.get("problemRate"));
		this.add(FormField.getStringFieldVertical(
				"How do you rate this problem?", problemRate));

		String howSolvingProblem = ConvertJson.convertToString(interview
				.get("howSolvingProblem"));
		this.add(FormField.getStringFieldVertical(
				"How are you solving this problem today?", howSolvingProblem));

		String make5Problem = ConvertJson.convertToString(interview
				.get("make5Problem"));
		this.add(FormField.getStringFieldVertical(
				"What will make this problem a 5?", make5Problem));

		String openComments = ConvertJson.convertToString(interview
				.get("openComments"));
		this.add(FormField.getStringFieldVertical("Comments?", openComments));
	}

}
