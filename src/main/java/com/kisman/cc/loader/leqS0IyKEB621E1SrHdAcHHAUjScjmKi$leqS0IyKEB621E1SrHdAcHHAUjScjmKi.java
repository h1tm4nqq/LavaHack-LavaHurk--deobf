/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Lambda
 */
package com.kisman.cc.loader;

import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import lavahack.loader.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "invoke"})
final class leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Lambda
implements Function0 {
    public static final leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14799 = new leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private int Field14800;

    public Object invoke() {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        return Unit.INSTANCE;
    }

    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method1647();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4865();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4859("2.0");
        while (true) {
            if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4849()) break;
            Thread.sleep(0x109053A8L & 0x741938DL);
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4860("2.0");
        while (true) {
            if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4851()) {
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4856();
                return;
            }
            Thread.sleep(0x300897CEL & 0x6005389L);
        }
    }

    leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        super((int)((long)-101532569 ^ (long)-101532569));
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)604356356 ^ (long)604356356);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-747817041L ^ 0xD36D3750);
            int n2 = ((int)-151320761L ^ 0xF6FB0756) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2130923354 ^ (long)-2130924443) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

