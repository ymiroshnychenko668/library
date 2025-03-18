package com.ua.crow.cprint.device;

import java.util.function.Consumer;

public abstract class Bed extends BasicObject{

    private final static String BED = "bed";

    public Bed() {
        super(BED);
    }

    public abstract void setTemperature(float temperature);

    public abstract void setPointUpdated(Consumer<Float> consumer);

    public abstract void currentTemperatureUpdate(Consumer<Float> temperatureCallback);

    public abstract void powerOff();
}
