package com.custdevframework.client.interviews.list;

import com.custdevframework.client.home.Home;
import com.custdevframework.client.utilities.UseTracking;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;

public class ButtonListInterviews extends Button {

	public ButtonListInterviews() {

		this.setText("List Interviews");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new UseTracking(this.getClass().getName());

				startInterviews();
			}
		});
	}

	public static void startInterviews() {

		Home.vpMain.clear();
		Home.vpMain.add(new InterviewsListPanel());

		ListPersonaInterviews.list();

		ListProblemInterviews.list();
	}

}
