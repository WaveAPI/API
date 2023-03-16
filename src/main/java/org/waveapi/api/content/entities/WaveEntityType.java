package org.waveapi.api.content.entities;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.entities.renderer.WaveEntityRenderer;
import org.waveapi.api.world.entity.EntityBase;
import org.waveapi.api.world.entity.EntityGroup;

public class WaveEntityType<T extends EntityBase> {

    public WaveEntityType (String id, Class<T> entity, EntityGroup group, EntityBox box, WaveMod mod) {}

    public WaveEntityType (String id, Class<T> entity, EntityBox box, WaveMod mod) {}

    public WaveEntityType (String id, Class<T> entity,  WaveMod mod) {}

    public String getId() {return java.util.Objects.requireNonNull(null);}

    public WaveMod getMod() {return java.util.Objects.requireNonNull(null);}

    public void setMaxTrackingRange(int range) {}

    public WaveEntityRenderer getEntityRenderer() {
        return null;
    }

}
