package org.waveapi.api.misc;

import java.util.Objects;

public class Text {
    public String getText() {return "";}
    public static Text plain(String text) {return Objects.requireNonNull(null);}

    /**
     * For if you know translation keys
     */
    public static Text translatable(String id) {return Objects.requireNonNull(null);}

}
