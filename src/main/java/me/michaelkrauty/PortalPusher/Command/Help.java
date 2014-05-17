package me.michaelkrauty.PortalPusher.Command;

import org.bukkit.entity.Player;

public class Help {

	public Help(Player player, String[] args) {
		// TODO Auto-generated constructor stub
		try {
			for (int i = 0; i < getHelp(Integer.parseInt(args[1])).length; i++) {
				player.sendMessage(getHelp(Integer.parseInt(args[1]))[i]);
			}
		} catch (Exception e) {
			for (int i = 0; i < getHelp(-1).length; i++) {
				player.sendMessage(getHelp(-1)[i]);
			}
		}
	}

	private String[] getHelp(int page) {
		if (page == 1) {
			return new String[]{
					"help line 1",
					"help line 2",
					"etc"
			};
		}
		if (page > 1 || page == -1) {
			return new String[]{
					"Unknown help page!"
			};
		}
		return null;
	}
}
