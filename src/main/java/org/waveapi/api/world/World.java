package org.waveapi.api.world;

import org.waveapi.api.entities.entity.EntityBase;
import org.waveapi.api.items.inventory.ItemStack;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.math.Vector3;

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

    public <T> T getTileEntity(BlockPos pos, Class<T> clazz) {return Objects.requireNonNull(null);}

    public void breakBlock(BlockPos pos, boolean shouldDrop) {}
    public void breakBlock(BlockPos pos, boolean shouldDrop, EntityBase entity) {}

    public void dropItem(Vector3 position, ItemStack stack) {}

}
