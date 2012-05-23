package com.custdevframework.client.persona.show;

import com.custdevframework.client.GWTEntryPoint;
import com.custdevframework.client.persona.edit.EditPersona;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Button;

public class ButtonEdit extends Button {

	public ButtonEdit(final JSONObject personaJson) {

		this.setText("Edit");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				GWTEntryPoint.vpMain.clear();
				GWTEntryPoint.vpMain.add(new EditPersona(personaJson));
			}
		});

	}

}
