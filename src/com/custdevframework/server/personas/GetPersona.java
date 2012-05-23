package com.custdevframework.server.personas;

import com.custdevframework.server.utilities.EncryptText;
import com.custdevframework.server.utilities.URLUtilities;

public class GetPersona {

	// http://jsonpfy.startupsdata.appspot.com/GetDataService
	// ?kind=Personas

	private static String getUrl = "https://jsonpfy.startupsdata.appspot.com/GetDataService";

	public static String get(String personaName) {

		String parameters = "kind=Personas&ID="
				+ URLUtilities.encode(personaName);

		final String jsonString = URLUtilities.fetchURLPost(getUrl, parameters
				+ EncryptText.getAuthParameter());

		return jsonString;
	}
}
