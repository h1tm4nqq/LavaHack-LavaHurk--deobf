/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1763;
import lavahack.client.Class2031;
import lavahack.client.Class2124;
import lavahack.client.Class623;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/dynamic/CharmsRewriteOptionsEnum;", "", "()V", "CharmsRewriteOptions", "Companion", "kisman.cc"})
public final class Class369 {
    private static final Class2124 Field9553;
    private static final Class1763 Field9554;
    public static final Class623 Field9555;
    private String Field9556 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field9555 = new Class623(null);
        Class2124 class2124 = Class1763.Method1727(Void.class, Void.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)class2124, (String)"AbstractTask.types(\n    \u2026oid::class.java\n        )");
        Field9553 = class2124;
        Field9554 = Field9553.Method7663(Class2031.Field17339);
    }

    public static final Class2124 Method1820() {
        return Field9553;
    }

    public static final Class1763 Method1821() {
        return Field9554;
    }

    private static String Method1822(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 132;
            cArray2[n] = (char)(cArray[n] ^ (0x1A2A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

