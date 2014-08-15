package com.hudzspeedz.AlkaliForge.block;

/**
 * Created by user on 02/08/2014.
 */
public class BlockCaesiumOre extends BlockCC {
    public BlockCaesiumOre ()
    {
        super();
        this.setBlockName("CaesiumOreBlock");
        this.setBlockTextureName("CaesiumOreBlock");
        this.setHardness(1.4F);
        this.setHarvestLevel("pickaxe",3);

    }
}
