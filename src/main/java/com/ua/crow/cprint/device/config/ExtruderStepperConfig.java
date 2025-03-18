package com.ua.crow.cprint.device.config;

import com.ua.crow.cprint.device.BasicObject;
import lombok.Data;

@Data
public class ExtruderStepperConfig extends HeaterSettings {
    private String step_pin;
    private String dir_pin;
    private String enable_pin;
    private Integer microsteps;
    private Double rotation_distance;
    private Integer full_steps_per_rotation;
    private String gear_ratio;
}
