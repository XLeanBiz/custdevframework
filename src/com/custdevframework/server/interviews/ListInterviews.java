package com.custdevframework.server.interviews;

import com.custdevframework.server.utilities.EncryptText;
import com.custdevframework.server.utilities.URLUtilities;

public class ListInterviews {

	// http://jsonpfy.startupsdata.appspot.com/ListDataService
	// ?kind=Interviews
	// &filterField=company&filterValue=

	private static String listUrl = "https://jsonpfy.startupsdata.appspot.com/ListDataService";

	public static String list(final String company) {

		String parameters = "kind=Interviews";
		
		parameters += "&filterField=company&filterValue="
				+ company;

		final String jsonString = URLUtilities.fetchURLPost(listUrl,
				parameters + EncryptText.getAuthParameter());

		return jsonString;
	}
}
