package com.bragu.friction.item;

import com.bragu.friction.reference.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;

public class FrictionItem extends Item
{
    public FrictionItem()
    {
        super();
        maxStackSize = 1;
        setCreativeTab(CreativeTabs.MISC);
        setNoRepair();
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", ModInfo.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack _ItemStack)
    {
        return String.format("item.%s%s", ModInfo.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getOriginalUnlocalizedName()
    {
        return super.getUnlocalizedName();
    }

    public String getOriginalUnlocalizedName(ItemStack _ItemStack)
    {
        return super.getUnlocalizedName();
    }

    protected String getUnwrappedUnlocalizedName(String _UnlocalizedName)
    {
        return _UnlocalizedName.substring(_UnlocalizedName.indexOf(".") +1);
    }

}
