package com.custdevframework.server.personas;

import co.uniqueid.authentication.client.utilities.EncryptText;

import com.custdevframework.server.utilities.JSONUtilities;
import com.custdevframework.server.utilities.URLUtilities;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

public class SavePersona {

	private static String saveUrl = "https://jsonpfy.startupsdata.appspot.com/SaveDataService";

	public static String save(JSONObject personaJson) {

		String parameters = "kind=Personas";

		parameters += "&ID=" + JSONUtilities.getString(personaJson, "ID");

		parameters += URLUtilities.addSaveParameterString(personaJson, "name");

		parameters += URLUtilities.addSaveParameterString(personaJson,
				"imageURL");

		parameters += URLUtilities.addSaveParameterText(personaJson,
				"behaviors");

		parameters += URLUtilities.addSaveParameterText(personaJson, "needs");

		parameters += URLUtilities.addSaveParameterText(personaJson, "goals");

		parameters += URLUtilities.addSaveParameterText(personaJson,
				"demographics");

		parameters += URLUtilities
				.addSaveParameterText(personaJson, "problems");

		URLUtilities.fetchURLPost(saveUrl,
				parameters + EncryptText.getAuthParameter());

		return personaJson.toString();
	}
}
