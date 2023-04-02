package org.waveapi.api.content.items.tools;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.WaveItem;

public class WaveAxeItem extends WaveItem {
    public WaveAxeItem(String id, WaveMod mod, WaveToolMaterial material) {
        super(id, mod);
    }

    public WaveAxeItem setAttackDamage(int damage) {return this;}
    public WaveAxeItem setAttackSpeed(float speed) {return this;}

}
