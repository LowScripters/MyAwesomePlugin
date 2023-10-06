package org.hakerplugin.plugin;

import com.google.common.util.concurrent.Service;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class VeryOriginalPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JumpListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
