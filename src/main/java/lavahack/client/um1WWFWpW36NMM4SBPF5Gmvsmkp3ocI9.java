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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.c329TsrwyQaghkrpEAKnYsAuVtEEsCMs;
import lavahack.client.cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.sSA8equmau5k5lLGsxcam9ZvHFAVwtnx;
import lavahack.client.tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg8;
import lavahack.client.um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.yyudEpjUiGZaElZMrUcgZH8OIB4Fn8JN;
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
public final class um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J
implements c329TsrwyQaghkrpEAKnYsAuVtEEsCMs {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13401 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entities", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)797769918L ^ 0x2F8D00BE) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13402 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hit Side Only", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)319356335 ^ (long)319356335)));
    private final cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Field13403 = new cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs(this).Method6042().Method6043();
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13404 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crystal Info", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13405 = this.Method23(this.Field13404.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crystal Info", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1151653974 ^ (long)1151653974))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13406;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13407;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13408;
    private final um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field13409;
    private AxisAlignedBB Field13410;
    private EnumFacing Field13411;
    @Nullable
    private static um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9 Field13412;
    public static final um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13413;
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
        if (um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9.Method4807().objectMouseOver == null) {
            return;
        }
        var2_2 = um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9.Method4807().objectMouseOver;
        v0 = var2_2.typeOfHit;
        if (v0 == null) ** GOTO lbl-1000
        switch (sSA8equmau5k5lLGsxcam9ZvHFAVwtnx.Field17546[v0.ordinal()]) {
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
                v4 = um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9.Method4807().world;
                v5 = var2_2;
                Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"hitObject");
                v6 = v4.getBlockState(v5.getBlockPos()).getSelectedBoundingBox((World)um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9.Method4807().world, var2_2.getBlockPos());
                Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"mc.world.getBlockState(h\u2026orld, hitObject.blockPos)");
                v3 = tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg8.Field16968.Method6696(v6).Method7190();
                break;
            }
            default: lbl-1000:
            // 2 sources

            {
                v3 = this.Field13410 = null;
            }
        }
        if (var2_2.typeOfHit == RayTraceResult.Type.ENTITY) {
            v7 = um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9.Method4807().renderViewEntity;
            if (v7 == null) {
                v7 = (Entity)um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9.Method4807().player;
            }
            var3_3 = v7;
            var4_4 /* !! */  = var3_3.getPositionEyes(var1_1.getPartialTicks());
            v8 = var2_2.entityHit;
            if (v8 == null) return;
            var5_5 = v8;
            v9 = var3_3;
            Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"viewEntity");
            var6_6 /* !! */  = v9.getLookVec();
            var7_7 = var4_4 /* !! */ .add(var6_6 /* !! */ .scale(Double.longBitsToDouble(-4009685431980725884L ^ -8628126849849169532L)));
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
        var3_3 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(v15.Method368());
        v16 = new StringBuilder();
        var5_5 = StringCompanionObject.INSTANCE;
        var6_6 /* !! */  = "%.1f";
        v17 = new Object[(int)366349959L ^ 366349958];
        v18 = (int)429287320L ^ 429287320;
        v19 = this.Field13407;
        Intrinsics.checkExpressionValueIsNotNull((Object)v19, (String)"crystalInfoTerrain");
        v20 = v19.Method365();
        v21 = var2_2;
        Intrinsics.checkExpressionValueIsNotNull((Object)v21, (String)"hitObject");
        v22 = v21.getBlockPos();
        Intrinsics.checkExpressionValueIsNotNull((Object)v22, (String)"hitObject.blockPos");
        v17[v18] = Float.valueOf(wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Field17021.Method6689(v20, v22));
        var7_7 = v17;
        var9_8 = v16;
        var8_9 = (int)((long)1945793865 ^ (long)1945793865);
        v23 = String.format((String)var6_6 /* !! */ , Arrays.copyOf(var7_7, var7_7.length));
        Intrinsics.checkExpressionValueIsNotNull((Object)v23, (String)"java.lang.String.format(format, *args)");
        var10_10 = v23;
        v24 = var9_8.append(var10_10).append((char)((int)-503119000L ^ -503119033));
        if (var3_3 != null) {
            var5_5 = StringCompanionObject.INSTANCE;
            var6_6 /* !! */  = "%.1f";
            v25 = new Object[(int)579591352L ^ 579591353];
            v26 = (int)((long)1671130740 ^ (long)1671130740);
            v27 = this.Field13407;
            Intrinsics.checkExpressionValueIsNotNull((Object)v27, (String)"crystalInfoTerrain");
            v28 = v27.Method365();
            v29 = var2_2.getBlockPos();
            Intrinsics.checkExpressionValueIsNotNull((Object)v29, (String)"hitObject.blockPos");
            v25[v26] = Float.valueOf(wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Field17021.Method6688(var3_3, v28, v29));
            var7_7 = v25;
            var9_8 = v24;
            var8_9 = (int)((long)-523377172 ^ (long)-523377172);
            v30 = String.format((String)var6_6 /* !! */ , Arrays.copyOf(var7_7, var7_7.length));
            Intrinsics.checkExpressionValueIsNotNull((Object)v30, (String)"java.lang.String.format(format, *args)");
            var10_10 = v30;
            v24 = var9_8;
            v31 = var10_10;
        } else {
            v31 = "0.0";
        }
        var4_4 /* !! */  = v24.append(v31).toString();
        v32 = var2_2.getBlockPos();
        Intrinsics.checkExpressionValueIsNotNull((Object)v32, (String)"hitObject.blockPos");
        v33 = this.Field13406;
        Intrinsics.checkExpressionValueIsNotNull((Object)v33, (String)"crystalInfoColor");
        v34 = v33.Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)v34, (String)"crystalInfoColor.colour");
        new yyudEpjUiGZaElZMrUcgZH8OIB4Fn8JN((String)var4_4 /* !! */ , v32, v34).Method1186(var1_1.getPartialTicks());
    }

    public void Method20() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13402;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"hitSideOnly");
        this.Field13409.Method4271(this.Field13410, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() ? this.Field13411 : null, this.Field13403);
    }

    public um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9() {
        super("BlockHighlight", "Highlights object you are looking at", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crystal Info Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Crystal Info Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1777304096 ^ (long)1777304287), (int)((long)-1263851700 ^ (long)-1263851597), (int)((long)1128517635 ^ (long)1128517884), (int)-1358884667L ^ 0xAF01103A)).Method313(new um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Crystal Info Co\u2026 crystalInfo.valBoolean }");
        this.Field13406 = this.Method23(this.Field13404.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crystal Info Terrain", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2055142531 ^ (long)-2055142531)).Method313(new um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Crystal Info Te\u2026 crystalInfo.valBoolean }");
        this.Field13407 = this.Method23(this.Field13404.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crystal Info Target Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xB4B0ADFDF1B983A2L ^ 0xF49EADFDF1B983A2L), 0.0, Double.longBitsToDouble(0x7B28F8C0B09B4580L ^ 0x3B1CF8C0B09B4580L), ((int)838603188L ^ 0x31FC11B5) != 0).Method313(new um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Crystal Info Ta\u2026 crystalInfo.valBoolean }");
        this.Field13408 = this.Method23(this.Field13404.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4));
        this.Field13409 = new um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$Ljc0gDTN8WkwPRHY480HpEkScGALG41A();
        Field13412 = this;
    }

    static {
        Field13413 = new um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    public static final Minecraft Method4807() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4808(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4809(um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9 um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI92) {
        return um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI92.Field13405;
    }

    public static final um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9 Method4810() {
        return Field13412;
    }

    public static final void Method4811(um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI9 um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI92) {
        Field13412 = um1WWFWpW36NMM4SBPF5Gmvsmkp3ocI92;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)484306259 ^ (long)484306259);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2106356319L ^ 0x82738D5E);
            int n2 = (int)((long)502038194 ^ (long)502038029);
            cArray2[n] = (char)(cArray[n] ^ ((int)726249696L ^ 0x2B49EC81 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

