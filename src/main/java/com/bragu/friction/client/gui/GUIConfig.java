package com.bragu.friction.client.gui;

import com.bragu.friction.handler.ConfigurationHandler;
import com.bragu.friction.reference.ModInfo;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class GUIConfig extends GuiConfig
{
    public GUIConfig(GuiScreen _guiScreen)
    {
        super(_guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                ModInfo.MOD_ID,
                false,
                false,
                GUIConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }

}
