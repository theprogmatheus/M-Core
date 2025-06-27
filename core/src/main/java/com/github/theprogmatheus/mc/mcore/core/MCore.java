package com.github.theprogmatheus.mc.mcore.core;

import java.io.File;
import java.util.logging.Logger;

public class MCore {

    private final Logger log;
    private final File dataFolder;

    public MCore(Logger log, File dataFolder) {
        this.log = log;
        this.dataFolder = dataFolder;
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
