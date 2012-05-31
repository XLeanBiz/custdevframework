package com.custdevframework.server;

import org.json.JSONException;
import org.json.JSONObject;

import com.custdevframework.client.CustDevFrameworkService;
import com.custdevframework.server.interviews.ListInterviews;
import com.custdevframework.server.interviews.SaveInterview;
import com.custdevframework.server.personas.GetPersona;
import com.custdevframework.server.personas.ListPersonas;
import com.custdevframework.server.personas.SavePersona;
import com.custdevframework.server.problems.ListProblems;
import com.custdevframework.server.problems.SaveProblem;
import com.custdevframework.server.startupsdata.GetStartupData;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class CustDevFrameworkServiceImpl extends RemoteServiceServlet implements
		CustDevFrameworkService {

	public String getStartupData(final String company) {

		return GetStartupData.getJsonString(company);
	}

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

	public String listInterviews(final String company) {

		return ListInterviews.list(company);
	}

	public String saveInterview(final String interview) {

		JSONObject json;
		try {
			json = new JSONObject(interview);

			return SaveInterview.save(json);

		} catch (JSONException e) {

			e.printStackTrace();
		}

		return null;
	}

}
