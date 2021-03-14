package com.bobby29831.pldev;

import com.bobby29831.pldev.cmds.*;
import com.bobby29831.pldev.cmds.help.HelpCMD;
import com.bobby29831.pldev.handlers.ChatListener;
import com.bobby29831.pldev.handlers.JoinListener;
import com.bobby29831.pldev.utils.Warp;
import com.bobby29831.pldev.utils.configurables.MessageConfig;
import com.bobby29831.pldev.utils.configurables.RegularConfig;
import com.bobby29831.pldev.utils.configurables.WarpsConfig;
import dev.spaceseries.spaceapi.abstraction.plugin.BukkitPlugin;
import dev.spaceseries.spaceapi.gui.listener.GuiListener;
import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;

public final class AlphaCore extends JavaPlugin {

    @Getter
    private static AlphaCore instance;
    @Getter
    private MessageConfig messageConfig;
    @Getter
    private RegularConfig regularConfig;
    @Getter
    private WarpsConfig warpsConfig;
    @Getter
    private HashMap<Integer, ItemStack> warpItems;
    @Getter
    private ArrayList<Integer> takenSlots;
    @Getter
    private BukkitPlugin plugin;
    @Getter
    private ArrayList<Player> enteringName;
    @Getter
    private ArrayList<Player> enteringMaterial;
    @Getter
    private HashMap<Player, Location> inCreationLocations;
    @Getter
    private HashMap<Player, Integer> inCreationSlots;
    @Getter
    private HashMap<Integer, String> inCreationNames;
    @Getter
    private HashMap<Integer, Warp> warps;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = new BukkitPlugin(this);
        instance = this;
        new GuiListener(this);

        new WarpCMD();
        new AlphaCMD();
        new CreateWarpCMD();
        new SetSpawnCMD();
        new SpawnCMD();
        new WarpCMD();
        new GiveStarterKit();
        new HelpCMD();

        loadMessageConfig();
        regularConfig = new RegularConfig();
        warpsConfig = new WarpsConfig();
        warpItems = new HashMap<>();
        takenSlots = new ArrayList<>();
        enteringName = new ArrayList<>();
        enteringMaterial = new ArrayList<>();
        inCreationSlots = new HashMap<>();
        inCreationNames = new HashMap<>();
        inCreationLocations = new HashMap<>();
        warps = new HashMap<>();

        warpsConfig.readConfig();

        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadMessageConfig() {
        messageConfig = new MessageConfig();
    }

    public String colorize(String index) {
        return ChatColor.translateAlternateColorCodes('&', index);
    }
}
