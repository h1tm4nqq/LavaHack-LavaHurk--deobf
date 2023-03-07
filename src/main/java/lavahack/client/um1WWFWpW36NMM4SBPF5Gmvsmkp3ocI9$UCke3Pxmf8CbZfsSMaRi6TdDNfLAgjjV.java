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
final class um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements Supplier {
    final um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9 Field8038;
    private String Field8039 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method280();
    }

    public final boolean Method280() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9.Method4809(this.Field8038);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"crystalInfo");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9 um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI92) {
        this.Field8038 = um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI92;
    }

    private static String Method281(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-863012881 ^ (long)-863012881);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1012198177 ^ (long)-1012198368);
            int n2 = (int)((long)-973737033 ^ (long)-973737050) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)629631149L ^ 0x25876938) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

