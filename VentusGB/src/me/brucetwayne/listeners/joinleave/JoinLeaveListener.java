package me.brucetwayne.listeners.joinleave;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.brucetwayne.listeners.Main;
import me.brucetwayne.listeners.utils.Utils;

public class JoinLeaveListener implements Listener {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public JoinLeaveListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if (!p.hasPlayedBefore()) {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("firstJoinMessage").replace("<player>",  p.getName())));
	} else {
		Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("JoinMessage".replace("<player>",  p.getName()))));
	}
		
	}
	
	@EventHandler
	public void onJoin(PlayerQuitEvent e) {
		Player p = e.getPlayer();

		
		if (p.hasPlayedBefore()) {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("LeaveMessage".replace("<player>",  p.getName()))));
		}
}
}
