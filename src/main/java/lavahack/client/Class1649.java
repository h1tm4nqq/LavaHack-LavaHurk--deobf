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
import lavahack.client.Class134;
import lavahack.client.Class1482;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/settings/util/shaders/ShaderCharmsRewriteFramebufferShader;", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "fragmentShader", "", "(Lcom/kisman/cc/settings/util/ShadersRendererPattern;Ljava/lang/String;)V", "setupUniforms", "", "updateUniforms", "kisman.cc"})
public abstract class Class1649
extends Class134 {
    private final Class1482 Field15667;
    private String Field15668 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method917() {
    }

    @Override
    public void Method918() {
    }

    public Class1649(@NotNull @NotNull Class1482 class1482, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)class1482, (String)"pattern");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"fragmentShader");
        super(string);
        this.Field15667 = class1482;
    }

    private static String Method922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 107;
            cArray2[n] = (char)(cArray[n] ^ (0x7996 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

