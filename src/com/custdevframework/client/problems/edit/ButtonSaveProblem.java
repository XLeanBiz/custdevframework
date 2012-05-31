package com.custdevframework.client.problems.edit;

import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;

public class ButtonSaveProblem extends Button {

	public ButtonSaveProblem(final JSONObject problemJson) {

		this.setText("Save");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				if (EditProblem.name.getValue() != null
						&& !"".equals(EditProblem.name.getValue())) {

					ConvertJson.setStringValue(problemJson,
							EditProblem.name.getValue(), "ID");

					ConvertJson.setStringValue(problemJson,
							EditProblem.imageURL.getValue(), "imageURL");

					ConvertJson.setStringValue(problemJson,
							EditProblem.description.getHTML(), "description");

					SaveProblem.save(problemJson);
				} else {

					Window.alert("Please, enter the Name of the problem.");
				}
			}
		});
	}

}
