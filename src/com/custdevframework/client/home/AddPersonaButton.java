package com.custdevframework.client.home;

import com.custdevframework.client.GWTEntryPoint;
import com.custdevframework.client.persona.edit.EditPersona;
import com.custdevframework.client.utilities.UseTracking;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Button;

public class AddPersonaButton extends Button {

	public AddPersonaButton() {

		this.setText("Add New Persona");

		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				new UseTracking(this.getClass().getName());

				GWTEntryPoint.vpMain.clear();
				GWTEntryPoint.vpMain.add(new EditPersona(new JSONObject()));
			}
		});
	}

}
