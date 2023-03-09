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

public class Class1766
extends Class42 {
    public static Class1766 Field16075;
    @Class1801
    private final Class618 Field16076 = new Class618(Class1185::Method158, new Predicate[0]);
    private String Field16077 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1766() {
        super("SkylightFix", Class97.Field8343);
        Field16075 = this;
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field16076);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field16076);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 255;
            cArray2[n] = (char)(cArray[n] ^ (0x7016 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

