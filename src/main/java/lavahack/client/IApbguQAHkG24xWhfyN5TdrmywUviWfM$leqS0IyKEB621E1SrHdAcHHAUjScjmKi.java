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
final class IApbguQAHkG24xWhfyN5TdrmywUviWfM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Supplier {
    final IApbguQAHkG24xWhfyN5TdrmywUviWfM Field12006;
    private String Field12007 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method3880();
    }

    public final boolean Method3880() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12006.Method5757();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mode");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341().equals((Object)g8jTvcUlgGLqqDPccwxFmeywlQlS99ad.Field8171)) {
            Object t = this.Field12006.Method5765().get();
            Intrinsics.checkExpressionValueIsNotNull(t, (String)"visible.get()");
            if (((Boolean)t).booleanValue()) {
                n = (int)((long)-2116862274 ^ (long)-2116862273);
                return n != 0;
            }
        }
        n = (int)((long)1200593408 ^ (long)1200593408);
        return n != 0;
    }

    IApbguQAHkG24xWhfyN5TdrmywUviWfM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(IApbguQAHkG24xWhfyN5TdrmywUviWfM iApbguQAHkG24xWhfyN5TdrmywUviWfM) {
        this.Field12006 = iApbguQAHkG24xWhfyN5TdrmywUviWfM;
    }

    private static String Method3881(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-126757410L ^ 0xF871D5DE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1719939281 ^ (long)1719939118);
            int n2 = ((int)691102682L ^ 0x2931639F) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1178473604 ^ (long)1178499409) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

