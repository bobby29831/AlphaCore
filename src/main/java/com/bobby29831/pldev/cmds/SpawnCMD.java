package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.AlphaCore;

import com.bobby29831.pldev.utils.MessageUtil;
import com.bobby29831.pldev.utils.SpaceUtil;
import dev.spaceseries.spaceapi.command.Command;
import dev.spaceseries.spaceapi.command.PlayersOnly;
import dev.spaceseries.spaceapi.command.SpaceCommandSender;
import dev.spaceseries.spaceapi.config.impl.Configuration;
import org.bukkit.Location;
import org.bukkit.entity.Player;

@PlayersOnly
public class SpawnCMD extends Command {

    public SpawnCMD() {
        super(AlphaCore.getInstance().getPlugin(), "spawn");
    }

    @Override
    public void onCommand(SpaceCommandSender sender, String label, String... args) {
        Player p = SpaceUtil.getPlayer(sender);
        Configuration file = AlphaCore.getInstance().getRegularConfig().getConfig();
        if (file.contains("spawn-x") && file.contains("spawn-y") && file.contains("spawn-z") && file.contains("spawn-world")) {
            if (AlphaCore.getInstance().getServer().getWorld(file.getString("spawn-world")) == null) {
                MessageUtil.getInstance().spawnNotFound.msg(sender);
                return;
            }
            Location location = new Location(AlphaCore.getInstance().getServer().getWorld(file.getString("spawn-world")), file.getDouble("spawn-x"), file.getDouble("spawn-y"), file.getDouble("spawn-z"));
            p.teleport(location);
            MessageUtil.getInstance().spawnTeleport.msg(sender);
        }
    }
}
