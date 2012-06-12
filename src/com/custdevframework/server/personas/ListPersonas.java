package com.custdevframework.server.personas;

import co.uniqueid.authentication.client.utilities.EncryptText;
import co.uniqueid.authentication.server.utilities.URLUtilities;

public class ListPersonas {

	// http://jsonpfy.startupsdata.appspot.com/ListDataService
	// ?kind=Personas

	private static String getListUrl = "https://jsonpfy.startupsdata.appspot.com/ListDataService";

	public static String list() {

		String parameters = "kind=Personas";

		final String jsonString = URLUtilities.fetchURLPost(getListUrl,
				parameters + EncryptText.getAuthParameter());

		return jsonString;
	}
}
