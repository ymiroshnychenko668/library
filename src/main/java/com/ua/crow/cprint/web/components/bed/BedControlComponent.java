package com.ua.crow.cprint.web.components.bed;

import com.ua.crow.cprint.device.Bed;
import com.ua.crow.cprint.web.components.Card;
import com.ua.crow.cprint.web.components.general.TemperatureNumberInput;
import com.vaadin.componentfactory.ToggleButton;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.theme.lumo.LumoUtility;


public class BedControlComponent extends Card {

    private Bed bed;
    private CrossedBedHeatersComponent crossedBedHeatersComponent = new CrossedBedHeatersComponent();
    private ToggleButton switch_ = new ToggleButton();

    private TemperatureNumberInput setpoint = new TemperatureNumberInput("");


    public BedControlComponent(Bed bed) {
        super("Bed");
        Div cardContent = new Div();
        // Card Title
        VerticalLayout verticalLayout = new VerticalLayout();
        HorizontalLayout horizontalLayout = new HorizontalLayout();


        horizontalLayout.add(switch_);
        horizontalLayout.add(setpoint);

        verticalLayout.add(horizontalLayout);
        verticalLayout.add(crossedBedHeatersComponent);
        verticalLayout.addClassNames(LumoUtility.Gap.SMALL);
        cardContent.add(verticalLayout);
        this.add(cardContent);

    }
    private Div createButtonSection() {
        Div buttonSection = new Div();
        buttonSection.addClassNames(LumoUtility.Display.FLEX, LumoUtility.Gap.SMALL, "pb-s", "px-s");
        Button button1 = new Button("Start");
        button1.setThemeName("tertiary");
        button1.addClassNames(LumoUtility.Margin.NONE);
        Button button2 = new Button("Stop");
        button2.setThemeName("tertiary");
        button2.addClassNames(LumoUtility.Margin.NONE);
        buttonSection.add(button1, button2);
        return buttonSection;
    }
}
