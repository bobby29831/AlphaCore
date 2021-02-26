package com.bobby29831.pldev.gui;

import com.bobby29831.pldev.AlphaCore;
import dev.spaceseries.spaceapi.gui.Gui;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SlotPickerGui extends Gui {

    public SlotPickerGui() {
        super(AlphaCore.getInstance(), "Select a slot...", 5);
        for (int i = 1; i < 28; i++) {
            ItemStack item;
            if (AlphaCore.getInstance().getTakenSlots().contains(i)) {
                item = new ItemStack(Material.RED_STAINED_GLASS_PANE, i);
                ItemMeta meta = item.getItemMeta();
                TextComponent name = Component.text(AlphaCore.getInstance().colorize("&c" + i));
                meta.displayName(name);
                item.setItemMeta(meta);
            } else {
                item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, i);
                ItemMeta meta = item.getItemMeta();
                TextComponent name = Component.text(AlphaCore.getInstance().colorize("&f" + i));
                meta.displayName(name);
                item.setItemMeta(meta);
            }
            setItem(i - 1, item);
        }
        ItemStack blank = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta blankMeta = blank.getItemMeta();
        TextComponent blankName = Component.text(AlphaCore.getInstance().colorize("&r"));
        blankMeta.displayName(blankName);
        blank.setItemMeta(blankMeta);
        for (int i = 28; i < 37; i++) {
            setItem(i - 1, blank);
        }

    }
}
