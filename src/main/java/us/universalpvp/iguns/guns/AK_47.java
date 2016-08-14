package us.universalpvp.iguns.guns;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import us.universalpvp.iguns.manager.Gun;
import us.universalpvp.iguns.manager.GunType;

/**
 * Created by avigh on 8/11/2016.
 */
public class AK_47 extends Gun {

    public AK_47() {
        super("AK-47", GunType.RIFLE);
    }

    @Override
    public int getClipSize() {
        return 0;
    }

    @Override
    public ItemStack getBukkitItemStack() {
        ItemStack itemStack = new ItemStack(Material.ACACIA_DOOR);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName("poop");

        return itemStack;
    }

    @Override
    public double getReloadTime() {
        return 1000000;
    }

    @Override
    public double getRecoilAmount() {
        return 10;
    }

    @Override
    public String getPermission() {
        return "Bleh.nle";
    }

    @Override
    public Projectile onInteract(PlayerInteractEvent e) {
        e.getPlayer().sendMessage("Banana");

        Snowball snowball = (Snowball) e.getPlayer().getWorld().spawnEntity(e.getPlayer().getLocation(), EntityType.SNOWBALL);
        return snowball;
    }

    @Override
    public void onHit(EntityDamageByEntityEvent e) {
        e.getEntity().sendMessage("U suck boi");
    }
}