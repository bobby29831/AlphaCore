package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.Message;
import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.Require;
import com.jonahseguin.drink.annotation.Sender;
import com.jonahseguin.drink.annotation.Text;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class DevCMD {

    @Command(name = "", desc = "Enable/disable a plugin.", usage = "<pluginName>")
    @Require("alphacore.dev")
    public void devCommand(@Sender CommandSender sender, @Text String index) {
        Plugin plugin = AlphaCore.getInstance().getServer().getPluginManager().getPlugin(index);
        if (plugin == null) {
            sender.sendMessage(Message.PLUGIN_NOT_FOUND.get(index));
            return;
        }
        if (plugin.isEnabled()) {
            AlphaCore.getInstance().getServer().getPluginManager().disablePlugin(plugin);
            sender.sendMessage(Message.DISABLED_PLUGIN.get(index));
        } else {
            AlphaCore.getInstance().getServer().getPluginManager().enablePlugin(plugin);
            sender.sendMessage(Message.ENABLED_PLUGIN.get(index));
        }
    }
}
