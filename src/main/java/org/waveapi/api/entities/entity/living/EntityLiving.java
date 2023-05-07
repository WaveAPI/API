package org.waveapi.api.entities.entity.living;

import org.waveapi.api.entities.EntityCastingType;
import org.waveapi.api.entities.EntityCreation;
import org.waveapi.api.entities.entity.EntityBase;

import java.util.Objects;

public class EntityLiving extends EntityBase {

    public final static EntityCastingType<EntityLiving> type = Objects.requireNonNull(null);

    public EntityLiving(EntityCreation e) {super(e);}

    public float getHealth() {return 0f;}

    public void setHealth(float health) {}

    public float getMaxHealth() {return 0f;}

    public float getHeadYaw() {return 0f;}

}
