/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/futureshader/shaders/model/ModelColorShader;", "Lcom/kisman/cc/features/module/Debug/futureshader/FramebufferShader;", "()V", "kisman.cc"})
public final class TyYVr3CSsmil6nhifsM1MIBAg1OH8o9Y
extends RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU {
    public static final TyYVr3CSsmil6nhifsM1MIBAg1OH8o9Y Field15515;
    private int Field15516;

    private TyYVr3CSsmil6nhifsM1MIBAg1OH8o9Y() {
        super("color", "model");
    }

    static {
        TyYVr3CSsmil6nhifsM1MIBAg1OH8o9Y tyYVr3CSsmil6nhifsM1MIBAg1OH8o9Y;
        Field15515 = tyYVr3CSsmil6nhifsM1MIBAg1OH8o9Y = new TyYVr3CSsmil6nhifsM1MIBAg1OH8o9Y();
    }

    private static String Method1713(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-144981973L ^ 0xF75BC02B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)754753022 ^ (long)754752769);
            int n2 = ((int)550687522L ^ 0x20D2D31B) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)704445296 ^ (long)704445161) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

