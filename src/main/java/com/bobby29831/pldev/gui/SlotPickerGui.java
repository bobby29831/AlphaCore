package com.bobby29831.pldev.gui;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.MessageUtil;
import com.bobby29831.pldev.utils.SpaceUtil;
import dev.spaceseries.spaceapi.gui.Gui;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SlotPickerGui extends Gui {

    public SlotPickerGui() {
        super(AlphaCore.getInstance(), "Select a slot...", 3);
        for (int i = 1; i < 28; i++) {
            ItemStack item;
            if (AlphaCore.getInstance().getTakenSlots().contains(i)) {
                item = new ItemStack(Material.RED_STAINED_GLASS_PANE, i);
                ItemMeta meta = item.getItemMeta();
                TextComponent name = Component.text(AlphaCore.getInstance().colorize("&c" + i));
                meta.displayName(name);
                item.setItemMeta(meta);
                setItem(i - 1, item);
            } else {
                item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, i);
                ItemMeta meta = item.getItemMeta();
                TextComponent name = Component.text(AlphaCore.getInstance().colorize("&f" + i));
                meta.displayName(name);
                item.setItemMeta(meta);
                setItemInteraction(i - 1, item, (p, e) -> {
                    p.closeInventory();
                    MessageUtil.getInstance().slotSelected.msg(SpaceUtil.getSender(p), "{0}",  + e.getSlot() + 1 + "");
                    AlphaCore.getInstance().getInCreationSlots().put(p, e.getSlot());
                    AlphaCore.getInstance().getEnteringName().add(p);
                });
            }
        }
    }
}
