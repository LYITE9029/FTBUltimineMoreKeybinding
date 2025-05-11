package common.src.main.java.lyite9029.ftbultimine_more_keybinding;

import com.mojang.blaze3d.platform.InputConstants;
import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;

public class ShortcutKeyRegister {
    public static List<KeyMapping> key = new ArrayList<>();

    public ShortcutKeyRegister() {
        keyRegister();
    }

    public static void keyRegister() {
        key.add(create("shapeless", GLFW.GLFW_KEY_UNKNOWN));
        key.add(create("0", GLFW.GLFW_KEY_UNKNOWN));
        key.add(create("1", GLFW.GLFW_KEY_UNKNOWN));
        key.add(create("2", GLFW.GLFW_KEY_UNKNOWN));
        key.add(create("3", GLFW.GLFW_KEY_UNKNOWN));
        key.add(create("4", GLFW.GLFW_KEY_UNKNOWN));
        key.add(create("5", GLFW.GLFW_KEY_UNKNOWN));
        key.add(create("6", GLFW.GLFW_KEY_UNKNOWN));
        key.add(create("7", GLFW.GLFW_KEY_UNKNOWN));
        key.add(create("8", GLFW.GLFW_KEY_UNKNOWN));
        key.add(create("9", GLFW.GLFW_KEY_UNKNOWN));

        for (KeyMapping keyMapping : key) {
            KeyMappingRegistry.register(keyMapping);
        }
    }

    private static KeyMapping create(String name, int key) {
        return new KeyMapping("key." + FTBUltimineMoreKeybinding.MOD_ID + "." + name, InputConstants.Type.KEYSYM, key, "key.categories." + FTBUltimineMoreKeybinding.MOD_ID);
    }
}
