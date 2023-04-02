package org.waveapi.api.content.items.tools;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.WaveItem;

public class WavePickaxeItem extends WaveItem {
    public WavePickaxeItem(String id, WaveMod mod, WaveToolMaterial material) {
        super(id, mod);
    }

    public WavePickaxeItem setAttackDamage(int damage) {return this;}
    public WavePickaxeItem setAttackSpeed(float speed) {return this;}

}
