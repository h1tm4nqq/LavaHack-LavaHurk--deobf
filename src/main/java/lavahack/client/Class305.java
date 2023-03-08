//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "kotlin.jvm.PlatformType", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call" })
final class Class305 implements Class1471
{
    public static final Class305 Field9309;
    private int Field9310;
    
    public Object Method1564(final Class424 class424) {
        return this.Method1578(class424);
    }
    
    public final float[] Method1578(@NotNull @NotNull final Class424 class424) {
        Intrinsics.checkParameterIsNotNull((Object)class424, "arg");
        final BlockPos blockPos = (BlockPos)class424.Method2054(0);
        final EntityPlayerSP player = Class1325.Method5367().player;
        final Minecraft method5367 = Class1325.Method5367();
        Intrinsics.checkExpressionValueIsNotNull((Object)method5367, "mc");
        final Vec3d getPositionEyes = player.getPositionEyes(method5367.getRenderPartialTicks());
        final BlockPos blockPos2 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, "block");
        return Class1568.Method6170(getPositionEyes, new Vec3d(blockPos2.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY(), blockPos.getZ() + Double.longBitsToDouble((long)1734745549 ^ 0x3FE0000067661DCDL)));
    }
    
    static {
        Field9309 = new Class305();
    }
    
    private static String Method1579(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x27C ^ 0x7A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
