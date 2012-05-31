package com.custdevframework.client.persona.edit;

import com.custdevframework.client.home.Home;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Button;

public class ButtonEditPersona extends Button {

	public ButtonEditPersona(final JSONObject personaJson) {

		this.setText("Edit");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				Home.vpMain.clear();
				Home.vpMain.add(new EditPersona(personaJson));
			}
		});

	}

}
