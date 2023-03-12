package org.waveapi.api.world.entity;

import org.waveapi.api.math.Vector3;

public class BaseEntity {
    public int getID() {return 0;}

    public String getName() {return null;}

    public float getYaw() {return 0;}
    public float getPitch() {return 0;}

    public Vector3 getPosition() {return null;}
    public void setPosition(Vector3 position) {}


    public Vector3 getVelocity() {return null;}
    public void setVelocity(Vector3 position) {}

}
