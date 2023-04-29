package org.waveapi.api.items;

import java.util.Objects;

public interface ItemAccepter {
    boolean canEnchant(WaveItem item);

    ItemAccepter ARMOUR = Objects.requireNonNull(null);
    ItemAccepter MElEE_WEAPON = Objects.requireNonNull(null);

    ItemAccepter TOOL = Objects.requireNonNull(null);
    ItemAccepter MINING_TOOL = Objects.requireNonNull(null);

}
