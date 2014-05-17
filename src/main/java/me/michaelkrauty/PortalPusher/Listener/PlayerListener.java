package me.michaelkrauty.PortalPusher.Listener;

import me.michaelkrauty.PortalPusher.Main;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListener implements Listener {

	private final Main plugin;

	public PlayerListener(Main plugin) {
		this.plugin = plugin;
	}

	public void onPlayerMove(PlayerMoveEvent event) {
		// TODO: player movement event
	}

	public void onPlayerInteract(PlayerInteractEvent event) {
		// TODO: player interact event
	}

	public void onEntityDamageEvent(EntityDamageEvent event) {
		// TODO: entity damage event
	}
}
