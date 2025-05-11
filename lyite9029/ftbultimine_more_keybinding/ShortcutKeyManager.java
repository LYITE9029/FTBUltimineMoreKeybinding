package lyite9029.ftbultimine_more_keybinding;

import net.minecraft.client.KeyMapping;

public class ShortcutKeyManager {
    public static KeyMapping Key_Shapeless = ShortcutKeyRegister.key.get(0);
    public static KeyMapping Key_0 = ShortcutKeyRegister.key.get(1);
    public static KeyMapping Key_1 = ShortcutKeyRegister.key.get(2);
    public static KeyMapping Key_2 = ShortcutKeyRegister.key.get(3);
    public static KeyMapping Key_3 = ShortcutKeyRegister.key.get(4);
    public static KeyMapping Key_4 = ShortcutKeyRegister.key.get(5);
    public static KeyMapping Key_5 = ShortcutKeyRegister.key.get(6);
    public static KeyMapping Key_6 = ShortcutKeyRegister.key.get(7);
    public static KeyMapping Key_7 = ShortcutKeyRegister.key.get(8);
    public static KeyMapping Key_8 = ShortcutKeyRegister.key.get(9);
    public static KeyMapping Key_9 = ShortcutKeyRegister.key.get(10);

    public static boolean isShortcutKeyPressed() {
        return getCurrentPressedShortcutKey() != null;
    }

    public static KeyMapping getCurrentPressedShortcutKey() {
        if (Key_Shapeless.isDown()) {
            return Key_Shapeless;
        } else if (Key_0.isDown()) {
            return Key_0;
        } else if (Key_1.isDown()) {
            return Key_1;
        } else if (Key_2.isDown()) {
            return Key_2;
        } else if (Key_3.isDown()) {
            return Key_3;
        } else if (Key_4.isDown()) {
            return Key_4;
        } else if (Key_5.isDown()) {
            return Key_5;
        } else if (Key_6.isDown()) {
            return Key_6;
        } else if (Key_7.isDown()) {
            return Key_7;
        } else if (Key_8.isDown()) {
            return Key_8;
        } else if (Key_9.isDown()) {
            return Key_9;
        }
        return null;
    }

    public static int getTargetShapeIdx(KeyMapping key) {
        if (key == Key_Shapeless) {
            return 0;
        } else if (key == Key_0) {
            return 0;
        } else if (key == Key_1) {
            return 1;
        } else if (key == Key_2) {
            return 2;
        } else if (key == Key_3) {
            return 3;
        } else if (key == Key_4) {
            return 4;
        } else if (key == Key_5) {
            return 5;
        } else if (key == Key_6) {
            return 6;
        } else if (key == Key_7) {
            return 7;
        } else if (key == Key_8) {
            return 8;
        } else if (key == Key_9) {
            return 9;
        }
        return -1;
    }
}
