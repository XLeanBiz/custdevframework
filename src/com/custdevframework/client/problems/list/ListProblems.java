package com.custdevframework.client.problems.list;

import com.custdevframework.client.CustDevFrameworkService;
import com.custdevframework.client.CustDevFrameworkServiceAsync;
import com.custdevframework.client.InitializeCustDevFramework;
import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class ListProblems {

	public static void list() {

		final CustDevFrameworkServiceAsync custDevService = GWT
				.create(CustDevFrameworkService.class);

		custDevService.listProblems(new AsyncCallback<String>() {

			public void onFailure(final Throwable caught) {
				System.out.println(caught);
			}

			public void onSuccess(final String jsonResults) {

				if (jsonResults != null) {

					JSONArray jsonArray = (JSONArray) JSONParser
							.parseStrict(jsonResults);

					InitializeCustDevFramework.problemsList = jsonArray;

					InitializeCustDevFramework.reinit();
				}
			}
		});
	}

}
