package me.brucetwayne.ventuslightsaber.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.brucetwayne.ventuslightsaber.Main;

public class LightsaberCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public LightsaberCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("lightsabergui").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command!");
			return true;
			// if (cmd.getName().equalsIgnoreCase("<name>")){
			
		}
		Player p = (Player) sender;
		
		if (p.hasPermission("ventuslightsabers.use")) {
			p.sendMessage("This is a test!");
			return true;
		} else {
			p.sendMessage("You do not have permission to execute this command!");
		}
		return false;
	}

}
