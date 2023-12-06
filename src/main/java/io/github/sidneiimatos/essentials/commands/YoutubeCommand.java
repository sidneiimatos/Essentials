package io.github.sidneiimatos.essentials.commands;

import io.github.sidneiimatos.essentials.Essentials;
import io.github.sidneiimatos.essentials.configmanager.Config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class YoutubeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Config.CONSOLE_BLOCKED);
            return false;
        }
        if (sender.hasPermission("essentials.commands")) {
            for (String msg : Config.INFORMATIONS_YOUTUBER) {
                sender.sendMessage(msg.replace("&", "§"));
            }
        }
        return false;
    }
}
