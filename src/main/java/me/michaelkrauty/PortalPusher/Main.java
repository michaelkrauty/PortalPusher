package me.michaelkrauty.PortalPusher;

import java.util.logging.Logger;

import me.michaelkrauty.PortalPusher.Command.*;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class Main extends JavaPlugin implements Listener {

	public static Logger log = Logger.getLogger("MC");

	private Server server = this.getServer();
	public static Main main;

	public void onEnable() {
		main = this;
	}

	public boolean onCommand(CommandSender sender, Command cmd,
							 String commandLabel, String[] args) {
		if (commandLabel.equalsIgnoreCase("portalpusher")
				|| commandLabel.equalsIgnoreCase("pp")) {
			if (!(sender instanceof Player)) {
				log.info("Silly console, you can't run PortalPusher commands");
				return false;
			}
			if(args.length < 1) {
				new Help();
				return false;
			}
			new me.michaelkrauty.PortalPusher.Command.Command(args);
		}
		return false;
	}

	public void onPlayerInteract(PlayerInteractEvent event) {
		// TODO
	}
}
