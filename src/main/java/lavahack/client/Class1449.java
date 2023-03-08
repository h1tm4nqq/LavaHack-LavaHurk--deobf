//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "place", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "invoke" })
final class Class1449 extends Lambda implements Function1
{
    final Class1281 Field14776;
    private String Field14777 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Object invoke(final Object o) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)o);
    }
    
    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final Class1281 field14776 = this.Field14776;
        final BlockPos north = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)north, "pos.north()");
        if (Class1281.Method5179(field14776, north)) {
            final Class1281 field14777 = this.Field14776;
            final BlockPos north2 = blockPos.north();
            Intrinsics.checkExpressionValueIsNotNull((Object)north2, "pos.north()");
            Class1281.Method5184(field14777, north2);
            return true;
        }
        final Class1281 field14778 = this.Field14776;
        final BlockPos east = blockPos.east();
        Intrinsics.checkExpressionValueIsNotNull((Object)east, "pos.east()");
        if (Class1281.Method5179(field14778, east)) {
            final Class1281 field14779 = this.Field14776;
            final BlockPos east2 = blockPos.east();
            Intrinsics.checkExpressionValueIsNotNull((Object)east2, "pos.east()");
            Class1281.Method5184(field14779, east2);
            return true;
        }
        final Class1281 field14780 = this.Field14776;
        final BlockPos west = blockPos.west();
        Intrinsics.checkExpressionValueIsNotNull((Object)west, "pos.west()");
        if (Class1281.Method5179(field14780, west)) {
            final Class1281 field14781 = this.Field14776;
            final BlockPos west2 = blockPos.west();
            Intrinsics.checkExpressionValueIsNotNull((Object)west2, "pos.west()");
            Class1281.Method5184(field14781, west2);
            return true;
        }
        final Class1281 field14782 = this.Field14776;
        final BlockPos south = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)south, "pos.south()");
        if (Class1281.Method5179(field14782, south)) {
            final Class1281 field14783 = this.Field14776;
            final BlockPos south2 = blockPos.south();
            Intrinsics.checkExpressionValueIsNotNull((Object)south2, "pos.south()");
            Class1281.Method5184(field14783, south2);
            return true;
        }
        return false;
    }
    
    Class1449(final Class1281 field14776) {
        this.Field14776 = field14776;
        super(1);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x484D ^ 0x6D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
