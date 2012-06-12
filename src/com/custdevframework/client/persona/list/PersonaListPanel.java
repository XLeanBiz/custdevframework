package com.custdevframework.client.persona.list;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.home.Home;
import com.custdevframework.client.persona.edit.AddNewPersonaButton;
import com.custdevframework.client.persona.show.ShowPersona;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PersonaListPanel extends VerticalPanel {

	public PersonaListPanel() {

		this.setSpacing(20);
		this.setWidth("400px");

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		HTML htmlTitle = new HTML("<b>THE PERSONA DATABASE</b>");
		this.add(htmlTitle);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

		this.add(new AddNewPersonaButton());

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

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
