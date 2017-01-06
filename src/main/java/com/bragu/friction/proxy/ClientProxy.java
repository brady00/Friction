package com.bragu.friction.proxy;

import com.bragu.friction.init.ModBlocks;
import com.bragu.friction.init.ModItems;

public class ClientProxy extends CommonProxy
{
    @Override
    public void init()
    {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
