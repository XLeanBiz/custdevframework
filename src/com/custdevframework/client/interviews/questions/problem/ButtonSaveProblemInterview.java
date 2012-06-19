package com.custdevframework.client.interviews.questions.problem;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Button;

public class ButtonSaveProblemInterview extends Button {

	public ButtonSaveProblemInterview(final JSONObject interview) {

		this.setText("Save Interview");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				ConvertJson.setStringValue(interview, Long
						.toString(EditProblemInterview.dateTime.getValue()
								.getTime()), "datetime");

				ConvertJson.setStringValue(interview,
						EditProblemInterview.customerNameField.getValue(),
						"customerName");

				ConvertJson.setStringValue(interview,
						EditProblemInterview.customerUniqueIDField.getValue(),
						"customerUniqueID");

				ConvertJson.setStringValue(interview,
						EditProblemInterview.videoURLField.getValue(),
						"videoURL");

				ConvertJson.setStringValue(interview,
						EditProblemInterview.notes.getHTML(), "notes");

				ConvertJson.setStringValue(interview,
						EditProblemInterview.problemField
								.getValue(EditProblemInterview.problemField
										.getSelectedIndex()), "problem");

				getInterviewQuesitons(interview);

				SaveProblemInterview.save(interview);
			}
		});

	}

	private void getInterviewQuesitons(JSONObject interview) {

		ConvertJson.setStringValue(interview,
				EditProblemInterviewQuestions.problemUnderstand.getHTML(),
				"problemUnderstand");

		ConvertJson.setStringValue(interview,
				EditProblemInterviewQuestions.haveProblem.getHTML(),
				"haveProblem");

		ConvertJson.setStringValue(interview,
				EditProblemInterviewQuestions.whyHaveProblem.getHTML(),
				"whyHaveProblem");

		ConvertJson
				.setStringValue(
						interview,
						EditProblemInterviewQuestions.problemRateField
								.getValue(EditProblemInterviewQuestions.problemRateField
										.getSelectedIndex()), "problemRate");

		ConvertJson.setStringValue(interview,
				EditProblemInterviewQuestions.howSolvingProblem.getHTML(),
				"howSolvingProblem");

		ConvertJson.setStringValue(interview,
				EditProblemInterviewQuestions.make5Problem.getHTML(),
				"make5Problem");

		ConvertJson.setStringValue(interview,
				EditProblemInterviewQuestions.openComments.getHTML(),
				"openComments");
	}

}
