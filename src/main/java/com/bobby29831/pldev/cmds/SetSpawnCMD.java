package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.MessageUtil;
import com.bobby29831.pldev.utils.SpaceUtil;
import dev.spaceseries.spaceapi.command.BukkitSpaceCommandSender;
import dev.spaceseries.spaceapi.command.Permissible;
import dev.spaceseries.spaceapi.command.PlayersOnly;
import dev.spaceseries.spaceapi.command.SpaceCommandSender;
import org.bukkit.entity.Player;

@PlayersOnly
@Permissible("alphacore.setspawn")
public class SetSpawnCMD extends dev.spaceseries.spaceapi.command.Command {

    public SetSpawnCMD() {
        super(AlphaCore.getInstance().getPlugin(), "setspawn");
    }

    @Override
    public void onCommand(SpaceCommandSender sender, String label, String... args) {
        Player p = SpaceUtil.getPlayer(sender);
        AlphaCore.getInstance().getRegularConfig().set("spawn-x", p.getLocation().getX());
        AlphaCore.getInstance().getRegularConfig().set("spawn-y", p.getLocation().getY());
        AlphaCore.getInstance().getRegularConfig().set("spawn-z", p.getLocation().getZ());
        AlphaCore.getInstance().getRegularConfig().set("spawn-world", p.getLocation().getWorld().getName());
        MessageUtil.getInstance().setSpawn.msg(new BukkitSpaceCommandSender(p), "{0}", (int) p.getLocation().getX() + "", "{1}", (int) p.getLocation().getY() + "", "{2}", (int) p.getLocation().getZ() + "");
    }
}
