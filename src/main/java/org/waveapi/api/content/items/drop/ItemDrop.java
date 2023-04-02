package org.waveapi.api.content.items.drop;

import org.waveapi.api.content.items.WaveItem;

public class ItemDrop {

    public ItemDrop(String item, int min, int max) {}
    public ItemDrop(WaveItem item, int min, int max) {}

    public ItemDrop(String item) {}
    public ItemDrop(WaveItem item) {}

    public ItemDrop apply() {return this; }

}
