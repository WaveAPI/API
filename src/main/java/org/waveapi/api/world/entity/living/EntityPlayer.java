package org.waveapi.api.world.entity.living;

import org.waveapi.api.misc.Text;
import org.waveapi.api.world.inventory.ItemStack;

public abstract class EntityPlayer extends EntityLiving {
    public EntityPlayer() {super(null);}
    public void sendMessage(String message) {}

    public void sendMessage(Text message) {}

    public void giveItem(ItemStack item) {}
    public void sendActionBar(String message) {}
    public void sendActionBar(Text message) {}

}
