package com.ua.crow.cprint.web.components.general;

import com.vaadin.flow.component.html.Span;

public class TemperatureLabel extends Span {
    public TemperatureLabel(String text) {
        super(text+ "°C");
    }
}
