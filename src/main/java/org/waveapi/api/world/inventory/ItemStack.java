package org.waveapi.api.world.inventory;

import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.world.entity.living.EntityPlayer;

public class ItemStack {

    public String getName() {return java.util.Objects.requireNonNull(null);}
    public int getAmount() {return 0;}
    public void setAmount(int amount) {}

    public WaveItem getItem() {return java.util.Objects.requireNonNull(null);}
    public void damage(int amount, EntityPlayer player) {}

    public boolean is(WaveItem item) {return false;}

}
