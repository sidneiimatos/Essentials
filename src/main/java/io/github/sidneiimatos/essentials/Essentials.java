package io.github.sidneiimatos.essentials;

import io.github.sidneiimatos.essentials.commands.FlyCommand;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Essentials extends JavaPlugin {
    private static Essentials instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        // Plugin startup logic
        getCommand("fly").setExecutor((CommandExecutor) new FlyCommand());

    }
    public static Essentials getInstance() {
        return instance;
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
