package org.waveapi.api.world.entity.living;

import org.waveapi.api.world.entity.EntityBase;
import org.waveapi.api.world.entity.DamageSource;

public class EntityLiving extends EntityBase {

    public float getHealth() {return 0f;}

    public void setHealth(float health) {}

    public float getMaxHealth() {return 0f;}

    public void damage(DamageSource source, float amount) {}

    public float getHeadYaw() {return 0f;}


}
