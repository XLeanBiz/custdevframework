package com.custdevframework.client.home.header;

import com.custdevframework.client.InitializeCustDevFramework;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;

public class Logo extends HTML {

	public Logo() {

		this.setHTML("<a href=#><img src='images/custdevday.png' border=0 height=35></a>");

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				InitializeCustDevFramework.reinit();
			}
		});
	}
}
