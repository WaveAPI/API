package org.waveapi.api.content.items.tools;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.world.entity.living.EntityLiving;
import org.waveapi.api.world.inventory.ItemStack;
import org.waveapi.api.world.world.BlockState;
import org.waveapi.api.world.world.World;

public class WaveHoeItem extends WaveItem {
    public WaveHoeItem(String id, WaveMod mod, WaveToolMaterial material) {
        super(id, mod);
    }

    public WaveHoeItem setAttackDamage(int damage) {return this;}
    public WaveHoeItem setAttackSpeed(float speed) {return this;}

    /**
     * called after a block was mined
     * @return true if the tool should loose durability, otherwise false.
     */
    public boolean onPostMine(ItemStack itemStack, World world, BlockState blockState, BlockPos pos, EntityLiving entity) {
        return true;
    }

}
