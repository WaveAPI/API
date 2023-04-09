package org.waveapi.api.content.items.recipes;

import org.waveapi.api.WaveMod;
import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.content.tags.Tag;

public class WaveShapedRecipe {

    public WaveShapedRecipe(String result, String[] pattern, WaveMod mod) {}
    public WaveShapedRecipe(WaveItem result, String[] pattern, WaveMod mod) {}

    public WaveShapedRecipe addIngredient(char symbol, String id) {return this;}

    public WaveShapedRecipe addIngredient(char symbol, Tag tag) {return this;}

    public WaveShapedRecipe setResultCount(int count) {return this;}

}
