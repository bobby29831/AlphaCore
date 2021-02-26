package com.bobby29831.pldev.utils.configurables;

import com.bobby29831.pldev.AlphaCore;
import dev.spaceseries.spaceapi.config.obj.Config;

public class MessageConfig extends Config {

    public MessageConfig() {
        super(AlphaCore.getInstance().getPlugin(), "messages.yml");
    }

}
