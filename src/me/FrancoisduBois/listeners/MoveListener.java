package me.FrancoisduBois.listeners;

import me.FrancoisduBois.GameState;
import me.FrancoisduBois.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Created by Miklas on 18.10.2014.
 */
public class MoveListener implements Listener {

    public MoveListener(){
        Main.getInstance().getServer().getPluginManager().registerEvents(this, Main.getInstance());
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e){
        if(Main.getInstance().gs == GameState.Spawn){
            e.setCancelled(true);
        }
    }

}
