package com.custdevframework.server.problems;

import co.uniqueid.authentication.client.utilities.EncryptText;

import com.custdevframework.server.utilities.JSONUtilities;
import com.custdevframework.server.utilities.URLUtilities;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

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
