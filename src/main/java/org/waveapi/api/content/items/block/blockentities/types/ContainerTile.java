package org.waveapi.api.content.items.block.blockentities.types;

import java.util.Objects;

public interface ContainerTile {

    int getSize();
    org.waveapi.api.world.inventory.ItemStack getStack(int slot);
    void setStack(int slot, org.waveapi.api.world.inventory.ItemStack stack);

    default int giveItem(org.waveapi.api.world.inventory.ItemStack stack) {
        return 0;
    }

    default org.waveapi.api.world.inventory.ItemStack take(int slot, int amount) {
        return Objects.requireNonNull(null);
    }

    default org.waveapi.api.world.inventory.ItemStack take(int slot) {
        return Objects.requireNonNull(null);
    }
}
