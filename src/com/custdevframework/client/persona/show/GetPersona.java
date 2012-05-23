package com.custdevframework.client.persona.show;

import com.custdevframework.client.CustDevFrameworkService;
import com.custdevframework.client.CustDevFrameworkServiceAsync;
import com.custdevframework.client.GWTEntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class GetPersona {

	public static void get(final String name) {

		final CustDevFrameworkServiceAsync custDevService = GWT
				.create(CustDevFrameworkService.class);

		custDevService.getPersona(name, new AsyncCallback<String>() {

			public void onFailure(final Throwable caught) {
				System.out.println(caught);
			}

			public void onSuccess(final String jsonResult) {

				if (jsonResult != null && !jsonResult.equals("")) {

					JSONObject persona = (JSONObject) JSONParser
							.parseStrict(jsonResult);

					GWTEntryPoint.vpMain.clear();
					GWTEntryPoint.vpMain.add(new ShowPersona(persona));
				}
			}
		});
	}

}
