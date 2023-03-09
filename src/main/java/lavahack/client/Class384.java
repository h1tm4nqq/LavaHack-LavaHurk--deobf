/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/math/vectors/xyz/ColorablePos;", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "colour", "Lcom/kisman/cc/util/Colour;", "(Lnet/minecraft/util/math/BlockPos;Lcom/kisman/cc/util/Colour;)V", "getColour", "()Lcom/kisman/cc/util/Colour;", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "kisman.cc"})
public final class Class384 {
    @NotNull
    private final BlockPos Field9611;
    @NotNull
    private final Class2027 Field9612;
    private String Field9613 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final BlockPos Method1858() {
        return this.Field9611;
    }

    @NotNull
    @NotNull
    public final Class2027 Method1859() {
        return this.Field9612;
    }

    public Class384(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"colour");
        this.Field9611 = blockPos;
        this.Field9612 = class2027;
    }

    private static String Method1860(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 227;
            cArray2[n] = (char)(cArray[n] ^ (0x549D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

