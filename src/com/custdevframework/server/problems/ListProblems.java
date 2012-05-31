package com.custdevframework.server.problems;

import com.custdevframework.server.utilities.EncryptText;
import com.custdevframework.server.utilities.URLUtilities;

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
