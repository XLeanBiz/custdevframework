package com.custdevframework.client.interviews.questions.persona;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Button;

public class ButtonSavePersonaInterview extends Button {

	public ButtonSavePersonaInterview(final JSONObject interview) {

		this.setText("Save Interview");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				ConvertJson.setStringValue(interview,
						EditPersonaInterview.personaNameField
								.getValue(EditPersonaInterview.personaNameField
										.getSelectedIndex()), "persona");

				ConvertJson.setStringValue(interview, Long
						.toString(EditPersonaInterview.dateTime.getValue()
								.getTime()), "datetime");

				ConvertJson.setStringValue(interview,
						EditPersonaInterview.customerNameField.getValue(),
						"customerName");

				ConvertJson.setStringValue(interview,
						EditPersonaInterview.customerUniqueIDField.getValue(),
						"customerUniqueID");

				ConvertJson.setStringValue(interview,
						EditPersonaInterview.videoURLField.getValue(),
						"videoURL");

				ConvertJson.setStringValue(interview,
						EditPersonaInterview.notes.getHTML(), "notes");

				ConvertJson.setStringValue(interview,
						EditPersonaInterview.problem1Field
								.getValue(EditPersonaInterview.problem1Field
										.getSelectedIndex()), "problem1");

				ConvertJson.setStringValue(interview,
						EditPersonaInterview.problem2Field
								.getValue(EditPersonaInterview.problem2Field
										.getSelectedIndex()), "problem2");

				getInterviewQuesitons(interview);

				SavePersonaInterview.save(interview);
			}
		});

	}

	private void getInterviewQuesitons(JSONObject interview) {

		ConvertJson.setStringValue(interview,
				EditPersonaInterviewQuestions.describeYourself.getHTML(),
				"describeYourself");

		ConvertJson.setStringValue(interview,
				EditPersonaInterviewQuestions.routine.getHTML(), "routine");

		ConvertJson.setStringValue(interview,
				EditPersonaInterviewQuestions.mainProblem.getHTML(),
				"mainProblem");

		ConvertJson
				.setStringValue(
						interview,
						EditPersonaInterviewQuestions.mainProblemRateField
								.getValue(EditPersonaInterviewQuestions.mainProblemRateField
										.getSelectedIndex()), "mainProblemRate");

		ConvertJson.setStringValue(interview,
				EditPersonaInterviewQuestions.solutionMainProblem.getHTML(),
				"solutionMainProblem");

		ConvertJson.setStringValue(interview,
				EditPersonaInterviewQuestions.secondMainProblem.getHTML(),
				"secondMainProblem");

		ConvertJson
				.setStringValue(
						interview,
						EditPersonaInterviewQuestions.secondProblemRateField
								.getValue(EditPersonaInterviewQuestions.secondProblemRateField
										.getSelectedIndex()),
						"secondProblemRate");

		ConvertJson.setStringValue(interview,
				EditPersonaInterviewQuestions.solutionSecondProblem.getHTML(),
				"solutionSecondProblem");

		ConvertJson.setStringValue(interview,
				EditPersonaInterviewQuestions.otherProblems.getHTML(),
				"otherProblems");

		ConvertJson.setStringValue(interview,
				EditPersonaInterviewQuestions.openComments.getHTML(),
				"openComments");
	}

}
