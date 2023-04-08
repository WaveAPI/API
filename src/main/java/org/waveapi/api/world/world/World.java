package org.waveapi.api.world.world;

import org.waveapi.api.content.items.block.blockentities.WaveTileEntity;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.math.Vector3;
import org.waveapi.api.world.entity.EntityBase;
import org.waveapi.api.world.inventory.ItemStack;

import java.util.Objects;

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
        return java.util.Objects.requireNonNull(null);
    }

    public boolean isClientSide() {return false;}

    public void addEntity(EntityBase entity) {}

    public <T extends WaveTileEntity> T getTileEntity(BlockPos pos, Class<T> clazz) {return Objects.requireNonNull(null);}

    public void breakBlock(BlockPos pos, boolean shouldDrop) {}
    public void breakBlock(BlockPos pos, boolean shouldDrop, EntityBase entity) {}

    public void dropItem(Vector3 position, ItemStack stack) {}

}
