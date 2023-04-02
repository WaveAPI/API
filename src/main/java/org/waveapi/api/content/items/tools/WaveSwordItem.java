package org.waveapi.api.content.items.tools;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.WaveItem;

public class WaveSwordItem extends WaveItem {
    public WaveSwordItem(String id, WaveMod mod, WaveToolMaterial material) {
        super(id, mod);
    }

    public WaveSwordItem setAttackDamage(int damage) {return this;}
    public WaveSwordItem setAttackSpeed(float speed) {return this;}

}
