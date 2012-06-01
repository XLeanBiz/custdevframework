package com.custdevframework.client.problems.change;

import co.uniqueid.authentication.client.UniqueIDGlobalVariables;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.startupdata.SaveStartupData;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;

public class ButtonSaveProblem extends Button {

	public ButtonSaveProblem() {

		this.setHTML("Save");
		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				String companyID = ConvertJson
						.convertToString(UniqueIDGlobalVariables.companyUniqueID
								.get("ID"));

				SaveStartupData.save(companyID, "Problem", ChangeProblem.list
						.getValue(ChangeProblem.list.getSelectedIndex()));

				InitializeCustDevFramework.reinit();
			}
		});
	}
}
