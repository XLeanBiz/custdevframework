package com.custdevframework.client.persona.change;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.persona.list.ListPersonas;
import com.custdevframework.client.persona.list.PersonaListPanel;
import com.custdevframework.client.persona.list.PersonaListbox;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ChangePersona extends VerticalPanel {

	public static PersonaListbox personaList = null;

	public ChangePersona() {

		if (InitializeCustDevFramework.personasList != null) {

			this.setSpacing(20);

			HorizontalPanel hp = new HorizontalPanel();
			
			hp.setSpacing(20);
			
			personaList = new PersonaListbox(
					ConvertJson.convertToString(InitializeCustDevFramework.startupdata
							.get("Persona")));

			hp.add(personaList);

			hp.add(new ButtonSavePersona());

			this.add(hp);

			this.add(new PersonaListPanel());

		} else {

			ListPersonas.list();
		}
	}
}
