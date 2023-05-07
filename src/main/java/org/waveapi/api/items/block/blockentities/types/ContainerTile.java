package org.waveapi.api.items.block.blockentities.types;

import org.waveapi.api.items.block.blockentities.BlockEntityCastingType;
import org.waveapi.api.items.inventory.ItemStack;

import java.util.Objects;

public interface ContainerTile {

    BlockEntityCastingType<ContainerTile> type = Objects.requireNonNull(null);

    int getSize();
    ItemStack getStack(int slot);
    void setStack(int slot, ItemStack stack);

    default int giveItem(ItemStack stack) {
        return 0;
    }

    default boolean isItemAllowedInSlot(int slot, ItemStack stack) {
        return true;
    }

    default int giveItem(int slot, ItemStack stack) {
        return 0;
    }

    default ItemStack take(int slot, int amount) {
        return Objects.requireNonNull(null);
    }

    default ItemStack take(int slot) {
        return Objects.requireNonNull(null);
    }
}
