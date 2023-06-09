package org.waveapi.api.items;

import org.waveapi.api.WaveMod;
import org.waveapi.api.entities.entity.living.EntityPlayer;
import org.waveapi.api.items.inventory.ItemStack;
import org.waveapi.api.items.models.ItemModel;
import org.waveapi.api.items.tags.Tag;
import org.waveapi.api.misc.Text;
import org.waveapi.api.world.World;

import java.util.List;
import java.util.Objects;

public class WaveItem {

    public WaveItem(String id, WaveMod mod) {}

    public String getId() {return java.util.Objects.requireNonNull(null);}

    public WaveItem tag(Tag tag) {return this;}

    public WaveItem setModel(ItemModel model) {return this;}

    public WaveItem setTab(WaveTab tab) {return this;}

    public WaveItem addTranslation(String language, String name) {return this;}
    public WaveItem setRarity(Rarity rarity) {return this;}

    public WaveItem setMaxStackSize(int size) {return this;}

    /**
     * Is called on client then on server if it returns a successful use
     */
    public ItemUseResult onUse(ItemStack item, UseHand hand, EntityPlayer player, World world) {return ItemUseResult.SUCCESS;}

    public ItemStack getDefaultStack() {return java.util.Objects.requireNonNull(null);}

    public List<Text> addToolTip(ItemStack stack) {return Objects.requireNonNull(null);}

    public int getMaxAmount() {return 64;}
    public void setDurability(int durability) {}

    public WaveItem makeFood(int hunger, float saturation) {return this;}
    public WaveItem makeFood(int hunger, float saturation, boolean isAlwaysEdible) {return this;}
    public WaveItem makeFood(int hunger, float saturation, boolean isAlwaysEdible, boolean isMeat, boolean isASnack) {return this;}

    }
