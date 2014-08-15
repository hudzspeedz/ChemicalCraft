package com.hudzspeedz.AlkaliForge;


import com.hudzspeedz.AlkaliForge.handler.ConfigurationHandler;
import com.hudzspeedz.AlkaliForge.init.ModBlocks;
import com.hudzspeedz.AlkaliForge.init.ModItems;
import com.hudzspeedz.AlkaliForge.init.ModOreGen;
import com.hudzspeedz.AlkaliForge.init.Recipes;
import com.hudzspeedz.AlkaliForge.proxy.IProxy;
import com.hudzspeedz.AlkaliForge.reference.Reference;
import com.hudzspeedz.AlkaliForge.utility.LogHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.block.Block;

@Mod( modid = Reference.MOD_ID , name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class AlkaliForge {

    @Mod.Instance(Reference.MOD_ID)
    public static AlkaliForge instance;

    @SidedProxy (clientSide = "com.hudzspeedz.AlkaliForge.proxy.ClientProxy", serverSide = "com.hudzspeedz.AlkaliForge.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initilization Compleat!");

        ModItems.init();
        ModBlocks.init();
        ModOreGen.init();

    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info(" Initilization Compleat!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initilization Compleat!");

    }



}
