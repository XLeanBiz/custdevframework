package com.custdevframework.client.persona.list;

import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.ListBox;

public class PersonaListbox extends ListBox {

	public PersonaListbox(final JSONArray personas, final String persona) {

		this.setWidth("200px");

		this.addItem("");

		if (personas != null) {

			for (int i = 0; i < personas.size(); i++) {

				JSONObject json = (JSONObject) personas.get(i);

				String ID = ConvertJson.getStringValue(json, "ID");

				if (ID != null) {

					this.addItem(ID);

					if (ID.equals(persona)) {

						this.setSelectedIndex(i + 1);
					}
				}
			}
		}

	}
}
