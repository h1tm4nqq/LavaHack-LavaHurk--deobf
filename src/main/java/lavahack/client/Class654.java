//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "mine", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "invoke" })
final class Class654 extends Lambda implements Function1
{
    final Class1281 Field10800;
    private String Field10801 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Object invoke(final Object o) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)o);
    }
    
    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final Class1724 class1725;
        final Class1724 class1724 = class1725 = new Class1724(this);
        final BlockPos north = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)north, "pos.north()");
        if (class1725.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(north)) {
            final Class1281 field10800 = this.Field10800;
            final BlockPos north2 = blockPos.north();
            Intrinsics.checkExpressionValueIsNotNull((Object)north2, "pos.north()");
            Class1281.Method5183(field10800, north2, true);
            return true;
        }
        final Class1724 class1726 = class1724;
        final BlockPos east = blockPos.east();
        Intrinsics.checkExpressionValueIsNotNull((Object)east, "pos.east()");
        if (class1726.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(east)) {
            final Class1281 field10801 = this.Field10800;
            final BlockPos east2 = blockPos.east();
            Intrinsics.checkExpressionValueIsNotNull((Object)east2, "pos.east()");
            Class1281.Method5183(field10801, east2, true);
            return true;
        }
        final Class1724 class1727 = class1724;
        final BlockPos west = blockPos.west();
        Intrinsics.checkExpressionValueIsNotNull((Object)west, "pos.west()");
        if (class1727.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(west)) {
            final Class1281 field10802 = this.Field10800;
            final BlockPos west2 = blockPos.west();
            Intrinsics.checkExpressionValueIsNotNull((Object)west2, "pos.west()");
            Class1281.Method5183(field10802, west2, true);
            return true;
        }
        final Class1724 class1728 = class1724;
        final BlockPos south = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)south, "pos.south()");
        if (class1728.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(south)) {
            final Class1281 field10803 = this.Field10800;
            final BlockPos south2 = blockPos.south();
            Intrinsics.checkExpressionValueIsNotNull((Object)south2, "pos.south()");
            Class1281.Method5183(field10803, south2, true);
            return true;
        }
        return false;
    }
    
    Class654(final Class1281 field10800) {
        this.Field10800 = field10800;
        super(1);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x329 ^ 0xC8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
