package com.custdevframework.client.persona.list;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.home.Home;
import com.custdevframework.client.persona.show.ShowPersona;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PersonaListPanel extends VerticalPanel {

	public PersonaListPanel() {

		this.setSpacing(10);

		for (int i = 0; i < InitializeCustDevFramework.personasList.size(); i++) {

			final JSONObject persona = (JSONObject) InitializeCustDevFramework.personasList
					.get(i);

			String personaName = ConvertJson.getStringValue(persona, "ID");

			HTML html = new HTML("<a href=#><b>" + personaName + "</b></a>");
			html.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					Home.vpMain.clear();
					Home.vpMain.add(new ShowPersona(persona));
				}
			});

			this.add(html);

		}

	}

}
