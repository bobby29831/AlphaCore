package com.bobby29831.pldev.utils;

import com.bobby29831.pldev.AlphaCore;
import net.md_5.bungee.api.ChatColor;

import java.text.MessageFormat;

public enum Message {

    DISABLED_PLUGIN(AlphaCore.getInstance().getMessageConfig().getConfig().getString("disabled-plugin")),
    ENABLED_PLUGIN(AlphaCore.getInstance().getMessageConfig().getConfig().getString("enabled-plugin")),
    PLUGIN_NOT_FOUND(AlphaCore.getInstance().getMessageConfig().getConfig().getString("plugin-not-found")),
    MUST_BE_PLAYER(AlphaCore.getInstance().getMessageConfig().getConfig().getString("must-be-player")),
    SET_SPAWN(AlphaCore.getInstance().getMessageConfig().getConfig().getString("set-spawn")),
    TELEPORTED_TO_SPAWN(AlphaCore.getInstance().getMessageConfig().getConfig().getString("teleported-to-spawn")),
    COULD_NOT_FIND_SPAWN(AlphaCore.getInstance().getMessageConfig().getConfig().getString("could-not-find-spawn"))
    ;

    private final String string;

    Message(String string) {
        this.string = string;
    }

    public String get() {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public String get(String x) {
        return ChatColor.translateAlternateColorCodes('&', MessageFormat.format(string, x));
    }
    public String get(String x, String y) {
        return ChatColor.translateAlternateColorCodes('&', MessageFormat.format(string, x, y));
    }
    public String get(String x, String y, String z) {
        return ChatColor.translateAlternateColorCodes('&', MessageFormat.format(string, x, y, z));
    }
}
