package org.hakerplugin.plugin.Commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

@CommandAlias("lieblingsessen")
public class Commands extends BaseCommand {
    private final JavaPlugin plugin;

    public Commands(JavaPlugin plugin) {
        this.plugin = plugin;
    }


    @Default
    public void FoodCom(CommandSender sender, String[] arg) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Du erbärmliche Maschine!");
        } else {
            if (arg.length > 0){
                plugin.getConfig().set("lieblingsessen", String.join(" ", arg));
                plugin.saveConfig();
                player.sendMessage("Das Lieblingsessen wurde in " + plugin.getConfig().get("lieblingsessen") + " geändert");
            } else {
                player.sendMessage("Lieblingsessen: " + plugin.getConfig().get("lieblingsessen"));
            }
        }
    }

}