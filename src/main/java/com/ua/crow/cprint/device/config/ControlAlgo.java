package com.ua.crow.cprint.device.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum ControlAlgo {

    PID("pid"),
    WATERMARK("watermark");

    private final String value;

    ControlAlgo(String value) {
        this.value = value;
    }

    @JsonCreator
    public static ControlAlgo valueOfString(String value) {
        return Arrays.stream(ControlAlgo.values())
                .filter(algo -> algo.value.equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown ControlAlgo: " + value));
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
