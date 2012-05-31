package com.custdevframework.client.persona.show;

import com.custdevframework.client.utilities.UseTracking;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;

public class PersonaLink extends HTML {

	public PersonaLink(final String persona) {

		if (persona != null) {

			this.setHTML("<a href=#><b>" + persona + "</b></a>");

			this.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					new UseTracking(this.getClass().getName());

					GetPersona.get(persona);
				}
			});
		}
	}

}
