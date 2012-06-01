package com.custdevframework.client.startupdata;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("startupdata")
public interface StartupDataService extends RemoteService {

	String getStartupData(String company);

	void saveStartupData(final String company, final String topicName,
			final String topicDescription);
}
