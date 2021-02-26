package com.bobby29831.pldev.handlers;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.gui.MaterialPickerGui;
import com.bobby29831.pldev.utils.MessageUtil;
import com.bobby29831.pldev.utils.SpaceUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player p = event.getPlayer();
        if (AlphaCore.getInstance().getEnteringName().contains(p)) {
            event.setCancelled(true);
            AlphaCore.getInstance().getInCreationNames().put(AlphaCore.getInstance().getInCreationSlots().get(p), event.getMessage());
            MessageUtil.getInstance().nameSelected.msg(SpaceUtil.getSender(p), "{0}", event.getMessage());
            AlphaCore.getInstance().getEnteringName().remove(p);
            Bukkit.getScheduler().runTask(AlphaCore.getInstance(), () -> {
                new MaterialPickerGui().open(p);
            });
        }
    }
}
