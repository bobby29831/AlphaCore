package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.SpaceUtil;
import dev.spaceseries.spaceapi.command.Command;
import dev.spaceseries.spaceapi.command.Permissible;
import dev.spaceseries.spaceapi.command.PlayersOnly;
import dev.spaceseries.spaceapi.command.SpaceCommandSender;
import org.bukkit.entity.Player;

@PlayersOnly
@Permissible("alphacore.warpgui")
public class WarpCMD extends Command {

    public WarpCMD() {
        super(AlphaCore.getInstance().getPlugin(), "warp", "Open up the warp GUI");
    }

    @Override
    public void onCommand(SpaceCommandSender sender, String label, String... args) {
        Player p = SpaceUtil.getPlayer(sender);
    }
}
