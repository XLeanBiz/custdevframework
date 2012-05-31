package com.custdevframework.client.problems.show;

import com.custdevframework.client.problems.edit.ButtonEditProblem;
import com.custdevframework.client.utilities.ConvertJson;
import com.custdevframework.client.utilities.FormField;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ShowProblem extends VerticalPanel {

	public ShowProblem(JSONObject json) {

		this.setSpacing(20);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

		this.add(new ButtonEditProblem(json));

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		String problemName = ConvertJson.convertToString(json.get("ID"));
		this.add(FormField.getStringField("Problem Name", problemName));

		String descriptionValue = ConvertJson.convertToString(json
				.get("description"));
		this.add(FormField.getStringField("Description", descriptionValue));

		String imageURLValue = ConvertJson
				.convertToString(json.get("imageURL"));
		HTML img = new HTML("<img src='" + imageURLValue + "' border=0>");
		this.add(img);
	}
}