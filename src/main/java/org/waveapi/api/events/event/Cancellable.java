package org.waveapi.api.events.event;

public interface Cancellable {
    boolean isCancelled();
    boolean setCancelled(boolean shouldCancel);
}
