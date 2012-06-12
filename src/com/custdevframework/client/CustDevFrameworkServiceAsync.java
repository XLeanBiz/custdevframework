package com.custdevframework.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface CustDevFrameworkServiceAsync {

	void listPersonas(AsyncCallback<String> callback);

	void getPersona(String name, AsyncCallback<String> callback);

	void savePersona(String persona, AsyncCallback<String> callback);

	void listProblems(AsyncCallback<String> callback);

	void getProblem(String name, AsyncCallback<String> callback);

	void saveProblem(String problem, AsyncCallback<String> callback);

	void listPersonaInterviews(final String company,
			AsyncCallback<String> callback);

	void savePersonaInterview(String interview, AsyncCallback<String> callback);

	void listProblemInterviews(final String company,
			AsyncCallback<String> callback);

	void saveProblemInterview(String interview, AsyncCallback<String> callback);
}
