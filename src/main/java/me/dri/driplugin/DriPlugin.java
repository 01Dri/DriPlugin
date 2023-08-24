package me.dri.driplugin;

import me.dri.driplugin.eventos.PlayerInteract;
import me.dri.driplugin.eventos.PlayerJoin;

import org.bukkit.plugin.java.JavaPlugin;



public final class DriPlugin extends JavaPlugin {


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteract(), this);
        super.onEnable();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
