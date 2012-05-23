package com.custdevframework.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface CustDevFrameworkServiceAsync {

	void listPersonas(AsyncCallback<String> callback);

	void getPersona(String name, AsyncCallback<String> callback);

	void savePersona(String persona, AsyncCallback<String> callback);
}
