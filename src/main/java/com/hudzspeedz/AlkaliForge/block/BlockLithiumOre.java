package com.hudzspeedz.AlkaliForge.block;

/**
 * Created by user on 31/07/2014.
 */
public class BlockLithiumOre extends BlockCC {

    public BlockLithiumOre()
    {
        super();
        this.setBlockName("LithiumOreBlock");
        this.setBlockTextureName("LithiumOreBlock");
        this.setHardness(1.4F);
        this.setHarvestLevel("pickaxe",1);
    }
}
