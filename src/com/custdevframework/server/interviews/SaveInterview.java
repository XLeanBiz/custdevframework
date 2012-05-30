package com.custdevframework.server.interviews;

import org.json.JSONObject;

import com.custdevframework.server.utilities.EncryptText;
import com.custdevframework.server.utilities.JSONUtilities;
import com.custdevframework.server.utilities.URLUtilities;

public class SaveInterview {

	private static String saveUrl = "https://jsonpfy.startupsdata.appspot.com/SaveDataService";

	public static String save(JSONObject interview) {

		String parameters = "kind=Interviews";

		if (JSONUtilities.getString(interview, "ID") != null) {

			parameters += "&ID=" + JSONUtilities.getString(interview, "ID");
		}

		parameters += URLUtilities.addSaveParameterString(interview, "company");

		parameters += URLUtilities.addSaveParameterString(interview,
				"interviewer");

		parameters += URLUtilities
				.addSaveParameterString(interview, "datetime");

		parameters += URLUtilities.addSaveParameterString(interview, "persona");

		parameters += URLUtilities.addSaveParameterString(interview,
				"customerName");

		parameters += URLUtilities.addSaveParameterString(interview,
				"customerUniqueID");

		parameters += URLUtilities
				.addSaveParameterString(interview, "videoURL");

		parameters += URLUtilities.addSaveParameterText(interview, "notes");

		URLUtilities.fetchURLPost(saveUrl,
				parameters + EncryptText.getAuthParameter());

		return interview.toString();
	}
}
