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
final class IApbguQAHkG24xWhfyN5TdrmywUviWfM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
implements Supplier {
    final IApbguQAHkG24xWhfyN5TdrmywUviWfM Field11120;
    private int Field11121;

    public Object get() {
        return this.Method3064();
    }

    public final boolean Method3064() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field11120.Method5757();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mode");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341().equals((Object)g8jTvcUlgGLqqDPccwxFmeywlQlS99ad.Field8171)) {
            Object t = this.Field11120.Method5765().get();
            Intrinsics.checkExpressionValueIsNotNull(t, (String)"visible.get()");
            if (((Boolean)t).booleanValue()) {
                n = (int)((long)-430477940 ^ (long)-430477939);
                return n != 0;
            }
        }
        n = (int)-1102662276L ^ 0xBE46B57C;
        return n != 0;
    }

    IApbguQAHkG24xWhfyN5TdrmywUviWfM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(IApbguQAHkG24xWhfyN5TdrmywUviWfM iApbguQAHkG24xWhfyN5TdrmywUviWfM) {
        this.Field11120 = iApbguQAHkG24xWhfyN5TdrmywUviWfM;
    }

    private static String Method3065(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)237971137L ^ 0xE2F26C1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1689772853L ^ 0x9B481C34);
            int n2 = (int)((long)1790592500 ^ (long)1790592455);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1397676932 ^ (long)1397677485) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

