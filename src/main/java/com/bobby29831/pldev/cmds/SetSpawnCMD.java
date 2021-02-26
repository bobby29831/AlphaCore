package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.Message;
import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.Require;
import com.jonahseguin.drink.annotation.Sender;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCMD {


    @Command(name = "", desc = "Change where /spawn teleports people to")
    @Require("alphacore.setspawn")
    public void setSpawnCommand(@Sender CommandSender sender) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            AlphaCore.getInstance().getRegularConfig().set("spawn-x", p.getLocation().getX());
            AlphaCore.getInstance().getRegularConfig().set("spawn-y", p.getLocation().getY());
            AlphaCore.getInstance().getRegularConfig().set("spawn-z", p.getLocation().getZ());
            AlphaCore.getInstance().getRegularConfig().set("spawn-world", p.getLocation().getWorld().getName());
            p.sendMessage(Message.SET_SPAWN.get((int) p.getLocation().getX() + "", (int) p.getLocation().getY() + "", (int) p.getLocation().getZ() + ""));
        } else {
            sender.sendMessage(Message.MUST_BE_PLAYER.get("/setspawn"));
        }
    }
}
