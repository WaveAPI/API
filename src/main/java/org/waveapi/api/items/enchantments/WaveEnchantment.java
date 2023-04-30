package org.waveapi.api.items.enchantments;

import org.waveapi.api.WaveMod;
import org.waveapi.api.entities.entity.EntityBase;
import org.waveapi.api.entities.entity.living.EntityLiving;
import org.waveapi.api.items.EquipmentSlot;
import org.waveapi.api.items.Rarity;

public class WaveEnchantment {

    public WaveEnchantment (String id, EnchantmentTarget target, WaveMod mod) {

    }

    public WaveEnchantment addEquipmentSlot(EquipmentSlot slot) {
        return this;
    }

    public WaveEnchantment setRarity(Rarity rarity) {
        return this;
    }

    /**
     * This function is called whenever an entity is attacked while having the enchantment equipped.
     */
    public void onAttack(EntityLiving attacker, EntityBase attacked, int level) {

    }

    public WaveEnchantment addTranslation(String language, String name) {
        return this;
    }

    public WaveEnchantment makeTreasure() {return this;}
    public WaveEnchantment makeCursed() {return this;}

    public WaveEnchantment makeAvailableInEnchantingTable() {return this;}
    public WaveEnchantment makeAvailableInVillagerTrades() {return this;}

    public WaveEnchantment setMaxLevel(int level) {
        return this;
    }

    public int getMaxLevel() {
        return 1;
    }

}
