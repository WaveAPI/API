package org.waveapi.api.misc;

public abstract class NBT {
    public abstract void writeInt(String name, int i);
    public abstract void writeFloat(String name, float f);
    public abstract void writeString(String name, String str);

    public abstract int readInt(String name);
    public abstract float readFloat(String name);
    public abstract String readString(String name);

}
