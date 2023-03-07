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
import lavahack.client.dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI;
import lavahack.client.x0MtYhvQfQtI7E21PXOL8wnfn81SE4kD;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\bJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0086\bJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0086\b\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo$Mutable;", "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "target", "Lnet/minecraft/entity/EntityLivingBase;", "minDamage", "", "(Lnet/minecraft/entity/EntityLivingBase;F)V", "clear", "", "player", "Lnet/minecraft/client/entity/EntityPlayerSP;", "takeValid", "damage", "update", "blockPos", "Lnet/minecraft/util/math/BlockPos;", "selfDamage", "targetDamage", "kisman.cc"})
public final class dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI {
    private String Field17656 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method7659(@NotNull @NotNull EntityLivingBase entityLivingBase, @NotNull @NotNull BlockPos blockPos, float f, float f2) {
        int n = (int)-1472206659L ^ 0xA83FE8BD;
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, (String)"target");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"blockPos");
        this.Method1202(entityLivingBase);
        this.Method1204(blockPos);
        this.Method1206(f);
        this.Method1208(f2);
    }

    public final void Method7660(@NotNull @NotNull EntityPlayerSP entityPlayerSP) {
        int n = (int)((long)1277743652 ^ (long)1277743652);
        Intrinsics.checkParameterIsNotNull((Object)entityPlayerSP, (String)"player");
        dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = this;
        BlockPos blockPos = BlockPos.ORIGIN;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"BlockPos.ORIGIN");
        BlockPos blockPos2 = blockPos;
        float f = FloatCompanionObject.INSTANCE.getMAX_VALUE();
        float f2 = this.Method1207();
        int n2 = (int)1822478111L ^ 0x6CA0CF1F;
        dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1202((EntityLivingBase)entityPlayerSP);
        dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1204(blockPos2);
        dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1206(f);
        dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1208(f2);
    }

    @Nullable
    @Nullable
    public final dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Method7661(float f) {
        int n;
        int n2 = (int)820391200L ^ 0x30E62D20;
        dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = this;
        int n3 = (int)((long)201801646 ^ (long)201801646);
        int n4 = (int)((long)1163096507 ^ (long)1163096507);
        dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        int n5 = (int)-1550036886L ^ 0xA39C506A;
        if ((Intrinsics.areEqual((Object)this.Method1201(), (Object)this.Method1199().player) ^ (int)((long)585709264 ^ (long)585709265)) != 0 && this.Method1205() != FloatCompanionObject.INSTANCE.getMAX_VALUE() && this.Method1207() != f) {
            n = (int)-778274883L ^ 0xD19C77BC;
            return null;
        }
        n = (int)((long)-71483317 ^ (long)-71483317);
        return null;
    }

    public dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(@NotNull @NotNull EntityLivingBase entityLivingBase, float f) {
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, (String)"target");
        super(entityLivingBase, BlockPos.ORIGIN, FloatCompanionObject.INSTANCE.getMAX_VALUE(), f, EnumFacing.UP, x0MtYhvQfQtI7E21PXOL8wnfn81SE4kD.Field11512.Method4229(), Vec3d.ZERO);
    }

    private static String Method1215(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)60796977 ^ (long)60796977);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-115961105L ^ 0xF9169210);
            int n2 = (int)101388110L ^ 0x60B0FE3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-334313775L ^ 0xEC12C5D2) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

