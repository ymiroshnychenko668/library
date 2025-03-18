package com.ua.crow.cprint.device;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Locale;

@Getter
@Setter
@NoArgsConstructor
public class HeaterVerifier extends   BasicObject{
    private Float max_error = 120f;
    private Integer check_gain_time = 20;
    private Float hysteresis = 5f;
    private Float heating_gain = 2f;


    public HeaterVerifier(String id) {
        super(id);
    }
//
//    public String getMax_error_description(Locale locale) {
//        return messageSource.getMessage("heater.max_error", null, locale);
//    }
//
//    public String getCheck_gain_time_description(Locale locale) {
//        return messageSource.getMessage("heater.check_gain_time", null, locale);
//    }
//
//    public String getHysteresis_description(Locale locale) {
//        return messageSource.getMessage("heater.hysteresis", null, locale);
//    }
//
//    public String getHeating_gain_description(Locale locale) {
//        return messageSource.getMessage("heater.heating_gain", null, locale);
//    }
}
