package com.custdevframework.client;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.persona.show.GetPersona;
import com.custdevframework.client.utilities.UseTracking;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window.Location;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTEntryPoint implements EntryPoint {

	public static VerticalPanel vpMain = new VerticalPanel();

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		new UseTracking(this.getClass().getName());

		String persona = Location.getParameter("persona");

		vpMain.clear();

		RootPanel.get().add(vpMain, 8, 3);

		vpMain.setWidth("100%");

		if (persona != null) {

			GetPersona.get(persona);

		} else {

			vpMain.add(new Home());
		}
	}
}
