/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/render/PearlTracer$VectorWithTimer;", "", "vector", "Lnet/minecraft/util/math/Vec3d;", "(Lnet/minecraft/util/math/Vec3d;)V", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "getVector", "()Lnet/minecraft/util/math/Vec3d;", "kisman.cc"})
public final class KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    @NotNull
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14767;
    @NotNull
    private final Vec3d Field14768;
    private String Field14769 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Method5767() {
        return this.Field14767;
    }

    @NotNull
    @NotNull
    public final Vec3d Method5768() {
        return this.Field14768;
    }

    public KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull Vec3d vec3d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"vector");
        this.Field14768 = vec3d;
        this.Field14767 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    }

    private static String Method5769(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2090927421L ^ 0x835EFAC3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)777615741L ^ 0x2E597982);
            int n2 = (int)-27740218L ^ 0xFE58B727;
            cArray2[n] = (char)(cArray[n] ^ (((int)1527411190L ^ 0x5B0A6E69) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

