package com.custdevframework.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("custdevframework")
public interface CustDevFrameworkService extends RemoteService {
	
	String listPersonas();
	
	String getPersona(String name);
	
	String savePersona(String persona);
	
	String listProblems();
	
	String getProblem(String name);
	
	String saveProblem(String problem);
	
	String listPersonaInterviews(final String company);
	
	String savePersonaInterview(String interview);
	
	String listProblemInterviews(final String company);
	
	String saveProblemInterview(String interview);
}
