package com.github.theprogmatheus.mc.mcore.core;

import lombok.Data;

import java.io.File;
import java.util.logging.Logger;

@Data
public class MCore {

    private final Logger log;
    private final File dataFolder;
    private final ServicesManager servicesManager;

    public MCore(Logger log, File dataFolder) {
        this.log = log;
        this.dataFolder = dataFolder;
        this.servicesManager = new ServicesManager();
    }

    public void onLoad() {
        this.log.info("M-Core loaded.");
    }

    public void onEnable() {
        this.log.info("M-Core enabled.");
    }

    public void onDisable() {
        this.log.info("M-Core disabled.");
    }

}
