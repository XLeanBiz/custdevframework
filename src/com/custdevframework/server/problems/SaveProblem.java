package com.custdevframework.server.problems;

import co.uniqueid.authentication.client.utilities.EncryptText;
import co.uniqueid.authentication.server.utilities.JSONUtilities;
import co.uniqueid.authentication.server.utilities.URLUtilities;

import com.google.appengine.repackaged.org.json.JSONObject;

public class SaveProblem {

	private static String saveUrl = "https://jsonpfy.startupsdata.appspot.com/SaveDataService";

	public static String save(JSONObject json) {

		String parameters = "kind=Problems";

		parameters += "&ID=" + JSONUtilities.getString(json, "ID");

		parameters += URLUtilities.addSaveParameterString(json, "imageURL");

		parameters += URLUtilities.addSaveParameterText(json, "description");

		URLUtilities.fetchURLPost(saveUrl,
				parameters + EncryptText.getAuthParameter());

		return json.toString();
	}
}
