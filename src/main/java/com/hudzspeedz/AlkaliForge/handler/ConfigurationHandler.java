package com.hudzspeedz.AlkaliForge.handler;

import com.hudzspeedz.AlkaliForge.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init (File configFile)
    {
        //create the config object from given config file
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }


@SubscribeEvent
 public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event)
{
    if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
    {
        //resync configs
        loadConfiguration();
    }
}
    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", "Forge", false,"this is an example config value");
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
