package com.custdevframework.client.home;

import com.custdevframework.client.InitializeCustDevFramework;
import com.custdevframework.client.interviews.list.ButtonListInterviews;
import com.custdevframework.client.persona.change.ChangePersonaButton;
import com.custdevframework.client.persona.show.PersonaLink;
import com.custdevframework.client.problems.change.ChangeProblemButton;
import com.custdevframework.client.problems.show.ProblemLink;
import com.custdevframework.client.utilities.ConvertJson;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HomeLists extends HorizontalPanel {

	public static VerticalPanel vpPersona = new VerticalPanel();

	public static VerticalPanel vpProblem = new VerticalPanel();

	public static VerticalPanel vpSolution = new VerticalPanel();

	public static VerticalPanel vpInterviews = new VerticalPanel();

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

		vp.add(new HTML("<b>PERSONA</b>"));

		vpPersona.clear();
		vp.add(vpPersona);

		vp.add(new ChangePersonaButton());

		return vp;

	}

	private VerticalPanel problemPanel() {

		VerticalPanel vpInterview = new VerticalPanel();

		vpInterview.setSpacing(20);
		vpInterview.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		vpInterview.add(new HTML("<b>PROBLEM</b>"));

		vpProblem.clear();
		vpInterview.add(vpProblem);

		vpInterview.add(new ChangeProblemButton());

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

		vpProblems.add(new HTML("<b>INTERVIEWS</b>"));

		vpInterviews.clear();
		vpProblems.add(vpInterviews);

		vpProblems.add(new ButtonListInterviews());

		return vpProblems;
	}

	public static void initHomeLists() {

		vpPersona.clear();
		vpPersona.add(new PersonaLink(ConvertJson
				.convertToString(InitializeCustDevFramework.startupdata
						.get("Persona"))));

		vpProblem.clear();
		vpProblem.add(new ProblemLink(ConvertJson
				.convertToString(InitializeCustDevFramework.startupdata
						.get("Problem"))));

		HTML solution = new HTML(
				"<b>"
						+ ConvertJson
								.convertToString(InitializeCustDevFramework.startupdata
										.get("Solution")) + "</b>");
		vpSolution.clear();
		// vpSolution.add(solution);
	}
}
