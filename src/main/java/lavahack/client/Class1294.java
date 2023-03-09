/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1185;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class97;

public class Class1294
extends Class42 {
    public static Class1294 Field13915;
    @Class1801
    private final Class618 Field13916 = new Class618(Class1185::Method158, new Predicate[0]);
    private String Field13917 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1294() {
        super("CameraClip", Class97.Field8341);
        Field13915 = this;
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field13916);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field13916);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 90;
            cArray2[n] = (char)(cArray[n] ^ (0x39B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

