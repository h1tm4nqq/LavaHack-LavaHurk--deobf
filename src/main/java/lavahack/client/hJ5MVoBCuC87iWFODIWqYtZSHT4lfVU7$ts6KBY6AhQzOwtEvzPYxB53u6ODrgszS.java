/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/features/module/render/Trails$TracePos;", "test"})
final class hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
implements Predicate {
    public static final hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field13967 = new hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS();
    private String Field13968 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean test(Object object) {
        return this.Method5305((hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object);
    }

    public final boolean Method5305(@NotNull @NotNull hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        Intrinsics.checkParameterIsNotNull((Object)hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, (String)"it");
        return hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method3221();
    }

    hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS() {
    }

    private static String Method5306(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-918733908L ^ 0xC93D3BAC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1936693699 ^ (long)-1936693566);
            int n2 = (int)1778572669L ^ 0x6A02DD0E;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-775954815 ^ (long)-775960156) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

