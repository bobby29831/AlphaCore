package com.bobby29831.pldev.utils;


import com.bobby29831.pldev.AlphaCore;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Warp {

    @Getter
    private final String name;
    private final Material material;
    private final int slot;
    @Getter
    private final Location loc;

    public Warp(String name, Material material, int slot, Location loc) {
        this.name = name;
        this.material = material;
        this.slot = slot;
        this.loc = loc;
        AlphaCore.getInstance().getWarps().put(slot, this);
    }

    public void createItem() {
        ItemStack item = new ItemStack(this.material, 1);
        ItemMeta meta = item.getItemMeta();
        String newName = AlphaCore.getInstance().colorize("&9&l" + name + " &7(Left Click)");
        meta.setDisplayName(newName);
        item.setItemMeta(meta);
        AlphaCore.getInstance().getWarpItems().put(this.slot, item);
        AlphaCore.getInstance().getTakenSlots().add(this.slot + 1);
    }

    public void addToWarpConfig() {
        AlphaCore.getInstance().getWarpsConfig().set("warps." + slot + ".name", name);
        AlphaCore.getInstance().getWarpsConfig().set("warps." + slot + ".material", material.toString());
        AlphaCore.getInstance().getWarpsConfig().set("warps." + slot + ".location.x", loc.getX());
        AlphaCore.getInstance().getWarpsConfig().set("warps." + slot + ".location.y", loc.getY());
        AlphaCore.getInstance().getWarpsConfig().set("warps." + slot + ".location.z", loc.getZ());
        AlphaCore.getInstance().getWarpsConfig().set("warps." + slot + ".location.world", loc.getWorld().getName());
    }
}
