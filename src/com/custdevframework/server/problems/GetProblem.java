package com.custdevframework.server.problems;

import co.uniqueid.authentication.client.utilities.EncryptText;
import co.uniqueid.authentication.server.utilities.URLUtilities;

public class GetProblem {

	// http://jsonpfy.startupsdata.appspot.com/GetDataService
	// ?kind=Personas

	private static String getUrl = "https://jsonpfy.startupsdata.appspot.com/GetDataService";

	public static String get(String name) {

		String parameters = "kind=Problems&ID=" + URLUtilities.encode(name);

		final String jsonString = URLUtilities.fetchURLPost(getUrl, parameters
				+ EncryptText.getAuthParameter());

		return jsonString;
	}
}
