package me.brucetwayne.deathmessages.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.brucetwayne.deathmessages.Main;
import me.brucetwayne.deathmessages.utils.Utils;

public class PlayerDeathListener implements Listener {
	
	private static Main plugin;
	
	@SuppressWarnings("static-access")
	public PlayerDeathListener (Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
		
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		if (e.getEntity().getKiller() instanceof Player) {
			
			Player killer = e.getEntity().getKiller();
			Player p = e.getEntity();
			
			if (p != killer) {
			killer.sendMessage(Utils.chat(plugin.getConfig().getString("onPlayerKill").replace("<player>", p.getName())));
			p.sendMessage(Utils.chat(plugin.getConfig().getString("onPlayerKilled".replace("<player>", p.getName()))));
			return;
		}
	}
	}
}
