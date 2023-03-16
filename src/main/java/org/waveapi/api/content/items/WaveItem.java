package org.waveapi.api.content.items;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.models.ItemModel;
import org.waveapi.api.world.entity.living.EntityPlayer;
import org.waveapi.api.world.inventory.ItemStack;
import org.waveapi.api.world.inventory.ItemUseResult;
import org.waveapi.api.world.inventory.UseHand;

public class WaveItem {

    public WaveItem(String id, WaveMod mod) {}

    public String getId() {return null;}

    public WaveItem setModel(ItemModel model) {return this;}

    public WaveItem setTab(WaveTab tab) {return this;}

    public WaveItem addTranslation(String language, String name) {return this;}

    public WaveItem setMaxStackSize(int size) {return this;}

    /**
     * Is called on client then on server if it returns a successful use
     */
    public ItemUseResult onUse(ItemStack item, UseHand hand, EntityPlayer player) {return ItemUseResult.SUCCESS;}
}
