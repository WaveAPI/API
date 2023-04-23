package org.waveapi.api.entities.entity.living;

import org.waveapi.api.items.inventory.ItemStack;
import org.waveapi.api.math.Vector3;
import org.waveapi.api.misc.Text;

import java.util.Objects;

public abstract class EntityPlayer extends EntityLiving {
    public EntityPlayer() {super(null);}
    public void sendMessage(String message) {}

    public void sendMessage(Text message) {}

    public void giveItem(ItemStack item) {}
    public void sendActionBar(String message) {}
    public void sendActionBar(Text message) {}

    public Vector3 getLookVector() {return Objects.requireNonNull(null);}

}
