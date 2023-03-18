package org.waveapi.api.world.entity.living;

import org.waveapi.api.content.entities.EntityCreation;
import org.waveapi.api.misc.Text;

public class EntityPlayer extends EntityLiving {
    public EntityPlayer(EntityCreation e) {super(e);}

    public void sendMessage(String message) {}

    public void sendMessage(Text message) {}
    public void sendActionBar(String message) {}
    public void sendActionBar(Text message) {}

}
