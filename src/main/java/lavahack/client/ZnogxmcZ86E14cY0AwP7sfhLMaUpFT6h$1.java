/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.Function;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h$1
implements Supplier {
    final ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h Field11651;
    private String Field11652 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method3659();
    }

    @NotNull
    @NotNull
    public final String Method3659() {
        StringBuilder stringBuilder = new StringBuilder().append((char)((long)-1982950532 ^ (long)-1982950617));
        Function function = ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943.Method2190();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h.Method4308(this.Field11651);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"delay");
        return stringBuilder.append((String)function.apply(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335())).toString();
    }

    ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h$1(ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h znogxmcZ86E14cY0AwP7sfhLMaUpFT6h) {
        this.Field11651 = znogxmcZ86E14cY0AwP7sfhLMaUpFT6h;
    }

    private static String Method3660(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)969881251 ^ (long)969881251);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)877336295L ^ 0x344B1618);
            int n2 = ((int)255674100L ^ 0xF3D46E3) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1200708350L ^ 0x47915AF3) << 8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

