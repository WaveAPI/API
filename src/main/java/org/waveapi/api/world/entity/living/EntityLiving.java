package org.waveapi.api.world.entity.living;

import org.waveapi.api.content.entities.EntityCreation;
import org.waveapi.api.world.entity.EntityBase;

public class EntityLiving extends EntityBase {

    public EntityLiving(EntityCreation e) {super(e);}

    public float getHealth() {return 0f;}

    public void setHealth(float health) {}

    public float getMaxHealth() {return 0f;}

    public float getHeadYaw() {return 0f;}


}
