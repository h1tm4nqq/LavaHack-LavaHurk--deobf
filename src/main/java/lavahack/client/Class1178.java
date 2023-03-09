//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import java.awt.Font;
import java.io.InputStream;
import lavahack.client.Class1427;
import lavahack.client.Class1613;
import lavahack.client.Class1831;
import lavahack.client.Class2167;
import lavahack.client.Class670;
import lavahack.client.Class88;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;

public class Class1178 {
    private static final FontRenderer Field13308 = Minecraft.getMinecraft().fontRenderer;
    public static Class88 Field13309 = new Class670(Class1178.Method4739("comfortaa-light", 30));
    public static Class88 Field13310 = new Class670(Class1178.Method4739("comfortaa-light", 18));
    public static Class88 Field13311 = new Class670(Class1178.Method4739("comfortaa-light", 15));
    public static Class88 Field13312 = new Class670(Class1178.Method4739("comfortaa-light", 16));
    public static Class88 Field13313 = new Class670(Class1178.Method4739("comfortaa-light", 10));
    public static Class88 Field13314 = new Class670(Class1178.Method4739("comfortaa-bold", 72));
    public static Class88 Field13315 = new Class670(Class1178.Method4739("comfortaa-bold", 55));
    public static Class88 Field13316 = new Class670(Class1178.Method4739("comfortaa-bold", 30));
    public static Class88 Field13317 = new Class670(Class1178.Method4739("comfortaa-bold", 18));
    public static Class88 Field13318 = new Class670(Class1178.Method4739("comfortaa-bold", 16));
    public static Class88 Field13319 = new Class670(Class1178.Method4739("comfortaa-bold", 10));
    public static Class88 Field13320 = new Class670(Class1178.Method4739("comfortaa-regular", 30));
    public static Class88 Field13321 = new Class670(Class1178.Method4739("comfortaa-regular", 18));
    public static Class88 Field13322 = new Class670(Class1178.Method4739("comfortaa-regular", 15));
    public static Class88 Field13323 = new Class670(Class1178.Method4739("comfortaa-regular", 10));
    public static Class88 Field13324 = new Class670(Class1178.Method4739("consolas", 18));
    public static Class88 Field13325 = new Class670(Class1178.Method4739("consolas", 16));
    public static Class88 Field13326 = new Class670(Class1178.Method4739("consolas", 15));
    public static Class88 Field13327 = new Class670(Class1178.Method4739("sf-ui", 19));
    public static Class88 Field13328 = new Class670(Class1178.Method4739("sf-ui", 18));
    public static Class88 Field13329 = new Class670(Class1178.Method4739("futura-normal", 20));
    public static Class88 Field13330 = new Class670(Class1178.Method4739("futura-normal", 18));
    public static Class88 Field13331 = new Class670(Class1178.Method4739("lexenddeca-regular", 18));
    public static Class88 Field13332 = new Class670(Class1178.Method4739("main", 18));
    public static Class88 Field13333 = new Class670(new Font("Verdana", 0, 18));
    public static Class88 Field13334 = new Class670(Class1178.Method4739("jellee-bold", 18));
    public static Class88 Field13335 = new Class670(Class1178.Method4739("minecraft", 13));
    private int Field13336;

    public static Font Method4739(String string, int n) {
        return Class1178.Method4740(string, Class1613.Field15543, n);
    }

    public static Font Method4740(String string, Class1613 class1613, int n) {
        InputStream inputStream = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("font/" + string + ".ttf")).getInputStream();
        Font font = Font.createFont(0, inputStream);
        return font.deriveFont(class1613.Method6280(), n);
    }

    public static int Method4741(String string) {
        return Class2167.Field17910.Method3256(string);
    }

    public static int Method4742(String string, boolean bl) {
        return Class2167.Field17910.Method3255(string, bl);
    }

    public static void Method4743(String string, double d, double d2, int n, boolean bl) {
        if (Class1178.Method4749()) {
            Class2167.Field17910.Method3253(bl).Method760(string, d, d2, n);
            return;
        }
        Field13308.drawString(string, (int)d, (int)d2, n);
    }

    public static int Method4744(String string, double d, double d2, int n) {
        if (!Class1178.Method4749()) return Field13308.drawString(string, (int)d, (int)d2, n);
        Class2167.Field17910.Method3254().Method760(string, d, d2, n);
        return 0;
    }

    public static int Method4745(String string, double d, double d2, int n) {
        if (!Class1178.Method4749()) return Field13308.drawStringWithShadow(string, (float)d, (float)d2, n);
        Class2167.Field17910.Method3254().Method748(string, (int)d, (int)d2, n);
        return 0;
    }

    public static void Method4746(String string, double d, double d2, int n) {
        if (Class1178.Method4749()) {
            Class2167.Field17910.Method3254().Method762(string, (int)d, (int)d2, n);
            return;
        }
        Field13308.drawStringWithShadow(string, (float)d - (float)Field13308.getStringWidth(string) / 2.0f, (float)d2, n);
    }

    public static int Method4747(boolean bl) {
        return Class2167.Field17910.Method3257(bl);
    }

    public static int Method4748() {
        return Class1178.Method4747(false);
    }

    private static boolean Method4749() {
        return Class1831.Field16464;
    }

    public static Class1427 Method4750() {
        return (Class1427)Class1831.Field16465.Field16453.Method341();
    }

    private static String Method4751(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 56;
            cArray2[n] = (char)(cArray[n] ^ (0x7E6E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

