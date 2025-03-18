package com.ua.crow.cprint.web.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.theme.lumo.LumoUtility;

public class Card extends Div {
    Div headerContainer = new Div();

    public Card(String title) {
        // Main card styling
        this.getStyle().set("width", "100%");
        this.addClassNames(LumoUtility.Background.BASE, LumoUtility.Display.FLEX,
                LumoUtility.FlexDirection.COLUMN,
                LumoUtility.Overflow.HIDDEN,
                LumoUtility.BorderRadius.MEDIUM,
                LumoUtility.BoxShadow.SMALL
        );

        // Create header section with title
        headerContainer.addClassNames(LumoUtility.Padding.SMALL, LumoUtility.Gap.SMALL);

        Span cardTitle = new Span(title);
        cardTitle.addClassNames(LumoUtility.FontWeight.SEMIBOLD, LumoUtility.FontSize.LARGE);
        headerContainer.add(cardTitle);


        // Add header to card
        this.add(headerContainer);
    }

    protected Div getHeader() {
        return headerContainer;
    }
}
