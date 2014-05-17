package me.michaelkrauty.PortalPusher;

import java.util.logging.Logger;

import me.michaelkrauty.PortalPusher.Command.*;

import me.michaelkrauty.PortalPusher.Listener.BlockListener;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Main extends JavaPlugin implements Listener {

	private final static Logger log = Logger.getLogger("MC");

	private Server server = this.getServer();
	public static Main main;

	private final BlockListener blockListener = new BlockListener(this);

	public void onEnable() {
		main = this;
		getCommand("portalpusher").setExecutor(new PortalPusherCommand(this));
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(blockListener, this);
	}
}
