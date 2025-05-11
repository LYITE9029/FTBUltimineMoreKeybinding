package common.src.main.java.lyite9029.ftbultimine_more_keybinding;

import common.src.main.java.lyite9029.ftbultimine_more_keybinding.net.FTBUMKNet;

import java.util.logging.Logger;

//@Mod(FTBUltimineMoreKeybinding.MOD_ID)
public class FTBUltimineMoreKeybinding {
    public static final String MOD_ID = "ftbultimine_more_keybinding";
    public static final String MOD_NAME= "FTBUltimine More Keybinding";
    public static final String LOG_TAG = "[" + MOD_ID + "]";

    public static final Logger logger = Logger.getLogger(LOG_TAG);

    public FTBUltimineMoreKeybinding() {
        FTBUMKNet.init();
        ShortcutKeyRegister.keyRegister();
    }

    public static void init() {
    }
}
