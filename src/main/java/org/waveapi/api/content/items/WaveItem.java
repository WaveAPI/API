package org.waveapi.api.content.items;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.models.ItemModel;
import org.waveapi.api.world.inventory.ItemUseResult;
import org.waveapi.api.world.inventory.UseHand;
import org.waveapi.api.world.inventory.ItemStack;

public class WaveItem {

    public WaveItem(String id, WaveMod mod) {}

    public String getId() {return null;}

    public void setModel(ItemModel model) {}

    public void addTranslation(String language, String name) {}

    public void setMaxStackSize(int size) {}

    /**
     * Is called on client then on server if it returns a successful use
     */
    public ItemUseResult onUse(ItemStack item, UseHand hand) {return ItemUseResult.SUCCESS;}
}
