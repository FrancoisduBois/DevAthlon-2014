package me.FrancoisduBois.countdown;

import me.FrancoisduBois.GameState;
import me.FrancoisduBois.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

/**
 * Created by Miklas on 18.10.2014.
 */
public class Lobby {

    public int Count;
    public int count;

    Spawn spawn = new Spawn();

    public void CountDown(int length){

        Count = length+1;

        if(Main.getInstance().gs == GameState.In_Lobby){
            count = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
                @Override
                public void run() {
                    if(Bukkit.getOnlinePlayers().length >= Main.getInstance().minplayers){
                        if(Count != 0){
                            Count--;
                        }
                        if(Count==50||Count==40||Count==30||Count==20||Count==15||Count==10||Count==5||Count==4||Count==0||
                                Count==2){
                            Bukkit.broadcastMessage(Main.getInstance().pr+"Die Runde beginnt in "+Count+" Sekunden");
                            Main.getInstance().playAllSound(Sound.CLICK, 50F, 50F);
                        }else if(Count == 1){
                            Bukkit.broadcastMessage(Main.getInstance().pr+"Die Runde beginnt in "+Count+" Sekunde");
                            Main.getInstance().playAllSound(Sound.CLICK, 50F, 50F);
                        }else if(Count==0){
                            Bukkit.broadcastMessage(Main.getInstance().pr+"Die Runde beginnt jetzt");
                            Main.getInstance().playAllSound(Sound.BLAZE_HIT, 60F, 60F);
                            //TODO Teleport
                            for(Player all : Bukkit.getOnlinePlayers()){
                                all.setHealth(20.0);
                                all.setFoodLevel(20);
                            }
                            Main.getInstance().gs = GameState.Spawn;
                            System.out.println("-----Spawn-----");
                            spawn.CountDown(15);
                        }
                    }
                }
            }, 0L, 20L);
        }

    }

}
