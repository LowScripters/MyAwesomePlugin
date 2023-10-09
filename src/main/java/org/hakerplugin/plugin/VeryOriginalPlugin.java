package org.hakerplugin.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.hakerplugin.plugin.Commands.Commands;
import java.util.logging.Logger;
import co.aikar.commands.BukkitCommandManager;

public final class VeryOriginalPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger log = getLogger();
        log.info("Ihr Plugin läuft, willkommen!");
        BukkitCommandManager manager = new BukkitCommandManager(this);
        manager.registerCommand(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
