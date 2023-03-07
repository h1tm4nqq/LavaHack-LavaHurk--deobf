/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.kisman.cc.util;

import com.kisman.cc.util.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.LjmXEwby3D747HQ8yMDBamZ4Wtw8da73;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2={"com/kisman/cc/util/AccountDataCheckerKt$check$messageProcessor$1", "Lcom/kisman/cc/websockets/IMessageProcessor;", "processMessage", "", "message", "", "kisman.cc"})
public final class leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements LjmXEwby3D747HQ8yMDBamZ4Wtw8da73 {
    private String Field8248 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method665(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        int n = (int)166939301L ^ 0x9F34AA5;
        System.out.println((Object)string);
        if (Intrinsics.areEqual((Object)string, (Object)"2")) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1149().clear();
            return;
        }
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("Error Code: 0x0002");
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6791();
    }

    leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method666(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-617323807 ^ (long)-617323807);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-156505548 ^ (long)-156505397);
            int n2 = (int)1970104351L ^ 0x756D680C;
            cArray2[n] = (char)(cArray[n] ^ ((int)731147428L ^ 0x2B946303 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

