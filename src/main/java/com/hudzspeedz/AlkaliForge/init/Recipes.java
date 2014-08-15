package com.hudzspeedz.AlkaliForge.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by user on 31/07/2014.
 */
public class Recipes {
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.LithiumBlock),"sss","sss","sss",'s',new ItemStack(ModItems.LithiumChunk));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.SodiumBlock),"sss","sss","sss",'s',new ItemStack(ModItems.SodiumChunk));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.PotassiumBlock),"sss","sss","sss",'s',new ItemStack(ModItems.PotassiumChunk));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.RubidiumBlock),"sss","sss","sss",'s',new ItemStack(ModItems.RubidiumChunk));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.CaesiumBlock),"sss","sss","sss",'s',new ItemStack(ModItems.CaesiumChunk));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.FranciumBlock),"sss","sss","sss",'s',new ItemStack(ModItems.FranciumChunk));
        GameRegistry.addRecipe(new ItemStack(ModItems.PotencyDrop),"sfs","fhf","sfs",'s',new ItemStack(ModItems.CaesiumChunk),'f', Items.diamond ,'h',new ItemStack(ModItems.FranciumChunk));
        GameRegistry.addRecipe(new ItemStack(ModItems.RedstoneIcore)," s ","sis"," s ",'s', Blocks.redstone_block, 'i', Items.ender_eye);
        GameRegistry.addRecipe(new ItemStack(ModItems.PowerDrop),"sfs","fhf","sfs",'s',new ItemStack(ModItems.RedstoneIcore),'h',new ItemStack(ModItems.FranciumChunk),'f',new ItemStack(ModItems.CaesiumChunk));
        GameRegistry.addRecipe(new ItemStack(ModItems.StabilizingDrop),"rdr","eie","rdr",'r',new ItemStack(ModItems.RubidiumChunk),'d', Items.diamond,'e',Items.emerald,'i',new ItemStack(ModItems.RedstoneIcore));
    }
}
