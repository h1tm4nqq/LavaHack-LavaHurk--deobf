/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lcom/kisman/cc/features/module/Debug/futureshader/shaders/filled/FilledColorShader;", "Lcom/kisman/cc/features/module/Debug/futureshader/FramebufferShader;", "()V", "kisman.cc"})
public final class Xgro5CYDjrkU7RODB7IUWd7ixliAWFpF
extends RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU {
    public static final Xgro5CYDjrkU7RODB7IUWd7ixliAWFpF Field13367;
    private String Field13368 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Xgro5CYDjrkU7RODB7IUWd7ixliAWFpF() {
        super("color", "filled");
    }

    static {
        Xgro5CYDjrkU7RODB7IUWd7ixliAWFpF xgro5CYDjrkU7RODB7IUWd7ixliAWFpF;
        Field13367 = xgro5CYDjrkU7RODB7IUWd7ixliAWFpF = new Xgro5CYDjrkU7RODB7IUWd7ixliAWFpF();
    }

    private static String Method1713(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-151292234 ^ (long)-151292234);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1539295355 ^ (long)-1539295366);
            int n2 = (int)((long)-269359615 ^ (long)-269359514) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1107676063 ^ (long)1107676744) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

