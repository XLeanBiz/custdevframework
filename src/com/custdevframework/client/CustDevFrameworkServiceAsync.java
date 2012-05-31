package com.custdevframework.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface CustDevFrameworkServiceAsync {

	void getStartupData(String company, AsyncCallback<String> callback);

	void listPersonas(AsyncCallback<String> callback);

	void getPersona(String name, AsyncCallback<String> callback);

	void savePersona(String persona, AsyncCallback<String> callback);

	void listInterviews(final String company, AsyncCallback<String> callback);

	void saveInterview(String interview, AsyncCallback<String> callback);
}
