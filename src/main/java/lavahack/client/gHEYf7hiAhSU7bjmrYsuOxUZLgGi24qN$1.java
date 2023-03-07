/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "get"})
final class gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$1
implements Supplier {
    public static final gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$1 Field15907 = new gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$1();
    private String Field15908 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method6558();
    }

    public final String Method6558() {
        if (!gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7085(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809).Method365()) return "";
        return "[Pickaxe Only]";
    }

    gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$1() {
    }

    private static String Method6559(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1980185141 ^ (long)1980185141);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)87680934 ^ (long)87680857);
            int n2 = ((int)232265731L ^ 0xDD81800) << 6;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1038582478L ^ 0xC21837ED ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

