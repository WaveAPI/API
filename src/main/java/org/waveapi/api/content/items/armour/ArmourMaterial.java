package org.waveapi.api.content.items.armour;

import org.waveapi.api.content.items.recipes.ingredients.Ingredient;
import org.waveapi.api.file.texture.Texture;

public class ArmourMaterial {

    public ArmourMaterial(String name) {}

    public ArmourMaterial setEnchantability(int enchantability) {return this;}

    /**
     * sets durability for every piece.<br>
     * [0] = helmet <br>
     * [1] = chestplate<br>
     * [2] = leggings<br>
     * [3] = boots<br>
     * the final piece's durability is this * base Durability ({@link #setBaseDurability(int)})
     */
    public ArmourMaterial setDurability(int[] durability) {return this;}

    /**
     * sets multiplier for durability
     * by default it is 1
     */
    public ArmourMaterial setBaseDurability(int durability) {return this;}
    public ArmourMaterial setProtection(int[] protection) {return this;}
    public ArmourMaterial setRepairIngredient(Ingredient ingredient) {return this;}

    public ArmourMaterial setToughness(float toughness) {return this;}

    public ArmourMaterial setKnockbackResistance(float resistance) {return this;}

    public ArmourMaterial setLayer1Texture(Texture texture) {return this;}
    public ArmourMaterial setLayer2Texture(Texture texture) {return this;}

}
