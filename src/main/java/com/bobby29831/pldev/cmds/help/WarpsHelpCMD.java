package com.bobby29831.pldev.cmds.help;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.MessageUtil;
import dev.spaceseries.spaceapi.command.Command;
import dev.spaceseries.spaceapi.command.SpaceCommandSender;
import dev.spaceseries.spaceapi.command.SubCommand;

@SubCommand
public class WarpsHelpCMD extends Command {

    public WarpsHelpCMD() {
        super(AlphaCore.getInstance().getPlugin(), "warps");
    }

    @Override
    public void onCommand(SpaceCommandSender sender, String label, String... args) {
        MessageUtil.getInstance().helpWarps.msg(sender);
    }
}
