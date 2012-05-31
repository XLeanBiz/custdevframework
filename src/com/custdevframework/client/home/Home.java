package com.custdevframework.client.home;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Home extends VerticalPanel {

	public static VerticalPanel vpHeader = new VerticalPanel();

	public static VerticalPanel vpMain = new VerticalPanel();

	public Home() {

		this.setSpacing(30);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(new HTML(
				"<font size=4><b>The Customer Development Framework</b></font>"));

		this.add(new HTML("MVP #1"));

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

		this.add(new HomeLists());
	}

}
