package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.AlphaCore;
import dev.spaceseries.spaceapi.command.Command;
import dev.spaceseries.spaceapi.command.Permissible;
import dev.spaceseries.spaceapi.command.SpaceCommandSender;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@Permissible("alphacore.gsk")
public class GiveStarterKit extends Command {
    public GiveStarterKit() {
        super(AlphaCore.getInstance().getPlugin(), "gsk");
    }

    @Override
    public void onCommand(SpaceCommandSender sender, String label, String... args) {
        if (args.length == 0) {
            sender.sendMessage(AlphaCore.getInstance().colorize("&cUsage: /gsk <player>"));
            return;
        }
        if (args.length == 1) {
            Player target = AlphaCore.getInstance().getServer().getPlayer(args[0]);
            if (target == null) {
                sender.sendMessage(AlphaCore.getInstance().colorize("&cPlayer not found."));
                return;
            }
            sender.sendMessage(AlphaCore.getInstance().colorize("&aAdded kit successfully."));
            target.sendMessage(AlphaCore.getInstance().colorize("&aYou were given the starter kit."));
            target.getInventory().addItem(new ItemStack(Material.LEATHER_HELMET, 1), new ItemStack(Material.LEATHER_CHESTPLATE, 1), new ItemStack(Material.LEATHER_LEGGINGS, 1),
                    new ItemStack(Material.LEATHER_BOOTS, 1), new ItemStack(Material.BOW, 1), new ItemStack(Material.ARROW, 16), new ItemStack(Material.STONE_SWORD, 1),
                    new ItemStack(Material.STONE_PICKAXE, 1), new ItemStack(Material.STONE_AXE, 1), new ItemStack(Material.STONE_PICKAXE, 1), new ItemStack(Material.STONE_SHOVEL, 1),
                    new ItemStack(Material.STONE_HOE, 1), new ItemStack(Material.BREAD, 16));
        }
    }
}
