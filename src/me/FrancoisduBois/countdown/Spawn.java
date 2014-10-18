package me.FrancoisduBois.countdown;

import me.FrancoisduBois.GameState;
import me.FrancoisduBois.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;

/**
 * Created by Miklas on 18.10.2014.
 */
public class Spawn {

    public int Count;
    public int count;

    public void CountDown(int length) {

        Count = length+1;

        if(Main.getInstance().gs == GameState.Spawn){
            count = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
                @Override
                public void run() {
                    if(Count != 0){
                        Count--;
                    }
                    if(Count==15||Count==10||Count==5||Count==4||Count==3||
                            Count==2){
                        Bukkit.broadcastMessage("Das Spiel beginnt in "+Count+" Sekunden");
                        Main.getInstance().playAllSound(Sound.NOTE_PIANO, 50F, 50F);
                    }else if(Count ==1){
                        Bukkit.broadcastMessage(Main.getInstance().pr+"Das Spiel beginnt in "+Count+" Sekunde");
                    }else if(Count==0){
                        Bukkit.broadcastMessage(Main.getInstance().pr+"Das Spiel beginnt jetzt");
                        Main.getInstance().gs = GameState.In_Game;
                    }
                }
            }, 0L, 20L);
        }
    }
}
