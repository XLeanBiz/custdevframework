package com.custdevframework.client.interviews.show.persona;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.utilities.FormField;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ShowPersonaInterviewQuestions extends VerticalPanel {

	public ShowPersonaInterviewQuestions(JSONObject interview) {

		this.setSpacing(20);
		this.setWidth("600px");

		String personaName = ConvertJson.convertToString(interview
				.get("persona"));

		String describeYourself = ConvertJson.convertToString(interview
				.get("describeYourself"));
		this.add(FormField.getStringFieldVertical(
				"How would you describe yourself as " + personaName + "?",
				describeYourself));

		String routine = ConvertJson.convertToString(interview.get("routine"));
		this.add(FormField.getStringFieldVertical(
				"How is your routine as " + personaName + "?", routine));

		String mainProblem = ConvertJson.convertToString(interview
				.get("mainProblem"));
		this.add(FormField.getStringFieldVertical(
				"What is your main problem as " + personaName + "?",
				mainProblem));

		String mainProblemRate = ConvertJson.convertToString(interview
				.get("mainProblemRate"));
		this.add(FormField.getStringFieldVertical(
				"How do you rate this problem?", mainProblemRate));

		String solutionMainProblem = ConvertJson.convertToString(interview
				.get("solutionMainProblem"));
		this.add(FormField.getStringFieldVertical(
				"How are you solving this problem today?", solutionMainProblem));

		String secondMainProblem = ConvertJson.convertToString(interview
				.get("secondMainProblem"));
		this.add(FormField.getStringFieldVertical(
				"What is your second main problem as a " + personaName + "?",
				secondMainProblem));

		String secondProblemRate = ConvertJson.convertToString(interview
				.get("secondProblemRate"));
		this.add(FormField.getStringFieldVertical(
				"How do you rate this problem?", secondProblemRate));

		String solutionSecondProblem = ConvertJson.convertToString(interview
				.get("solutionSecondProblem"));
		this.add(FormField.getStringFieldVertical(
				"How are you solving this problem today?",
				solutionSecondProblem));

		String otherProblems = ConvertJson.convertToString(interview
				.get("otherProblems"));
		this.add(FormField.getStringFieldVertical("Other Problems?",
				otherProblems));

		String openComments = ConvertJson.convertToString(interview
				.get("openComments"));
		this.add(FormField.getStringFieldVertical("Comments?", openComments));
	}

}
