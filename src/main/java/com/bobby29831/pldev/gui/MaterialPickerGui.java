package com.bobby29831.pldev.gui;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.MessageUtil;
import com.bobby29831.pldev.utils.SpaceUtil;
import com.bobby29831.pldev.utils.Warp;
import dev.spaceseries.spaceapi.gui.Gui;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MaterialPickerGui extends Gui {

    public MaterialPickerGui() {
        super(AlphaCore.getInstance(), "Choose an icon...", 3);

        addItemInteraction(new ItemStack(Material.BLUE_CONCRETE, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            AlphaCore.getInstance().getInCreationNames().remove(AlphaCore.getInstance().getInCreationSlots().get(p));
            AlphaCore.getInstance().getInCreationSlots().remove(p);
            AlphaCore.getInstance().getInCreationLocations().remove(p);
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.ORANGE_GLAZED_TERRACOTTA, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.SUGAR_CANE, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.SPECTRAL_ARROW, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.ENCHANTING_TABLE, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.MUSIC_DISC_13, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.DIAMOND, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.SPLASH_POTION, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.MOSSY_STONE_BRICKS, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.RED_TULIP, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.DIAMOND_HELMET, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.BEETROOT_SOUP, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.CAULDRON, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.COD, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.OAK_LOG, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.COOKED_PORKCHOP, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.RED_WOOL, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.REPEATER, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.PURPLE_STAINED_GLASS, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.ENCHANTED_BOOK, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.CYAN_BED, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.DIAMOND_PICKAXE, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.WHEAT_SEEDS, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.ENDER_EYE, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.NETHER_BRICK, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.CHEST, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
        addItemInteraction(new ItemStack(Material.MINECART, 1), (p, e) -> {
            Warp warp = new Warp(AlphaCore.getInstance().getInCreationNames().get(AlphaCore.getInstance().getInCreationSlots().get(p)), e.getCurrentItem().getType(), AlphaCore.getInstance().getInCreationSlots().get(p), AlphaCore.getInstance().getInCreationLocations().get(p));
            warp.createItem();
            warp.addToWarpConfig();
            p.closeInventory();
            MessageUtil.getInstance().materialSelected.msg(SpaceUtil.getSender(p), "{0}", e.getCurrentItem().getType().toString());
        });
    }

}
