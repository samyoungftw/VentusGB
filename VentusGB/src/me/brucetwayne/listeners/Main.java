package me.brucetwayne.listeners;

import org.bukkit.plugin.java.JavaPlugin;

import me.brucetwayne.listeners.joinleave.JoinLeaveListener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new JoinLeaveListener(this);
	}

}
