package hahota.fun.simon;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener {
	
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
		this.getConfig().options().copyDefaults();
		saveDefaultConfig();
    }
    
    
    @Override
    public void onDisable() {
		getLogger().info(ChatColor.RED + "Goodbye!");
    	
    }
    @EventHandler
    public void join(PlayerJoinEvent event) {
    	Player player = event.getPlayer();
    	
    	ScoreboardManager manager = Bukkit.getScoreboardManager();
    	Scoreboard board = manager.getNewScoreboard();
    	@SuppressWarnings("deprecation")
		Objective objective = board.registerNewObjective("test", "dummy");
    	objective.setDisplaySlot(DisplaySlot.SIDEBAR);
    	objective.setDisplayName(ChatColor.translateAlternateColorCodes('&', "" + getConfig().getString("Title")));
    	@SuppressWarnings("unused")
		Team team = board.registerNewTeam("teamname");
    	Score score = objective.getScore(ChatColor.GREEN + "First Score"); 
    	score.setScore(1);  	
    	
    	player.setScoreboard(board);
    	
    }
}