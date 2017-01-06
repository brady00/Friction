package com.bragu.friction.init;

import com.bragu.friction.block.BlockFlag;
import com.bragu.friction.block.FrictionBlock;
import com.bragu.friction.item.FrictionItem;
import com.bragu.friction.item.ItemMapleLeaf;
import com.bragu.friction.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlocks
{
    public static FrictionBlock flag;

    public static void init()
    {
        flag = new BlockFlag();
        LogHelper.info("Flag Has Been Created");
    }

    public static void register()
    {
        RegisterBlock(flag);
    }

    private static void RegisterBlock(Block _Block)
    {
        GameRegistry.register(_Block);
        ItemBlock item = new ItemBlock(_Block);
        item.setRegistryName(_Block.getRegistryName());
        GameRegistry.register(item);
        LogHelper.info("Flag Has Been Registered");
    }

    public static void registerRenders()
    {
        registerRender(flag);
    }

    private static void registerRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        LogHelper.info("Flag's renderer Has Been Registered");
    }


}
