package com.bobby29831.pldev.gui;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.MessageUtil;
import com.bobby29831.pldev.utils.SpaceUtil;
import dev.spaceseries.spaceapi.gui.Gui;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WarpGui extends Gui {

    public WarpGui() {
        super(AlphaCore.getInstance(), "Choose a warp...", 5);

        for (int i = 0; i < 45; i++) {
            if (AlphaCore.getInstance().getTakenSlots().contains(i + 1)) {
                ItemStack warpItem = AlphaCore.getInstance().getWarpItems().get(i);
                setItemInteraction(i, warpItem, (p, e) -> {
                    p.closeInventory();
                    p.teleport(AlphaCore.getInstance().getWarps().get(e.getSlot()).getLoc());
                    MessageUtil.getInstance().warpTeleport.msg(SpaceUtil.getSender(p), "{0}", AlphaCore.getInstance().getWarps().get(e.getSlot()).getName());
                });
            } else {
                ItemStack blank = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
                ItemMeta blankMeta = blank.getItemMeta();
                String blankName = AlphaCore.getInstance().colorize("&r");
                blankMeta.setDisplayName(blankName);
                blank.setItemMeta(blankMeta);
                setItem(i, blank);
            }
        }
    }
}
