package com.custdevframework.client.persona.show;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.interviews.questions.persona.EditPersonaInterviewPage;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Button;

public class ButtonAddPersonaInterview extends Button {

	public ButtonAddPersonaInterview(final String personaName) {

		this.setText("Interview");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				JSONObject interview = new JSONObject();
				ConvertJson.setStringValue(interview, personaName, "persona");

				Home.vpMain.clear();
				Home.vpMain.add(new EditPersonaInterviewPage(interview));
			}
		});

	}

}
