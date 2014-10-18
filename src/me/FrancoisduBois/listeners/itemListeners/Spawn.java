package me.FrancoisduBois.listeners.itemListeners;

import me.FrancoisduBois.Main;
import org.bukkit.entity.Chicken;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

/**
 * Created by Miklas on 18.10.2014.
 */
public class Spawn implements Listener {



    @EventHandler
    public void onSpawn(CreatureSpawnEvent e){
        if(e.getEntity() instanceof Chicken){
            Main.getInstance().chicken = (Chicken) e.getEntity();
        }
    }

}
