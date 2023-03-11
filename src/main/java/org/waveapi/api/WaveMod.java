package org.waveapi.api;

public abstract class WaveMod {

    public final String name;
    public final String version;

    public WaveMod(String name, String version) {
        this.name = name;
        this.version = version;

        WaveLoader.register(this);
    }


    public void init() {}

}
