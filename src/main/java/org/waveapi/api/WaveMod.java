package org.waveapi.api;

import org.waveapi.api.events.Events;

import java.io.InputStream;

public abstract class WaveMod {

    public WaveMod(String name, String version) {}
    public WaveMod() {}

    public void init() {}

    public void registerEvents(Events register) {}

    public void registerClientEvents(Events register) {}

    /**
     * For people who want to load resources from another place for no reason.
     */
    public InputStream getResource (String path) {
        return getClass().getClassLoader().getResourceAsStream(path);
    }

}
