package com.custdevframework.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("custdevframework")
public interface CustDevFrameworkService extends RemoteService {

	String getStartupData(String company);
	
	String listPersonas();
	
	String getPersona(String name);
	
	String savePersona(String persona);
	
	String listProblems();
	
	String saveProblem(String problem);
	
	String listInterviews(final String company);
	
	String saveInterview(String interview);
}
