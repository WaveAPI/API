package org.waveapi.api.misc;

import org.waveapi.api.WaveMod;

public class TranslatedText extends Text {

    public TranslatedText(String name, WaveMod mod) {}

    public TranslatedText addTranslation(String language, String translation) {return this;}

    /**
     * Think String.format()
     */
    public Text withValues(Object... objects) {return this;}

}
