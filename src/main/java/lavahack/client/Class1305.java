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
import lavahack.client.Class773;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/features/module/render/Trails$TracePos;", "test"})
final class Class1305
implements Predicate {
    public static final Class1305 Field13967 = new Class1305();
    private String Field13968 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean test(Object object) {
        return this.Method5305((Class773)object);
    }

    public final boolean Method5305(@NotNull @NotNull Class773 class773) {
        Intrinsics.checkParameterIsNotNull((Object)class773, (String)"it");
        return class773.Method3221();
    }

    Class1305() {
    }

    private static String Method5306(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 115;
            cArray2[n] = (char)(cArray[n] ^ (0x2E4A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

