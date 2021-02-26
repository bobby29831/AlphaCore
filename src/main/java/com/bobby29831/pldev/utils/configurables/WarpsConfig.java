package com.bobby29831.pldev.utils.configurables;

import com.bobby29831.pldev.AlphaCore;
import com.bobby29831.pldev.utils.Warp;
import dev.spaceseries.spaceapi.config.obj.Config;
import org.bukkit.Location;
import org.bukkit.Material;

public class WarpsConfig extends Config {

    public WarpsConfig() {
        super(AlphaCore.getInstance().getPlugin(), "warps.yml");
    }

    public void readConfig() {
        for (String slot : this.getConfig().getSection("warps").getKeys()) {
            Warp warp = new Warp(getConfig().getString("warps." + slot + ".name"), Material.getMaterial(getConfig().getString("warps." + slot + ".material")), Integer.parseInt(slot),
                    new Location(AlphaCore.getInstance().getServer().getWorld(AlphaCore.getInstance().getWarpsConfig().getConfig().getString("warps." + slot + ".location.world")),
                            AlphaCore.getInstance().getWarpsConfig().getConfig().getDouble("warps." + slot + ".location.x"),
                            AlphaCore.getInstance().getWarpsConfig().getConfig().getDouble("warps." + slot + ".location.y"),
                            AlphaCore.getInstance().getWarpsConfig().getConfig().getDouble("warps." + slot + ".location.z")));
            warp.createItem();
        }
    }
}
