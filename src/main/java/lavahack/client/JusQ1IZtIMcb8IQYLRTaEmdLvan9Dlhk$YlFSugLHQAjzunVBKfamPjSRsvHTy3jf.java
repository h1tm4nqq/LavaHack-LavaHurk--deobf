/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Supplier {
    public static final JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field7938 = new JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private String Field7939 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method245();
    }

    public final boolean Method245() {
        int n;
        if (aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465 != null) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465.Field16457;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CustomFontModule.instance.test");
            n = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
            return n != 0;
        }
        n = (int)((long)265103789 ^ (long)265103789);
        return n != 0;
    }

    JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method246(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-886712518L ^ 0xCB25D73A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)495868519 ^ (long)495868568);
            int n2 = (int)((long)118357724 ^ (long)118357685) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1584299119L ^ 0x5E6E240E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

