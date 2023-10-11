package org.hakerplugin.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.hakerplugin.plugin.Commands.Commands;
import java.util.logging.Logger;
import co.aikar.commands.BukkitCommandManager;
import org.hakerplugin.plugin.Event.BowEvent;

public final class VeryOriginalPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger log = getLogger();
        log.info("Ihr Plugin läuft, willkommen!");
        BukkitCommandManager manager = new BukkitCommandManager(this);
        manager.registerCommand(new Commands());
        getServer().getPluginManager().registerEvents(new BowEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
