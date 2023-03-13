package org.waveapi.api.world.world;

import org.waveapi.api.math.BlockPos;

public class World {

    /**
     *
     * @param pos block position
     * @param state block state
     * @return if BlockState was set
     */
    public boolean setBlockState(BlockPos pos, BlockState state) {
        return false;
    }

    public BlockState getBlockState(BlockPos pos) {
        return null;
    }

    public boolean isClientSide() {return false;}

}
