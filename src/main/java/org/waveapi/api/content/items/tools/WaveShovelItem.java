package org.waveapi.api.content.items.tools;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.WaveItem;

public class WaveShovelItem extends WaveItem {
    public WaveShovelItem(String id, WaveMod mod, WaveToolMaterial material) {
        super(id, mod);
    }

    public WaveShovelItem setAttackDamage(int damage) {return this;}
    public WaveShovelItem setAttackSpeed(float speed) {return this;}

}
