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

import com.kisman.cc.util.Class886;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1173;
import lavahack.client.Class1612;
import lavahack.client.Class1996;
import lavahack.client.Class2155;
import lavahack.client.Class2171;
import lavahack.client.Class394;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class543;
import lavahack.client.Class97;
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
public final class Class461
extends Class42 {
    private final Class44 Field9909 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)1756297531 ^ 0x4034000068AEF93BL), 1.0, Double.longBitsToDouble(4629137466983448576L), true));
    private final Class44 Field9910 = this.Method23(new Class44("Terrain", (Class42)this, false));
    private final Class1996 Field9911 = this.Method24(new Class1996(new Class44("Safe", this)));
    private final Class1996 Field9912 = this.Method24(this.Field9911.Method7406(new Class1996(new Class44("Render", this))));
    private final Class1612 Field9913;
    private final Class44 Field9914;
    private final Class1996 Field9915;
    private final Class1996 Field9916;
    private final Class1612 Field9917;
    private final Class44 Field9918;
    private final Class411 Field9919;
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
        this.Field9919.Method2005(new Class2171(this));
    }

    private final void Method2164() {
        this.Field9920.clear();
        for (Entity entity : Class461.Method2168().world.loadedEntityList) {
            if (!(entity instanceof EntityEnderCrystal)) continue;
            Iterator iterator = Class2155.Method7756(entity, Float.intBitsToFloat(0x41400000), true, false).iterator();
            while (iterator.hasNext()) {
                BlockPos blockPos;
                BlockPos blockPos2 = blockPos = (BlockPos)iterator.next();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
                if (!this.Method2165(blockPos2)) continue;
                double d = entity.posX;
                double d2 = entity.posY;
                double d3 = entity.posZ;
                double d4 = (double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L);
                double d5 = blockPos.getY();
                double d6 = (double)blockPos.getZ() + Double.longBitsToDouble((long)1587993736 ^ 0x3FE000005EA6DC88L);
                Class44 class44 = this.Field9910;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"terrain");
                float f = this.Method2166(d, d2, d3, d4, d5, d6, 0, class44.Method365());
                Map map = this.Field9920;
                BlockPos blockPos3 = blockPos;
                EntityPlayerSP entityPlayerSP = Class461.Method2168().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                Boolean bl = f < entityPlayerSP.getHealth() + Class461.Method2168().player.absorptionAmount;
                boolean bl2 = false;
                map.put(blockPos3, bl);
            }
        }
        Iterator<Object> iterator = this.Field9920.keySet().iterator();
        while (iterator.hasNext()) {
            Entity entity;
            entity = (BlockPos)iterator.next();
            Class461.Method2168().addScheduledTask((Runnable)new Class543(this, (BlockPos)entity));
        }
    }

    private final boolean Method2165(BlockPos blockPos) {
        if (!Intrinsics.areEqual((Object)Class886.Method3703(blockPos).getBlock(), (Object)Blocks.AIR)) return false;
        BlockPos blockPos2 = blockPos.down();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.down()");
        if (!(Intrinsics.areEqual((Object)Class886.Method3703(blockPos2).getBlock(), (Object)Blocks.AIR) ^ true)) return false;
        double d = Class461.Method2168().player.getDistance((double)blockPos.getX() + Double.longBitsToDouble((long)392952674 ^ 0x3FE00000176BFB62L), (double)blockPos.getY(), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
        Class44 class44 = this.Field9909;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"range");
        if (!(d <= (double)class44.Method335())) return false;
        return true;
    }

    public final float Method2166(double d, double d2, double d3, double d4, double d5, double d6, int n, boolean bl) {
        double d7;
        float f = Float.intBitsToFloat(0x41400000);
        boolean bl2 = false;
        boolean bl3 = false;
        double d8 = Class1173.Field13279.Method7204(d4 - d) + Class1173.Field13279.Method7204(d5 - d2) + Class1173.Field13279.Method7204(d6 - d3);
        boolean bl4 = false;
        double d9 = Math.sqrt(d8);
        if (d9 > (double)f) {
            return 0.0f;
        }
        if (n > 0) {
            Vec3d vec3d = Class394.Method1942((Entity)Class461.Method2168().player, n);
            d9 = Class394.Method1954(vec3d.x, vec3d.y, vec3d.z, d, d2, d3);
        }
        double d10 = d9 / (double)f;
        Vec3d vec3d = new Vec3d(d, d2, d3);
        double d11 = 0.0;
        if (bl) {
            EntityPlayerSP entityPlayerSP = Class461.Method2168().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            d7 = Class2155.Method7765(vec3d, entityPlayerSP.getEntityBoundingBox());
        } else {
            WorldClient worldClient = Class461.Method2168().world;
            EntityPlayerSP entityPlayerSP = Class461.Method2168().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            d7 = worldClient.getBlockDensity(vec3d, entityPlayerSP.getEntityBoundingBox());
        }
        d11 = d7;
        double d12 = (1.0 - d10) * d11;
        float f2 = (int)((d12 * d12 + d12) / Double.longBitsToDouble(0x4000000000000000L) * Double.longBitsToDouble((long)383247860 ^ 0x401C000016D7E5F4L) * (double)f + 1.0);
        double d13 = Class2155.Method7767((EntityLivingBase)Class461.Method2168().player, Class2155.Method7768((World)Class461.Method2168().world, f2), new Explosion((World)Class461.Method2168().world, null, d, d2, d3, Float.intBitsToFloat(0x40C00000), false, true));
        return (float)d13;
    }

    public Class461() {
        super("CrystalSafeBlocks", "Shows safe/unsafe blocks by nearest crystals with different colors.", Class97.Field8342);
        Class1612 class1612 = new Class1612(this);
        Class1996 class1996 = this.Field9912;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1996, (String)"safeRenderGroup");
        this.Field9913 = ((Class1612)((Class1612)class1612.Method772(class1996)).Method773("Safe")).Method3788().Method3789();
        Class44 class44 = new Class44("Safe Down", (Class42)this, false).Method355("Down");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Safe Down\", this, false).setTitle(\"Down\")");
        this.Field9914 = this.Method23(this.Field9911.Method7405(class44));
        this.Field9915 = this.Method24(new Class1996(new Class44("Unsafe", this)));
        this.Field9916 = this.Method24(this.Field9915.Method7406(new Class1996(new Class44("Render", this))));
        Class1612 class16122 = new Class1612(this);
        Class1996 class19962 = this.Field9916;
        Intrinsics.checkExpressionValueIsNotNull((Object)class19962, (String)"unsafeRenderGroup");
        this.Field9917 = ((Class1612)((Class1612)class16122.Method772(class19962)).Method773("Unsafe")).Method3788().Method3789();
        Class44 class442 = new Class44("Unsafe Down", (Class42)this, false).Method355("Down");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Unsafe Down\", t\u2026, false).setTitle(\"Down\")");
        this.Field9918 = this.Method23(this.Field9915.Method7405(class442));
        this.Field9919 = new Class411(this).Method2003();
        this.Field9920 = new HashMap();
    }

    public static final void Method2167(Class461 class461) {
        class461.Method2164();
    }

    public static final Minecraft Method2168() {
        return Class42.Field8052;
    }

    public static final void Method2169(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final HashMap Method2170(Class461 class461) {
        return class461.Field9920;
    }

    public static final Class1612 Method2171(Class461 class461) {
        return class461.Field9913;
    }

    public static final Class44 Method2172(Class461 class461) {
        return class461.Field9914;
    }

    public static final Class1612 Method2173(Class461 class461) {
        return class461.Field9917;
    }

    public static final Class44 Method2174(Class461 class461) {
        return class461.Field9918;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 54;
            cArray2[n] = (char)(cArray[n] ^ (0x7CBF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

