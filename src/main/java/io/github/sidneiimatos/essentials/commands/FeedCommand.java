package io.github.sidneiimatos.essentials.commands;

import io.github.sidneiimatos.essentials.configmanager.Config;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Config.CONSOLE_BLOCKED);
            return false;
        }
        if (sender.hasPermission("essentials.commands.heal")) {
            if (args.length == 0) {
                Player p = (Player)sender;
                if (getLife(p) == true) {
                    p.sendMessage("Sua vida não pode ser restaurada");
                } else {
                    setLife(p);
                }
            } else {
                Player target = Bukkit.getPlayer(args[0]);
                if (target == null) {
                    sender.sendMessage("Este jogador não foi encontrado");
                } else {
                    if (getLife(target) == true) {
                        sender.sendMessage("A vida desse jogador não pode ser restaurada");
                        target.sendMessage(sender.getName() + " tentou restaurar sua vida!");
                    } else {
                        setLife(target);
                    }
                }
            }
        } else {
            sender.sendMessage(Config.NO_PERMISSION);
        }
        return false;
    }

    public boolean getLife(Player p) {
        return p.getHealth() == 20 && p.getFoodLevel() == 20;
    }
    public void setLife(Player p) {
        p.setFoodLevel(20);
        p.setHealth(20);
        p.sendMessage("Sua vida foi restaurada com sucesso!");
    }
}
