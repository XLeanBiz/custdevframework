package com.custdevframework.client.home;

import com.custdevframework.client.interviews.edit.AddInterviewButton;
import com.custdevframework.client.interviews.list.ListInterviews;
import com.custdevframework.client.persona.edit.AddPersonaButton;
import com.custdevframework.client.persona.list.ListPersonas;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Lists extends HorizontalPanel {

	public static VerticalPanel vpPersonaList = new VerticalPanel();

	public static VerticalPanel vpInterviewsList = new VerticalPanel();

	public static VerticalPanel vpProblemsList = new VerticalPanel();

	public Lists() {

		this.setSpacing(60);

		this.add(listPersonas());

		this.add(listInterviews());

		this.add(listProblems());

	}

	private VerticalPanel listPersonas() {

		VerticalPanel vp = new VerticalPanel();

		vp.setSpacing(20);
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		vp.add(new HTML("<b>PERSONAS</b>"));

		vp.add(new AddPersonaButton());

		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		vpPersonaList.clear();
		vp.add(vpPersonaList);

		ListPersonas.list();

		return vp;

	}

	private VerticalPanel listInterviews() {

		VerticalPanel vpInterview = new VerticalPanel();

		vpInterview.setSpacing(20);
		vpInterview.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		vpInterview.add(new HTML("<b>INTERVIEWS</b>"));

		vpInterview.add(new AddInterviewButton());

		vpInterview.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		vpInterviewsList.clear();
		vpInterview.add(vpInterviewsList);

		ListInterviews.list();

		return vpInterview;

	}

	private VerticalPanel listProblems() {

		VerticalPanel vpProblems = new VerticalPanel();

		vpProblems.setSpacing(20);

		vpProblems.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		vpProblems.add(new HTML("<b>PROBLEMS</b>"));

		// vpProblems.add(new AddPersonaButton());

		vpProblems.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		vpProblemsList.clear();
		vpProblems.add(vpProblemsList);

		// ListPersonas.list();

		return vpProblems;
	}
}
