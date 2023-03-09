//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.StringCompanionObject
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import lavahack.client.Class1044;
import lavahack.client.Class1366;
import lavahack.client.Class1515;
import lavahack.client.Class1656;
import lavahack.client.Class1697;
import lavahack.client.Class1934;
import lavahack.client.Class1950;
import lavahack.client.Class1955;
import lavahack.client.Class1996;
import lavahack.client.Class2092;
import lavahack.client.Class37;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class43;
import lavahack.client.Class44;
import lavahack.client.Class802;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2={"Lcom/kisman/cc/features/module/render/BlockHighlight;", "Lcom/kisman/cc/features/module/Module;", "Lcom/kisman/cc/util/interfaces/Drawable;", "()V", "bb", "Lnet/minecraft/util/math/AxisAlignedBB;", "ciGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "crystalInfo", "Lcom/kisman/cc/settings/Setting;", "crystalInfoColor", "crystalInfoTargetRange", "crystalInfoTerrain", "entities", "facing", "Lnet/minecraft/util/EnumFacing;", "hitSideOnly", "pattern", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "renderer", "Lcom/kisman/cc/features/module/render/BlockHighlight$IRenderer;", "draw", "", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "Companion", "IRenderer", "kisman.cc"})
public final class Class1194
extends Class42
implements Class1697 {
    private final Class44 Field13401 = this.Method23(new Class44("Entities", (Class42)this, false));
    private final Class44 Field13402 = this.Method23(new Class44("Hit Side Only", (Class42)this, false));
    private final Class1515 Field13403 = new Class1515(this).Method6042().Method6043();
    private final Class1996 Field13404 = this.Method24(new Class1996(new Class44("Crystal Info", this)));
    private final Class44 Field13405 = this.Method23(this.Field13404.Method7405(new Class44("Crystal Info", (Class42)this, false)));
    private final Class44 Field13406;
    private final Class44 Field13407;
    private final Class44 Field13408;
    private final Class1950 Field13409;
    private AxisAlignedBB Field13410;
    private EnumFacing Field13411;
    @Nullable
    private static Class1194 Field13412;
    public static final Class43 Field13413;
    private String Field13414 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field13409.Method4272();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @SubscribeEvent
    @SubscribeEvent
    public final void Method4806(@NotNull @NotNull RenderWorldLastEvent var1_1) {
        Intrinsics.checkParameterIsNotNull((Object)var1_1, (String)"event");
        if (Class1194.Method4807().objectMouseOver == null) {
            return;
        }
        var2_2 = Class1194.Method4807().objectMouseOver;
        v0 = var2_2.typeOfHit;
        if (v0 == null) ** GOTO lbl-1000
        switch (Class2092.Field17546[v0.ordinal()]) {
            case 1: {
                v1 = this.Field13401;
                Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"entities");
                if (v1.Method365()) {
                    v2 = var2_2.entityHit;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"hitObject.entityHit");
                    v3 = v2.getEntityBoundingBox();
                    break;
                }
                v3 = null;
                break;
            }
            case 2: {
                v4 = Class1194.Method4807().world;
                v5 = var2_2;
                Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"hitObject");
                v6 = v4.getBlockState(v5.getBlockPos()).getSelectedBoundingBox((World)Class1194.Method4807().world, var2_2.getBlockPos());
                Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"mc.world.getBlockState(h\u2026orld, hitObject.blockPos)");
                v3 = Class1934.Field16968.Method6696(v6).Method7190();
                break;
            }
            default: lbl-1000:
            // 2 sources

            {
                v3 = this.Field13410 = null;
            }
        }
        if (var2_2.typeOfHit == RayTraceResult.Type.ENTITY) {
            v7 = Class1194.Method4807().renderViewEntity;
            if (v7 == null) {
                v7 = (Entity)Class1194.Method4807().player;
            }
            var3_3 = v7;
            var4_4 /* !! */  = var3_3.getPositionEyes(var1_1.getPartialTicks());
            v8 = var2_2.entityHit;
            if (v8 == null) return;
            var5_5 = v8;
            v9 = var3_3;
            Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"viewEntity");
            var6_6 /* !! */  = v9.getLookVec();
            var7_7 = var4_4 /* !! */ .add(var6_6 /* !! */ .scale(Double.longBitsToDouble(4618441417868443648L)));
            v10 = var5_5.getEntityBoundingBox().calculateIntercept(var4_4 /* !! */ , (Vec3d)var7_7);
            v11 = v10;
            if (v10 == null) return;
            v12 = v11.sideHit;
            v11 = v12;
            if (v12 == null) return;
        } else {
            v11 = this.Field13411 = var2_2.sideHit;
        }
        if (this.Field13403.Method3791()) {
            v13 = this.Field13402;
            Intrinsics.checkExpressionValueIsNotNull((Object)v13, (String)"hitSideOnly");
            this.Field13409.Method4271(this.Field13410, v13.Method365() != false ? this.Field13411 : null, this.Field13403);
        }
        if (this.Field13410 == null) return;
        v14 = this.Field13405;
        Intrinsics.checkExpressionValueIsNotNull((Object)v14, (String)"crystalInfo");
        if (v14.Method365() == false) return;
        if (var2_2.typeOfHit != RayTraceResult.Type.BLOCK) return;
        v15 = this.Field13408;
        Intrinsics.checkExpressionValueIsNotNull((Object)v15, (String)"crystalInfoTargetRange");
        var3_3 = Class394.Method1924(v15.Method368());
        v16 = new StringBuilder();
        var5_5 = StringCompanionObject.INSTANCE;
        var6_6 /* !! */  = "%.1f";
        v17 = new Object[1];
        v18 = this.Field13407;
        Intrinsics.checkExpressionValueIsNotNull((Object)v18, (String)"crystalInfoTerrain");
        v19 = v18.Method365();
        v20 = var2_2;
        Intrinsics.checkExpressionValueIsNotNull((Object)v20, (String)"hitObject");
        v21 = v20.getBlockPos();
        Intrinsics.checkExpressionValueIsNotNull((Object)v21, (String)"hitObject.blockPos");
        v17[0] = Float.valueOf(Class1955.Field17021.Method6689(v19, v21));
        var7_7 = v17;
        var9_8 = v16;
        var8_9 = false;
        v22 = String.format((String)var6_6 /* !! */ , Arrays.copyOf(var7_7, var7_7.length));
        Intrinsics.checkExpressionValueIsNotNull((Object)v22, (String)"java.lang.String.format(format, *args)");
        var10_10 = v22;
        v23 = var9_8.append(var10_10).append('/');
        if (var3_3 != null) {
            var5_5 = StringCompanionObject.INSTANCE;
            var6_6 /* !! */  = "%.1f";
            v24 = new Object[1];
            v25 = this.Field13407;
            Intrinsics.checkExpressionValueIsNotNull((Object)v25, (String)"crystalInfoTerrain");
            v26 = v25.Method365();
            v27 = var2_2.getBlockPos();
            Intrinsics.checkExpressionValueIsNotNull((Object)v27, (String)"hitObject.blockPos");
            v24[0] = Float.valueOf(Class1955.Field17021.Method6688(var3_3, v26, v27));
            var7_7 = v24;
            var9_8 = v23;
            var8_9 = false;
            v28 = String.format((String)var6_6 /* !! */ , Arrays.copyOf(var7_7, var7_7.length));
            Intrinsics.checkExpressionValueIsNotNull((Object)v28, (String)"java.lang.String.format(format, *args)");
            var10_10 = v28;
            v23 = var9_8;
            v29 = var10_10;
        } else {
            v29 = "0.0";
        }
        var4_4 /* !! */  = v23.append(v29).toString();
        v30 = var2_2.getBlockPos();
        Intrinsics.checkExpressionValueIsNotNull((Object)v30, (String)"hitObject.blockPos");
        v31 = this.Field13406;
        Intrinsics.checkExpressionValueIsNotNull((Object)v31, (String)"crystalInfoColor");
        v32 = v31.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)v32, (String)"crystalInfoColor.colour");
        new Class1366((String)var4_4 /* !! */ , v30, v32).Method1186(var1_1.getPartialTicks());
    }

    public void Method20() {
        Class44 class44 = this.Field13402;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"hitSideOnly");
        this.Field13409.Method4271(this.Field13410, class44.Method365() ? this.Field13411 : null, this.Field13403);
    }

    public Class1194() {
        super("BlockHighlight", "Highlights object you are looking at", Class97.Field8342);
        Class44 class44 = new Class44("Crystal Info Color", (Class42)this, "Crystal Info Color", new Class2027(255, 255, 255, 255)).Method313(new Class37(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Crystal Info Co\u2026 crystalInfo.valBoolean }");
        this.Field13406 = this.Method23(this.Field13404.Method7405(class44));
        Class44 class442 = new Class44("Crystal Info Terrain", (Class42)this, false).Method313(new Class1656(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Crystal Info Te\u2026 crystalInfo.valBoolean }");
        this.Field13407 = this.Method23(this.Field13404.Method7405(class442));
        Class44 class443 = new Class44("Crystal Info Target Range", (Class42)this, Double.longBitsToDouble(4624633867356078080L), 0.0, Double.longBitsToDouble(0x4034000000000000L), true).Method313(new Class802(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Crystal Info Ta\u2026 crystalInfo.valBoolean }");
        this.Field13408 = this.Method23(this.Field13404.Method7405(class443));
        this.Field13409 = new Class1044();
        Field13412 = this;
    }

    static {
        Field13413 = new Class43(null);
    }

    public static final Minecraft Method4807() {
        return Class42.Field8052;
    }

    public static final void Method4808(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method4809(Class1194 class1194) {
        return class1194.Field13405;
    }

    public static final Class1194 Method4810() {
        return Field13412;
    }

    public static final void Method4811(Class1194 class1194) {
        Field13412 = class1194;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 191;
            cArray2[n] = (char)(cArray[n] ^ (0x5C61 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

