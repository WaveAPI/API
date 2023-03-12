package org.waveapi.api.world.entity;

public abstract class DamageSource {

    public abstract String getName();

    public abstract boolean doesIgnoreArmour();

    public static final DamageSource GENERIC = null;
    public static final DamageSource LAVA = null;
    public static final DamageSource IN_FIRE = null;

}
