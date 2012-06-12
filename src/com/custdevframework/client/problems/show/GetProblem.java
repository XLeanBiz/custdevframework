package com.custdevframework.client.problems.show;

import com.custdevframework.client.CustDevFrameworkService;
import com.custdevframework.client.CustDevFrameworkServiceAsync;
import com.custdevframework.client.home.Home;
import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class GetProblem {

	public static void get(final String name) {

		final CustDevFrameworkServiceAsync custDevService = GWT
				.create(CustDevFrameworkService.class);

		custDevService.getProblem(name, new AsyncCallback<String>() {

			public void onFailure(final Throwable caught) {
				System.out.println(caught);
			}

			public void onSuccess(final String jsonResult) {

				if (jsonResult != null && !jsonResult.equals("")) {

					JSONObject problem = (JSONObject) JSONParser
							.parseStrict(jsonResult);

					Home.vpMain.clear();
					Home.vpMain.add(new ShowProblem(problem));
				}
			}
		});
	}

}
