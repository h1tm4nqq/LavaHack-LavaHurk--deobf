//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/util/render/objects/world/Box$Companion;", "", "()V", "byAABB", "Lcom/kisman/cc/util/render/objects/world/Box;", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "getMaxBySize", "Lnet/minecraft/util/math/Vec3d;", "pos", "size", "kisman.cc" })
public final class Class1759
{
    private String Field16055 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Vec3d Method6695(@NotNull @NotNull final Vec3d vec3d, @NotNull @NotNull final Vec3d vec3d2) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, "pos");
        Intrinsics.checkParameterIsNotNull((Object)vec3d2, "size");
        return new Vec3d(vec3d.x + vec3d2.x, vec3d.y + vec3d2.y, vec3d.z + vec3d2.z);
    }
    
    @NotNull
    @NotNull
    public final Class1934 Method6696(@NotNull @NotNull final AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        return new Class1934(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), new Vec3d(axisAlignedBB.maxX - axisAlignedBB.minX, axisAlignedBB.maxY - axisAlignedBB.minY, axisAlignedBB.maxZ - axisAlignedBB.minZ));
    }
    
    private Class1759() {
    }
    
    public Class1759(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method6697(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2C63 ^ 0xA2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
