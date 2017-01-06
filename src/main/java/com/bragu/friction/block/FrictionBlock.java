package com.bragu.friction.block;

import com.bragu.friction.reference.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FrictionBlock extends Block
{
    public FrictionBlock(Material _Material)
    {
        super(_Material);
        setCreativeTab(CreativeTabs.MISC);
    }

    public FrictionBlock()
    {
        this(Material.ROCK);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", ModInfo.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getOriginalUnlocalizedName()
    {
        return super.getUnlocalizedName();
    }

    protected String getUnwrappedUnlocalizedName(String _UnlocalizedName)
    {
        return _UnlocalizedName.substring(_UnlocalizedName.indexOf(".") +1);
    }

}
