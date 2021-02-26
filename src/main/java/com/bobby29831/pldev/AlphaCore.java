package com.bobby29831.pldev;

import com.bobby29831.pldev.cmds.CreateWarpCMD;
import com.bobby29831.pldev.cmds.DevCMD;
import com.bobby29831.pldev.cmds.SetSpawnCMD;
import com.bobby29831.pldev.cmds.SpawnCMD;
import com.bobby29831.pldev.utils.configurables.MessageConfig;
import com.bobby29831.pldev.utils.configurables.RegularConfig;
import com.bobby29831.pldev.utils.configurables.WarpsConfig;
import com.jonahseguin.drink.CommandService;
import com.jonahseguin.drink.Drink;
import dev.spaceseries.spaceapi.abstraction.plugin.BukkitPlugin;
import dev.spaceseries.spaceapi.gui.listener.GuiListener;
import lombok.Getter;
import org.bukkit.ChatColor;
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

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = new BukkitPlugin(this);
        instance = this;
        CommandService drink = Drink.get(this);
        new GuiListener(this);

        drink.register(new DevCMD(), "dev");
        drink.register(new SetSpawnCMD(), "setspawn");
        drink.register(new SpawnCMD(), "spawn");
        drink.register(new CreateWarpCMD(), "createwarp");
        drink.registerCommands();
        messageConfig = new MessageConfig();
        regularConfig = new RegularConfig();
        warpsConfig = new WarpsConfig();
        warpItems = new HashMap<>();
        takenSlots = new ArrayList<>();

        takenSlots.add(3);
        takenSlots.add(25);
        takenSlots.add(19);
        takenSlots.add(14);

        getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public String colorize(String index) {
        return ChatColor.translateAlternateColorCodes('&', index);
    }
}
