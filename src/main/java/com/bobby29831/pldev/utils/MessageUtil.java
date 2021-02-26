package com.bobby29831.pldev.utils;

import com.bobby29831.pldev.AlphaCore;
import dev.spaceseries.spaceapi.config.impl.Configuration;
import dev.spaceseries.spaceapi.text.Message;

public class MessageUtil {

    /**
     * Instance of this class
     */
    private static MessageUtil instance;

    /**
     * Gets instance of messages class
     * <p>(Singleton)</p>
     *
     * @return messages
     */
    public static MessageUtil getInstance() {
        if (instance == null)
            instance = new MessageUtil();
        return instance;
    }


    /**
     * Renews the messages
     */
    public static void renew() {
        instance = null;
    }

    /* General */

    // Setting Spawn
    public Message setSpawn = Message.fromConfigurationSection(getLangConfiguration().getSection("spawn.set"), "general.help")
            .build();

    public Message spawnTeleport = Message.fromConfigurationSection(getLangConfiguration().getSection("spawn.teleport"), "general.help")
            .build();

    public Message spawnNotFound = Message.fromConfigurationSection(getLangConfiguration().getSection("spawn.notfound"), "general.help")
            .build();
    /* Reload */

    // success
    public Message reloadSuccess = Message.fromConfigurationSection(getLangConfiguration().getSection("reload.success"), "reload.success")
            .build();

    // failure
    public Message reloadFailure = Message.fromConfigurationSection(getLangConfiguration().getSection("reload.failure"), "reload.failure")
            .build();

    /**
     * Gets the lang configuration from the main class
     *
     * @return The lang configuration
     */
    private Configuration getLangConfiguration() {
        return AlphaCore.getInstance().getMessageConfig().getConfig();
    }
}
