package com.custdevframework.client.interviews.show;

import java.util.Date;

import com.custdevframework.client.utilities.ConvertJson;
import com.custdevframework.client.utilities.FormField;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ShowInterview extends VerticalPanel {

	public ShowInterview(JSONObject interview) {

		this.setSpacing(20);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

		this.add(new ButtonEditInterview(interview));

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

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
		this.add(FormField.getStringField("Video URL", videoURL));

		String notes = ConvertJson.convertToString(interview.get("notes"));
		this.add(FormField.getStringField("Notes", notes));
	}

}
