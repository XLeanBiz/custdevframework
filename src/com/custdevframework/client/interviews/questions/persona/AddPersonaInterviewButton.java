package com.custdevframework.client.interviews.questions.persona;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.utilities.UseTracking;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Button;

public class AddPersonaInterviewButton extends Button {

	public AddPersonaInterviewButton() {

		this.setText("New Persona Interview");

		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				new UseTracking(this.getClass().getName());

				Home.vpMain.clear();
				Home.vpMain.add(new EditPersonaInterviewPage(new JSONObject()));
			}
		});
	}

}
