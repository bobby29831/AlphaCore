package com.bobby29831.pldev.cmds.help;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.MessageUtil;
import dev.spaceseries.spaceapi.command.Command;
import dev.spaceseries.spaceapi.command.SpaceCommandSender;

public class HelpCMD extends Command {

    public HelpCMD() {
        super(AlphaCore.getInstance().getPlugin(), "help");

        addSubCommands(new TownyHelpCMD(), new WarpsHelpCMD());
    }

    @Override
    public void onCommand(SpaceCommandSender sender, String label, String... args) {
        MessageUtil.getInstance().helpMain.msg(sender);
    }
}
