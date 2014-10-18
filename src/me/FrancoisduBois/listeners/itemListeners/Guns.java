package me.FrancoisduBois.listeners.itemListeners;

import org.bukkit.Material;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Miklas on 18.10.2014.
 */
public class Guns {

    public ItemStack ChickenGun(){
        ItemStack cg = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta cgm = cg.getItemMeta();
        cgm.setDisplayName("§a$$§4ChickenGun§a$$");
        cg.setItemMeta(cgm);

        return cg;
    }

    public ItemStack BabyGun(){
        ItemStack cg = new ItemStack(Material.STONE_HOE);
        ItemMeta cgm = cg.getItemMeta();
        cgm.setDisplayName("§dBabyGun");
        cg.setItemMeta(cgm);

        return cg;
    }

    public ItemStack Sophiäää(){
        ItemStack cg = new ItemStack(Material.GOLD_PICKAXE);
        ItemMeta cgm = cg.getItemMeta();
        cgm.setDisplayName("§0Sophiäääää");
        cg.setItemMeta(cgm);

        return cg;
    }

    public EntityType chicken(){
        return EntityType.CHICKEN;
    }

}
