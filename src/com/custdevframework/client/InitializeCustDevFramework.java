package com.custdevframework.client;

import co.uniqueid.authentication.client.login.facebook.FacebookLoginVerifyer;
import co.uniqueid.authentication.client.login.facebook.InitializeFacebookLogin;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.home.header.Header;
import com.custdevframework.client.persona.show.GetPersona;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.user.client.ui.RootPanel;

public class InitializeCustDevFramework {
	
	public static JSONArray listPersonas;

	private static final String REDIRECT_URL = "http://startupsdata.appspot.com/";
	private static final String facebookAppID = "237384049703314";

	public static void init(final String uniqueID, final String companyID,
			final String persona) {

		RootPanel.get().add(Home.vpHeader, 8, 3);

		RootPanel.get().add(Home.vpMain, 8, 40);

		Home.vpMain.setWidth("100%");

		reinit(uniqueID, companyID, persona);
	}

	public static void reinit(final String uniqueID, final String companyID,
			final String persona) {

		Home.vpHeader.clear();
		Home.vpHeader.add(new Header());

		new InitializeFacebookLogin(uniqueID, facebookAppID, REDIRECT_URL,
				companyID);

		Home.vpMain.clear();

		if (persona != null) {

			GetPersona.get(persona);

		} else {

			Home.vpMain.add(new Home());
		}
	}

	public static void VerifyFacebookLogin(final String authenticationCode) {

		FacebookLoginVerifyer.authenticate(facebookAppID, authenticationCode,
				REDIRECT_URL, null, true);
	}
}
