/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/features/module/combat/autocrystalpvp/PlaceInfo;", "", "target", "Lnet/minecraft/entity/Entity;", "pos", "Lnet/minecraft/util/math/BlockPos;", "damage", "", "(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/BlockPos;F)V", "getDamage", "()F", "setDamage", "(F)V", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "setPos", "(Lnet/minecraft/util/math/BlockPos;)V", "getTarget", "()Lnet/minecraft/entity/Entity;", "setTarget", "(Lnet/minecraft/entity/Entity;)V", "kisman.cc"})
public final class Class387 {
    @NotNull
    private Entity Field9621;
    @NotNull
    private BlockPos Field9622;
    private float Field9623;
    private String Field9624 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Entity Method1864() {
        return this.Field9621;
    }

    public final void Method1865(@NotNull @NotNull Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"<set-?>");
        this.Field9621 = entity;
    }

    @NotNull
    @NotNull
    public final BlockPos Method1866() {
        return this.Field9622;
    }

    public final void Method1867(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"<set-?>");
        this.Field9622 = blockPos;
    }

    public final float Method1868() {
        return this.Field9623;
    }

    public final void Method1869(float f) {
        this.Field9623 = f;
    }

    public Class387(@NotNull @NotNull Entity entity, @NotNull @NotNull BlockPos blockPos, float f) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"target");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        this.Field9621 = entity;
        this.Field9622 = blockPos;
        this.Field9623 = f;
    }

    private static String Method1870(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 252;
            cArray2[n] = (char)(cArray[n] ^ (0x5D59 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

