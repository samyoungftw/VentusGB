package me.brucetwayne.ventuslightsaber;

import org.bukkit.plugin.java.JavaPlugin;

import me.brucetwayne.ventuslightsaber.commands.LightsaberCommand;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new LightsaberCommand(this);
	}

}
