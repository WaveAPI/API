package org.waveapi.api.items.block.blockentities;

/**
 * Not recommended.
 */
public interface DeltaTicking {
    /**
     * @param ticksSinceLastTick Amount of ticks since last tick, may not 100% be accurate with some deltaTick managers.
     */
    void tick(int ticksSinceLastTick);

    /**
     * max ticks without ticking, may not be supported with some deltaTick managers.
     */
    default int maxTicksUnticked() {
        return 100;
    }

}
