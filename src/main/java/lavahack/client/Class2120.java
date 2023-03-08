//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.awt.*;

public class Class2120
{
    public static Class2027 Field17641;
    public static Class2027 Field17642;
    public static Class2027 Field17643;
    public static Class2027 Field17644;
    public static boolean Field17645;
    public static float Field17646;
    public static String Field17647;
    public static String Field17648;
    public static String Field17649;
    public static boolean Field17650;
    public static boolean Field17651;
    public static float Field17652;
    public static boolean Field17653;
    public static int Field17654;
    private String Field17655 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method7657() {
        Class2120.Field17641 = null.Field11812.Method339();
        Class2120.Field17642 = null.Field11816.Method339();
        Class2120.Field17643 = null.Field11818.Method339();
        Class2120.Field17644 = null.Field11817.Method339();
        Class2120.Field17645 = !null.Field11814.Method359().equals(Class1527.Field15137.name());
        Class2120.Field17646 = null.Field11819.Method368();
        Class2120.Field17647 = null.Field11814.Method359();
        Class2120.Field17650 = null.Field11813.Method365();
        Class2120.Field17651 = null.Field11822.Method365();
        Class2120.Field17652 = null.Field11823.Method368();
        Class2120.Field17653 = null.Field11811.Method365();
        Class2120.Field17654 = null.Field11824.Method335();
    }
    
    static {
        Class2120.Field17641 = new Class2027(Color.ORANGE);
        Class2120.Field17642 = new Class2027(Color.CYAN);
        Class2120.Field17643 = new Class2027(Color.PINK);
        Class2120.Field17644 = new Class2027(Color.PINK);
        Class2120.Field17645 = true;
        Class2120.Field17646 = Float.intBitsToFloat(1075838976);
        Class2120.Field17647 = "Default";
        Class2120.Field17648 = Class1527.Field15138.name();
        Class2120.Field17649 = Class1527.Field15139.name();
        Class2120.Field17650 = false;
        Class2120.Field17651 = false;
        Class2120.Field17652 = 1.0f;
        Class2120.Field17653 = true;
        Class2120.Field17654 = 300;
    }
    
    private static String Method7658(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xF37 ^ 0x7D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
