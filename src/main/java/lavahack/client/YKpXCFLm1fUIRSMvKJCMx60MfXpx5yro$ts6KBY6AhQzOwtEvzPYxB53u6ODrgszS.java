/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.Vec2f
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import net.minecraft.util.math.Vec2f;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/render/shader/ShaderUtil$UniformVec2f;", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;", "name", "", "value", "Lnet/minecraft/util/math/Vec2f;", "(Ljava/lang/String;Lnet/minecraft/util/math/Vec2f;)V", "getName", "()Ljava/lang/String;", "getValue", "()Lnet/minecraft/util/math/Vec2f;", "kisman.cc"})
public final class YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
extends YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    @NotNull
    private final String Field16486;
    @NotNull
    private final Vec2f Field16487;
    private String Field16488 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final String Method6931() {
        return this.Field16486;
    }

    @NotNull
    @NotNull
    public final Vec2f Method6932() {
        return this.Field16487;
    }

    public YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(@NotNull @NotNull String string, @NotNull @NotNull Vec2f vec2f) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)vec2f, (String)"value");
        this.Field16486 = string;
        this.Field16487 = vec2f;
    }

    private static String Method6933(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)305120508 ^ (long)305120508);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)924778163L ^ 0x371EFE4C);
            int n2 = (int)1090391978L ^ 0x40FE0F9B;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1820230138L ^ 0x93815627) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

