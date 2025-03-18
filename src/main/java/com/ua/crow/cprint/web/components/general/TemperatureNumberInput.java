package com.ua.crow.cprint.web.components.general;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.NumberField;

public class TemperatureNumberInput extends NumberField {
    public TemperatureNumberInput(String label) {
        super(label);
        setLabel(label);
        setStep(1);
        setStepButtonsVisible(true);
        setSuffixComponent(new Span("°C"));
//        numberField.setI18n(new NumberFieldI18n()
//                .setBadInputErrorMessage("Invalid number format")
//                .setStepErrorMessage("Duration must be a multiple of 0.5"));

    }
}
