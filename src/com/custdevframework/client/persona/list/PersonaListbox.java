package com.custdevframework.client.persona.list;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.InitializeCustDevFramework;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.ListBox;

public class PersonaListbox extends ListBox {

	public PersonaListbox(final String persona) {

		if (InitializeCustDevFramework.personasList != null) {

			this.setWidth("300px");

			this.addItem("");

			for (int i = 0; i < InitializeCustDevFramework.personasList.size(); i++) {

				JSONObject json = (JSONObject) InitializeCustDevFramework.personasList
						.get(i);

				String ID = ConvertJson.getStringValue(json, "ID");

				if (ID != null) {

					this.addItem(ID);

					if (ID.equals(persona)) {

						this.setSelectedIndex(i + 1);
					}
				}
			}

		} else {

			ListPersonas.list();
		}

	}
}
