package com.custdevframework.client.startupdata;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class SaveStartupData {

	public static void save(final String company, final String topicID,
			final String topicDescription) {

		final StartupDataServiceAsync startupDataService = GWT
				.create(StartupDataService.class);

		startupDataService.saveStartupData(company, topicID, topicDescription,
				new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {

					}

					public void onSuccess(Void result) {

						GetStartupData.get(company);
					}
				});

	}
}
