//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.ChunkPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/features/nocom/modules/tracker/TrackedChunk;", "", "x", "", "y", "(II)V", "pos", "Lnet/minecraft/util/math/ChunkPos;", "getBlockPos", "Lnet/minecraft/util/math/BlockPos;", "getChunkPos", "set", "", "kisman.cc"})
public final class v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7 {
    private ChunkPos Field16684;
    private int Field16685;

    public final void Method6988(int n, int n2) {
        this.Field16684 = new ChunkPos(n, n2);
    }

    @NotNull
    @NotNull
    public final ChunkPos Method6989() {
        return this.Field16684;
    }

    @NotNull
    @NotNull
    public final BlockPos Method6990() {
        BlockPos blockPos = this.Field16684.getBlock((int)((long)-711024624 ^ (long)-711024624), (int)169422105L ^ 0xA192D19, (int)1942302509L ^ 0x73C52F2D);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"pos.getBlock(0, 0, 0)");
        return blockPos;
    }

    public v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7(int n, int n2) {
        this.Field16684 = new ChunkPos(n, n2);
    }

    private static String Method6991(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1861576505 ^ (long)-1861576505);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-399042139 ^ (long)-399042214);
            int n2 = ((int)387933370L ^ 0x171F64DF) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)420649807 ^ (long)420653206) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

