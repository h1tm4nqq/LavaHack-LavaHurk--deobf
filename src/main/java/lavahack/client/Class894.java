//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/util/math/BlockPos;", "kotlin.jvm.PlatformType", "test" })
final class Class894 implements Predicate
{
    final Class1281 Field11744;
    final boolean Field11745;
    final double Field11746;
    final EntityPlayer Field11747;
    private int Field11748;
    
    @Override
    public boolean test(final Object o) {
        return this.Method3722((BlockPos)o);
    }
    
    public final boolean Method3722(final BlockPos blockPos) {
        final Class1281 field11744 = this.Field11744;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, "it");
        if (Class1281.Method5175(field11744, blockPos) && (Intrinsics.areEqual((Object)Class1281.Method5176(this.Field11744), (Object)blockPos) ^ true)) {
            if (this.Field11745) {
                if (Class1281.Method5173().player.getDistanceSq(blockPos) < Math.pow(this.Field11746, Double.longBitsToDouble((long)323102631 ^ 0x40000000134227A7L))) {}
            }
            else if (this.Field11747.getDistanceSq(blockPos) > 4 && this.Field11747.getDistanceSq(blockPos) < 25) {}
        }
        return false;
    }
    
    Class894(final Class1281 field11744, final boolean field11745, final double field11746, final EntityPlayer field11747) {
        this.Field11744 = field11744;
        this.Field11745 = field11745;
        this.Field11746 = field11746;
        this.Field11747 = field11747;
    }
    
    private static String Method3723(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x468B ^ 0x0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
