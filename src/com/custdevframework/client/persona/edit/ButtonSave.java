package com.custdevframework.client.persona.edit;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.TextBoxBase;

public class ButtonSave extends Button {

	public ButtonSave(final JSONObject personaJson) {

		this.setText("Save");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				if (EditPersona.name.getValue() != null
						&& !"".equals(EditPersona.name.getValue())) {

					setFieldValue(personaJson, EditPersona.name, "ID");
					setFieldValue(personaJson, EditPersona.imageURL, "imageURL");
					setFieldValue(personaJson, EditPersona.behaviors,
							"behaviors");
					setFieldValue(personaJson, EditPersona.demographics,
							"demographics");
					setFieldValue(personaJson, EditPersona.goals, "goals");
					setFieldValue(personaJson, EditPersona.needs, "needs");
					setFieldValue(personaJson, EditPersona.problems, "problems");

					SavePersona.save(personaJson);
				} else {

					Window.alert("Please, enter the Name of the persona.");
				}

			}
		});

	}

	private void setFieldValue(JSONObject unoUSer, final TextBoxBase field,
			final String fieldName) {

		String value = field.getValue();
		if (value != null) {
			unoUSer.put(fieldName, new JSONString(field.getValue()));
		}
	}

	private void setFieldValue(JSONObject unoUSer, final RichTextArea field,
			final String fieldName) {

		String value = field.getHTML();
		if (value != null) {
			unoUSer.put(fieldName, new JSONString(field.getHTML()));
		}
	}

}
