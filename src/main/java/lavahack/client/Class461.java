//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.item.*;
import java.util.*;
import net.minecraft.client.entity.*;
import com.kisman.cc.util.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002JF\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0006J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0005H\u0002R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \n*\u0004\u0018\u00010\r0\rX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u0004?\u0006\u0002\n\u0000?\u0006+" }, d2 = { "Lcom/kisman/cc/features/module/render/CrystalSafeBlocks;", "Lcom/kisman/cc/features/module/Module;", "()V", "map", "Ljava/util/HashMap;", "Lnet/minecraft/util/math/BlockPos;", "", "Lkotlin/collections/HashMap;", "range", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "safeDown", "safeGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "safeRenderGroup", "safeRenderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "terrain", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "unsafeDown", "unsafeGroup", "unsafeRenderGroup", "unsafeRenderer", "calculate", "", "posX", "", "posY", "posZ", "posXEntity", "posYEntity", "posZEntity", "interlopedAmount", "", "doIt", "", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "valid", "pos", "kisman.cc" })
public final class Class461 extends Class42
{
    private final Class44 Field9909;
    private final Class44 Field9910;
    private final Class1996 Field9911;
    private final Class1996 Field9912;
    private final Class1612 Field9913;
    private final Class44 Field9914;
    private final Class1996 Field9915;
    private final Class1996 Field9916;
    private final Class1612 Field9917;
    private final Class44 Field9918;
    private final Class411 Field9919;
    private final HashMap Field9920;
    private String Field9921 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method38() {
        super.Method38();
        this.Field9919.Method2004();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method2163(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        this.Field9919.Method2005((Runnable)new Class2171(this));
    }
    
    private final void Method2164() {
        this.Field9920.clear();
        for (final Entity entity : Method2168().world.loadedEntityList) {
            if (entity instanceof EntityEnderCrystal) {
                for (final BlockPos blockPos2 : Class2155.Method7756(entity, Float.intBitsToFloat(1094713344), true, false)) {
                    final BlockPos blockPos = blockPos2;
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, "pos");
                    if (this.Method2165(blockPos2)) {
                        final double posX = entity.posX;
                        final double posY = entity.posY;
                        final double posZ = entity.posZ;
                        final double n = blockPos.getX() + Double.longBitsToDouble(4602678819172646912L);
                        final double n2 = blockPos.getY();
                        final double n3 = blockPos.getZ() + Double.longBitsToDouble((long)1587993736 ^ 0x3FE000005EA6DC88L);
                        final int n4 = 0;
                        final Class44 field9910 = this.Field9910;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field9910, "terrain");
                        final float method2166 = this.Method2166(posX, posY, posZ, n, n2, n3, n4, field9910.Method365());
                        final HashMap hashMap = this.Field9920;
                        final BlockPos blockPos3 = blockPos;
                        final float n5 = method2166;
                        final EntityPlayerSP player = Method2168().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                        hashMap.put(blockPos3, n5 < player.getHealth() + Method2168().player.absorptionAmount);
                    }
                }
            }
        }
        final Iterator<BlockPos> iterator3 = this.Field9920.keySet().iterator();
        while (iterator3.hasNext()) {
            Method2168().addScheduledTask((Runnable)new Class543(this, iterator3.next()));
        }
    }
    
    private final boolean Method2165(final BlockPos blockPos) {
        if (Intrinsics.areEqual((Object)Class886.Method3703(blockPos).getBlock(), (Object)Blocks.AIR)) {
            final BlockPos down = blockPos.down();
            Intrinsics.checkExpressionValueIsNotNull((Object)down, "pos.down()");
            if (Intrinsics.areEqual((Object)Class886.Method3703(down).getBlock(), (Object)Blocks.AIR) ^ true) {
                final double getDistance = Method2168().player.getDistance(blockPos.getX() + Double.longBitsToDouble((long)392952674 ^ 0x3FE00000176BFB62L), (double)blockPos.getY(), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
                final Class44 field9909 = this.Field9909;
                Intrinsics.checkExpressionValueIsNotNull((Object)field9909, "range");
                if (getDistance <= field9909.Method335()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final float Method2166(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int n7, final boolean b) {
        final float intBitsToFloat = Float.intBitsToFloat(1094713344);
        double n8 = Math.sqrt(Class1173.Field13279.Method7204(n4 - n) + Class1173.Field13279.Method7204(n5 - n2) + Class1173.Field13279.Method7204(n6 - n3));
        if (n8 > intBitsToFloat) {
            return 0.0f;
        }
        if (n7 > 0) {
            final Vec3d method1942 = Class394.Method1942((Entity)Method2168().player, (double)n7);
            n8 = Class394.Method1954(method1942.x, method1942.y, method1942.z, n, n2, n3);
        }
        final double n9 = n8 / intBitsToFloat;
        final Vec3d vec3d = new Vec3d(n, n2, n3);
        double n10;
        if (b) {
            final Vec3d vec3d2 = vec3d;
            final EntityPlayerSP player = Method2168().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            n10 = Class2155.Method7765(vec3d2, player.getEntityBoundingBox());
        }
        else {
            final WorldClient world = Method2168().world;
            final Vec3d vec3d3 = vec3d;
            final EntityPlayerSP player2 = Method2168().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            n10 = world.getBlockDensity(vec3d3, player2.getEntityBoundingBox());
        }
        final double n11 = (1.0 - n9) * n10;
        return Class2155.Method7767((EntityLivingBase)Method2168().player, Class2155.Method7768((World)Method2168().world, (float)(int)((n11 * n11 + n11) / Double.longBitsToDouble(4611686018427387904L) * Double.longBitsToDouble((long)383247860 ^ 0x401C000016D7E5F4L) * intBitsToFloat + 1.0)), new Explosion((World)Method2168().world, (Entity)null, n, n2, n3, Float.intBitsToFloat(1086324736), false, true));
    }
    
    public Class461() {
        super("CrystalSafeBlocks", "Shows safe/unsafe blocks by nearest crystals with different colors.", Class97.Field8342);
        this.Field9909 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)1756297531 ^ 0x4034000068AEF93BL), 1.0, Double.longBitsToDouble(4629137466983448576L), true));
        this.Field9910 = this.Method23(new Class44("Terrain", (Class42)this, false));
        this.Field9911 = this.Method24(new Class1996(new Class44("Safe", (Class42)this)));
        this.Field9912 = this.Method24(this.Field9911.Method7406(new Class1996(new Class44("Render", (Class42)this))));
        final Class1612 class1612 = new Class1612((Class42)this);
        final Class1996 field9912 = this.Field9912;
        Intrinsics.checkExpressionValueIsNotNull((Object)field9912, "safeRenderGroup");
        this.Field9913 = ((Class1612)((Class1612)class1612.Method772(field9912)).Method773("Safe")).Method3788().Method3789();
        final Class1996 field9913 = this.Field9911;
        final Class44 method355 = new Class44("Safe Down", (Class42)this, false).Method355("Down");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Safe Down\", this, false).setTitle(\"Down\")");
        this.Field9914 = this.Method23(field9913.Method7405(method355));
        this.Field9915 = this.Method24(new Class1996(new Class44("Unsafe", (Class42)this)));
        this.Field9916 = this.Method24(this.Field9915.Method7406(new Class1996(new Class44("Render", (Class42)this))));
        final Class1612 class1613 = new Class1612((Class42)this);
        final Class1996 field9914 = this.Field9916;
        Intrinsics.checkExpressionValueIsNotNull((Object)field9914, "unsafeRenderGroup");
        this.Field9917 = ((Class1612)((Class1612)class1613.Method772(field9914)).Method773("Unsafe")).Method3788().Method3789();
        final Class1996 field9915 = this.Field9915;
        final Class44 method356 = new Class44("Unsafe Down", (Class42)this, false).Method355("Down");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"Unsafe Down\", t\u2026, false).setTitle(\"Down\")");
        this.Field9918 = this.Method23(field9915.Method7405(method356));
        this.Field9919 = new Class411((Class42)this).Method2003();
        this.Field9920 = new HashMap();
    }
    
    public static final void Method2167(final Class461 class461) {
        class461.Method2164();
    }
    
    public static final Minecraft Method2168() {
        return Class42.Field8052;
    }
    
    public static final void Method2169(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final HashMap Method2170(final Class461 class461) {
        return class461.Field9920;
    }
    
    public static final Class1612 Method2171(final Class461 class461) {
        return class461.Field9913;
    }
    
    public static final Class44 Method2172(final Class461 class461) {
        return class461.Field9914;
    }
    
    public static final Class1612 Method2173(final Class461 class461) {
        return class461.Field9917;
    }
    
    public static final Class44 Method2174(final Class461 class461) {
        return class461.Field9918;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7CBF ^ 0x36));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
