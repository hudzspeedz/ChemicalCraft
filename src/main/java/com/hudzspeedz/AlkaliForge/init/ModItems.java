package com.hudzspeedz.AlkaliForge.init;

import com.hudzspeedz.AlkaliForge.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    //dust
    public static final ItemCC LithiumDust = new ItemLithiumDust();
    public static final ItemCC SodiumDust = new ItemSodiumDust();
    public static final ItemCC PotassiumDust = new ItemPotassiumDust();
    public static final ItemCC RubidiumDust = new ItemRubidiumDust();
    public static final ItemCC CaesiumDust = new ItemCaesiumDust();
    public static final ItemCC FranciumDust = new ItemFranciumDust();

    // chunks
    public static final ItemCC LithiumChunk = new ItemLithiumChunk();
    public static final ItemCC SodiumChunk = new ItemSodiumChunk();
    public static final ItemCC PotassiumChunk = new ItemPotassiumChunk();
    public static final ItemCC RubidiumChunk = new ItemRubidiumChunk();
    public static final ItemCC CaesiumChunk = new ItemCaesiumChunk();
    public static final ItemCC FranciumChunk = new ItemFranciumChunk();

    //other
    public static final ItemCC PotencyDrop = new ItemPotencyDrop();
    public static final ItemCC RedstoneIcore = new ItemRedstoneIcore();
    public static final ItemCC PowerDrop = new ItemPowerDrop();
    public static final ItemCC StabilizingDrop = new ItemStabilizingDrop();

    public static void init ()
    {
        //dust
        GameRegistry.registerItem(LithiumDust, "LithiumDust");
        GameRegistry.registerItem(SodiumDust, "SodiumDust");
        GameRegistry.registerItem(PotassiumDust, "PotassiumDust");
        GameRegistry.registerItem(RubidiumDust,"RubidiumDust");
        GameRegistry.registerItem(CaesiumDust,"CaesiumDust");
        GameRegistry.registerItem(FranciumDust,"FranciumDust");

        //chunks
        GameRegistry.registerItem(LithiumChunk,"LithiumChunk");
        GameRegistry.registerItem(SodiumChunk,"SodiumChunk");
        GameRegistry.registerItem(PotassiumChunk,"PotassiumChunk");
        GameRegistry.registerItem(RubidiumChunk,"RubidiumChunk");
        GameRegistry.registerItem(CaesiumChunk,"CaesiumChunk");
        GameRegistry.registerItem(FranciumChunk,"FranciumChunk");

        //other
        GameRegistry.registerItem(PotencyDrop, "PotencyDrop");
        GameRegistry.registerItem(RedstoneIcore,"RedstoneIcore");
        GameRegistry.registerItem(PowerDrop,"PowerDrop");
        GameRegistry.registerItem(StabilizingDrop, "StabilizingDrop");
    }


}
