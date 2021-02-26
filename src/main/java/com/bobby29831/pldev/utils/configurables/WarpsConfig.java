package com.bobby29831.pldev.utils.configurables;

import com.bobby29831.pldev.AlphaCore;
import dev.spaceseries.spaceapi.config.obj.Config;

public class WarpsConfig extends Config {

    public WarpsConfig() {
        super(AlphaCore.getInstance().getPlugin(), "warps.yml");
    }
}
