package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.gui.SlotPickerGui;
import com.bobby29831.pldev.utils.SpaceUtil;
import dev.spaceseries.spaceapi.command.Command;
import dev.spaceseries.spaceapi.command.Permissible;
import dev.spaceseries.spaceapi.command.SpaceCommandSender;
import org.bukkit.entity.Player;

@Permissible("alphacore.createwarp")
public class CreateWarpCMD extends Command {

    public CreateWarpCMD() {
        super(AlphaCore.getInstance().getPlugin(), "createwarp");
    }

    @Override
    public void onCommand(SpaceCommandSender sender, String label, String... args) {
        Player p = SpaceUtil.getPlayer(sender);
        AlphaCore.getInstance().getInCreationLocations().put(p, p.getLocation());
        new SlotPickerGui().open(p);
    }
}
