package com.ua.crow.cprint.device.config;

import com.ua.crow.cprint.device.BasicObject;
import lombok.Data;

@Data
public class StepperConfig extends BasicObject {
    private String step_pin;
    private String dir_pin;
    private String enable_pin;
    private Double rotation_distance;
    private Integer microsteps;
    private Integer full_steps_per_rotation;
    private String gear_ratio;
    private Double step_pulse_duration;
    private String endstop_pin;
    private Double position_min;
    private Double position_endstop;
    private Double position_max;
    private Double homing_speed;
    private Double homing_retract_dist;
    private Double homing_retract_speed;
    private Double second_homing_speed;
    private Boolean homing_positive_dir;
}
