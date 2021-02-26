package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.gui.SlotPickerGui;
import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.Require;
import com.jonahseguin.drink.annotation.Sender;
import com.jonahseguin.drink.annotation.Text;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CreateWarpCMD {

    @Command(name = "", desc = "Create a warp at the coordinates you're standing at", usage = "<name>")
    @Require("alphacore.createwarp")
    public void onCreateWarpCommand(@Sender CommandSender sender, @Text String name) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            new SlotPickerGui().open(p);
        }
    }
}
