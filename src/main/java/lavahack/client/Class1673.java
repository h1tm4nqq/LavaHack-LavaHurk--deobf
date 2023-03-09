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
import lavahack.client.Class2163;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/enums/ShadersShaders$Shader;", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "instance", "Lcom/kisman/cc/util/enums/ShadersShaders;", "(Lcom/kisman/cc/util/enums/ShadersShaders;)V", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "setupUniforms", "", "updateUniforms", "kisman.cc"})
public final class Class1673
extends Class134 {
    private Class1482 Field15804;
    private final Class2163 Field15805;
    private String Field15806 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1673 Method6462(@NotNull @NotNull Class1482 class1482) {
        Intrinsics.checkParameterIsNotNull((Object)class1482, (String)"pattern");
        this.Field15804 = class1482;
        return this;
    }

    @Override
    public void Method917() {
        Class1482 class1482 = this.Field15804;
        if (class1482 == null) {
            Intrinsics.throwNpe();
        }
        this.Field15805.Method1480(class1482, this);
    }

    @Override
    public void Method918() {
        Class1482 class1482 = this.Field15804;
        if (class1482 == null) {
            Intrinsics.throwNpe();
        }
        this.Field15805.Method1479(class1482, this);
    }

    public Class1673(@NotNull @NotNull Class2163 class2163) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class2163), (String)"instance");
        super(class2163.Method1482());
        this.Field15805 = class2163;
    }

    private static String Method922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 109;
            cArray2[n] = (char)(cArray[n] ^ (0x654 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

