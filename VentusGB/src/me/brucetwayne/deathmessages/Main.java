package me.brucetwayne.deathmessages;

import org.bukkit.plugin.java.JavaPlugin;

import me.brucetwayne.deathmessages.listeners.PlayerDeathListener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new PlayerDeathListener(this);
	}

}
