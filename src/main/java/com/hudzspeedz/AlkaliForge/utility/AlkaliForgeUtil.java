package com.hudzspeedz.AlkaliForge.utility;

import net.minecraft.util.ResourceLocation;



/**
 * Created by user on 05/08/2014.
 */
public final class AlkaliForgeUtil {

    public static ResourceLocation getResource(ResourceType type, String name)
    {
        return new ResourceLocation("alkaliforge", type.getPrefix() + name);
    }

    public static enum ResourceType
    {
        GUI("gui"),
        GUI_ELEMENT("gui/elements"),
        SOUND("sound"),
        RENDER("render"),
        TEXTURE_BLOCKS("textures/blocks"),
        TEXTURE_ITEMS("textures/items"),
        MODEL("models"),
        INFUSE("infuse");


        private String prefix;


        private ResourceType(String s)
        {
            prefix = s;
        }


        public String getPrefix()
        {
            return prefix + "/";
        }
    }



}
