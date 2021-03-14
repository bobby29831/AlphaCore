package com.bobby29831.pldev.handlers;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.gui.MaterialPickerGui;
import com.bobby29831.pldev.utils.MessageUtil;
import com.bobby29831.pldev.utils.SpaceUtil;
import com.bobby29831.pldev.utils.Warp;
import org.bukkit.Bukkit;
import org.bukkit.Material;
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
            Bukkit.getScheduler().runTask(AlphaCore.getInstance(), () -> new MaterialPickerGui().open(p));
        }

        if (AlphaCore.getInstance().getEnteringMaterial().contains(p)) {
            event.setCancelled(true);
            if (event.getMessage().equalsIgnoreCase("%held%")) {
                if (p.getInventory().getItemInMainHand().getType() == Material.AIR) {
                    MessageUtil.getInstance().materialInvalid.msg(SpaceUtil.getSender(p));
                    return;
                }
                Material material = p.getInventory().getItemInMainHand().getType();
                Bukkit.getScheduler().runTask(AlphaCore.getInstance(), () -> {
                    createWarp(event.getPlayer(), material);
                    AlphaCore.getInstance().getEnteringMaterial().remove(event.getPlayer());
                });
            } else {
                Material material = Material.getMaterial(event.getMessage());
                if (material == null) {
                    MessageUtil.getInstance().materialInvalid.msg(SpaceUtil.getSender(p));
                    return;
                }
                Bukkit.getScheduler().runTask(AlphaCore.getInstance(), () -> {
                    createWarp(event.getPlayer(), material);
                    AlphaCore.getInstance().getEnteringMaterial().remove(event.getPlayer());
                });
            }
        }
    }

    private void createWarp(Player p, Material material) {
        Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), material, AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
        warp.createItem();
        warp.addToWarpConfig();
        AlphaCore.getInstance().getInCreationNames().remove(AlphaCore.getInstance().getInCreationSlots().get(p));
        AlphaCore.getInstance().getInCreationSlots().remove(p);
        AlphaCore.getInstance().getInCreationLocations().remove(p);
        p.closeInventory();
        MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", material.toString());
    }
}
