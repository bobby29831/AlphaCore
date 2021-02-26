package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.Message;
import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.Sender;
import dev.spaceseries.spaceapi.config.impl.Configuration;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCMD {

    @Command(name = "", desc = "Teleports a player to spawn")
    public void spawnCommand(@Sender CommandSender sender) {
        if (sender instanceof Player) {
            Configuration file = AlphaCore.getInstance().getRegularConfig().getConfig();
            if (file.contains("spawn-x") && file.contains("spawn-y") && file.contains("spawn-z") && file.contains("spawn-world")) {
                if (AlphaCore.getInstance().getServer().getWorld(file.getString("spawn-world")) == null) {
                    sender.sendMessage(Message.COULD_NOT_FIND_SPAWN.get());
                    return;
                }
                Location location = new Location(AlphaCore.getInstance().getServer().getWorld(file.getString("spawn-world")), file.getDouble("spawn-x"), file.getDouble("spawn-y"), file.getDouble("spawn-z"));
                Player p = (Player) sender;
                p.teleport(location);
                p.sendMessage(Message.TELEPORTED_TO_SPAWN.get());
            }
        } else {
            sender.sendMessage(Message.MUST_BE_PLAYER.get("/spawn"));
        }
    }
}
