package me.dri.driplugin.eventos;

import me.dri.driplugin.models.PlayerEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteract implements Listener {

    @EventHandler
    public void getCurrentItemPlayer(PlayerInteractEvent e) {
        PlayerEntity player = new PlayerEntity();
        try {
            String itemName = e.getItem().toString();
            player.setCurrentItemName(itemName);
            System.out.println(player.getCurrentItemName());
        } catch (Exception event) {
            System.out.println("Item é nulo");
        }
    }
}