package com.custdevframework.client;

import co.uniqueid.authentication.client.login.facebook.FacebookLoginVerifyer;
import co.uniqueid.authentication.client.login.facebook.InitializeFacebookLogin;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.home.HomeLists;
import com.custdevframework.client.home.header.Header;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.RootPanel;

public class InitializeCustDevFramework {

	public static JSONArray personasList = null;
	public static JSONArray problemsList = null;
	public static JSONArray solutionsList = null;

	public static JSONObject startupdata = null;

	private static final String REDIRECT_URL = "http://startupsdata.appspot.com/";
	private static final String facebookAppID = "237384049703314";

	public static void init() {

		Home.vpHeader.clear();
		Home.vpMain.clear();
		Home.vpMain.setWidth("100%");

		RootPanel.get().add(Home.vpHeader, 8, 3);
		RootPanel.get().add(Home.vpMain, 8, 100);

		Home.vpHeader.add(new Header());
	}

	public static void initHome(final String uniqueID, final String companyID) {

		new InitializeFacebookLogin(uniqueID, facebookAppID, REDIRECT_URL,
				companyID);

		Home.vpMain.clear();
		Home.vpMain.add(new Home());
	}

	public static void reinit() {

		Home.vpMain.clear();
		Home.vpMain.add(new Home());

		HomeLists.initHomeLists();
	}

	public static void VerifyFacebookLogin(final String authenticationCode) {

		FacebookLoginVerifyer.authenticate(facebookAppID, authenticationCode,
				REDIRECT_URL, null, true);
	}
}
