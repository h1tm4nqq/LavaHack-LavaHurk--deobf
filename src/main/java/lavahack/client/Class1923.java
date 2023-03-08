//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n?\u0006\u0002\b\u0005" }, d2 = { "findBlock", "Lnet/minecraft/util/math/BlockPos;", "centre", "obby", "", "invoke" })
final class Class1923 extends Lambda implements Function2
{
    final Class1281 Field16933;
    private String Field16934 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Object invoke(final Object o, final Object o2) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)o, (boolean)o2);
    }
    
    @Nullable
    @Nullable
    public final BlockPos leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final BlockPos blockPos, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "centre");
        final Class420 class421;
        final Class420 class420 = class421 = new Class420(this);
        final BlockPos north = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)north, "centre.north()");
        if (class421.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(north, b)) {
            return blockPos.north();
        }
        final Class420 class422 = class420;
        final BlockPos west = blockPos.west();
        Intrinsics.checkExpressionValueIsNotNull((Object)west, "centre.west()");
        if (class422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(west, b)) {
            return blockPos.west();
        }
        final Class420 class423 = class420;
        final BlockPos east = blockPos.east();
        Intrinsics.checkExpressionValueIsNotNull((Object)east, "centre.east()");
        if (class423.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(east, b)) {
            return blockPos.east();
        }
        final Class420 class424 = class420;
        final BlockPos south = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)south, "centre.south()");
        if (class424.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(south, b)) {
            return blockPos.south();
        }
        return null;
    }
    
    Class1923(final Class1281 field16933) {
        this.Field16933 = field16933;
        super(2);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x572D ^ 0x52));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
