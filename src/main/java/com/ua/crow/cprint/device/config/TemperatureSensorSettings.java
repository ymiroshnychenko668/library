package com.ua.crow.cprint.device.config;

import com.ua.crow.cprint.device.BasicObject;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TemperatureSensorSettings extends BasicObject {
    protected String sensor_type;
    protected String sensor_pin;
    protected Long pullup_resistor;
    protected long inline_resistor;
    protected float adc_voltage;
    protected float voltage_offset;

    public TemperatureSensorSettings(String id) {
        super(id);
    }

//    public String getInlineResistorDescription(Locale locale) {
//        return messageSource.getMessage("heater.inline_resistor", null, locale);
//    }
//
//    public String getAdcVoltageDescription(Locale locale) {
//        return messageSource.getMessage("heater.adc_voltage", null, locale);
//    }
//
//    public String getVoltageOffsetDescription(Locale locale) {
//        return messageSource.getMessage("heater.voltage_offset", null, locale);
//    }
//
//    public String getSensorTypeDescription(Locale locale) {
//        return messageSource.getMessage("heater.sensor_type", null, locale);
//    }
//
//    public String getSensorPinDescription(Locale locale) {
//        return messageSource.getMessage("heater.sensor_pin", null, locale);
//    }
//
//    public String getPullupResistorDescription(Locale locale) {
//        return messageSource.getMessage("heater.pullup_resistor", null, locale);
//    }


}
