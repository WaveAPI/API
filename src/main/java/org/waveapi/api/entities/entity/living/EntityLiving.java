package org.waveapi.api.entities.entity.living;

import org.waveapi.api.entities.EntityCreation;
import org.waveapi.api.entities.entity.EntityBase;

public class EntityLiving extends EntityBase {

    public EntityLiving(EntityCreation e) {super(e);}

    public float getHealth() {return 0f;}

    public void setHealth(float health) {}

    public float getMaxHealth() {return 0f;}

    public float getHeadYaw() {return 0f;}

}
