package com.custdevframework.client.interviews.edit;

import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;

public class ButtonSaveInterview extends Button {

	public ButtonSaveInterview(final JSONObject interview) {

		this.setText("Save Interview");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				if (EditInterview.customerNameField.getValue() != null
						&& !"".equals(EditInterview.customerNameField
								.getValue())) {

					ConvertJson.setStringValue(interview,
							EditInterview.personaNameField
									.getValue(EditInterview.personaNameField
											.getSelectedIndex()), "persona");

					ConvertJson.setStringValue(interview, Long
							.toString(EditInterview.dateTime.getValue()
									.getTime()), "datetime");

					ConvertJson.setStringValue(interview,
							EditInterview.customerNameField.getValue(),
							"customerName");

					ConvertJson.setStringValue(interview,
							EditInterview.customerUniqueIDField.getValue(),
							"customerUniqueID");

					ConvertJson.setStringValue(interview,
							EditInterview.videoURLField.getValue(), "videoURL");

					ConvertJson.setStringValue(interview,
							EditInterview.notes.getHTML(), "notes");

					SaveInterview.save(interview);

				} else {

					Window.alert("Please, enter the Name of the customer.");
				}

			}
		});

	}

}
