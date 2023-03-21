package org.waveapi.api.content.items.block.blockentities;

public interface TileEntityProvider {

    WaveTileEntity getNewTileEntity(TileEntityCreation creation);

}
