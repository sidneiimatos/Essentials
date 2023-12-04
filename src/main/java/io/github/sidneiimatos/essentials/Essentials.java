package io.github.sidneiimatos.essentials;

import io.github.sidneiimatos.essentials.commands.CommandFly;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Essentials extends JavaPlugin {
    private static Essentials instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        // Plugin startup logic
        getCommand("fly").setExecutor((CommandExecutor) new CommandFly());

    }
    public static Essentials getInstance() {
        return instance;
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
