package com.bragu.friction.init;

import com.bragu.friction.item.FrictionItem;
import com.bragu.friction.item.ItemMapleLeaf;
import com.bragu.friction.reference.ModInfo;
import com.bragu.friction.utility.LogHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    public static FrictionItem mapleLeaf;

    public static void init()
    {
       mapleLeaf = new ItemMapleLeaf();
    }

    public static void register()
    {
        LogHelper.info(mapleLeaf.getRegistryName());
        GameRegistry.register(mapleLeaf);
    }

    public static void registerRenders()
    {
        registerRender(mapleLeaf);
    }

    private static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }


}
