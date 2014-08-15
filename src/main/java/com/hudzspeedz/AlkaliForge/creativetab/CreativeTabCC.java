package com.hudzspeedz.AlkaliForge.creativetab;

import com.hudzspeedz.AlkaliForge.init.ModItems;
import com.hudzspeedz.AlkaliForge.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by user on 31/07/2014.
 */
public class CreativeTabCC
{

    public static final CreativeTabs CC_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.PotassiumDust;
        }
        @Override
    public String getTranslatedTabLabel()
        {
            return "Chemical Craft";
        }

    };
}
