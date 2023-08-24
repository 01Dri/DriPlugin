package me.dri.driplugin.eventos;

import me.dri.driplugin.models.PlayerEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerJoin implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        PlayerEntity player = new PlayerEntity();
        player.setName(e.getPlayer().getName());
        e.setJoinMessage(player.getName() + " Entrou porra!!");;



    }
}