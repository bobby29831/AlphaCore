package com.bobby29831.pldev.utils;

import dev.spaceseries.spaceapi.command.SpaceCommandSender;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class SpaceUtil {

    /**
     * Gets a player from a SpaceCommandSender
     *
     * @param spaceCommandSender The command sender
     */
    public static Player getPlayer(SpaceCommandSender spaceCommandSender) {
        if (!spaceCommandSender.isPlayer()) return null;
        return Bukkit.getPlayer(spaceCommandSender.getUuid());
    }
}
