package me.michaelkrauty.PortalPusher.Command;

import me.michaelkrauty.PortalPusher.Util.Format;
import org.bukkit.entity.Player;

import java.text.Normalizer;

public class Help {

	public Help(Player player, String[] args) {
		// TODO Auto-generated constructor stub
		try {
			if (args.length == 0) {
				for (String line : getHelp(1)) {
					player.sendMessage(Format.format(line));
				}
			} else {
				if (args.length == 1) {
					for (String line : getHelp(1)) {
						player.sendMessage(Format.format(line));
					}
				} else {
					for (String line : getHelp(Integer.parseInt(args[1]))) {
						player.sendMessage(Format.format(line));
					}
				}
			}
		} catch (Exception e) {
			for (String line : getHelp(-1)) {
				player.sendMessage(Format.format(line));
			}
		}
	}

	private String[] getHelp(int page) {
		int pages = 1;
		if (page == 1) {
			return new String[]{
					"&7help page 1",
					"&7etc etc edit this later"
			};
		}
		if (page > pages || page == -1) {
			return new String[]{
					"&7Unknown help page!"
			};
		}
		return null;
	}
}
