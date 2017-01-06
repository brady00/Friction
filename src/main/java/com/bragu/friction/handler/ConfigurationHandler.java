package com.bragu.friction.handler;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.bragu.friction.reference.ModInfo;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File _ConfigFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(_ConfigFile);
            LoadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent _Event)
    {
        if(_Event.getModID().equalsIgnoreCase(ModInfo.MOD_ID))
        {
            LoadConfiguration();
        }
    }

    private static void LoadConfiguration()
    {
        try
        {
            //load
            configuration.load();

            //Read
            testValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean();
        }
        catch (Exception e)
        {
            //log exception
        }
        finally
        {
            //save config file
            if(configuration.hasChanged())
            {
                configuration.save();
            }
        }
    }

}
