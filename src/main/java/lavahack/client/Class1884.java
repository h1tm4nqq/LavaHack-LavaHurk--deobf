//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003?\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\r" }, d2 = { "Lcom/kisman/cc/features/nocom/modules/tracker/TrackedChunk;", "", "x", "", "y", "(II)V", "pos", "Lnet/minecraft/util/math/ChunkPos;", "getBlockPos", "Lnet/minecraft/util/math/BlockPos;", "getChunkPos", "set", "", "kisman.cc" })
public final class Class1884
{
    private ChunkPos Field16684;
    private int Field16685;
    
    public final void Method6988(final int n, final int n2) {
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
        final BlockPos getBlock = this.Field16684.getBlock(0, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlock, "pos.getBlock(0, 0, 0)");
        return getBlock;
    }
    
    public Class1884(final int n, final int n2) {
        this.Field16684 = new ChunkPos(n, n2);
    }
    
    private static String Method6991(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x67B2 ^ 0xCA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
