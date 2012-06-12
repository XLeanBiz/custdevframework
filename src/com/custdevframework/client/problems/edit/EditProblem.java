package com.custdevframework.client.problems.edit;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.utilities.FormField;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EditProblem extends VerticalPanel {

	public static TextBox name = new TextBox();

	public static TextBox imageURL = new TextBox();

	public static RichTextArea description = new RichTextArea();

	public EditProblem(JSONObject problemJson) {

		this.setSpacing(20);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		String problemName = ConvertJson.convertToString(problemJson.get("ID"));
		name.setValue(problemName);
		this.add(FormField.getFormField(
				"<font color=red>*</font> Problem Name", name));
		name.setWidth("500px");

		String problemDescription = ConvertJson.convertToString(problemJson
				.get("description"));
		description.setHTML(problemDescription);
		this.add(FormField.getFormField("Description", description));
		description.setSize("500px", "100px");

		String imageURLValue = ConvertJson.convertToString(problemJson
				.get("imageURL"));
		imageURL.setValue(imageURLValue);
		this.add(FormField.getFormField("Sketch URL", imageURL));
		imageURL.setWidth("500px");

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(new ButtonSaveProblem(problemJson));
	}

}
