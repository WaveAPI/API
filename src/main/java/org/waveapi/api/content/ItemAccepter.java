package org.waveapi.api.content;

import org.waveapi.api.content.items.WaveItem;

import java.util.Objects;

public interface ItemAccepter {
    boolean canEnchant(WaveItem item);

    ItemAccepter ARMOUR = Objects.requireNonNull(null);
    ItemAccepter WEAPON = Objects.requireNonNull(null);
    ItemAccepter MINING_TOOL = Objects.requireNonNull(null);

}
