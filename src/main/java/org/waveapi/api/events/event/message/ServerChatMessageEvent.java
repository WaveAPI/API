package org.waveapi.api.events.event.message;

import org.waveapi.api.events.event.Cancellable;
import org.waveapi.api.events.event.Event;
import org.waveapi.api.misc.Text;

/**
 * Triggered whenever a message is received by the world
 */
public abstract class ServerChatMessageEvent implements Event, Cancellable {
    /**
     * @return text of the message
     */
    public abstract Text getText();
    public abstract String getSendersName();
}
