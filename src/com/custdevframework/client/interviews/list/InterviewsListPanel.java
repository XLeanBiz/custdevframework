package com.custdevframework.client.interviews.list;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class InterviewsListPanel extends VerticalPanel {

	public static VerticalPanel vpPersonaInterviews = new VerticalPanel();

	public static VerticalPanel vpProblemInterviews = new VerticalPanel();

	public InterviewsListPanel() {

		this.setSpacing(20);

		HorizontalPanel hp = new HorizontalPanel();
		
		hp.setSpacing(40);

		hp.add(vpPersonaInterviews);
		
		hp.add(new Label(" "));

		hp.add(vpProblemInterviews);

		this.add(hp);

	}
}
