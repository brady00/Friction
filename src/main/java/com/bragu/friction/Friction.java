package com.bragu.friction;
import com.bragu.friction.handler.ConfigurationHandler;
import com.bragu.friction.init.ModBlocks;
import com.bragu.friction.init.ModItems;
import com.bragu.friction.proxy.IProxy;
import com.bragu.friction.reference.ModInfo;
import com.bragu.friction.utility.LogHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION, guiFactory = ModInfo.GUI_FACTORY_CLASS)
public class Friction
{
    @Mod.Instance(ModInfo.MOD_ID)
    public static Friction m_Instance;

    @SidedProxy(clientSide = ModInfo.MOD_CLIENT_CLASS, serverSide = ModInfo.MOD_SERVER_CLASS)
    public static IProxy m_Proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent _Event)
    {
        ConfigurationHandler.init(_Event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
        ModItems.init();
        ModItems.register();
        ModBlocks.init();
        ModBlocks.register();
        LogHelper.info("Pre Initialization Done");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent _Event)
    {
        m_Proxy.init();
        LogHelper.info("Initialization Done");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent _Event)
    {
        LogHelper.info("Post Initialization Done");

    }

}
