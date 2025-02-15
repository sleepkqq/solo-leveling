package com.sleepkqq.sololeveling.view;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Home")
@Route("")
@Menu(order = 0, icon = LineAwesomeIconUrl.CAMPGROUND_SOLID)
@Uses(Icon.class)
public class HomeView extends Composite<VerticalLayout> {

  public HomeView() {
    getContent().setWidth("100%");
    getContent().getStyle().set("flex-grow", "1");
  }
}
