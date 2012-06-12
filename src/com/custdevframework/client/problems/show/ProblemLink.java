package com.custdevframework.client.problems.show;

import com.custdevframework.client.utilities.UseTracking;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;

public class ProblemLink extends HTML {

	public ProblemLink(final String problem) {

		if (problem != null) {

			this.setHTML("<a href=#><b>" + problem + "</b></a>");

			this.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					new UseTracking(this.getClass().getName());

					GetProblem.get(problem);
				}
			});
		}
	}

}
