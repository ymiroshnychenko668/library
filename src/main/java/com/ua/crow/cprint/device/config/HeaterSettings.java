package com.ua.crow.cprint.device.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
@NoArgsConstructor
public class HeaterSettings extends TemperatureSensorSettings {
    @Serial
    private static final long serialVersionUID = -7203489957843596926L;
    private HeaterVerifier heaterVerifier;
    protected String heater_pin;
    protected float max_power;
    protected float smooth_time;
    protected ControlAlgo control;
    protected Float pid_Kp;
    protected Float pid_Ki;
    protected Float pid_Kd;
    protected Float max_delta;
    protected Float pwm_cycle_time;
    protected Float min_temp;
    protected Float max_temp;


    public HeaterSettings(String id) {
        super(id);
    }

//    public String getHeaterPinDescription(Locale locale) {
//        return messageSource.getMessage("heater.heater_pin", null, locale);
//    }
//
//    public String getMaxPowerDescription(Locale locale) {
//        return messageSource.getMessage("heater.max_power", null, locale);
//    }
//
//
//    public String getSmoothTimeDescription(Locale locale) {
//        return messageSource.getMessage("heater.smooth_time", null, locale);
//    }
//
//    public String getControlDescription(Locale locale) {
//        return messageSource.getMessage("heater.control", null, locale);
//    }
//
//    public String getMaxTempDescription(Locale locale) {
//        return messageSource.getMessage("heater.max_temp", null, locale);
//    }
//
//    public String getMinTempDescription(Locale locale) {
//        return messageSource.getMessage("heater.min_temp", null, locale);
//    }


}
