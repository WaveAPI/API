package org.waveapi.api.content.items.tools;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.WaveItem;

public class WaveHoeItem extends WaveItem {
    public WaveHoeItem(String id, WaveMod mod, WaveToolMaterial material) {
        super(id, mod);
    }

    public WaveHoeItem setAttackDamage(int damage) {return this;}
    public WaveHoeItem setAttackSpeed(float speed) {return this;}

}
