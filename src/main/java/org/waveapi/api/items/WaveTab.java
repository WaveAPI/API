package org.waveapi.api.items;

import org.waveapi.api.WaveMod;
import org.waveapi.api.items.models.ItemModel;

public class WaveTab {

    public WaveTab(String id, WaveItem item, WaveMod mod) {}

    public WaveTab(String id, ItemModel icon, WaveMod mod) {}

    public WaveTab(String id, String texturePath, WaveMod mod) {}

    public WaveTab addTranslation(String language, String name) {return this;}


}
