package com.custdevframework.client;

import co.uniqueid.authentication.client.utilities.EncryptText;

import com.custdevframework.client.utilities.UseTracking;
import com.google.gwt.core.client.EntryPoint;
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
		String persona = Location.getParameter("persona");

		if (uniqueID == null || uniqueID.equals("null")) {

			String authenticationCode = Location.getParameter("code");

			final String error = Location.getParameter("error_reason");

			if (!((null != error && error.equals("user_denied")) || (authenticationCode == null || ""
					.equals(authenticationCode)))) {

				InitializeCustDevFramework.init(uniqueID, company, persona);

				InitializeCustDevFramework
						.VerifyFacebookLogin(authenticationCode);
			} else {

				InitializeCustDevFramework.init(uniqueID, company, persona);
			}
		} else {

			InitializeCustDevFramework.init(uniqueID, company, persona);
		}

	}
}
