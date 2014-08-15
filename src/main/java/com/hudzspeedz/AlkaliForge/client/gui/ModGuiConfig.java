package com.hudzspeedz.AlkaliForge.client.gui;

import com.hudzspeedz.AlkaliForge.handler.ConfigurationHandler;
import com.hudzspeedz.AlkaliForge.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;


public class ModGuiConfig extends GuiConfig{

    public ModGuiConfig (GuiScreen guiScreen)
    {
        super(
                guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory("forge")).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }

}
