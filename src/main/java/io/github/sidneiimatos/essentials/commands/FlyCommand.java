package io.github.sidneiimatos.essentials.commands;

import io.github.sidneiimatos.essentials.configmanager.Config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Config.CONSOLE_BLOCKED);
            return false;
        }
        if(sender.hasPermission("essentials.permission.fly")) {
            Player p = (Player)sender;
            if (p.getAllowFlight() == true) {
                p.sendMessage(Config.FLY_DESATIVADO);
                p.setAllowFlight(false);
            } else {
                p.setAllowFlight(true);
                p.sendMessage(Config.FLY_ATIVADO);
            }
        } else {
            sender.sendMessage("Você não tem permissão para utilizar este comando!");
        }
        return false;
    }
}
