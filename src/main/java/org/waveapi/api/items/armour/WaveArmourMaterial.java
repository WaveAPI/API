package org.waveapi.api.items.armour;

import org.waveapi.api.file.texture.Texture;
import org.waveapi.api.items.recipes.ingredients.Ingredient;

public class WaveArmourMaterial {

    public WaveArmourMaterial(String name) {}

    public WaveArmourMaterial setEnchantability(int enchantability) {return this;}

    /**
     * sets durability for every piece.<br>
     * [0] = helmet <br>
     * [1] = chestplate<br>
     * [2] = leggings<br>
     * [3] = boots<br>
     * the final piece's durability is this * base Durability ({@link #setBaseDurability(int)})
     */
    public WaveArmourMaterial setDurability(int[] durability) {return this;}

    /**
     * sets multiplier for durability
     * by default it is 1
     */
    public WaveArmourMaterial setBaseDurability(int durability) {return this;}
    public WaveArmourMaterial setProtection(int[] protection) {return this;}
    public WaveArmourMaterial setRepairIngredient(Ingredient ingredient) {return this;}

    public WaveArmourMaterial setToughness(float toughness) {return this;}

    public WaveArmourMaterial setKnockbackResistance(float resistance) {return this;}

    public WaveArmourMaterial setHelmetChestplateBootsTexture(Texture texture) {return this;}
    public WaveArmourMaterial setLeggingsTexture(Texture texture) {return this;}

}
