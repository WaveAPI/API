package org.waveapi.api.world.entity;

public abstract class DamageSource {

    public abstract String getName();

    public abstract boolean doesIgnoreArmour();

    public static final DamageSource GENERIC = java.util.Objects.requireNonNull(null);
    public static final DamageSource LAVA = java.util.Objects.requireNonNull(null);
    public static final DamageSource IN_FIRE = java.util.Objects.requireNonNull(null);

}
