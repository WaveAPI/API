package org.waveapi.api;

import org.waveapi.api.events.Events;

public abstract class WaveMod {

    public WaveMod(String name, String version) {}

    public void init() {}

    public void registerEvents(Events register) {}

    public void registerClientEvents(Events register) {}

}
