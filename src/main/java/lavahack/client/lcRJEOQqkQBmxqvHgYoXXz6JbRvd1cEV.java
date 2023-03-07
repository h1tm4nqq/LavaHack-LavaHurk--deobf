/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/futureshader/shaders/filled/FilledImageShader;", "Lcom/kisman/cc/features/module/Debug/futureshader/FramebufferShader;", "()V", "kisman.cc"})
public final class lcRJEOQqkQBmxqvHgYoXXz6JbRvd1cEV
extends RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU {
    public static final lcRJEOQqkQBmxqvHgYoXXz6JbRvd1cEV Field17952;
    private int Field17953;

    private lcRJEOQqkQBmxqvHgYoXXz6JbRvd1cEV() {
        super("image", "filled");
    }

    static {
        lcRJEOQqkQBmxqvHgYoXXz6JbRvd1cEV lcRJEOQqkQBmxqvHgYoXXz6JbRvd1cEV2;
        Field17952 = lcRJEOQqkQBmxqvHgYoXXz6JbRvd1cEV2 = new lcRJEOQqkQBmxqvHgYoXXz6JbRvd1cEV();
    }

    private static String Method1713(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1879619476 ^ (long)1879619476);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1227022309 ^ (long)1227022106);
            int n2 = (int)((long)1292102053 ^ (long)1292102050) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)892347587 ^ (long)892345868) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

