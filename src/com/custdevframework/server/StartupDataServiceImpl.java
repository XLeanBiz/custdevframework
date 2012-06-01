package com.custdevframework.server;

import com.custdevframework.client.startupdata.StartupDataService;
import com.custdevframework.server.startupsdata.GetStartupData;
import com.custdevframework.server.startupsdata.SaveStartupData;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class StartupDataServiceImpl extends RemoteServiceServlet implements
		StartupDataService {

	public String getStartupData(final String company) {

		return GetStartupData.getJsonString(company);
	}

	public void saveStartupData(final String company, final String topicName,
			final String topicDescription) {

		SaveStartupData.save(company, topicName, topicDescription);
	}
}
