package com.ua.crow.cprint.device;

import com.ua.crow.cprint.device.config.HeaterSettings;
import lombok.Getter;
import lombok.Setter;

import java.util.function.Consumer;

@Getter
@Setter
public abstract class Heater extends BasicObject {

    private HeaterSettings settings;

    public Heater() {
    }

    public String getId() {
        return settings.getId();
    }

    public void setId(String id) {
        super.setId(id);
        settings.setId(id);
    }

    public Heater(HeaterSettings settings) {
        this.settings = settings;
    }

    public abstract void setTemperature(float temperature);

    public abstract void setPointUpdated(Consumer<Float> consumer);

    public abstract void currentTemperatureUpdate(Consumer<Float> temperatureCallback);

    public abstract void powerOff();
}
