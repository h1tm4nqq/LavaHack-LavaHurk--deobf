//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1759;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u0005R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/util/render/objects/world/Box;", "", "box", "(Lcom/kisman/cc/util/render/objects/world/Box;)V", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "(Lnet/minecraft/util/math/AxisAlignedBB;)V", "pos", "Lnet/minecraft/util/math/Vec3d;", "size", "(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)V", "getPos", "()Lnet/minecraft/util/math/Vec3d;", "setPos", "(Lnet/minecraft/util/math/Vec3d;)V", "getSize", "setSize", "center", "toAABB", "Companion", "kisman.cc"})
public final class Class1934 {
    @NotNull
    private Vec3d Field16966;
    @NotNull
    private Vec3d Field16967;
    public static final Class1759 Field16968 = new Class1759(null);
    private String Field16969 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final AxisAlignedBB Method7190() {
        return new AxisAlignedBB(this.Field16966, Field16968.Method6695(this.Field16966, this.Field16967));
    }

    @NotNull
    @NotNull
    public final Vec3d Method7191() {
        return new Vec3d(this.Field16966.x + this.Field16967.x / (double)2, this.Field16966.y + this.Field16967.y / (double)2, this.Field16966.z + this.Field16967.z / (double)2);
    }

    @NotNull
    @NotNull
    public final Vec3d Method7192() {
        return this.Field16966;
    }

    public final void Method7193(@NotNull @NotNull Vec3d vec3d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"<set-?>");
        this.Field16966 = vec3d;
    }

    @NotNull
    @NotNull
    public final Vec3d Method7194() {
        return this.Field16967;
    }

    public final void Method7195(@NotNull @NotNull Vec3d vec3d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"<set-?>");
        this.Field16967 = vec3d;
    }

    public Class1934(@NotNull @NotNull Vec3d vec3d, @NotNull @NotNull Vec3d vec3d2) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)vec3d2, (String)"size");
        this.Field16966 = vec3d;
        this.Field16967 = vec3d2;
    }

    public Class1934(@NotNull @NotNull Class1934 class1934) {
        Intrinsics.checkParameterIsNotNull((Object)class1934, (String)"box");
        this(class1934.Field16966, class1934.Field16967);
    }

    public Class1934(@NotNull @NotNull AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        this(Field16968.Method6696(axisAlignedBB));
    }

    private static String Method7196(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 5;
            cArray2[n] = (char)(cArray[n] ^ (0x221D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

