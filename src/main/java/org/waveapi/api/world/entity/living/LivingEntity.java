package org.waveapi.api.world.entity.living;

import org.waveapi.api.world.entity.BaseEntity;
import org.waveapi.api.world.entity.DamageSource;

public class LivingEntity extends BaseEntity {

    public boolean isAlive() {return false;}

    public float getHealth() {return 0f;}

    public void setHealth(float health) {}

    public void damage(DamageSource source, float amount) {}

}
