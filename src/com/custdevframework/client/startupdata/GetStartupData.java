package com.custdevframework.client.startupdata;

import com.custdevframework.client.CustDevFrameworkService;
import com.custdevframework.client.CustDevFrameworkServiceAsync;
import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.home.HomeLists;
import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class GetStartupData {

	public static void get(final String company) {

		final CustDevFrameworkServiceAsync custDevService = GWT
				.create(CustDevFrameworkService.class);

		custDevService.getStartupData(company, new AsyncCallback<String>() {

			public void onFailure(Throwable caught) {

			}

			public void onSuccess(String jsonResult) {

				if (jsonResult != null && !jsonResult.equals("")) {

					JSONObject obj = (JSONObject) JSONParser
							.parseStrict(jsonResult);

					InitializeCustDevFramework.startupdata = obj;

					HomeLists.initHomeLists();
				}

			}
		});
	}
}
