/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.SaFAdkXnAH4UyheTd3e2CmA7eDc0whTK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ohP0orxdq2P1v9VESBaGP1easnqKGTCb;
import lavahack.client.uJlc9uxrtKnkTsCaT5ROLyCQup215H6e;
import lavahack.client.wNM4U1NB2Ofc1ABWK5xbjgJ9wZ6Zvqvz;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/pingbypass/server/gui/PingBypassFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "cat", "Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassCategory;", "x", "", "y", "(Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassCategory;II)V", "kisman.cc"})
public final class VsTXmVvyqdA0SKTX6ohtYzgOsY6ncD5e
extends ohP0orxdq2P1v9VESBaGP1easnqKGTCb {
    private int Field7832;

    public VsTXmVvyqdA0SKTX6ohtYzgOsY6ncD5e(@NotNull @NotNull wNM4U1NB2Ofc1ABWK5xbjgJ9wZ6Zvqvz wNM4U1NB2Ofc1ABWK5xbjgJ9wZ6Zvqvz2, int n, int n2) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)wNM4U1NB2Ofc1ABWK5xbjgJ9wZ6Zvqvz2), (String)"cat");
        super(wNM4U1NB2Ofc1ABWK5xbjgJ9wZ6Zvqvz2.Method7667(), n, n2, ((int)1520287258L ^ 0x5A9DBE1B) != 0);
        int n3 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604;
        int n4 = (int)240554647L ^ 0xE569297;
        Iterator iterator = ((Iterable)uJlc9uxrtKnkTsCaT5ROLyCQup215H6e.Field14116.Method5392(wNM4U1NB2Ofc1ABWK5xbjgJ9wZ6Zvqvz2)).iterator();
        while (iterator.hasNext()) {
            WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)iterator.next();
            this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(new SaFAdkXnAH4UyheTd3e2CmA7eDc0whTK(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, n, n2, n3, n4));
            n3 += zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604;
            ++n4;
        }
    }

    private static String Method74(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)81810792L ^ 0x4E05568;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1837633772 ^ (long)-1837633557);
            int n2 = (int)((long)-1063519521 ^ (long)-1063519590);
            cArray2[n] = (char)(cArray[n] ^ (((int)-2094625277L ^ 0x83268430) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

