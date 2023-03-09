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
import lavahack.client.Class1338;
import lavahack.client.Class1419;
import lavahack.client.Class1429;
import lavahack.client.Class2130;
import lavahack.client.Class354;
import lavahack.client.Class42;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/pingbypass/server/gui/PingBypassFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "cat", "Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassCategory;", "x", "", "y", "(Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassCategory;II)V", "kisman.cc"})
public final class Class5
extends Class354 {
    private int Field7832;

    public Class5(@NotNull @NotNull Class2130 class2130, int n, int n2) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class2130), (String)"cat");
        super(class2130.Method7667(), n, n2, true);
        int n3 = Class1419.Field14604;
        int n4 = 0;
        Iterator iterator = ((Iterable)Class1338.Field14116.Method5392(class2130)).iterator();
        while (iterator.hasNext()) {
            Class42 class42 = (Class42)iterator.next();
            this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(new Class1429(class42, n, n2, n3, n4));
            n3 += Class1419.Field14604;
            ++n4;
        }
    }

    private static String Method74(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 69;
            cArray2[n] = (char)(cArray[n] ^ (0x5198 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

