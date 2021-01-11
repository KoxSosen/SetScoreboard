package hahota.fun.simon;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

	
	public class ChatStuff implements CommandExecutor {

	    public static Main plugin;
	 
	    public ChatStuff(Main instance) {
	        plugin = instance;
	    }

	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	     
	        if(cmd.getName().equalsIgnoreCase("std reload")) {
	         
	            if(!sender.hasPermission("std.admin")) {
	                sender.sendMessage(ChatColor.RED + "You don't have permission!");
	             
	                return false;
	            } else {
	            	plugin.reloadConfig();
	            	sender.sendMessage(ChatColor.GREEN + "You have sucessfully reloaded the config file.");
	             
	                return true;
	            }
	         
	        }
	     
	        return false;
	    }
	 
	 
	 
	}