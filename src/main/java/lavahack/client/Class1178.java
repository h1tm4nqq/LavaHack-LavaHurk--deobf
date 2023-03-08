//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import java.awt.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

public class Class1178
{
    private static final FontRenderer Field13308;
    public static Class88 Field13309;
    public static Class88 Field13310;
    public static Class88 Field13311;
    public static Class88 Field13312;
    public static Class88 Field13313;
    public static Class88 Field13314;
    public static Class88 Field13315;
    public static Class88 Field13316;
    public static Class88 Field13317;
    public static Class88 Field13318;
    public static Class88 Field13319;
    public static Class88 Field13320;
    public static Class88 Field13321;
    public static Class88 Field13322;
    public static Class88 Field13323;
    public static Class88 Field13324;
    public static Class88 Field13325;
    public static Class88 Field13326;
    public static Class88 Field13327;
    public static Class88 Field13328;
    public static Class88 Field13329;
    public static Class88 Field13330;
    public static Class88 Field13331;
    public static Class88 Field13332;
    public static Class88 Field13333;
    public static Class88 Field13334;
    public static Class88 Field13335;
    private int Field13336;
    
    public static Font Method4739(final String s, final int n) {
        return Method4740(s, Class1613.Field15543, n);
    }
    
    public static Font Method4740(final String str, final Class1613 class1613, final int n) {
        return Font.createFont(0, Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("font/" + str + ".ttf")).getInputStream()).deriveFont(class1613.Method6280(), (float)n);
    }
    
    public static int Method4741(final String s) {
        return Class2167.Field17910.Method3256(s);
    }
    
    public static int Method4742(final String s, final boolean b) {
        return Class2167.Field17910.Method3255(s, b);
    }
    
    public static void Method4743(final String s, final double n, final double n2, final int n3, final boolean b) {
        if (Method4749()) {
            Class2167.Field17910.Method3253(b).Method760(s, n, n2, n3);
        }
        else {
            Class1178.Field13308.drawString(s, (int)n, (int)n2, n3);
        }
    }
    
    public static int Method4744(final String s, final double n, final double n2, final int n3) {
        if (Method4749()) {
            Class2167.Field17910.Method3254().Method760(s, n, n2, n3);
            return 0;
        }
        return Class1178.Field13308.drawString(s, (int)n, (int)n2, n3);
    }
    
    public static int Method4745(final String s, final double n, final double n2, final int n3) {
        if (Method4749()) {
            Class2167.Field17910.Method3254().Method748(s, (int)n, (int)n2, n3);
            return 0;
        }
        return Class1178.Field13308.drawStringWithShadow(s, (float)n, (float)n2, n3);
    }
    
    public static void Method4746(final String s, final double n, final double n2, final int n3) {
        if (Method4749()) {
            Class2167.Field17910.Method3254().Method762(s, (float)(int)n, (float)(int)n2, n3);
        }
        else {
            Class1178.Field13308.drawStringWithShadow(s, (float)n - Class1178.Field13308.getStringWidth(s) / 2.0f, (float)n2, n3);
        }
    }
    
    public static int Method4747(final boolean b) {
        return Class2167.Field17910.Method3257(b);
    }
    
    public static int Method4748() {
        return Method4747(false);
    }
    
    private static boolean Method4749() {
        return Class1831.Field16464;
    }
    
    public static Class1427 Method4750() {
        return (Class1427)Class1831.Field16465.Field16453.Method341();
    }
    
    static {
        Field13308 = Minecraft.getMinecraft().fontRenderer;
        Class1178.Field13309 = new Class670(Method4739("comfortaa-light", 30));
        Class1178.Field13310 = new Class670(Method4739("comfortaa-light", 18));
        Class1178.Field13311 = new Class670(Method4739("comfortaa-light", 15));
        Class1178.Field13312 = new Class670(Method4739("comfortaa-light", 16));
        Class1178.Field13313 = new Class670(Method4739("comfortaa-light", 10));
        Class1178.Field13314 = new Class670(Method4739("comfortaa-bold", 72));
        Class1178.Field13315 = new Class670(Method4739("comfortaa-bold", 55));
        Class1178.Field13316 = new Class670(Method4739("comfortaa-bold", 30));
        Class1178.Field13317 = new Class670(Method4739("comfortaa-bold", 18));
        Class1178.Field13318 = new Class670(Method4739("comfortaa-bold", 16));
        Class1178.Field13319 = new Class670(Method4739("comfortaa-bold", 10));
        Class1178.Field13320 = new Class670(Method4739("comfortaa-regular", 30));
        Class1178.Field13321 = new Class670(Method4739("comfortaa-regular", 18));
        Class1178.Field13322 = new Class670(Method4739("comfortaa-regular", 15));
        Class1178.Field13323 = new Class670(Method4739("comfortaa-regular", 10));
        Class1178.Field13324 = new Class670(Method4739("consolas", 18));
        Class1178.Field13325 = new Class670(Method4739("consolas", 16));
        Class1178.Field13326 = new Class670(Method4739("consolas", 15));
        Class1178.Field13327 = new Class670(Method4739("sf-ui", 19));
        Class1178.Field13328 = new Class670(Method4739("sf-ui", 18));
        Class1178.Field13329 = new Class670(Method4739("futura-normal", 20));
        Class1178.Field13330 = new Class670(Method4739("futura-normal", 18));
        Class1178.Field13331 = new Class670(Method4739("lexenddeca-regular", 18));
        Class1178.Field13332 = new Class670(Method4739("main", 18));
        Class1178.Field13333 = new Class670(new Font("Verdana", 0, 18));
        Class1178.Field13334 = new Class670(Method4739("jellee-bold", 18));
        Class1178.Field13335 = new Class670(Method4739("minecraft", 13));
    }
    
    private static String Method4751(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7E6E ^ 0x38));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
