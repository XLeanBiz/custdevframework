package com.custdevframework.client;

import co.uniqueid.authentication.client.UniqueIDGlobalVariables;
import co.uniqueid.authentication.client.utilities.EncryptText;

import com.custdevframework.client.interviews.list.ButtonListInterviews;
import com.custdevframework.client.persona.list.ListPersonas;
import com.custdevframework.client.persona.show.GetPersona;
import com.custdevframework.client.problems.show.GetProblem;
import com.custdevframework.client.startupdata.GetStartupData;
import com.custdevframework.client.utilities.UseTracking;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window.Location;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTEntryPoint implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		new UseTracking(this.getClass().getName());

		String uniqueID = EncryptText.decrypt(Cookies.getCookie("UniqueID"));
		// uniqueID = "AllineWatkins_1332886062783";

		final String company = Location.getParameter("company");
		if (company != null) {

			JSONObject json = new JSONObject();
			json.put("ID", new JSONString(company));

			UniqueIDGlobalVariables.companyUniqueID = json;
		}

		if (uniqueID == null || uniqueID.equals("null")) {

			String authenticationCode = Location.getParameter("code");

			final String error = Location.getParameter("error_reason");

			if (!((null != error && error.equals("user_denied")) || (authenticationCode == null || ""
					.equals(authenticationCode)))) {

				InitializeCustDevFramework
						.VerifyFacebookLogin(authenticationCode);

			} else {

				InitializeCustDevFramework.init();
				InitializeCustDevFramework.initHome(null, null);
			}
		} else {

			InitializeCustDevFramework.init();

			if (company != null) {

				GetStartupData.get(company);
			}
			InitializeCustDevFramework.initHome(uniqueID, company);
		}

		final String persona = Location.getParameter("persona");
		if (persona != null) {

			if ("all".equals(persona)) {

				ListPersonas.list();
			} else {

				GetPersona.get(persona);
			}
		}

		final String problem = Location.getParameter("problem");
		if (problem != null) {

			GetProblem.get(problem);
		}

		final String interviews = Location.getParameter("interviews");
		if (interviews != null) {

			ButtonListInterviews.startInterviews();
		}
	}
}
