/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/features/module/render/Trails$TracePos;", "", "pos", "Lnet/minecraft/util/math/Vec3d;", "time", "", "(Lnet/minecraft/util/math/Vec3d;J)V", "getPos", "()Lnet/minecraft/util/math/Vec3d;", "setPos", "(Lnet/minecraft/util/math/Vec3d;)V", "getTime", "()J", "setTime", "(J)V", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "shouldBeRemove", "", "kisman.cc"})
public final class Class773 {
    @NotNull
    private final Class650 Field11271;
    @NotNull
    private Vec3d Field11272;
    private long Field11273;
    private String Field11274 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class650 Method3220() {
        return this.Field11271;
    }

    public final boolean Method3221() {
        return this.Field11271.Method2797(2000L);
    }

    @NotNull
    @NotNull
    public final Vec3d Method3222() {
        return this.Field11272;
    }

    public final void Method3223(@NotNull @NotNull Vec3d vec3d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"<set-?>");
        this.Field11272 = vec3d;
    }

    public final long Method3224() {
        return this.Field11273;
    }

    public final void Method3225(long l) {
        this.Field11273 = l;
    }

    public Class773(@NotNull @NotNull Vec3d vec3d, long l) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"pos");
        this.Field11272 = vec3d;
        this.Field11273 = l;
        this.Field11271 = new Class650();
    }

    private static String Method3226(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 36;
            cArray2[n] = (char)(cArray[n] ^ (0x62D0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

