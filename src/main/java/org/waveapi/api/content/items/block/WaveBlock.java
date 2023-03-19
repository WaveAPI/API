package org.waveapi.api.content.items.block;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.WaveTab;
import org.waveapi.api.content.items.block.model.BlockModel;
import org.waveapi.api.world.world.BlockState;

public class WaveBlock {

    public WaveBlock(String id, WaveMod mod, BlockMaterial material) { }

    public WaveBlock(String id, WaveMod mod) { }

    public WaveBlock addTranslation(String language, String name) {return this;}
    public WaveBlock setModels(BlockModel model) {return this;}

    public boolean hasItem() {
        return true;
    }

    public WaveBlock setHasItem(boolean hasItem) {return this;}

    public BlockState getDefaultState() {
        return java.util.Objects.requireNonNull(null);
    }

    public WaveBlock setTab(WaveTab tab) {return this;}

}
