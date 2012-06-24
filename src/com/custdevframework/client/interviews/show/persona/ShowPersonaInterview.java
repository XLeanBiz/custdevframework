package com.custdevframework.client.interviews.show.persona;

import java.util.Date;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.utilities.FormField;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ShowPersonaInterview extends VerticalPanel {

	public ShowPersonaInterview(JSONObject interview) {

		this.setSpacing(20);



		String interviewer = ConvertJson.convertToString(interview
				.get("interviewer"));
		this.add(FormField.getStringField("Interviewer", interviewer));

		String datetime = ConvertJson
				.convertToString(interview.get("datetime"));
		this.add(FormField.getStringField("Date",
				new Date(new Long(datetime)).toString()));

		String personaName = ConvertJson.convertToString(interview
				.get("persona"));
		this.add(FormField.getStringField("Persona", personaName));

		String customerName = ConvertJson.convertToString(interview
				.get("customerName"));
		this.add(FormField.getStringField("Customer Name", customerName));

		String customerID = ConvertJson.convertToString(interview
				.get("customerUniqueID"));
		this.add(FormField.getStringField("Customer UniqueID", customerID));

		String videoURL = ConvertJson
				.convertToString(interview.get("videoURL"));
		this.add(FormField.getStringField("Video URL", "<a href='" + videoURL
				+ "' target='_blank'>" + videoURL + "</a>"));

		if (interview.get("problem1") != null) {

			String problem1 = ConvertJson.convertToString(interview
					.get("problem1"));
			this.add(FormField.getStringField("Problem 1", problem1));
		}

		if (interview.get("problem2") != null) {

			String problem2 = ConvertJson.convertToString(interview
					.get("problem2"));
			this.add(FormField.getStringField("Problem 2", problem2));
		}

		String notes = ConvertJson.convertToString(interview.get("notes"));
		this.add(FormField.getStringField("Notes", notes));
	}

}
