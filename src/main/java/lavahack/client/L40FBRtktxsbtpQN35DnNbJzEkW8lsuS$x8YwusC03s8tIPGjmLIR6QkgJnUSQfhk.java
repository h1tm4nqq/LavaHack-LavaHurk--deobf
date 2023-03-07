/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.ToDoubleFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "applyAsDouble", "(Ljava/lang/Double;)Ljava/lang/Double;"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk
implements ToDoubleFunction {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk Field16754 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk();
    private String Field16755 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public double applyAsDouble(Object object) {
        return this.Method7047((Double)object);
    }

    public final Double Method7047(Double d) {
        Double d2 = d;
        Intrinsics.checkExpressionValueIsNotNull((Object)d2, (String)"it");
        return d2;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk() {
    }

    private static String Method7048(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-485303526 ^ (long)-485303526);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)246170924 ^ (long)246171091);
            int n2 = ((int)1100526410L ^ 0x4198B351) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-227191929L ^ 0xF27519AE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

