//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004?\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t?\u0006\n" }, d2 = { "Lcom/kisman/cc/util/math/vectors/bb/ColorableBB;", "Lnet/minecraft/util/math/AxisAlignedBB;", "bb", "color", "Lcom/kisman/cc/util/Colour;", "(Lnet/minecraft/util/math/AxisAlignedBB;Lcom/kisman/cc/util/Colour;)V", "getBb", "()Lnet/minecraft/util/math/AxisAlignedBB;", "getColor", "()Lcom/kisman/cc/util/Colour;", "kisman.cc" })
public final class Class1799 extends AxisAlignedBB
{
    @NotNull
    private final AxisAlignedBB Field16297;
    @NotNull
    private final Class2027 Field16298;
    private String Field16299 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final AxisAlignedBB getBb() {
        return this.Field16297;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColor() {
        return this.Field16298;
    }
    
    public Class1799(@NotNull @NotNull final AxisAlignedBB field16297, @NotNull @NotNull final Class2027 field16298) {
        Intrinsics.checkParameterIsNotNull((Object)field16297, "bb");
        Intrinsics.checkParameterIsNotNull((Object)field16298, "color");
        super(field16297.minX, field16297.minY, field16297.minZ, field16297.maxX, field16297.maxY, field16297.maxZ);
        this.Field16297 = field16297;
        this.Field16298 = field16298;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7412 ^ 0xC6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
