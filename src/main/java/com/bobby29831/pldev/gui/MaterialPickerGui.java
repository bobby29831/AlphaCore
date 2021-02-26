package com.bobby29831.pldev.gui;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.MessageUtil;
import com.bobby29831.pldev.utils.SpaceUtil;
import com.bobby29831.pldev.utils.Warp;
import dev.spaceseries.spaceapi.gui.Gui;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MaterialPickerGui extends Gui {

    public MaterialPickerGui() {
        super(AlphaCore.getInstance(), "Choose an icon...", 3);
        Material[] materials = {Material.BLUE_CONCRETE, Material.ORANGE_GLAZED_TERRACOTTA, Material.SUGAR_CANE, Material.SPECTRAL_ARROW, Material.ENCHANTING_TABLE,
                Material.MUSIC_DISC_13, Material.DIAMOND, Material.SPLASH_POTION, Material.MOSSY_STONE_BRICKS, Material.RED_TULIP, Material.DIAMOND_HELMET,
                Material.BEETROOT_SOUP, Material.CAULDRON, Material.COD, Material.OAK_LOG, Material.COOKED_PORKCHOP, Material.RED_WOOL, Material.REPEATER, Material.PURPLE_STAINED_GLASS,
                Material.ENCHANTED_BOOK, Material.CYAN_BED, Material.DIAMOND_PICKAXE, Material.WHEAT_SEEDS, Material.ENDER_EYE, Material.NETHER_BRICK, Material.CHEST, Material.MINECART};

        for (Material material : materials) {
            addItemInteraction(new ItemStack(material, 1), (p, e) -> {
                createWarp(p, e.getCurrentItem().getType());
            });
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
