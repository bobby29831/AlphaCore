package com.bobby29831.pldev.handlers;

import com.bobby29831.pldev.AlphaCore;
import dev.spaceseries.spaceapi.config.impl.Configuration;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        if (!p.hasPlayedBefore()) {
            p.getInventory().addItem(new ItemStack(Material.LEATHER_HELMET, 1), new ItemStack(Material.LEATHER_CHESTPLATE, 1), new ItemStack(Material.LEATHER_LEGGINGS, 1),
                    new ItemStack(Material.LEATHER_BOOTS, 1), new ItemStack(Material.BOW, 1), new ItemStack(Material.ARROW, 16), new ItemStack(Material.STONE_SWORD, 1),
                    new ItemStack(Material.STONE_PICKAXE, 1), new ItemStack(Material.STONE_AXE, 1), new ItemStack(Material.STONE_PICKAXE, 1), new ItemStack(Material.STONE_SHOVEL, 1),
                    new ItemStack(Material.STONE_HOE, 1), new ItemStack(Material.BREAD, 16));
            Configuration file = AlphaCore.getInstance().getRegularConfig().getConfig();
            if (file.contains("spawn-x") && file.contains("spawn-y") && file.contains("spawn-z") && file.contains("spawn-world")) {
                if (AlphaCore.getInstance().getServer().getWorld(file.getString("spawn-world")) == null) {
                    return;
                }
                Location location = new Location(AlphaCore.getInstance().getServer().getWorld(file.getString("spawn-world")), file.getDouble("spawn-x"), file.getDouble("spawn-y"), file.getDouble("spawn-z"));
                p.teleport(location);
            }
        }
    }
}
