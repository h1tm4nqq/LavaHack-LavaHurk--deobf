/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import lavahack.client.vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;

public class Sv29wE551AqbVdEIXquNgSfEAIgOnsoV {
    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field17641 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color.ORANGE);
    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field17642 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color.CYAN);
    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field17643 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color.PINK);
    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field17644 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color.PINK);
    public static boolean Field17645 = (int)-463355696L ^ 0xE461C0D1;
    public static float Field17646 = Float.intBitsToFloat(0x138A32D ^ 0x4118A32D);
    public static String Field17647 = "Default";
    public static String Field17648 = vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15138.name();
    public static String Field17649 = vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15139.name();
    public static boolean Field17650 = (int)-1401090038L ^ 0xAC7D100A;
    public static boolean Field17651 = (int)((long)381301301 ^ (long)381301301);
    public static float Field17652 = 1.0f;
    public static boolean Field17653 = (int)1160434370L ^ 0x452AD2C3;
    public static int Field17654 = (int)((long)1946094355 ^ (long)1946094424) << 2;
    private String Field17655 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method7657() {
        Field17641 = null.Field11812.Method339();
        Field17642 = null.Field11816.Method339();
        Field17643 = null.Field11818.Method339();
        Field17644 = null.Field11817.Method339();
        Field17645 = !null.Field11814.Method359().equals(vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15137.name()) ? (int)((long)-1535875752 ^ (long)-1535875751) : (int)((long)-1487506160 ^ (long)-1487506160);
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
        int n = (int)((long)1519338421 ^ (long)1519338421);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-883468800 ^ (long)-883468545);
            int n2 = (int)((long)-1883761878 ^ (long)-1883761833);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1444167266 ^ (long)1444163925) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

