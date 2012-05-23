package com.custdevframework.server;

import org.json.JSONException;
import org.json.JSONObject;

import com.custdevframework.client.CustDevFrameworkService;
import com.custdevframework.server.personas.GetPersona;
import com.custdevframework.server.personas.ListPersonas;
import com.custdevframework.server.personas.SavePersona;
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

}
