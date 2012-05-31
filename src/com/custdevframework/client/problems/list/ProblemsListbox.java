package com.custdevframework.client.problems.list;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.ListBox;

public class ProblemsListbox extends ListBox {

	public ProblemsListbox(final String problem) {

		if (InitializeCustDevFramework.problemsList != null) {

			this.setWidth("200px");

			this.addItem("");

			for (int i = 0; i < InitializeCustDevFramework.problemsList.size(); i++) {

				JSONObject json = (JSONObject) InitializeCustDevFramework.problemsList
						.get(i);

				String ID = ConvertJson.getStringValue(json, "ID");

				if (ID != null) {

					this.addItem(ID);

					if (ID.equals(problem)) {

						this.setSelectedIndex(i + 1);
					}
				}
			}

		} else {

			ListProblems.list();
		}

	}
}
