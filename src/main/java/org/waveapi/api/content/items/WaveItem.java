package org.waveapi.api.content.items;

import org.waveapi.api.WaveMod;

public class WaveItem {
    private final String id;

    public WaveItem(String id, WaveMod mod) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
