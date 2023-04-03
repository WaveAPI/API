package org.waveapi.api.content.items.tools;

import org.waveapi.api.content.items.recipes.ingredients.Ingredient;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.world.entity.living.EntityLiving;
import org.waveapi.api.world.inventory.ItemStack;
import org.waveapi.api.world.world.BlockState;
import org.waveapi.api.world.world.World;

public class WaveToolMaterial {
    public WaveToolMaterial setBaseDurability(int durability) {return this;}

    public WaveToolMaterial setMiningSpeedMultiplier(float speed) {return this;}

    public WaveToolMaterial setAttackDamage(float damage) {return this;}

    public WaveToolMaterial setMiningLevel(int level) {return this;}

    public WaveToolMaterial setEnchantability(int enchantability) {return this;}

    public WaveToolMaterial setRepairIngredient(Ingredient ingredient) {return this;}

    /**
     * called after a block was mined
     * @return true if the tool should loose durability, otherwise false.
     */
    public boolean onPostMine(ItemStack itemStack, World world, BlockState blockState, BlockPos pos, EntityLiving entity) {
        return true;
    }

}
