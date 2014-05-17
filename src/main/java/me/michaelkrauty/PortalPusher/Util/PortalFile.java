package me.michaelkrauty.PortalPusher.Util;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

/**
 * Created by Michael on 5/17/2014.
 */
public class PortalFile {

	File portalFile = new File("portals.yml");
	YamlConfiguration portals = new YamlConfiguration();

	public PortalFile() {
		loadPortalFile();
	}

	private void checkPortalFile() {
		if (!portalFile.exists()) {
			try {
				portalFile.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void loadPortalFile() {
		checkPortalFile();
		try {
			portals.load(portalFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void savePortalFile() {
		try {
			portals.save(portalFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
