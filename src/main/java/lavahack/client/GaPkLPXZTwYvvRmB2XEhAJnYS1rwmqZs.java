/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.texture.DynamicTexture
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/render/image/NameableImage;", "", "name", "", "texture", "Lnet/minecraft/client/renderer/texture/DynamicTexture;", "(Ljava/lang/String;Lnet/minecraft/client/renderer/texture/DynamicTexture;)V", "getName", "()Ljava/lang/String;", "getTexture", "()Lnet/minecraft/client/renderer/texture/DynamicTexture;", "kisman.cc"})
public final class GaPkLPXZTwYvvRmB2XEhAJnYS1rwmqZs {
    @NotNull
    private final String Field17587;
    @NotNull
    private final DynamicTexture Field17588;
    private String Field17589 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final String Method7645() {
        return this.Field17587;
    }

    @NotNull
    @NotNull
    public final DynamicTexture Method7646() {
        return this.Field17588;
    }

    public GaPkLPXZTwYvvRmB2XEhAJnYS1rwmqZs(@NotNull @NotNull String string, @NotNull @NotNull DynamicTexture dynamicTexture) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)dynamicTexture, (String)"texture");
        this.Field17587 = string;
        this.Field17588 = dynamicTexture;
    }

    private static String Method7647(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-651786083L ^ 0xD926889D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2043717248L ^ 0x862F597F);
            int n2 = (int)843965630L ^ 0x324DE43F;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)184445049 ^ (long)184422572) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

