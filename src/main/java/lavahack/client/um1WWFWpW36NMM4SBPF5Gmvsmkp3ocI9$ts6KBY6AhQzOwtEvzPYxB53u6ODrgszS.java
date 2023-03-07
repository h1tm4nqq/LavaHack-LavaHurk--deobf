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
final class um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
implements Supplier {
    final um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9 Field15710;
    private String Field15711 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method6409();
    }

    public final boolean Method6409() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9.Method4809(this.Field15710);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"crystalInfo");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9 um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI92) {
        this.Field15710 = um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI92;
    }

    private static String Method6410(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1761887837L ^ 0x6904465D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1146931174L ^ 0x445CC719);
            int n2 = ((int)-2080610622L ^ 0x83FC66F3) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1292985600L ^ 0x4D1175A3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

