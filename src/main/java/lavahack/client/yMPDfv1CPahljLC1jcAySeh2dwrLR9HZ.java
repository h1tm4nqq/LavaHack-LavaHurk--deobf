/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/futureshader/shaders/model/ModelRainbowShader;", "Lcom/kisman/cc/features/module/Debug/futureshader/FramebufferShader;", "()V", "kisman.cc"})
public final class yMPDfv1CPahljLC1jcAySeh2dwrLR9HZ
extends RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU {
    public static final yMPDfv1CPahljLC1jcAySeh2dwrLR9HZ Field17047;
    private int Field17048;

    private yMPDfv1CPahljLC1jcAySeh2dwrLR9HZ() {
        super("rainbow", "model");
    }

    static {
        yMPDfv1CPahljLC1jcAySeh2dwrLR9HZ yMPDfv1CPahljLC1jcAySeh2dwrLR9HZ2;
        Field17047 = yMPDfv1CPahljLC1jcAySeh2dwrLR9HZ2 = new yMPDfv1CPahljLC1jcAySeh2dwrLR9HZ();
    }

    private static String Method1713(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)417571177 ^ (long)417571177);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1018393433 ^ (long)-1018393512);
            int n2 = ((int)-568117719L ^ 0xDE23365C) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)18750361L ^ 0x11E2222 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

