package com.RATE.score_Server;

import org.bukkit.plugin.java.JavaPlugin;

public final class Score_Server extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("Hello World!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
