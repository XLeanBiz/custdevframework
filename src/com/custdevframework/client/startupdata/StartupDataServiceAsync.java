package com.custdevframework.client.startupdata;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface StartupDataServiceAsync {

	void getStartupData(String company, AsyncCallback<String> callback);

	void saveStartupData(final String company, final String topicName,
			final String topicDescription, AsyncCallback<Void> callback);
}
	