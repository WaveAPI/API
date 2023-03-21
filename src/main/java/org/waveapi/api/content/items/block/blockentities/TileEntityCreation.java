package org.waveapi.api.content.items.block.blockentities;

import org.waveapi.api.math.BlockPos;
import org.waveapi.api.world.world.BlockState;

public abstract class TileEntityCreation {
    public abstract BlockPos getPosition();
    public abstract BlockState getState();

}
