package org.waveapi.api.events.event.message;

import org.waveapi.api.events.event.Cancellable;
import org.waveapi.api.events.event.Event;
import org.waveapi.api.misc.Text;

public abstract class ClientChatMessageEvent implements Event, Cancellable {
    /**
     * @return returns message's text e.g. "&lt;player234&gt; hello guys, I am new" or "This is some message send by the server."
     */
    public abstract Text getText();
}
