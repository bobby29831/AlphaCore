package com.bobby29831.pldev.cmds.help;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.MessageUtil;
import dev.spaceseries.spaceapi.command.Command;
import dev.spaceseries.spaceapi.command.SpaceCommandSender;
import dev.spaceseries.spaceapi.command.SubCommand;

@SubCommand
public class TownyHelpCMD extends Command {

    public TownyHelpCMD() {
        super(AlphaCore.getInstance().getPlugin(), "towny");
    }

    @Override
    public void onCommand(SpaceCommandSender sender, String label, String... args) {
        MessageUtil.getInstance().helpTowny.msg(sender);
    }
}
