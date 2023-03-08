//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000?\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b?\u0006\u0002\u0010\nJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u0005R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e?\u0006\u0014" }, d2 = { "Lcom/kisman/cc/util/render/objects/world/Box;", "", "box", "(Lcom/kisman/cc/util/render/objects/world/Box;)V", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "(Lnet/minecraft/util/math/AxisAlignedBB;)V", "pos", "Lnet/minecraft/util/math/Vec3d;", "size", "(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)V", "getPos", "()Lnet/minecraft/util/math/Vec3d;", "setPos", "(Lnet/minecraft/util/math/Vec3d;)V", "getSize", "setSize", "center", "toAABB", "Companion", "kisman.cc" })
public final class Class1934
{
    @NotNull
    private Vec3d Field16966;
    @NotNull
    private Vec3d Field16967;
    public static final Class1759 Field16968;
    private String Field16969 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final AxisAlignedBB Method7190() {
        return new AxisAlignedBB(this.Field16966, Class1934.Field16968.Method6695(this.Field16966, this.Field16967));
    }
    
    @NotNull
    @NotNull
    public final Vec3d Method7191() {
        return new Vec3d(this.Field16966.x + this.Field16967.x / 2, this.Field16966.y + this.Field16967.y / 2, this.Field16966.z + this.Field16967.z / 2);
    }
    
    @NotNull
    @NotNull
    public final Vec3d Method7192() {
        return this.Field16966;
    }
    
    public final void Method7193(@NotNull @NotNull final Vec3d field16966) {
        Intrinsics.checkParameterIsNotNull((Object)field16966, "<set-?>");
        this.Field16966 = field16966;
    }
    
    @NotNull
    @NotNull
    public final Vec3d Method7194() {
        return this.Field16967;
    }
    
    public final void Method7195(@NotNull @NotNull final Vec3d field16967) {
        Intrinsics.checkParameterIsNotNull((Object)field16967, "<set-?>");
        this.Field16967 = field16967;
    }
    
    public Class1934(@NotNull @NotNull final Vec3d field16966, @NotNull @NotNull final Vec3d field16967) {
        Intrinsics.checkParameterIsNotNull((Object)field16966, "pos");
        Intrinsics.checkParameterIsNotNull((Object)field16967, "size");
        this.Field16966 = field16966;
        this.Field16967 = field16967;
    }
    
    public Class1934(@NotNull @NotNull final Class1934 class1934) {
        Intrinsics.checkParameterIsNotNull((Object)class1934, "box");
        this(class1934.Field16966, class1934.Field16967);
    }
    
    public Class1934(@NotNull @NotNull final AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        this(Class1934.Field16968.Method6696(axisAlignedBB));
    }
    
    static {
        Field16968 = new Class1759((DefaultConstructorMarker)null);
    }
    
    private static String Method7196(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x221D ^ 0x5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
