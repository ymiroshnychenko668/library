package com.ua.crow.cprint.web.components.bed;

import com.ua.crow.cprint.web.components.Card;
import com.ua.crow.cprint.web.components.general.TemperatureLabel;
import com.ua.crow.cprint.web.components.general.TemperatureNumberInput;
import com.vaadin.componentfactory.ToggleButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.theme.lumo.LumoUtility;


public class BedHeater extends Card {
    TemperatureNumberInput temperatureNumberInput = new TemperatureNumberInput("");
    TemperatureLabel temperatureLabel = new TemperatureLabel("");
    ToggleButton button = new ToggleButton();



    public BedHeater(String title) {
        super(title);
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.add(temperatureNumberInput);
        HorizontalLayout layout = new HorizontalLayout();
        layout.add(button,temperatureLabel);
        verticalLayout.add(layout);
        verticalLayout.addClassNames(LumoUtility.Gap.XSMALL, LumoUtility.Padding.Horizontal.XSMALL, LumoUtility.Padding.Vertical.XSMALL);
        addClassNames(LumoUtility.Padding.SMALL, LumoUtility.BorderRadius.SMALL, LumoUtility.BoxShadow.XSMALL);
        add(verticalLayout);

    }
}
