package com.hudzspeedz.AlkaliForge.init;

import com.hudzspeedz.AlkaliForge.generation.*;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by user on 03/08/2014.
 */
public class ModOreGen {

    public static final IWorldGenerator LithiumOreGen = new LithiumOreGeneration();
    public static final IWorldGenerator SodiumOreGen = new SodiumOreGeneration();
    public static final IWorldGenerator PotassiumOreGen = new PotassiumOreGeneraion();
    public static final IWorldGenerator RubidiumOreGen = new RubidiumOreGeneraion();
    public static final IWorldGenerator CaesiumOreGen = new CaesiumOreGeneration();
    public static final IWorldGenerator FranciumOreGen = new FranciumOreGeneration();



    public static void init(){

        GameRegistry.registerWorldGenerator(LithiumOreGen,1);
        GameRegistry.registerWorldGenerator(SodiumOreGen,1);
        GameRegistry.registerWorldGenerator(PotassiumOreGen,1);
        GameRegistry.registerWorldGenerator(RubidiumOreGen,1);
        GameRegistry.registerWorldGenerator(CaesiumOreGen,1);
        GameRegistry.registerWorldGenerator(FranciumOreGen,1);
}


}
