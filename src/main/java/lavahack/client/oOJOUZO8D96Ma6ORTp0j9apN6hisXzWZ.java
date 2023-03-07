/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh;
import lavahack.client.rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/settings/util/shaders/ShaderCharmsRewriteFramebufferShader;", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "fragmentShader", "", "(Lcom/kisman/cc/settings/util/ShadersRendererPattern;Ljava/lang/String;)V", "setupUniforms", "", "updateUniforms", "kisman.cc"})
public abstract class oOJOUZO8D96Ma6ORTp0j9apN6hisXzWZ
extends rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P {
    private final GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh Field15667;
    private String Field15668 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method917() {
    }

    @Override
    public void Method918() {
    }

    public oOJOUZO8D96Ma6ORTp0j9apN6hisXzWZ(@NotNull @NotNull GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh, (String)"pattern");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"fragmentShader");
        super(string);
        this.Field15667 = gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh;
    }

    private static String Method922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)545588347L ^ 0x2085047B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)364930789L ^ 0x15C0661A);
            int n2 = (int)((long)903535980 ^ (long)903535879);
            cArray2[n] = (char)(cArray[n] ^ (((int)327884621L ^ 0x138B2386) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

