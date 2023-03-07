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
final class I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Supplier {
    public static final I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field10001 = new I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private int Field10002;

    public Object get() {
        return this.Method2230();
    }

    public final boolean Method2230() {
        int n;
        if (aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465 != null) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16465.Field16457;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"CustomFontModule.instance.test");
            n = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
            return n != 0;
        }
        n = (int)((long)-242779880 ^ (long)-242779880);
        return n != 0;
    }

    I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method2231(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-67888003 ^ (long)-67888003);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-619672676 ^ (long)-619672733);
            int n2 = (int)-1506819429L ^ 0xA62FC2C8;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1270119096 ^ (long)1270117729) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

