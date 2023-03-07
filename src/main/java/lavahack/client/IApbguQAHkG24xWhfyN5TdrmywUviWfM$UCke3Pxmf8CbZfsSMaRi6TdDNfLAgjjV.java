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
import lavahack.client.IApbguQAHkG24xWhfyN5TdrmywUviWfM;
import lavahack.client.g8jTvcUlgGLqqDPccwxFmeywlQlS99ad;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class IApbguQAHkG24xWhfyN5TdrmywUviWfM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements Supplier {
    final IApbguQAHkG24xWhfyN5TdrmywUviWfM Field15919;
    private int Field15920;

    public Object get() {
        return this.Method6580();
    }

    public final boolean Method6580() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field15919.Method5757();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mode");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341().equals((Object)g8jTvcUlgGLqqDPccwxFmeywlQlS99ad.Field8170)) {
            Object t = this.Field15919.Method5765().get();
            Intrinsics.checkExpressionValueIsNotNull(t, (String)"visible.get()");
            if (((Boolean)t).booleanValue()) {
                n = (int)((long)-1195892428 ^ (long)-1195892427);
                return n != 0;
            }
        }
        n = (int)((long)-942796037 ^ (long)-942796037);
        return n != 0;
    }

    IApbguQAHkG24xWhfyN5TdrmywUviWfM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(IApbguQAHkG24xWhfyN5TdrmywUviWfM iApbguQAHkG24xWhfyN5TdrmywUviWfM) {
        this.Field15919 = iApbguQAHkG24xWhfyN5TdrmywUviWfM;
    }

    private static String Method6581(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1422107275L ^ 0x54C3A28B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1640335728L ^ 0x9E3A766F);
            int n2 = ((int)-1018180163L ^ 0xC34FCD82) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1093748751 ^ (long)-1093749242) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

