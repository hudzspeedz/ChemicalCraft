package com.hudzspeedz.AlkaliForge.generation;

import com.hudzspeedz.AlkaliForge.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * Created by user on 03/08/2014.
 */
public class PotassiumOreGeneraion implements IWorldGenerator {
    @Override
    public void generate (Random random, int chunkX, int chunkZ, World world,
                          IChunkProvider chunkGenerator, IChunkProvider chunkProvider){

        switch (world.provider.dimensionId){

            case -1: generateNether(world,random,chunkX*16,chunkZ*16);
            case 0: generateSurface(world,random,chunkX*16,chunkZ*16);


        }

    }

    private void generateNether(World world, Random random, int i,int j)
    {

    }
    private void generateSurface(World world, Random random, int chunkX,int chunkZ)
    {
        for(int K = 0; K < 16; K++){
            int Xcoords = chunkX + random.nextInt(16);
            int Ycoords = random.nextInt(64);
            int Zcoords = chunkZ + random.nextInt(16);
            new WorldGenMinable(ModBlocks.PotassiumOreBlock,4).generate(world, random, Xcoords, Ycoords, Zcoords);
        }
    }

}
