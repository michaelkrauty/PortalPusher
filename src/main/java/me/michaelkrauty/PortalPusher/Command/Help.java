package me.michaelkrauty.PortalPusher.Command;

import org.bukkit.entity.Player;

public class Help {

	public Help(Player player, String[] args) {
		// TODO Auto-generated constructor stub
		player.sendMessage(args[0]);
	}
}
