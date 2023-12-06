package io.github.sidneiimatos.essentials;

import io.github.sidneiimatos.essentials.commands.FeedCommand;
import io.github.sidneiimatos.essentials.commands.FlyCommand;
import io.github.sidneiimatos.essentials.commands.SiteCommand;
import io.github.sidneiimatos.essentials.commands.YoutubeCommand;
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
        getCommand("site").setExecutor((CommandExecutor) new SiteCommand());
        getCommand("youtube").setExecutor((CommandExecutor) new YoutubeCommand());
        getCommand("heal").setExecutor((CommandExecutor) new FeedCommand());

    }
    public static Essentials getInstance() {
        return instance;
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
