package com.github.theprogmatheus.mc.mcore.velocity;

import com.github.theprogmatheus.mc.mcore.core.MCore;
import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.proxy.ProxyShutdownEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;

import java.nio.file.Path;
import java.util.logging.Logger;

@Plugin(
        id = "mcore",
        name = "M-Core",
        version = "1.0-SNAPSHOT",
        url = "https://github.com/theprogmatheus/M-Core",
        description = "M-Core is a powerful, extensible, and production-ready framework for developing high-quality Minecraft plugins with shared architecture.",
        authors = {"TheProgMatheus", "Sr_Edition"}
)
public class MCoreVelocityPlugin {

    private final MCore mcore;

    @Inject
    public MCoreVelocityPlugin(Logger log, @DataDirectory Path dataDirectory) {
        this.mcore = MCore.setup(new MCore(log, dataDirectory.toFile()));
        this.mcore.onLoad();
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        this.mcore.onEnable();
    }

    @Subscribe
    public void onProxyShutdownEvent(ProxyShutdownEvent event) {
        this.mcore.onDisable();
    }
}
