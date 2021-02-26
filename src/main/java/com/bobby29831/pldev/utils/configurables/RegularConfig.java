package com.bobby29831.pldev.utils.configurables;

import com.bobby29831.pldev.AlphaCore;
import dev.spaceseries.spaceapi.config.obj.Config;

public class RegularConfig extends Config {
    public RegularConfig() {
        super(AlphaCore.getInstance().getPlugin(), "config.yml");
    }
}
