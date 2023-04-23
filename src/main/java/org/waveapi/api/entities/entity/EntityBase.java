package org.waveapi.api.entities.entity;

import org.waveapi.api.entities.EntityCreation;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.math.Vector3;
import org.waveapi.api.world.World;

import java.util.Objects;

public class EntityBase {
    public int getID() {return 0;}

    public boolean isAlive() {return false;}

    public String getName() {return java.util.Objects.requireNonNull(null);}

    public float getYaw() {return 0;}
    public float getPitch() {return 0;}

    public Vector3 getPosition() {return java.util.Objects.requireNonNull(null);}
    public void setPosition(Vector3 position) {}

    public BlockPos getBlockLookingAt(double maxDistance) {return java.util.Objects.requireNonNull(null);}

    public BlockPos getBlockLookingAt(double maxDistance, boolean ignoreTransparent) {return java.util.Objects.requireNonNull(null);}


    public Vector3 getVelocity() {return java.util.Objects.requireNonNull(null);}
    public void setVelocity(Vector3 position) {}

    public void destroy() {}

    public boolean handleAttack() {return false;}

    public EntityBase(EntityCreation e) {}

    public World getWorld() {
        return Objects.requireNonNull(null);
    }

    public boolean damage(DamageSource source, float amount) {return true;}

    public void tick() {}

}
