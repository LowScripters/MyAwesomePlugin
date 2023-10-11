package org.hakerplugin.plugin.Commands;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import net.md_5.bungee.api.chat.hover.content.Item;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

@CommandAlias("bow")
@CommandPermission("TPBow.command")
public class Commands extends BaseCommand {
    @Default
    public void TPBowComm(CommandSender sender) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Ты не проведёшь меня, жалкая машина!");
            return;
        }
        ItemStack bow =new ItemStack(Material.BOW,1);
        ItemMeta meta = bow.getItemMeta();
        meta.setDisplayName("§kТелепортационное устройство многократной зарядки");
        ArrayList<String> lor = new ArrayList<>();
        lor.add("ТУМЗ");
        meta.setLore(lor);
        bow.setItemMeta(meta);
        player.getInventory().addItem(bow);
    }

}