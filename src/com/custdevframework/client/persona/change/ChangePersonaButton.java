package com.custdevframework.client.persona.change;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.utilities.UseTracking;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;

public class ChangePersonaButton extends Button {

	public ChangePersonaButton() {

		this.setText("Edit Persona");

		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				new UseTracking(this.getClass().getName());

				Home.vpMain.clear();
				Home.vpMain.add(new ChangePersona());
			}
		});
	}

}
