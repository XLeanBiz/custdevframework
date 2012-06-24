package com.custdevframework.client.interviews.questions.problem;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.interviews.questions.ProblemRateListbox;
import com.custdevframework.client.utilities.FormField;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EditProblemInterviewQuestions extends VerticalPanel {

	public static RichTextArea problemUnderstand = new RichTextArea();

	public static RichTextArea haveProblem = new RichTextArea();

	public static RichTextArea whyHaveProblem = new RichTextArea();

	public static ProblemRateListbox problemRateField;

	public static RichTextArea howSolvingProblem = new RichTextArea();

	public static RichTextArea make5Problem = new RichTextArea();

	public static RichTextArea openComments = new RichTextArea();

	public EditProblemInterviewQuestions(JSONObject interview,
			final JSONObject problemJson) {

		this.setSpacing(20);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		String descriptionValue = ConvertJson.getStringValue(problemJson,
				"description");
		this.add(FormField.getStringField("Problem Description",
				descriptionValue));

		String imageURLValue = ConvertJson.getStringValue(problemJson,
				"imageURL");
		HTML img = new HTML("<img src='" + imageURLValue + "' border=0>");
		this.add(img);

		String problemUnderstandValue = ConvertJson.getStringValue(interview,
				"problemUnderstand");
		problemUnderstand.setHTML(problemUnderstandValue);
		this.add(FormField.getVerticalFormField(
				"What do you understand from this problem?", problemUnderstand));
		problemUnderstand.setSize("500px", "80px");

		String haveProblemValue = ConvertJson.getStringValue(interview,
				"haveProblem");
		haveProblem.setHTML(haveProblemValue);
		this.add(FormField.getVerticalFormField("Do you have this problem?",
				haveProblem));
		haveProblem.setSize("500px", "80px");

		String whyHaveProblemValue = ConvertJson.getStringValue(interview,
				"whyHaveProblem");
		whyHaveProblem.setHTML(whyHaveProblemValue);
		this.add(FormField.getVerticalFormField("Why?", whyHaveProblem));
		whyHaveProblem.setSize("500px", "80px");

		String problemRate = ConvertJson.getStringValue(interview,
				"problemRate");
		problemRateField = new ProblemRateListbox(problemRate);
		this.add(FormField.getVerticalFormField(
				"How do you rate this problem?", problemRateField));

		String howSolvingProblemValue = ConvertJson.getStringValue(interview,
				"howSolvingProblem");
		howSolvingProblem.setHTML(howSolvingProblemValue);
		this.add(FormField.getVerticalFormField(
				"How are you solving this problem today?", howSolvingProblem));
		howSolvingProblem.setSize("500px", "80px");

		String make5ProblemValue = ConvertJson.getStringValue(interview,
				"make5Problem");
		make5Problem.setHTML(make5ProblemValue);
		this.add(FormField.getVerticalFormField(
				"What will make this problem a 5?", make5Problem));
		make5Problem.setSize("500px", "80px");

		String openCommentsValue = ConvertJson.getStringValue(interview,
				"openComments");
		openComments.setHTML(openCommentsValue);
		this.add(FormField.getVerticalFormField("Comments?", openComments));
		openComments.setSize("500px", "80px");
	}
}
