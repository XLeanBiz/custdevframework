package com.custdevframework.client.interviews.list;

import co.uniqueid.authentication.client.UniqueIDGlobalVariables;

import com.custdevframework.client.CustDevFrameworkService;
import com.custdevframework.client.CustDevFrameworkServiceAsync;
import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.home.Lists;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class ListInterviews {

	public static void list() {

		final CustDevFrameworkServiceAsync custDevService = GWT
				.create(CustDevFrameworkService.class);

		if (UniqueIDGlobalVariables.companyUniqueID != null) {

			String companyUniqueID = ConvertJson
					.convertToString(UniqueIDGlobalVariables.companyUniqueID
							.get("ID"));

			custDevService.listInterviews(companyUniqueID,
					new AsyncCallback<String>() {

						public void onFailure(final Throwable caught) {
							System.out.println(caught);
						}

						public void onSuccess(final String jsonResults) {

							if (jsonResults != null) {

								JSONArray jsonArray = (JSONArray) JSONParser
										.parseStrict(jsonResults);

								Lists.vpInterviewsList.clear();
								Lists.vpInterviewsList
										.add(new InterviewsListPanel(jsonArray));
							}
						}
					});
		}
	}
}
