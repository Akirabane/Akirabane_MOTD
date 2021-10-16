package fr.akirabane.akirabanemotd;

import org.bukkit.plugin.java.JavaPlugin;

import net.minecraft.server.MinecraftServer;

public class Main extends JavaPlugin{

	@SuppressWarnings("deprecation")
	public void onEnable() {
		saveDefaultConfig();	
		MinecraftServer.getServer().setMotd(getConfig().getString("strings.serverList.setMotd").replace("&", "§"));
	}
	
}
