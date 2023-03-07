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
import lavahack.client.hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
implements Supplier {
    final hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7 Field9389;
    private String Field9390 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method1663();
    }

    public final boolean Method1663() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7.Method1684(this.Field9389);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fade");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7 hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU72) {
        this.Field9389 = hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU72;
    }

    private static String Method1664(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1547670230L ^ 0x5C3F92D6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)75800271 ^ (long)75800112);
            int n2 = ((int)262973591L ^ 0xFACA89E) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1963400661 ^ (long)-1963419960) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

