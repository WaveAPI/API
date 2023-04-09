package org.waveapi.api.content.tags;

import org.waveapi.api.WaveMod;

import java.util.Objects;

public class Tags {
    //<editor-fold desc="Common tags">
    public static final Tag BUTTON = Objects.requireNonNull(null);
    public static final Tag LOG = Objects.requireNonNull(null);
    public static final Tag PLANKS = Objects.requireNonNull(null);
    public static final Tag SAND = Objects.requireNonNull(null);

    public static final Tag SLAB = Objects.requireNonNull(null);

    public static final Tag STAIR = Objects.requireNonNull(null);

    public static final Tag WOOL = Objects.requireNonNull(null);

    public static final Tag DIRT = Objects.requireNonNull(null);

    public static final Tag FISH = Objects.requireNonNull(null);

    public static final Tag LEAVES = Objects.requireNonNull(null);

    public static final Tag SMALL_FLOWER = Objects.requireNonNull(null);

    public static final Tag SAPLING = Objects.requireNonNull(null);

    public static final Tag INGOT = Objects.requireNonNull(null);
    public static final Tag COBBLESTONE = Objects.requireNonNull(null);
    public static final Tag GEM = Objects.requireNonNull(null);

    //</editor-fold>


    //<editor-fold desc="Advanced tags">
    public Tag ingotCommon(String name) {
        return Objects.requireNonNull(null);
    }

    public Tag ingotModSpecific(String name, WaveMod mod) {
        return Objects.requireNonNull(null);
    }

    public Tag otherCommon(String name) {
        return Objects.requireNonNull(null);
    }

    public Tag otherModSpecific(String name, WaveMod mod) {
        return Objects.requireNonNull(null);
    }
    //</editor-fold>


}
