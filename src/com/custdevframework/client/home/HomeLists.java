package com.custdevframework.client.home;

import co.uniqueid.authentication.client.utilities.ConvertJson;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.interviews.list.ButtonListInterviews;
import com.custdevframework.client.persona.list.ListPersonas;
import com.custdevframework.client.persona.show.PersonaLink;
import com.custdevframework.client.problems.change.ChangeProblem;
import com.custdevframework.client.problems.show.ProblemLink;
import com.custdevframework.client.utilities.UseTracking;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HomeLists extends HorizontalPanel {

	public static VerticalPanel vpPersona = new VerticalPanel();

	public static VerticalPanel vpProblem = new VerticalPanel();

	public static VerticalPanel vpSolution = new VerticalPanel();

	public HomeLists() {

		this.setSpacing(60);

		this.add(personaPanel());

		this.add(problemPanel());

		this.add(solutionPanel());

		this.add(interviewsPanel());
	}

	private VerticalPanel personaPanel() {

		VerticalPanel vp = new VerticalPanel();

		vp.setSpacing(20);
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		HTML personaTitle = new HTML(
				"<a href=#><font color=black><b>PERSONA</b></font></a>");
		personaTitle.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				new UseTracking(this.getClass().getName());

				ListPersonas.list();
			}
		});
		vp.add(personaTitle);

		vpPersona.clear();
		vp.add(vpPersona);

		return vp;

	}

	private VerticalPanel problemPanel() {

		VerticalPanel vpInterview = new VerticalPanel();

		vpInterview.setSpacing(20);
		vpInterview.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		HTML problemTitle = new HTML(
				"<a href=#><font color=black><b>PROBLEM</b></font></a>");
		problemTitle.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				new UseTracking(this.getClass().getName());

				Home.vpMain.clear();
				Home.vpMain.add(new ChangeProblem());
			}
		});
		vpInterview.add(problemTitle);

		vpProblem.clear();
		vpInterview.add(vpProblem);

		return vpInterview;
	}

	private VerticalPanel solutionPanel() {

		VerticalPanel vpProblems = new VerticalPanel();

		vpProblems.setSpacing(20);

		vpProblems.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		vpProblems.add(new HTML("<b>SOLUTION</b>"));

		vpSolution.clear();
		vpProblems.add(vpSolution);

		// vpProblems.add(new AddPersonaButton());

		return vpProblems;
	}

	private VerticalPanel interviewsPanel() {

		VerticalPanel vpProblems = new VerticalPanel();

		vpProblems.setSpacing(20);

		vpProblems.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		vpProblems.add(new ButtonListInterviews());

		return vpProblems;
	}

	public static void initHomeLists() {

		if (InitializeCustDevFramework.startupdata != null) {

			vpPersona.clear();
			vpPersona.add(new PersonaLink(ConvertJson
					.convertToString(InitializeCustDevFramework.startupdata
							.get("Persona"))));

			vpProblem.clear();
			vpProblem.add(new ProblemLink(ConvertJson
					.convertToString(InitializeCustDevFramework.startupdata
							.get("Problem"))));
		}
	}
}
