package me.michaelkrauty.PortalPusher;

import java.util.logging.Logger;

import me.michaelkrauty.PortalPusher.Command.*;

import me.michaelkrauty.PortalPusher.Listener.BlockListener;
import me.michaelkrauty.PortalPusher.Listener.PlayerListener;
import me.michaelkrauty.PortalPusher.Util.PortalFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;

public class Main extends JavaPlugin implements Listener {

	private final static Logger log = Logger.getLogger("MC");

	public static Main plugin;

	public static PortalFile portalFile = new PortalFile();

	public void onEnable() {
		plugin = this;
		getCommand("portalpusher").setExecutor(new PortalPusherCommand(this));
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new BlockListener(this), this);
		pm.registerEvents(new PlayerListener(this), this);
		log.info(getDescription().getName() + " v" + getDescription().getVersion() + " enabled!");
	}
}
