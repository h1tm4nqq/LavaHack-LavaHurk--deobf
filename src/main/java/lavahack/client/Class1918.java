/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/util/math/vectors/xyz/ColorableSlidePos;", "Lnet/minecraft/util/math/BlockPos;", "pos", "colour1", "Lcom/kisman/cc/util/Colour;", "colour2", "colour3", "colour4", "colour5", "colour6", "(Lnet/minecraft/util/math/BlockPos;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;)V", "getColour1", "()Lcom/kisman/cc/util/Colour;", "getColour2", "getColour3", "getColour4", "getColour5", "getColour6", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "kisman.cc"})
public final class Class1918
extends BlockPos {
    @NotNull
    private final BlockPos Field16911;
    @NotNull
    private final Class2027 Field16912;
    @NotNull
    private final Class2027 Field16913;
    @NotNull
    private final Class2027 Field16914;
    @NotNull
    private final Class2027 Field16915;
    @NotNull
    private final Class2027 Field16916;
    @NotNull
    private final Class2027 Field16917;
    private int Field16918;

    @NotNull
    @NotNull
    public final BlockPos getPos() {
        return this.Field16911;
    }

    @NotNull
    @NotNull
    public final Class2027 getColour1() {
        return this.Field16912;
    }

    @NotNull
    @NotNull
    public final Class2027 getColour2() {
        return this.Field16913;
    }

    @NotNull
    @NotNull
    public final Class2027 getColour3() {
        return this.Field16914;
    }

    @NotNull
    @NotNull
    public final Class2027 getColour4() {
        return this.Field16915;
    }

    @NotNull
    @NotNull
    public final Class2027 getColour5() {
        return this.Field16916;
    }

    @NotNull
    @NotNull
    public final Class2027 getColour6() {
        return this.Field16917;
    }

    public Class1918(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class2027 class20273, @NotNull @NotNull Class2027 class20274, @NotNull @NotNull Class2027 class20275, @NotNull @NotNull Class2027 class20276) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"colour1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"colour2");
        Intrinsics.checkParameterIsNotNull((Object)class20273, (String)"colour3");
        Intrinsics.checkParameterIsNotNull((Object)class20274, (String)"colour4");
        Intrinsics.checkParameterIsNotNull((Object)class20275, (String)"colour5");
        Intrinsics.checkParameterIsNotNull((Object)class20276, (String)"colour6");
        super((Vec3i)blockPos);
        this.Field16911 = blockPos;
        this.Field16912 = class2027;
        this.Field16913 = class20272;
        this.Field16914 = class20273;
        this.Field16915 = class20274;
        this.Field16916 = class20275;
        this.Field16917 = class20276;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 208;
            cArray2[n] = (char)(cArray[n] ^ (0x777 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

