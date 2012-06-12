package com.custdevframework.server;

import com.custdevframework.client.CustDevFrameworkService;
import com.custdevframework.server.interviews.ListPersonaInterviews;
import com.custdevframework.server.interviews.ListProblemInterviews;
import com.custdevframework.server.interviews.SavePersonaInterview;
import com.custdevframework.server.interviews.SaveProblemInterview;
import com.custdevframework.server.personas.GetPersona;
import com.custdevframework.server.personas.ListPersonas;
import com.custdevframework.server.personas.SavePersona;
import com.custdevframework.server.problems.GetProblem;
import com.custdevframework.server.problems.ListProblems;
import com.custdevframework.server.problems.SaveProblem;
import com.google.appengine.repackaged.org.json.JSONException;
import com.google.appengine.repackaged.org.json.JSONObject;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class CustDevFrameworkServiceImpl extends RemoteServiceServlet implements
		CustDevFrameworkService {

	public String listPersonas() {

		return ListPersonas.list();
	}

	public String getPersona(final String personaName) {

		return GetPersona.get(personaName);
	}

	public String savePersona(final String personaString) {

		JSONObject personaJson;
		try {
			personaJson = new JSONObject(personaString);

			return SavePersona.save(personaJson);
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return null;
	}

	public String listProblems() {

		return ListProblems.list();
	}

	public String getProblem(final String name) {

		return GetProblem.get(name);
	}

	public String saveProblem(final String problemString) {

		JSONObject json;
		try {

			json = new JSONObject(problemString);

			return SaveProblem.save(json);

		} catch (JSONException e) {

			e.printStackTrace();
		}

		return null;
	}

	public String listPersonaInterviews(final String company) {

		return ListPersonaInterviews.list(company);
	}

	public String savePersonaInterview(final String interview) {

		JSONObject json;
		try {
			json = new JSONObject(interview);

			return SavePersonaInterview.save(json);

		} catch (JSONException e) {

			e.printStackTrace();
		}

		return null;
	}

	public String listProblemInterviews(final String company) {

		return ListProblemInterviews.list(company);
	}

	public String saveProblemInterview(final String interview) {

		JSONObject json;
		try {
			json = new JSONObject(interview);

			return SaveProblemInterview.save(json);

		} catch (JSONException e) {

			e.printStackTrace();
		}

		return null;
	}
}
