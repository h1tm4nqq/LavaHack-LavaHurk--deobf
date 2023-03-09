/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1185;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1967;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class97;

public class Class1012
extends Class42 {
    private final Class44 Field12397 = this.Method23(new Class44("Compatibility", (Class42)this, false));
    @Class1801
    private final Class618 Field12398 = new Class618(Class1185::Method158, new Predicate[0]);
    @Class1801
    private final Class618 Field12399 = new Class618(this::Method4121, new Predicate[0]);
    private String Field12400 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1012() {
        super("NoPing", Class97.Field8343, true);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method705(this);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
    }

    private void Method4121(Class1967 class1967) {
        if (!this.Field12397.Method365()) return;
        class1967.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 38;
            cArray2[n] = (char)(cArray[n] ^ (0x1061 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

