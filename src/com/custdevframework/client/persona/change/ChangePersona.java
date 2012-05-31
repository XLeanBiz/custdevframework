package com.custdevframework.client.persona.change;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.persona.list.ListPersonas;
import com.custdevframework.client.persona.list.PersonaListPanel;
import com.custdevframework.client.persona.list.PersonaListbox;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ChangePersona extends VerticalPanel {

	public ChangePersona() {

		if (InitializeCustDevFramework.personasList != null) {
			
			this.setSpacing(40);

			PersonaListbox personaList = new PersonaListbox(
					ConvertJson
							.convertToString(InitializeCustDevFramework.startupdata
									.get("Persona")));

			personaList.addChangeHandler(new ChangeHandler() {

				@Override
				public void onChange(ChangeEvent event) {

				}
			});

			this.add(personaList);
			
			this.add(new PersonaListPanel());

		} else {

			ListPersonas.list();
		}
	}
}
