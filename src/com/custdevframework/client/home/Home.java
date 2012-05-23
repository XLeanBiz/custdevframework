package com.custdevframework.client.home;

import com.custdevframework.client.persona.list.ListPersonas;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Home extends VerticalPanel {
	
	public static VerticalPanel vpPersonaList = new VerticalPanel();

	public Home() {

		this.setSpacing(20);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(new HTML("<font size=4><b>The Persona Database</b></font>"));

		this.add(new HTML("MVP #1"));

		this.add(new AddPersonaButton());

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		vpPersonaList.clear();
		this.add(vpPersonaList);
		
		ListPersonas.list();
	}
}
