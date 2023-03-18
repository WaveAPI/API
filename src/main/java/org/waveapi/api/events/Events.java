package org.waveapi.api.events;

public abstract class Events {
    public void register(Class<?> classToRegister) {}

    public void register(Object objectToRegister) {}
}
