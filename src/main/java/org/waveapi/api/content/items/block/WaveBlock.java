package org.waveapi.api.content.items.block;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.content.items.WaveTab;
import org.waveapi.api.content.items.block.model.BlockModel;
import org.waveapi.api.content.items.drop.Drop;
import org.waveapi.api.content.items.drop.ItemDrop;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.world.world.BlockState;
import org.waveapi.api.world.world.World;

import java.util.Objects;

public class WaveBlock {

    public WaveBlock(String id, WaveMod mod, BlockMaterial material) { }

    public WaveBlock(String id, WaveMod mod) { }

    public WaveBlock addTranslation(String language, String name) {return this;}
    public WaveBlock setModels(BlockModel model) {return this;}

    public boolean hasItem() {
        return true;
    }

    public void enableRandomTick() {}
    public void onRandomTick(BlockState state, BlockPos pos, World world) {}

    public WaveBlock setHasItem(boolean hasItem) {return this;}

    public BlockState getDefaultState() {
        return java.util.Objects.requireNonNull(null);
    }

    public WaveBlock setTab(WaveTab tab) {return this;}

    public WaveBlock setHardness(float hardness) {return this; }

    public WaveBlock setDrop() {return this; }
    public WaveBlock setDrop(Drop[] drop) {return this; }

    public WaveItem getItem() {return Objects.requireNonNull(null); }

    public ItemDrop getAsSimpleDrop() {return Objects.requireNonNull(null); }
    public WaveBlock setMiningLevelRequired(int level) { return this; }
    public WaveBlock makePickaxeEffective() { return this; }
    public WaveBlock makeAxeEffective() { return this; }
    public WaveBlock makeShovelEffective() { return this; }
    public WaveBlock makeHoeEffective() { return this; }


}
