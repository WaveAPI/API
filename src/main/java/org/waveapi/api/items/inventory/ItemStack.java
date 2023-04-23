package org.waveapi.api.items.inventory;

import org.waveapi.api.entities.entity.living.EntityPlayer;
import org.waveapi.api.items.WaveItem;
import org.waveapi.api.items.tags.Tag;

public class ItemStack {

    public ItemStack (WaveItem item) {

    }

    public String getName() {return java.util.Objects.requireNonNull(null);}
    public int getAmount() {return 0;}

    public int getMaxAmount() {return 64;}
    public void setAmount(int amount) {}

    public boolean isOfTag(Tag tag) {return false;}

    public WaveItem getItem() {return java.util.Objects.requireNonNull(null);}
    public void damage(int amount, EntityPlayer player) {}
    public boolean is(WaveItem item) {return false;}

}
