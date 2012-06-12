package com.custdevframework.server.interviews;

import co.uniqueid.authentication.client.utilities.EncryptText;
import co.uniqueid.authentication.server.utilities.URLUtilities;

public class ListPersonaInterviews {

	// http://jsonpfy.startupsdata.appspot.com/ListDataService
	// ?kind=Interviews
	// &filterField=company&filterValue=
	// &sortField=datetime&sortDirection=desc

	private static String listUrl = "https://jsonpfy.startupsdata.appspot.com/ListDataService";

	public static String list(final String company) {

		String parameters = "kind=PersonaInterviews";
		
		parameters += "&filterField=company&filterValue="
				+ company;
		
	//	parameters += "&sortField=datetime&sortDirection=desc";

		final String jsonString = URLUtilities.fetchURLPost(listUrl,
				parameters + EncryptText.getAuthParameter());

		return jsonString;
	}
}
