package com.custdevframework.server.startupsdata;

import com.custdevframework.server.utilities.EncryptText;
import com.custdevframework.server.utilities.URLUtilities;

public class GetStartupData {

	// http://jsonpfy.xleanbiz.appspot.com/GetDataService?
	// kind=StartupData
	// &ID=Vision%20Statement

	private static String getUrl = "https://jsonpfy.startupsdata.appspot.com/GetDataService";

	public static String getJsonString(final String startupID) {

		String parameters = "kind=StartupDataTopics&ID="
				+ URLUtilities.encode(startupID);

		final String jsonTopicString = URLUtilities.fetchURLPost(getUrl,
				parameters + EncryptText.getAuthParameter());

		return jsonTopicString;
	}
}
