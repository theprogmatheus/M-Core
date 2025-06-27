package com.github.theprogmatheus.mc.mcore.velocity;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.proxy.ProxyShutdownEvent;
import com.velocitypowered.api.plugin.Plugin;

@Plugin(
        id = "mcore",
        name = "M-Core",
        version = "1.0-SNAPSHOT",
        url = "https://github.com/theprogmatheus/M-Core",
        description = "M-Core is a powerful, extensible, and production-ready framework for developing high-quality Minecraft plugins with shared architecture.",
        authors = {"TheProgMatheus", "Sr_Edition"}
)
public class MCoreVelocityPlugin {

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }

    @Subscribe
    public void onProxyShutdownEvent(ProxyShutdownEvent event) {
    }
}
