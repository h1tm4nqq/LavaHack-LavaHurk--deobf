//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.Iterator;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1047;
import lavahack.client.Class1416;
import lavahack.client.Class1727;
import lavahack.client.Class2155;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class61;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;", "Lcom/kisman/cc/util/entity/TargetFinder;", "logic", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/util/enums/AutoRerTargetFinderLogic;", "placeRange", "", "autoRer", "Lcom/kisman/cc/features/module/combat/AutoRer;", "range", "", "delay", "", "threadded", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Lcom/kisman/cc/features/module/combat/AutoRer;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "getDamageForPlayer", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "getTarget", "wallRange", "kisman.cc"})
public final class Class1921
extends Class61 {
    private final Supplier Field16928;
    private final Supplier Field16929;
    private final Class1416 Field16930;
    private String Field16931 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @Nullable
    @Nullable
    public EntityPlayer Method501(float f, float f2) {
        EntityPlayer entityPlayer = null;
        float f3 = Float.intBitsToFloat(1112014848);
        float f4 = Float.intBitsToFloat(0x3F000000);
        Iterator iterator = this.Method495().world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityPlayer)) continue;
            Intrinsics.checkExpressionValueIsNotNull(null, (String)"AntiBot.instance");
            if (((Class42)null).Method35() && null.Field10954.Method309("Zamorozka") && !Class394.Method1927((EntityLivingBase)entity) || this.Method502((EntityLivingBase)entity, f, f2) || entityPlayer != null && !(this.Method495().player.getDistanceSq(entity) < this.Method495().player.getDistanceSq((Entity)entityPlayer))) continue;
            float f5 = this.Method7173((EntityPlayer)entity);
            if ((Class1727)((Object)this.Field16928.get()) == Class1727.Field15931 ? f5 < f4 : (Class1727)((Object)this.Field16928.get()) == Class1727.Field15930 && ((EntityPlayer)entity).getHealth() > f3) continue;
            entityPlayer = (EntityPlayer)entity;
            if (f5 > f4) {
                f4 = f5;
            }
            if (!(((EntityPlayer)entity).getHealth() < f3)) continue;
            f3 = ((EntityPlayer)entity).getHealth();
        }
        return entityPlayer;
    }

    private final float Method7173(EntityPlayer entityPlayer) {
        float f = Float.intBitsToFloat(0x3F000000);
        BlockPos blockPos = entityPlayer.getPosition();
        Object t = this.Field16929.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"placeRange.get()");
        Iterator iterator = Class394.Method1946(blockPos, ((Number)t).floatValue(), 1 + (int)((Number)this.Field16929.get()).floatValue(), false, true, 0).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos2 = (BlockPos)iterator.next();
            Class44 class44 = this.Field16930.Field14490;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"autoRer.thirdCheck");
            if (class44.Method365() && !this.Field16930.Method5622(blockPos2)) continue;
            Class44 class442 = this.Field16930.Field14489;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"autoRer.secondCheck");
            boolean bl = class442.Method365();
            boolean bl2 = this.Field16930.Method27();
            Class44 class443 = this.Field16930.Field14493;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"autoRer.firePlace");
            if (!Class2155.Method7755(blockPos2, bl, true, bl2, class443.Method365())) continue;
            World world = (World)this.Method495().world;
            BlockPos blockPos3 = blockPos2;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos");
            double d = (double)blockPos3.getX() + Double.longBitsToDouble((long)566020868 ^ 0x3FE0000021BCCB04L);
            double d2 = blockPos2.getY() + 1;
            double d3 = (double)blockPos2.getZ() + Double.longBitsToDouble((long)690312300 ^ 0x3FE000002925546CL);
            Entity entity = (Entity)entityPlayer;
            Class44 class444 = this.Field16930.Field14454;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"autoRer.terrain");
            f = Class1047.Method4280(f, Class2155.Method7759(world, d, d2, d3, entity, class444.Method365()));
        }
        return f;
    }

    public Class1921(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull Class1416 class1416, @NotNull @NotNull Supplier supplier3, @NotNull @NotNull Supplier supplier4, @NotNull @NotNull Supplier supplier5) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"logic");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"placeRange");
        Intrinsics.checkParameterIsNotNull((Object)class1416, (String)"autoRer");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"range");
        Intrinsics.checkParameterIsNotNull((Object)supplier4, (String)"delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier5, (String)"threadded");
        super(supplier3, supplier4, supplier5);
        this.Field16928 = supplier;
        this.Field16929 = supplier2;
        this.Field16930 = class1416;
    }

    private static String Method504(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 34;
            cArray2[n] = (char)(cArray[n] ^ (0x26CA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

