package com.ua.crow.cprint.device.config;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
public class BedConfig {
    private List<HeaterSettings> heaterConfig = new LinkedList<>();
}
