package com.custdevframework.client.interviews.questions.persona;

import java.util.Date;

import co.uniqueid.authentication.client.UniqueIDGlobalVariables;
import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.persona.list.PersonaListbox;
import com.custdevframework.client.problems.list.ProblemsListbox;
import com.custdevframework.client.utilities.FormField;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;

public class EditPersonaInterview extends VerticalPanel {

	public static DateBox dateTime = new DateBox();

	public static PersonaListbox personaNameField;

	public static TextBox customerNameField = new TextBox();

	public static TextBox customerUniqueIDField = new TextBox();

	public static TextBox videoURLField = new TextBox();

	public static RichTextArea notes = new RichTextArea();

	public static ProblemsListbox problem1Field;

	public static ProblemsListbox problem2Field;

	public EditPersonaInterview(JSONObject interview) {

		this.setSpacing(20);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		String interviewID = ConvertJson.convertToString(interview.get("ID"));

		String interviewerUniqueID = ConvertJson.convertToString(interview
				.get("interviewer"));

		String companyUniqueID = ConvertJson.convertToString(interview
				.get("company"));

		if (interviewID == null) {

			if (companyUniqueID == null) {

				companyUniqueID = ConvertJson
						.convertToString(UniqueIDGlobalVariables.companyUniqueID
								.get("ID"));

				ConvertJson.setStringValue(interview, companyUniqueID,
						"company");
			}

			if (interviewerUniqueID == null) {

				interviewerUniqueID = ConvertJson
						.convertToString(UniqueIDGlobalVariables.uniqueID
								.get("ID"));

				ConvertJson.setStringValue(interview, interviewerUniqueID,
						"interviewer");
			}
		}
		
		this.add(FormField.getStringField("Interviewer", interviewerUniqueID));

		String date = ConvertJson.convertToString(interview.get("datetime"));
		if (date == null) {
			dateTime.setValue(new Date());
		} else {
			dateTime.setValue(new Date(new Long(date)));
		}

		this.add(FormField.getFormField("<font color=red>*</font> Date",
				dateTime));

		String personaName = ConvertJson.convertToString(interview
				.get("persona"));
		personaNameField = new PersonaListbox(personaName);
		this.add(FormField.getFormField("<font color=red>*</font> Persona",
				personaNameField));

		String customerName = ConvertJson.convertToString(interview
				.get("customerName"));
		customerNameField.setValue(customerName);
		this.add(FormField.getFormField(
				"<font color=red>*</font> Customer Name", customerNameField));

		String customerUniqueID = ConvertJson.convertToString(interview
				.get("customerUniqueID"));
		customerUniqueIDField.setValue(customerUniqueID);
		this.add(FormField.getFormField("Customer UniqueID",
				customerUniqueIDField));

		String videoURLValue = ConvertJson.convertToString(interview
				.get("videoURL"));
		videoURLField.setValue(videoURLValue);
		this.add(FormField.getFormField("Video URL", videoURLField));
		videoURLField.setWidth("300px");

		String problem1Name = ConvertJson.convertToString(interview
				.get("problem1"));
		problem1Field = new ProblemsListbox(problem1Name);
		this.add(FormField.getFormField("Problem 1", problem1Field));

		String problem2Name = ConvertJson.convertToString(interview
				.get("problem2"));
		problem2Field = new ProblemsListbox(problem2Name);
		this.add(FormField.getFormField("Problem 2", problem2Field));

		String notesValue = ConvertJson.convertToString(interview.get("notes"));
		notes.setHTML(notesValue);
		this.add(FormField.getFormField("Notes", notes));
		notes.setSize("300px", "100px");
	}
}
