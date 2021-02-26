package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.AlphaCore;

import dev.spaceseries.spaceapi.command.Command;
import dev.spaceseries.spaceapi.command.SpaceCommandSender;


public class AlphaCMD extends Command {

    public AlphaCMD() {
        super(AlphaCore.getInstance().getPlugin(), "alpha", "main cmd");

        addSubCommands(new AlphaReloadCMD());
    }

    @Override
    public void onCommand(SpaceCommandSender sender, String label, String... args) {

    }
}
