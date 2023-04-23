package org.waveapi.api.items.tools;

import org.waveapi.api.WaveMod;
import org.waveapi.api.entities.entity.living.EntityLiving;
import org.waveapi.api.items.WaveItem;
import org.waveapi.api.items.inventory.ItemStack;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.world.BlockState;
import org.waveapi.api.world.World;

public class WaveAxeItem extends WaveItem {
    public WaveAxeItem(String id, WaveToolMaterial material, WaveMod mod) {
        super(id, mod);
    }

    public WaveAxeItem setAttackDamage(int damage) {return this;}
    public WaveAxeItem setAttackSpeed(float speed) {return this;}

    /**
     * called after a block was mined
     * @return true if the tool should loose durability, otherwise false.
     */
    public boolean onPostMine(ItemStack itemStack, World world, BlockState blockState, BlockPos pos, EntityLiving entity) {
        return true;
    }

}
