package org.waveapi.api.world.inventory;

import org.waveapi.api.world.entity.living.EntityPlayer;

public class ItemStack {

    public String getName() {return java.util.Objects.requireNonNull(null);}
    public int getAmount() {return 0;}
    public void setAmount(int amount) {}

    public void damage(int amount, EntityPlayer player) {}

}
