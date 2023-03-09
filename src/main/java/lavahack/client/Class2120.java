/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import lavahack.client.Class1527;

public class Class2120 {
    public static Class2027 Field17641 = new Class2027(Color.ORANGE);
    public static Class2027 Field17642 = new Class2027(Color.CYAN);
    public static Class2027 Field17643 = new Class2027(Color.PINK);
    public static Class2027 Field17644 = new Class2027(Color.PINK);
    public static boolean Field17645 = true;
    public static float Field17646 = Float.intBitsToFloat(0x40200000);
    public static String Field17647 = "Default";
    public static String Field17648 = Class1527.Field15138.name();
    public static String Field17649 = Class1527.Field15139.name();
    public static boolean Field17650 = false;
    public static boolean Field17651 = false;
    public static float Field17652 = 1.0f;
    public static boolean Field17653 = true;
    public static int Field17654 = 300;
    private String Field17655 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method7657() {
        Field17641 = null.Field11812.Method339();
        Field17642 = null.Field11816.Method339();
        Field17643 = null.Field11818.Method339();
        Field17644 = null.Field11817.Method339();
        Field17645 = !null.Field11814.Method359().equals(Class1527.Field15137.name());
        Field17646 = null.Field11819.Method368();
        Field17647 = null.Field11814.Method359();
        Field17650 = null.Field11813.Method365();
        Field17651 = null.Field11822.Method365();
        Field17652 = null.Field11823.Method368();
        Field17653 = null.Field11811.Method365();
        Field17654 = null.Field11824.Method335();
    }

    private static String Method7658(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 125;
            cArray2[n] = (char)(cArray[n] ^ (0xF37 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

