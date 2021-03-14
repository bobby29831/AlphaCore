package com.bobby29831.pldev.gui;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.MessageUtil;
import com.bobby29831.pldev.utils.SpaceUtil;
import com.bobby29831.pldev.utils.Warp;
import dev.spaceseries.spaceapi.gui.Gui;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MaterialPickerGui extends Gui {

    public MaterialPickerGui() {
        super(AlphaCore.getInstance(), "Choose an icon...", 4);
        Material[] materials = {Material.BLUE_CONCRETE, Material.ORANGE_GLAZED_TERRACOTTA, Material.SUGAR_CANE, Material.SPECTRAL_ARROW, Material.ENCHANTING_TABLE,
                Material.MUSIC_DISC_13, Material.DIAMOND, Material.SPLASH_POTION, Material.MOSSY_STONE_BRICKS, Material.RED_TULIP, Material.DIAMOND_HELMET,
                Material.BEETROOT_SOUP, Material.CAULDRON, Material.COD, Material.OAK_LOG, Material.COOKED_PORKCHOP, Material.RED_WOOL, Material.REPEATER, Material.PURPLE_STAINED_GLASS,
                Material.ENCHANTED_BOOK, Material.CYAN_BED, Material.DIAMOND_PICKAXE, Material.WHEAT_SEEDS, Material.ENDER_EYE, Material.NETHER_BRICK, Material.CHEST, Material.MINECART};

        for (Material material : materials) {
            addItemInteraction(new ItemStack(material, 1), (p, e) -> {
                createWarp(p, e.getCurrentItem().getType());
            });
        }

        ItemStack manuallyEnter = new ItemStack(Material.OAK_SIGN, 1);
        ItemMeta mEMeta = manuallyEnter.getItemMeta();
        String mEName = AlphaCore.getInstance().colorize("&9&lEnter Manually... &7(Left Click)");
        List<String> mELore = new ArrayList<>();
        mELore.add(AlphaCore.getInstance().colorize("&7Click to manually enter the material's"));
        mELore.add(AlphaCore.getInstance().colorize("&7name in chat. Works with all 1.16.5"));
        mELore.add(AlphaCore.getInstance().colorize("&7items."));
        mEMeta.setDisplayName(mEName);
        mEMeta.setLore(mELore);
        manuallyEnter.setItemMeta(mEMeta);


        setItemInteraction(31, manuallyEnter, (p, e) -> {
            p.closeInventory();
            AlphaCore.getInstance().getEnteringMaterial().add(p);
            MessageUtil.getInstance().enterMaterial.msg(SpaceUtil.getSender(p));
        });

        for (int i = 1; i < 9; i++) {
            ItemStack blank = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
            ItemMeta blankMeta = blank.getItemMeta();
            String blankName = AlphaCore.getInstance().colorize("&r");
            blankMeta.setDisplayName(blankName);
            blank.setItemMeta(blankMeta);
            addItem(blank);
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
