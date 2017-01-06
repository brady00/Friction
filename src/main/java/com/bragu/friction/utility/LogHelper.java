package com.bragu.friction.utility;

import com.bragu.friction.reference.ModInfo;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper
{
    public static void log(Level _Level, Object _Object)
    {
        FMLLog.log(ModInfo.MOD_NAME, _Level, String.valueOf(_Object));
    }

    public static void all(Object _Object){log(Level.ALL, _Object);}
    public static void debug(Object _Object){log(Level.DEBUG, _Object);}
    public static void error(Object _Object){log(Level.ERROR, _Object);}
    public static void fatal(Object _Object){log(Level.FATAL, _Object);}
    public static void info(Object _Object){log(Level.INFO, _Object);}
    public static void off(Object _Object){log(Level.OFF, _Object);}
    public static void trace(Object _Object){log(Level.TRACE, _Object);}
    public static void warn(Object _Object){log(Level.WARN, _Object);}

}
