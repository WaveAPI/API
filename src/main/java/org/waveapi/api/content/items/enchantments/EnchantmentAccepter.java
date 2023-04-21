package org.waveapi.api.content.items.enchantments;

import org.waveapi.api.content.items.WaveItem;

import java.util.Objects;

public interface EnchantmentAccepter {
    boolean canEnchant(WaveItem item);

    EnchantmentAccepter ARMOUR = Objects.requireNonNull(null);
    EnchantmentAccepter WEAPON = Objects.requireNonNull(null);
    EnchantmentAccepter MINING_TOOL = Objects.requireNonNull(null);

}
