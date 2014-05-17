package me.michaelkrauty.PortalPusher.Listener;

import me.michaelkrauty.PortalPusher.Main;
import org.bukkit.block.Block;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;

public class BlockListener implements Listener {

	private final Main plugin;

	public BlockListener(Main plugin) {
		this.plugin = plugin;
	}

	public void onBlockPhysics(BlockPhysicsEvent event) {
		Block block = event.getBlock();
	}
}
