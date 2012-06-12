package com.custdevframework.server.startupsdata;

import co.uniqueid.authentication.client.utilities.EncryptText;
import co.uniqueid.authentication.server.utilities.URLUtilities;

public class SaveStartupData {

	// http://jsonpfy.xleanbiz.appspot.com/SaveDataService?
	// kind=StartupData
	// &ID=Vision%20Statement
	// &fieldsKind=Text&fieldsName=topicDescription&fieldsValue=Test

	private static String saveUrl = "https://jsonpfy.startupsdata.appspot.com/SaveDataService";

	public static void save(final String startupID, final String topicName,
			final String topicDescription) {

		String parameters = "kind=StartupDataTopics&ID="
				+ URLUtilities.encode(startupID);

		parameters += "&fieldsKind=Text&fieldsName="
				+ URLUtilities.encode(topicName) + "&fieldsValue="
				+ URLUtilities.encode(topicDescription);

		URLUtilities.fetchURLPost(saveUrl,
				parameters + EncryptText.getAuthParameter());
	}
}
