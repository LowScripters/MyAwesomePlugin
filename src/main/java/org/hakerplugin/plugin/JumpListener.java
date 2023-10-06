package org.hakerplugin.plugin;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class JumpListener implements Listener {

    @EventHandler
    public void onPlayerJump(PlayerJumpEvent event){
        event.getPlayer().sendMessage("NO");
    }
}
