package org.hakerplugin.plugin.Event;

import org.bukkit.Particle;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.hakerplugin.plugin.VeryOriginalPlugin;

import java.util.ArrayList;
public class BowEvent implements Listener{
    @EventHandler
    public void tparrow(ProjectileHitEvent event){
        if (event.getEntity() instanceof Arrow arrow && arrow.getShooter() instanceof Player player){
            ArrayList<String> lor = new ArrayList<>();
            lor.add("ТУМЗ");
            if (player.getInventory().getItemInMainHand().getItemMeta().getLore().equals(lor)) {
                player.teleport(arrow.getLocation().setDirection(player.getLocation().getDirection()));
                arrow.remove();

                arrow.getWorld().spawnParticle(Particle.DRAGON_BREATH, arrow.getLocation(), 50, 3, 3, 3, 0);
            }
        }
    }
}