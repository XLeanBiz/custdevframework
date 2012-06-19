package com.custdevframework.client.persona.change;

import co.uniqueid.authentication.client.UniqueIDGlobalVariables;
import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.persona.list.PersonaListPanel;
import com.custdevframework.client.persona.list.PersonaListbox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ChangePersona extends VerticalPanel {

	public static PersonaListbox personaList = null;

	public ChangePersona() {

		if (InitializeCustDevFramework.personasList != null) {

			this.setSpacing(20);

			if (UniqueIDGlobalVariables.companyUniqueID != null) {

				this.add(personaChangePanel());
			}

			this.add(new PersonaListPanel());
		}
	}

	private HorizontalPanel personaChangePanel() {

		HorizontalPanel hp = new HorizontalPanel();

		hp.setSpacing(20);

		String persona = null;
		if (InitializeCustDevFramework.startupdata != null) {

			persona = ConvertJson
					.convertToString(InitializeCustDevFramework.startupdata
							.get("Persona"));
		}

		personaList = new PersonaListbox(persona);

		hp.add(personaList);

		hp.add(new ButtonSavePersona());

		return hp;
	}
}
