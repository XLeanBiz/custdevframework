package com.custdevframework.client.interviews.questions.persona;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.utilities.FormField;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EditPersonaInterviewQuestions extends VerticalPanel {

	public static RichTextArea describeYourself = new RichTextArea();

	public static RichTextArea routine = new RichTextArea();

	public static RichTextArea mainProblem = new RichTextArea();

	public static RichTextArea secondMainProblem = new RichTextArea();

	public static RichTextArea solutionMainProblem = new RichTextArea();

	public static RichTextArea solutionSecondProblem = new RichTextArea();

	public EditPersonaInterviewQuestions(JSONObject interview) {

		this.setSpacing(20);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		String personaName = ConvertJson.convertToString(interview
				.get("persona"));

		String describeYourselfValue = ConvertJson.convertToString(interview
				.get("describeYourself"));
		describeYourself.setHTML(describeYourselfValue);
		this.add(FormField.getVerticalFormField(
				"How do you describe yourself as a " + personaName + "?",
				describeYourself));
		describeYourself.setSize("500px", "80px");

		String routineValue = ConvertJson.convertToString(interview
				.get("routine"));
		routine.setHTML(routineValue);
		this.add(FormField.getVerticalFormField("How is your routine as a "
				+ personaName + "?", routine));
		routine.setSize("500px", "80px");

		String mainProblemValue = ConvertJson.convertToString(interview
				.get("mainProblem"));
		mainProblem.setHTML(mainProblemValue);
		this.add(FormField.getVerticalFormField(
				"What is your main problem as a " + personaName + "?",
				mainProblem));
		mainProblem.setSize("500px", "80px");

		String solutionMainProblemValue = ConvertJson.convertToString(interview
				.get("solutionMainProblem"));
		solutionMainProblem.setHTML(solutionMainProblemValue);
		this.add(FormField.getVerticalFormField(
				"How are you solving this problem today?", solutionMainProblem));
		solutionMainProblem.setSize("500px", "80px");

		String secondMainProblemValue = ConvertJson.convertToString(interview
				.get("secondMainProblem"));
		secondMainProblem.setHTML(secondMainProblemValue);
		this.add(FormField.getVerticalFormField(
				"What is your second main problem as a " + personaName + "?",
				secondMainProblem));
		secondMainProblem.setSize("500px", "80px");

		String solutionSecondProblemValue = ConvertJson
				.convertToString(interview.get("solutionSecondProblem"));
		solutionSecondProblem.setHTML(solutionSecondProblemValue);
		this.add(FormField.getVerticalFormField(
				"How are you solving this problem today?",
				solutionSecondProblem));
		solutionSecondProblem.setSize("500px", "80px");
	}
}
