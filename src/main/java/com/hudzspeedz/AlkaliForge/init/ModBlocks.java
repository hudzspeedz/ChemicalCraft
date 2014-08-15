package com.hudzspeedz.AlkaliForge.init;

import com.hudzspeedz.AlkaliForge.block.*;
import com.hudzspeedz.AlkaliForge.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


/**
 * Created by user on 31/07/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    //blocks
    public static final BlockCC LithiumBlock = new BlockLithium();
    public static final BlockCC SodiumBlock = new BlockSodium();
    public static final BlockCC PotassiumBlock = new BlockPotassium();
    public static final BlockCC RubidiumBlock = new BlockRubidium();
    public static final BlockCC CaesiumBlock = new BlockCaesium();
    public static final BlockCC FranciumBlock = new BlockFrancium();

    //ores

    public static final BlockCC LithiumOreBlock = new BlockLithiumOre();
    public static final BlockCC SodiumOreBlock = new BlockSodiumOre();
    public static final BlockCC PotassiumOreBlock = new BlockPotassiumOre();
    public static final BlockCC RubidiumOreBlock = new BlockRubidiumOre();
    public static final BlockCC CaesiumOreBlock = new BlockCaesiumOre();
    public static final BlockCC FranciumOreBlock = new BlockFranciumOre();



    public static void init()
    {
        //block registerys
        GameRegistry.registerBlock(LithiumBlock,"LithiumBlock");
        GameRegistry.registerBlock(SodiumBlock,"SodiumBlock");
        GameRegistry.registerBlock(PotassiumBlock,"PotassiumBlock");
        GameRegistry.registerBlock(RubidiumBlock,"RubidiumBlock");
        GameRegistry.registerBlock(CaesiumBlock,"CaesiumBlock");
        GameRegistry.registerBlock(FranciumBlock,"FranciumBlock");

        //TNT REGISTERY



        // ore registerys
        GameRegistry.registerBlock(LithiumOreBlock,"LithiumOreBlock");
        GameRegistry.registerBlock(SodiumOreBlock,"SodiumOreBlock");
        GameRegistry.registerBlock(PotassiumOreBlock,"PotassiumOreBlock");
        GameRegistry.registerBlock(RubidiumOreBlock,"RubidiumOreBlock");
        GameRegistry.registerBlock(CaesiumOreBlock,"CaesiumOreBlock");
        GameRegistry.registerBlock(FranciumOreBlock,"FranciumOreBlock");
    }

}
