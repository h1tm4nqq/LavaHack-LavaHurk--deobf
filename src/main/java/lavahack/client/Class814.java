/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/util/math/vectors/xyz/Vec3dColored;", "", "vec", "Lnet/minecraft/util/math/Vec3d;", "color", "Lcom/kisman/cc/util/Colour;", "(Lnet/minecraft/util/math/Vec3d;Lcom/kisman/cc/util/Colour;)V", "getColor", "()Lcom/kisman/cc/util/Colour;", "setColor", "(Lcom/kisman/cc/util/Colour;)V", "getVec", "()Lnet/minecraft/util/math/Vec3d;", "setVec", "(Lnet/minecraft/util/math/Vec3d;)V", "kisman.cc"})
public final class Class814 {
    @NotNull
    private Vec3d Field11480;
    @NotNull
    private Class2027 Field11481;
    private int Field11482;

    @NotNull
    @NotNull
    public final Vec3d Method3427() {
        return this.Field11480;
    }

    public final void Method3428(@NotNull @NotNull Vec3d vec3d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"<set-?>");
        this.Field11480 = vec3d;
    }

    @NotNull
    @NotNull
    public final Class2027 Method3429() {
        return this.Field11481;
    }

    public final void Method3430(@NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"<set-?>");
        this.Field11481 = class2027;
    }

    public Class814(@NotNull @NotNull Vec3d vec3d, @NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"vec");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        this.Field11480 = vec3d;
        this.Field11481 = class2027;
    }

    private static String Method3431(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 105;
            cArray2[n] = (char)(cArray[n] ^ (0x7DA3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

