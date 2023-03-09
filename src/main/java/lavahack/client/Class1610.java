/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class2058;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/futureshader/shaders/model/ModelColorShader;", "Lcom/kisman/cc/features/module/Debug/futureshader/FramebufferShader;", "()V", "kisman.cc"})
public final class Class1610
extends Class2058 {
    public static final Class1610 Field15515;
    private int Field15516;

    private Class1610() {
        super("color", "model");
    }

    static {
        Class1610 class1610;
        Field15515 = class1610 = new Class1610();
    }

    private static String Method1713(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 228;
            cArray2[n] = (char)(cArray[n] ^ (0x3320 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

