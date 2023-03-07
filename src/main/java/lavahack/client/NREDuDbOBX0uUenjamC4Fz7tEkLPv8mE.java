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
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb;
import lavahack.client.HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;", "Lcom/kisman/cc/util/entity/TargetFinder;", "logic", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/util/enums/AutoRerTargetFinderLogic;", "placeRange", "", "autoRer", "Lcom/kisman/cc/features/module/combat/AutoRer;", "range", "", "delay", "", "threadded", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Lcom/kisman/cc/features/module/combat/AutoRer;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "getDamageForPlayer", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "getTarget", "wallRange", "kisman.cc"})
public final class NREDuDbOBX0uUenjamC4Fz7tEkLPv8mE
extends IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk {
    private final Supplier Field16928;
    private final Supplier Field16929;
    private final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD Field16930;
    private String Field16931 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @Nullable
    @Nullable
    public EntityPlayer Method501(float f, float f2) {
        EntityPlayer entityPlayer = null;
        float f3 = Float.intBitsToFloat((int)((long)178257905 ^ (long)1222115313));
        float f4 = Float.intBitsToFloat(0xAAC7025 ^ 0x35AC7025);
        Iterator iterator = this.Method495().world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityPlayer)) continue;
            Intrinsics.checkExpressionValueIsNotNull(null, (String)"AntiBot.instance");
            if (((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method35() && null.Field10954.Method309("Zamorozka") && !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1927((EntityLivingBase)entity) || this.Method502((EntityLivingBase)entity, f, f2) || entityPlayer != null && !(this.Method495().player.getDistanceSq(entity) < this.Method495().player.getDistanceSq((Entity)entityPlayer))) continue;
            float f5 = this.Method7173((EntityPlayer)entity);
            if ((H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb)((Object)this.Field16928.get()) == H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb.Field15931 ? f5 < f4 : (H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb)((Object)this.Field16928.get()) == H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb.Field15930 && ((EntityPlayer)entity).getHealth() > f3) continue;
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
        float f = Float.intBitsToFloat((int)1986271956L ^ 0x49641AD4);
        BlockPos blockPos = entityPlayer.getPosition();
        Object t = this.Field16929.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"placeRange.get()");
        Iterator iterator = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1946(blockPos, ((Number)t).floatValue(), (int)((long)1166735510 ^ (long)1166735511) + (int)((Number)this.Field16929.get()).floatValue(), (boolean)((long)663298386 ^ (long)663298386), (boolean)((long)-361960199 ^ (long)-361960200), (int)1681567183L ^ 0x643AADCF).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos2 = (BlockPos)iterator.next();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16930.Field14490;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"autoRer.thirdCheck");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() && !this.Field16930.Method5622(blockPos2)) continue;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16930.Field14489;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"autoRer.secondCheck");
            boolean bl3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365();
            bl3 = (int)-1045263618L ^ 0xC1B28AFF;
            bl3 = this.Field16930.Method27();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field16930.Field14493;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"autoRer.firePlace");
            if (!vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7755(blockPos2, bl, bl2, bl3, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365())) continue;
            World world = (World)this.Method495().world;
            BlockPos blockPos3 = blockPos2;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos");
            double d3 = (double)blockPos3.getX() + Double.longBitsToDouble((long)566020868 ^ 0x3FE0000021BCCB04L);
            d3 = blockPos2.getY() + ((int)1400916359L ^ 0x53804986);
            d3 = (double)blockPos2.getZ() + Double.longBitsToDouble((long)690312300 ^ 0x3FE000002925546CL);
            Entity entity = (Entity)entityPlayer;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field16930.Field14454;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"autoRer.terrain");
            f = HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4280(f, vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759(world, d, d2, d3, entity, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()));
        }
        return f;
    }

    public NREDuDbOBX0uUenjamC4Fz7tEkLPv8mE(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2, @NotNull @NotNull Supplier supplier3, @NotNull @NotNull Supplier supplier4, @NotNull @NotNull Supplier supplier5) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"logic");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"placeRange");
        Intrinsics.checkParameterIsNotNull((Object)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2, (String)"autoRer");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"range");
        Intrinsics.checkParameterIsNotNull((Object)supplier4, (String)"delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier5, (String)"threadded");
        super(supplier3, supplier4, supplier5);
        this.Field16928 = supplier;
        this.Field16929 = supplier2;
        this.Field16930 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2;
    }

    private static String Method504(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1523143368L ^ 0xA536AD38;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1401864878L ^ 0xAC713DAD);
            int n2 = (int)((long)-1536860947 ^ (long)-1536860932) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1616606572L ^ 0x605B6609) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

