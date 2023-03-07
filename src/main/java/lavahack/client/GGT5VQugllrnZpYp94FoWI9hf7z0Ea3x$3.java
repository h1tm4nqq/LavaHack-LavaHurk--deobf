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
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$3
implements Supplier {
    final GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x Field15633;
    private String Field15634 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method6374();
    }

    @NotNull
    @NotNull
    public final String Method6374() {
        StringBuilder stringBuilder = new StringBuilder().append((char)((int)-1436135071L ^ 0xAA66513A));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7120(this.Field15633);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"entityStepVal");
        return stringBuilder.append(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()).append((char)((int)-317377091L ^ 0xED1535E0)).toString();
    }

    GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$3(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        this.Field15633 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
    }

    private static String Method6375(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)867394384L ^ 0x33B36350;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1254237400 ^ (long)1254237223);
            int n2 = ((int)-164904224L ^ 0xF62BC29B) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1645907442L ^ 0x9DE56D23) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

