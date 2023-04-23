package org.waveapi.api.items.drop;

import org.waveapi.api.items.WaveItem;

public class ItemDrop extends Drop {

    public ItemDrop(String item, int min, int max) {}
    public ItemDrop(WaveItem item, int min, int max) {}

    public ItemDrop(String item) {}
    public ItemDrop(WaveItem item) {}

    public ItemDrop apply(DropFunction function) {return this; }

}
