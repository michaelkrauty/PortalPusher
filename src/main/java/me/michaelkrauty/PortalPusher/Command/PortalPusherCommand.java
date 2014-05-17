package me.michaelkrauty.PortalPusher.Command;

import me.michaelkrauty.PortalPusher.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

public class PortalPusherCommand implements CommandExecutor {

	private final Main plugin;

	public PortalPusherCommand(Main plugin) {
		this.plugin = plugin;
	}

	private final static Logger log = Logger.getLogger("MC");

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			log.info("Silly console, you can't run PortalPusher commands");
			return false;
		}

		Player player = (Player) sender;


		if (args.length < 1) {
			new Help(player, args);
			return false;
		}


		return false;
	}
}
