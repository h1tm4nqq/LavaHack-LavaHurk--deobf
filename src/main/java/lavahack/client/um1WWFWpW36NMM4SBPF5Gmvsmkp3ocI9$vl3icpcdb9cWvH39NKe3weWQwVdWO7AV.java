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
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
implements Supplier {
    final um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9 Field11412;
    private String Field11413 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method3388();
    }

    public final boolean Method3388() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9.Method4809(this.Field11412);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"crystalInfo");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9 um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI92) {
        this.Field11412 = um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI92;
    }

    private static String Method3389(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-315750164 ^ (long)-315750164);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-785917877 ^ (long)-785917772);
            int n2 = (int)((long)2132973204 ^ (long)2132973311);
            cArray2[n] = (char)(cArray[n] ^ ((int)-736649392L ^ 0xD417B7E5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

