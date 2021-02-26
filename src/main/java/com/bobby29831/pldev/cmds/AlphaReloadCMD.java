package com.bobby29831.pldev.cmds;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.MessageUtil;
import dev.spaceseries.spaceapi.command.Command;
import dev.spaceseries.spaceapi.command.Permissible;
import dev.spaceseries.spaceapi.command.SpaceCommandSender;
import dev.spaceseries.spaceapi.command.SubCommand;

@SubCommand
@Permissible("alphacore.reload")
public class AlphaReloadCMD extends Command {

    public AlphaReloadCMD() {
        super(AlphaCore.getInstance().getPlugin(), "reload", "Reload messages.yml file");
    }

    @Override
    public void onCommand(SpaceCommandSender sender, String label, String... args) {
        try {
            AlphaCore.getInstance().loadMessageConfig();
            MessageUtil.renew();
            MessageUtil.getInstance().reloadSuccess.msg(sender);
        } catch (Exception ignored) {
            MessageUtil.getInstance().reloadFailure.msg(sender);
        }
    }
}
