package io.github.sidneiimatos.essentials.commands;

import io.github.sidneiimatos.essentials.Essentials;
import io.github.sidneiimatos.essentials.configmanager.Config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class SiteCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Config.CONSOLE_BLOCKED);
            return false;
        }
        if (sender.hasPermission("essentials.commands")) {
            //for (String msg : Essentials.getInstance().getConfig().getStringList("SITE")) {
              //  sender.sendMessage(msg.replace("&", "§"));
            //}//
            for (String msg : Config.INFORMATIONS_SITE) {
                sender.sendMessage(msg.replace("&", "§"));
            }
        }
        return false;
    }
}
