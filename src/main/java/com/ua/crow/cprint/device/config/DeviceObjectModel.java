package com.ua.crow.cprint.device.config;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeviceObjectModel {
    private BedConfig bedConfig;
    private ToolheadConfig extruderConfig ;
    private FanConfig fanConfig;
    private CameraHeaterConfig cameraHeaterConfig;

}
