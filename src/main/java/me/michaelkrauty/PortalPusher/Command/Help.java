package me.michaelkrauty.PortalPusher.Command;

import org.bukkit.entity.Player;

public class Help {

	public Help(Player player, String[] args) {
		// TODO Auto-generated constructor stub
		try {
			if (args.length == 0) {
				for (String line : getHelp(1)) {
					player.sendMessage(line);
				}
			} else {
				if (args.length == 1) {
					for (String line : getHelp(1)) {
						player.sendMessage(line);
					}
				} else {
					for (String line : getHelp(Integer.parseInt(args[1]))) {
						player.sendMessage(line);
					}
				}
			}
		} catch (Exception e) {
			for (String line : getHelp(-1)) {
				player.sendMessage(line);
			}
		}
	}

	private String[] getHelp(int page) {
		int pages = 1;
		if (page == 1) {
			return new String[]{
					"help page 1",
					"etc etc edit this later"
			};
		}
		if (page > pages || page == -1) {
			return new String[]{
					"Unknown help page!"
			};
		}
		return null;
	}
}
