package com.github.theprogmatheus.mc.mcore.core;

import lombok.Data;

import java.io.File;
import java.util.logging.Logger;

@Data
public class MCore {

    private static MCore instance;

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

    /**
     * Instala uma instância MCore para usar.
     *
     * @param mcore - A instância a ser instalada.
     * @return a instância instalada.
     */
    public static MCore setup(MCore mcore) {
        if (instance != null)
            throw new IllegalStateException("MCore instance has already been installed, use MCore.get() to use it");
        return get();
    }

    /**
     * Resgata a instância MCore instalada anteriormente.
     *
     * @return a instância instalada.
     */
    public static MCore get() {
        if (instance == null)
            throw new IllegalStateException("MCore instance has not yet been installed, use MCore.setup() to install");
        return instance;
    }
}
