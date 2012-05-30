package com.custdevframework.client.persona.list;

import com.custdevframework.client.CustDevFrameworkService;
import com.custdevframework.client.CustDevFrameworkServiceAsync;
import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.home.Lists;
import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class ListPersonas {

	public static void list() {

		final CustDevFrameworkServiceAsync custDevService = GWT
				.create(CustDevFrameworkService.class);

		custDevService.listPersonas(new AsyncCallback<String>() {

			public void onFailure(final Throwable caught) {
				System.out.println(caught);
			}

			public void onSuccess(final String jsonResults) {

				if (jsonResults != null) {

					JSONArray jsonArray = (JSONArray) JSONParser
							.parseStrict(jsonResults);

					InitializeCustDevFramework.listPersonas = jsonArray;

					Lists.vpPersonaList.clear();
					Lists.vpPersonaList.add(new PersonaListPanel(jsonArray));
				}
			}
		});
	}

}
