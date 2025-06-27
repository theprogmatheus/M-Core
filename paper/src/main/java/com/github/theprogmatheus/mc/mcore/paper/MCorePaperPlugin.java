package com.github.theprogmatheus.mc.mcore.paper;

import com.github.theprogmatheus.mc.mcore.core.MCore;
import org.bukkit.plugin.java.JavaPlugin;

public class MCorePaperPlugin extends JavaPlugin {

    private final MCore mcore;

    public MCorePaperPlugin() {
        this.mcore = new MCore(getLogger(), getDataFolder());
    }

    @Override
    public void onLoad() {
        this.mcore.onLoad();
    }

    @Override
    public void onEnable() {
        this.mcore.onEnable();
    }

    @Override
    public void onDisable() {
        this.mcore.onDisable();
    }
}
