package com.ua.crow.cprint.device.config;

import lombok.Data;

@Data
public class ExtruderConfig extends ExtruderStepperConfig {
    private Double nozzle_diameter;
    private Double filament_diameter;
    private Double max_extrude_cross_section;
    private Double instantaneous_corner_velocity;
    private Double max_extrude_only_distance;
    private Double max_extrude_only_velocity;
    private Double max_extrude_only_accel;
    private Double pressure_advance;
    private Double pressure_advance_smooth_time;
}
