package com.custdevframework.server.problems;

import co.uniqueid.authentication.client.utilities.EncryptText;
import co.uniqueid.authentication.server.utilities.URLUtilities;

public class ListProblems {

	// http://jsonpfy.startupsdata.appspot.com/ListDataService
	// ?kind=Personas

	private static String listUrl = "https://jsonpfy.startupsdata.appspot.com/ListDataService";

	public static String list() {

		String parameters = "kind=Problems";

		final String jsonString = URLUtilities.fetchURLPost(listUrl, parameters
				+ EncryptText.getAuthParameter());

		return jsonString;
	}
}
