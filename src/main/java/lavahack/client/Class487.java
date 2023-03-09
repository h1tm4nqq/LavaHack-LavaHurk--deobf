/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.DimensionType
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006!"}, d2={"Lcom/kisman/cc/features/module/render/Trails$Trace;", "", "index", "", "name", "", "type", "Lnet/minecraft/world/DimensionType;", "pos", "Lnet/minecraft/util/math/Vec3d;", "trace", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/render/Trails$TracePos;", "Lkotlin/collections/ArrayList;", "(ILjava/lang/String;Lnet/minecraft/world/DimensionType;Lnet/minecraft/util/math/Vec3d;Ljava/util/ArrayList;)V", "getIndex", "()I", "setIndex", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPos", "()Lnet/minecraft/util/math/Vec3d;", "setPos", "(Lnet/minecraft/util/math/Vec3d;)V", "getTrace", "()Ljava/util/ArrayList;", "getType", "()Lnet/minecraft/world/DimensionType;", "setType", "(Lnet/minecraft/world/DimensionType;)V", "kisman.cc"})
public final class Class487 {
    private int Field10031;
    @Nullable
    private String Field10032;
    @NotNull
    private DimensionType Field10033;
    @NotNull
    private Vec3d Field10034;
    @NotNull
    private final ArrayList Field10035;
    private String Field10036 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final int Method2249() {
        return this.Field10031;
    }

    public final void Method2250(int n) {
        this.Field10031 = n;
    }

    @Nullable
    @Nullable
    public final String Method2251() {
        return this.Field10032;
    }

    public final void Method2252(@Nullable @Nullable String string) {
        this.Field10032 = string;
    }

    @NotNull
    @NotNull
    public final DimensionType Method2253() {
        return this.Field10033;
    }

    public final void Method2254(@NotNull @NotNull DimensionType dimensionType) {
        Intrinsics.checkParameterIsNotNull((Object)dimensionType, (String)"<set-?>");
        this.Field10033 = dimensionType;
    }

    @NotNull
    @NotNull
    public final Vec3d Method2255() {
        return this.Field10034;
    }

    public final void Method2256(@NotNull @NotNull Vec3d vec3d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"<set-?>");
        this.Field10034 = vec3d;
    }

    @NotNull
    @NotNull
    public final ArrayList Method2257() {
        return this.Field10035;
    }

    public Class487(int n, @Nullable @Nullable String string, @NotNull @NotNull DimensionType dimensionType, @NotNull @NotNull Vec3d vec3d, @NotNull @NotNull ArrayList arrayList) {
        Intrinsics.checkParameterIsNotNull((Object)dimensionType, (String)"type");
        Intrinsics.checkParameterIsNotNull((Object)vec3d, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)arrayList, (String)"trace");
        this.Field10031 = n;
        this.Field10032 = string;
        this.Field10033 = dimensionType;
        this.Field10034 = vec3d;
        this.Field10035 = arrayList;
    }

    private static String Method2258(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 118;
            cArray2[n] = (char)(cArray[n] ^ (0x4232 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

