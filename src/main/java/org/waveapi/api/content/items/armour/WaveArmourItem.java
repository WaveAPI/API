package org.waveapi.api.content.items.armour;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.WaveItem;

public class WaveArmourItem extends WaveItem {
    public WaveArmourItem(String id, WaveArmourMaterial material, ArmourSlot slot, WaveMod mod) {
        super(id, mod);
    }
}
