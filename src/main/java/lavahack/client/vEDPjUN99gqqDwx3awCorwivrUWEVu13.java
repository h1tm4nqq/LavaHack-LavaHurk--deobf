//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.lP4XuXSdVr7C3YwY40uDBjSUKKDWorZL;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vEDPjUN99gqqDwx3awCorwivrUWEVu13$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.vEDPjUN99gqqDwx3awCorwivrUWEVu13$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JF\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0006J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0005H\u0002R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2={"Lcom/kisman/cc/features/module/render/CrystalSafeBlocks;", "Lcom/kisman/cc/features/module/Module;", "()V", "map", "Ljava/util/HashMap;", "Lnet/minecraft/util/math/BlockPos;", "", "Lkotlin/collections/HashMap;", "range", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "safeDown", "safeGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "safeRenderGroup", "safeRenderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "terrain", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "unsafeDown", "unsafeGroup", "unsafeRenderGroup", "unsafeRenderer", "calculate", "", "posX", "", "posY", "posZ", "posXEntity", "posYEntity", "posZEntity", "interlopedAmount", "", "doIt", "", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "valid", "pos", "kisman.cc"})
public final class vEDPjUN99gqqDwx3awCorwivrUWEVu13
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9909 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1756297531 ^ 0x4034000068AEF93BL), 1.0, Double.longBitsToDouble(0xBC849431ECA4737AL ^ 0xFCBA9431ECA4737AL), ((int)-513815277L ^ 0xE15FCD12) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9910 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Terrain", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)218787923L ^ 0xD0A7053) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field9911 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Safe", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field9912 = this.Method24(this.Field9911.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", this))));
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field9913;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9914;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field9915;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field9916;
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field9917;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9918;
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field9919;
    private final HashMap Field9920;
    private String Field9921 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field9919.Method2004();
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method2163(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        this.Field9919.Method2005(new vEDPjUN99gqqDwx3awCorwivrUWEVu13$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this));
    }

    private final void Method2164() {
        this.Field9920.clear();
        for (Entity entity : vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().world.loadedEntityList) {
            if (!(entity instanceof EntityEnderCrystal)) continue;
            Iterator iterator = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7756(entity, Float.intBitsToFloat((int)((long)1498681258 ^ (long)403967914)), (boolean)((long)456532034 ^ (long)456532035), (boolean)((long)-1058113703 ^ (long)-1058113703)).iterator();
            while (iterator.hasNext()) {
                BlockPos blockPos;
                BlockPos blockPos2 = blockPos = (BlockPos)iterator.next();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
                if (!this.Method2165(blockPos2)) continue;
                double d = entity.posX;
                double d2 = entity.posY;
                double d3 = entity.posZ;
                double d4 = (double)blockPos.getX() + Double.longBitsToDouble(0xF31D22DFE3868610L ^ 0xCCFD22DFE3868610L);
                double d5 = blockPos.getY();
                double d6 = (double)blockPos.getZ() + Double.longBitsToDouble((long)1587993736 ^ 0x3FE000005EA6DC88L);
                int n = (int)((long)-1558400249 ^ (long)-1558400249);
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field9910;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"terrain");
                float f = this.Method2166(d, d2, d3, d4, d5, d6, n, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365());
                Map map = this.Field9920;
                BlockPos blockPos3 = blockPos;
                EntityPlayerSP entityPlayerSP = vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                Boolean bl = (f < entityPlayerSP.getHealth() + vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().player.absorptionAmount ? (int)-1450818036L ^ 0xA986460D : (int)-902683789L ^ 0xCA322373) != 0;
                int n2 = (int)1265033699L ^ 0x4B66E1E3;
                map.put(blockPos3, bl);
            }
        }
        Iterator<Object> iterator = this.Field9920.keySet().iterator();
        while (iterator.hasNext()) {
            Entity entity;
            entity = (BlockPos)iterator.next();
            vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().addScheduledTask((Runnable)new vEDPjUN99gqqDwx3awCorwivrUWEVu13$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, (BlockPos)entity));
        }
    }

    private final boolean Method2165(BlockPos blockPos) {
        int n;
        if (Intrinsics.areEqual((Object)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3703(blockPos).getBlock(), (Object)Blocks.AIR)) {
            BlockPos blockPos2 = blockPos.down();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.down()");
            if ((Intrinsics.areEqual((Object)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3703(blockPos2).getBlock(), (Object)Blocks.AIR) ^ ((int)-1309581481L ^ 0xB1F15F56)) != 0) {
                double d = vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().player.getDistance((double)blockPos.getX() + Double.longBitsToDouble((long)392952674 ^ 0x3FE00000176BFB62L), (double)blockPos.getY(), (double)blockPos.getZ() + Double.longBitsToDouble(0x5C86A5638C79C623L ^ 0x6366A5638C79C623L));
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field9909;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"range");
                if (d <= (double)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()) {
                    n = (int)((long)375787386 ^ (long)375787387);
                    return n != 0;
                }
            }
        }
        n = (int)((long)-153463138 ^ (long)-153463138);
        return n != 0;
    }

    public final float Method2166(double d, double d2, double d3, double d4, double d5, double d6, int n, boolean bl) {
        double d7;
        float f = Float.intBitsToFloat((int)((long)217644099 ^ (long)1303968835));
        int n2 = (int)((long)632884254 ^ (long)632884254);
        int n3 = (int)((long)-250492324 ^ (long)-250492324);
        double d8 = lP4XuXSdVr7C3YwY40uDBjSUKKDWorZL.Field13279.Method7204(d4 - d) + lP4XuXSdVr7C3YwY40uDBjSUKKDWorZL.Field13279.Method7204(d5 - d2) + lP4XuXSdVr7C3YwY40uDBjSUKKDWorZL.Field13279.Method7204(d6 - d3);
        int n4 = (int)((long)1381186197 ^ (long)1381186197);
        double d9 = Math.sqrt(d8);
        if (d9 > (double)f) {
            return 0.0f;
        }
        if (n > 0) {
            Vec3d vec3d = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1942((Entity)vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().player, n);
            d9 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1954(vec3d.x, vec3d.y, vec3d.z, d, d2, d3);
        }
        double d10 = d9 / (double)f;
        Vec3d vec3d = new Vec3d(d, d2, d3);
        double d11 = 0.0;
        if (bl) {
            EntityPlayerSP entityPlayerSP = vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            d7 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7765(vec3d, entityPlayerSP.getEntityBoundingBox());
        } else {
            WorldClient worldClient = vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().world;
            EntityPlayerSP entityPlayerSP = vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            d7 = worldClient.getBlockDensity(vec3d, entityPlayerSP.getEntityBoundingBox());
        }
        d11 = d7;
        double d12 = (1.0 - d10) * d11;
        float f2 = (int)((d12 * d12 + d12) / Double.longBitsToDouble(0x768780F019CA2477L ^ 0x368780F019CA2477L) * Double.longBitsToDouble((long)383247860 ^ 0x401C000016D7E5F4L) * (double)f + 1.0);
        double d13 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7767((EntityLivingBase)vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().player, vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7768((World)vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().world, f2), new Explosion((World)vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2168().world, null, d, d2, d3, Float.intBitsToFloat((int)359348269L ^ 0x55AB382D), (boolean)((long)2110384207 ^ (long)2110384207), ((int)-1460635357L ^ 0xA8F07922) != 0));
        return (float)d13;
    }

    public vEDPjUN99gqqDwx3awCorwivrUWEVu13() {
        super("CrystalSafeBlocks", "Shows safe/unsafe blocks by nearest crystals with different colors.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = this.Field9912;
        Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"safeRenderGroup");
        this.Field9913 = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2)).Method773("Safe")).Method3788().Method3789();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Safe Down", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1903828961L ^ 0x717A1FE1) != 0).Method355("Down");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Safe Down\", this, false).setTitle(\"Down\")");
        this.Field9914 = this.Method23(this.Field9911.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        this.Field9915 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Unsafe", this)));
        this.Field9916 = this.Method24(this.Field9915.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", this))));
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK2 = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 = this.Field9916;
        Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3, (String)"unsafeRenderGroup");
        this.Field9917 = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK2.Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3)).Method773("Unsafe")).Method3788().Method3789();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Unsafe Down", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)58089536L ^ 0x3766040) != 0).Method355("Down");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Unsafe Down\", t\u2026, false).setTitle(\"Down\")");
        this.Field9918 = this.Method23(this.Field9915.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        this.Field9919 = new Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ(this).Method2003();
        this.Field9920 = new HashMap();
    }

    public static final void Method2167(vEDPjUN99gqqDwx3awCorwivrUWEVu13 vEDPjUN99gqqDwx3awCorwivrUWEVu132) {
        vEDPjUN99gqqDwx3awCorwivrUWEVu132.Method2164();
    }

    public static final Minecraft Method2168() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method2169(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final HashMap Method2170(vEDPjUN99gqqDwx3awCorwivrUWEVu13 vEDPjUN99gqqDwx3awCorwivrUWEVu132) {
        return vEDPjUN99gqqDwx3awCorwivrUWEVu132.Field9920;
    }

    public static final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Method2171(vEDPjUN99gqqDwx3awCorwivrUWEVu13 vEDPjUN99gqqDwx3awCorwivrUWEVu132) {
        return vEDPjUN99gqqDwx3awCorwivrUWEVu132.Field9913;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2172(vEDPjUN99gqqDwx3awCorwivrUWEVu13 vEDPjUN99gqqDwx3awCorwivrUWEVu132) {
        return vEDPjUN99gqqDwx3awCorwivrUWEVu132.Field9914;
    }

    public static final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Method2173(vEDPjUN99gqqDwx3awCorwivrUWEVu13 vEDPjUN99gqqDwx3awCorwivrUWEVu132) {
        return vEDPjUN99gqqDwx3awCorwivrUWEVu132.Field9917;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2174(vEDPjUN99gqqDwx3awCorwivrUWEVu13 vEDPjUN99gqqDwx3awCorwivrUWEVu132) {
        return vEDPjUN99gqqDwx3awCorwivrUWEVu132.Field9918;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)283603791 ^ (long)283603791);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1271478630L ^ 0xB436C665);
            int n2 = ((int)-961282681L ^ 0xC6B3FD9C) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1221655921 ^ (long)-1221624272) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

