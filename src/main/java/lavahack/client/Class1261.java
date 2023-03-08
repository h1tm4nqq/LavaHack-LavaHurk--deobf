//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "o1", "Lnet/minecraft/util/math/BlockPos;", "o2", "compare" })
final class Class1261 implements Comparator
{
    public static final Class1261 Field13708;
    private String Field13709 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.Method5093((BlockPos)o, (BlockPos)o2);
    }
    
    public final int Method5093(@NotNull @NotNull final BlockPos blockPos, @NotNull @NotNull final BlockPos blockPos2) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "o1");
        Intrinsics.checkParameterIsNotNull((Object)blockPos2, "o2");
        return Double.compare(blockPos.distanceSq(Class1497.Method6011().player.posX, Class1497.Method6011().player.posY, Class1497.Method6011().player.posZ), blockPos2.distanceSq(Class1497.Method6011().player.posX, Class1497.Method6011().player.posY, Class1497.Method6011().player.posZ));
    }
    
    static {
        Field13708 = new Class1261();
    }
    
    private static String Method5094(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x28CB ^ 0xA9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
