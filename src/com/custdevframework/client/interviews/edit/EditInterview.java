package com.custdevframework.client.interviews.edit;

import java.util.Date;

import com.custdevframework.client.persona.edit.ButtonSave;
import com.custdevframework.client.utilities.ConvertJson;
import com.custdevframework.client.utilities.FormField;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;

public class EditInterview extends VerticalPanel {

	public static DateBox dateTime = new DateBox();

	public static TextBox personaNameField = new TextBox();

	public static TextBox customerNameField = new TextBox();

	public static TextBox customerUniqueIDField = new TextBox();

	public static TextBox videoURLField = new TextBox();

	public static RichTextArea notes = new RichTextArea();

	public EditInterview(JSONObject personaJson) {

		this.setSpacing(20);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		String interviewerUniqueID = ConvertJson.convertToString(personaJson
				.get("interviewerUniqueID"));
		this.add(new HTML("Interviewer: " + interviewerUniqueID));

		String date = ConvertJson.convertToString(personaJson.get("dateTime"));
		dateTime.setValue(new Date());
		this.add(FormField.getFormField("<font color=red>*</font> Date",
				dateTime));

		String personaName = ConvertJson.convertToString(personaJson
				.get("persona"));
		personaNameField.setValue(personaName);
		this.add(FormField.getFormField("<font color=red>*</font> Persona",
				personaNameField));

		String customerName = ConvertJson.convertToString(personaJson
				.get("customerName"));
		customerNameField.setValue(customerName);
		this.add(FormField.getFormField(
				"<font color=red>*</font> Customer Name", customerNameField));

		String customerUniqueID = ConvertJson.convertToString(personaJson
				.get("customerUniqueID"));
		customerUniqueIDField.setValue(customerUniqueID);
		this.add(FormField.getFormField("Customer UniqueID",
				customerUniqueIDField));

		String videoURLValue = ConvertJson.convertToString(personaJson
				.get("imageURL"));
		videoURLField.setValue(videoURLValue);
		this.add(FormField.getFormField("Video URL", videoURLField));
		videoURLField.setWidth("500px");

		String notesValue = ConvertJson.convertToString(personaJson
				.get("notes"));
		notes.setHTML(notesValue);
		this.add(FormField.getFormField("Notes", notes));
		notes.setSize("500px", "200px");

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(new ButtonSave(personaJson));
	}
}
