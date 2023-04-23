package org.waveapi.api.items.block.blockentities;

import org.waveapi.api.math.BlockPos;
import org.waveapi.api.world.BlockState;

public abstract class TileEntityCreation {
    public abstract BlockPos getPosition();
    public abstract BlockState getState();

}
