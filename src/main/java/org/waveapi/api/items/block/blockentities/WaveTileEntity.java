package org.waveapi.api.items.block.blockentities;

import org.waveapi.api.math.BlockPos;
import org.waveapi.api.misc.NBT;
import org.waveapi.api.world.World;

import java.util.Objects;

public class WaveTileEntity {
    public WaveTileEntity(TileEntityCreation creation) {}

    public void save(NBT nbt) {}

    public void load(NBT nbt) {}

    public void markNeedsSaving() {}

    /**
     * @return world if in a word, and null if not or called before added to one (e.g. in init)
     */
    public World getWorld() {
        return Objects.requireNonNull(null);
    }

    public BlockPos getPosition() { return Objects.requireNonNull(null); }

}
