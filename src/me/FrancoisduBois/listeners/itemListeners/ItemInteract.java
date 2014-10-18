package me.FrancoisduBois.listeners.itemListeners;

import me.FrancoisduBois.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

/**
 * Created by Miklas on 18.10.2014.
 */
public class ItemInteract implements Listener {

    public ItemInteract(){
        Main.getInstance().getServer().getPluginManager().registerEvents(this, Main.getInstance());
    }
    Guns guns = new Guns();


    @EventHandler
    public void onClick(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR){
            if(p.getInventory().getItemInHand().equals(guns.ChickenGun())){
              p.getWorld().spawnEntity(p.getEyeLocation(), EntityType.CHICKEN);
            }
        }
    }

}
