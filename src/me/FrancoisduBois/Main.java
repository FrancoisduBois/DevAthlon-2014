package me.FrancoisduBois;

import me.FrancoisduBois.listeners.MoveListener;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Miklas on 18.10.2014.
 */
public class Main extends JavaPlugin {

    public GameState gs;

    private static Main main;

    public void onEnable(){
        main = this;
        System.out.println("MobWars wird gestratet");

        new MoveListener();
    }

    public int minplayers = 3;

    public static Main getInstance(){
        return main;
    }

    public String pr = "§b[§6MobWars§b] §a";

    public void playAllSound(Sound sound, float f1, float f2){

        for(Player all : Bukkit.getOnlinePlayers()){
            all.playSound(all.getLocation(), sound, f1, f2);
        }

    }

    public void playPlayerSound(Player p, Sound sound, float f1, float f2){
        p.playSound(p.getLocation(), sound, f1, f2);
    }

    public Chicken chicken;

}
