package me.michaelkrauty.PortalPusher.Command;

import me.michaelkrauty.PortalPusher.Main;
import me.michaelkrauty.PortalPusher.Util.Format;
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
			return true;
		}

		Player player = (Player) sender;


		if (args.length < 1) {
			player.sendMessage(Format.format("&8Unknown command! Use \"/pp help\" for help!"));
			return true;
		}

		if (args[0].equalsIgnoreCase("help")) {
			new Help(player, args);
			return true;
		}


		return true;
	}
}
