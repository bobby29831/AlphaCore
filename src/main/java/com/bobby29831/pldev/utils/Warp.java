package com.bobby29831.pldev.utils;


import com.bobby29831.pldev.AlphaCore;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.apache.commons.lang.WordUtils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Warp {

    private String name;
    private Material material;
    private int slot;
    private boolean cooldownLocked;

    public Warp(String name, Material material, int slot, boolean cooldownLocked) {
        this.name = name;
        this.material = material;
        this.slot = slot;
        this.cooldownLocked = cooldownLocked;
    }

    public void createItem() {
        ItemStack item = new ItemStack(this.material, 1);
        ItemMeta meta = item.getItemMeta();
        TextComponent nameComponent = Component.text(AlphaCore.getInstance().colorize("&9&l" + WordUtils.capitalize(name.replaceAll("_", " ").toLowerCase()) + " &7(Left Click)"));
        meta.displayName(nameComponent);
        item.setItemMeta(meta);
        AlphaCore.getInstance().getWarpItems().put(this.slot, item);
    }
}
