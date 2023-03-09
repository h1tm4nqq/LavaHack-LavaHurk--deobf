/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1368;
import lavahack.client.Class1565;
import lavahack.client.Class158;
import lavahack.client.Class1833;
import lavahack.client.Class2003;
import lavahack.client.Class2113;
import lavahack.client.Class428;
import lavahack.client.Class509;
import lavahack.client.Class578;

public class Class813
extends Class158 {
    private static Class813 Field11476;
    private String Field11477;
    private boolean Field11478;
    private String Field11479 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class813() {
        super("music");
        this.Method445(new Class578(this), new Class428(this), new Class1565(this), new Class509(this), new Class2113(this), new Class1833(this), new Class2003(this));
        this.Field11477 = "";
        this.Field11478 = false;
        Field11476 = this;
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        if (stringArray.length < 1) {
            return;
        }
        Class1368 class1368 = this.Method444(stringArray[0]);
        if (class1368 == null) {
            return;
        }
        class1368.Method443(string, stringArray);
    }

    @Override
    public String Method447() {
        return "null";
    }

    @Override
    public String Method448() {
        return "null";
    }

    private static String Method3419(String[] stringArray, int n) {
        StringBuilder stringBuilder = new StringBuilder(Class813.Method3420(n, stringArray));
        int n2 = 0;
        while (n2 < stringArray.length) {
            if (n2 == stringArray.length - 1) {
                stringBuilder.append(stringArray[n2]);
            } else {
                stringBuilder.append(stringArray[n2]);
                stringBuilder.append(' ');
            }
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static int Method3420(int n, String[] stringArray) {
        int n2 = 0;
        int n3 = n;
        while (n3 < stringArray.length) {
            n2 += stringArray[n3].length();
            ++n3;
        }
        return n2 += stringArray.length;
    }

    static boolean Method3421(Class813 class813, boolean bl) {
        class813.Field11478 = bl;
        return class813.Field11478;
    }

    static boolean Method3422(Class813 class813) {
        return class813.Field11478;
    }

    static String Method3423(String[] stringArray, int n) {
        return Class813.Method3419(stringArray, n);
    }

    static Class813 Method3424() {
        return Field11476;
    }

    static String Method3425(Class813 class813, String string) {
        class813.Field11477 = string;
        return class813.Field11477;
    }

    static String Method3426(Class813 class813) {
        return class813.Field11477;
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 82;
            cArray2[n] = (char)(cArray[n] ^ (0x50BE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

