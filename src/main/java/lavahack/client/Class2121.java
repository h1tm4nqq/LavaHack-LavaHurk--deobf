//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.FloatCompanionObject
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class204;
import lavahack.client.Class824;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\bJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0086\bJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0086\b\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo$Mutable;", "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "target", "Lnet/minecraft/entity/EntityLivingBase;", "minDamage", "", "(Lnet/minecraft/entity/EntityLivingBase;F)V", "clear", "", "player", "Lnet/minecraft/client/entity/EntityPlayerSP;", "takeValid", "damage", "update", "blockPos", "Lnet/minecraft/util/math/BlockPos;", "selfDamage", "targetDamage", "kisman.cc"})
public final class Class2121
extends Class204 {
    private String Field17656 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method7659(@NotNull @NotNull EntityLivingBase entityLivingBase, @NotNull @NotNull BlockPos blockPos, float f, float f2) {
        boolean bl = false;
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, (String)"target");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"blockPos");
        this.Method1202(entityLivingBase);
        this.Method1204(blockPos);
        this.Method1206(f);
        this.Method1208(f2);
    }

    public final void Method7660(@NotNull @NotNull EntityPlayerSP entityPlayerSP) {
        boolean bl = false;
        Intrinsics.checkParameterIsNotNull((Object)entityPlayerSP, (String)"player");
        Class2121 class2121 = this;
        BlockPos blockPos = BlockPos.ORIGIN;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"BlockPos.ORIGIN");
        BlockPos blockPos2 = blockPos;
        float f = FloatCompanionObject.INSTANCE.getMAX_VALUE();
        float f2 = this.Method1207();
        boolean bl2 = false;
        class2121.Method1202((EntityLivingBase)entityPlayerSP);
        class2121.Method1204(blockPos2);
        class2121.Method1206(f);
        class2121.Method1208(f2);
    }

    @Nullable
    @Nullable
    public final Class2121 Method7661(float f) {
        boolean bl;
        boolean bl2 = false;
        Class2121 class2121 = this;
        boolean bl3 = false;
        boolean bl4 = false;
        Class2121 class21212 = class2121;
        boolean bl5 = false;
        if (Intrinsics.areEqual((Object)this.Method1201(), (Object)this.Method1199().player) ^ true && this.Method1205() != FloatCompanionObject.INSTANCE.getMAX_VALUE() && this.Method1207() != f) {
            bl = true;
            return null;
        }
        bl = false;
        return null;
    }

    public Class2121(@NotNull @NotNull EntityLivingBase entityLivingBase, float f) {
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, (String)"target");
        super(entityLivingBase, BlockPos.ORIGIN, FloatCompanionObject.INSTANCE.getMAX_VALUE(), f, EnumFacing.UP, Class824.Field11512.Method4229(), Vec3d.ZERO);
    }

    private static String Method1215(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 173;
            cArray2[n] = (char)(cArray[n] ^ (0x3030 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

