package com.custdevframework.client.persona.edit;

import com.custdevframework.client.CustDevFrameworkService;
import com.custdevframework.client.CustDevFrameworkServiceAsync;
import com.custdevframework.client.persona.list.ListPersonas;
import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class SavePersona {

	public static void save(final JSONObject personaJson) {

		final CustDevFrameworkServiceAsync custDevService = GWT
				.create(CustDevFrameworkService.class);

		custDevService.savePersona(personaJson.toString(),
				new AsyncCallback<String>() {

					public void onFailure(final Throwable caught) {
						System.out.println(caught);
					}

					public void onSuccess(String unoUserJson) {

						ListPersonas.list();
					}
				});

	}
}
