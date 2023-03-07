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
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB
implements ToDoubleFunction {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB Field10911 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB();
    private String Field10912 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public double applyAsDouble(Object object) {
        return this.Method2901((Double)object);
    }

    public final Double Method2901(Double d) {
        Double d2 = d;
        Intrinsics.checkExpressionValueIsNotNull((Object)d2, (String)"it");
        return d2;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB() {
    }

    private static String Method2902(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1601312471L ^ 0x5F7216D7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1473100537 ^ (long)1473100294);
            int n2 = ((int)-1828709299L ^ 0x93001C6C) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1651208695L ^ 0x9D948126) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

