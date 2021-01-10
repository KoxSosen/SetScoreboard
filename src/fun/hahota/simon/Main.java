package fun.hahota.simon;

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

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener {
	
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void join(PlayerJoinEvent event) {
    	Player player = event.getPlayer();
    	
    	ScoreboardManager m = Bukkit.getScoreboardManager();
    	Scoreboard b = m.getNewScoreboard();
    	
    	@SuppressWarnings("deprecation")
		Objective o = b.registerNewObjective("Hahota", "");
    	o.setDisplaySlot(DisplaySlot.SIDEBAR);
    	o.setDisplayName(ChatColor.DARK_AQUA + "Survival V2");
    	
    	Score gold = o.getScore(ChatColor.DARK_AQUA + "By Simon");
    	gold.setScore(1);
    	
    	player.setScoreboard(b);
    	
    	
    	
    			
    }
}
