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

import com.kisman.cc.loader.Class1204;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import lavahack.loader.Class328;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "invoke"})
final class Class1451
extends Lambda
implements Function0 {
    public static final Class1451 Field14799 = new Class1451();
    private int Field14800;

    public Object invoke() {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        return Unit.INSTANCE;
    }

    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        Class328.Method1647();
        Class1204.Method4865();
        Class1204.Method4859("2.0");
        while (true) {
            if (Class1204.Method4849()) break;
            Thread.sleep(5000L);
        }
        Class1204.Method4860("2.0");
        while (true) {
            if (Class1204.Method4851()) {
                Class1204.Method4856();
                return;
            }
            Thread.sleep(5000L);
        }
    }

    Class1451() {
        super(0);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 68;
            cArray2[n] = (char)(cArray[n] ^ (0x3986 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

