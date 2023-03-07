/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/futureshader/shaders/filled/FilledCutOutShader;", "Lcom/kisman/cc/features/module/Debug/futureshader/FramebufferShader;", "()V", "kisman.cc"})
public final class gwLtzgbydQ86oH1HUuUA5OEHE31xO1EC
extends RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU {
    public static final gwLtzgbydQ86oH1HUuUA5OEHE31xO1EC Field9434;
    private int Field9435;

    private gwLtzgbydQ86oH1HUuUA5OEHE31xO1EC() {
        super("cutout", "filled");
    }

    static {
        gwLtzgbydQ86oH1HUuUA5OEHE31xO1EC gwLtzgbydQ86oH1HUuUA5OEHE31xO1EC2;
        Field9434 = gwLtzgbydQ86oH1HUuUA5OEHE31xO1EC2 = new gwLtzgbydQ86oH1HUuUA5OEHE31xO1EC();
    }

    private static String Method1713(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1745647472 ^ (long)1745647472);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)470970644L ^ 0x1C1271EB);
            int n2 = (int)-1409741310L ^ 0xABF90E23;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1169359723L ^ 0xBA4CF8AE) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

