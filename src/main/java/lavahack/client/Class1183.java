/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class2058;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/futureshader/shaders/filled/FilledColorShader;", "Lcom/kisman/cc/features/module/Debug/futureshader/FramebufferShader;", "()V", "kisman.cc"})
public final class Class1183
extends Class2058 {
    public static final Class1183 Field13367;
    private String Field13368 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class1183() {
        super("color", "filled");
    }

    static {
        Class1183 class1183;
        Field13367 = class1183 = new Class1183();
    }

    private static String Method1713(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 206;
            cArray2[n] = (char)(cArray[n] ^ (0x5D7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

