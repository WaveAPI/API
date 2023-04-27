package org.waveapi.api.items.enchantments;

import org.waveapi.api.WaveMod;
import org.waveapi.api.entities.entity.EntityBase;
import org.waveapi.api.entities.entity.living.EntityLiving;
import org.waveapi.api.items.ItemAccepter;

public class WaveEnchantment {

    public WaveEnchantment (String name, WaveMod mod) {

    }

    public WaveEnchantment addEquipmentSlot(equipmentSlot slot) {
        return this;
    }

    public WaveEnchantment addAllowedItemsAccepter(ItemAccepter accepter) {
        return this;
    }

    /**
     * This function is called whenever an entity is attacked with an item that has this enchantment
     */
    public void onUsedToAttack(EntityLiving user, EntityBase base, int level) {

    }

    public WaveEnchantment setMaxLevel() {
        return this;
    }

    public int getMaxLevel() {
        return 1;
    }

    public enum equipmentSlot {
        MAIN_HAND,
        OFF_HAND,
        HELMET,
        CHESTPLATE,
        LEGGINGS,
        BOOTS
    }
}
