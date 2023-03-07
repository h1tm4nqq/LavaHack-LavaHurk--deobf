//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.TypeCastException
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.item.EntityEnderPearl
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.abbi5WXwBhAC2jwfVuZJg478P13czAOh;
import lavahack.client.eGpjZ9WURaqUDHfTvGyS5cpHQw5WmYvE;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u001bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000RJ\u0010\f\u001a>\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\rj\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011`\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2={"Lcom/kisman/cc/features/module/render/PearlTracer;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "colorVal", "Lcom/kisman/cc/settings/Setting;", "depth", "gradient", "gradientDiff", "lineWidth", "map", "Ljava/util/HashMap;", "Lnet/minecraft/entity/item/EntityEnderPearl;", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/render/PearlTracer$VectorWithTimer;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "removeTime", "test1", "test2", "getColour", "Lcom/kisman/cc/util/Colour;", "index", "", "onEnable", "", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "update", "VectorWithTimer", "kisman.cc"})
public final class KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8182 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Test 1", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1738408434 ^ (long)-1738408434)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8183 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Test 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1667507865L ^ 0x63642699) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8184 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Depth", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1037384390 ^ (long)1037384390)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8185 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Line Width", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0x22349FBC03F2BC4AL ^ 0x1D8D06259A6B25D0L), Double.longBitsToDouble(0x8F765E0ABA957AF5L ^ 0xCF625E0ABA957AF5L), (boolean)((long)1222669662 ^ (long)1222669662)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8186 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Remove Time", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x1DFE1AEB61411A07L ^ 0x5D715AEB61411A07L), Double.longBitsToDouble((long)53096632 ^ 0x40590000032A30B8L), Double.longBitsToDouble((long)1738552090 ^ 0x40B3880067A0331AL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8187 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8188 = this.Method23(this.Field8187.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Gradient", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, abbi5WXwBhAC2jwfVuZJg478P13czAOh.Field17489)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8189 = this.Method23(this.Field8187.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Diff", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble((long)470005118 ^ 0x408F40001C03B57EL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8190 = this.Method23(this.Field8187.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)1425195832L ^ 0xAB0D3CC7))));
    private final HashMap Field8191 = new HashMap();
    private int Field8192;

    @Override
    public void Method38() {
        super.Method38();
        this.Field8191.clear();
    }

    @Override
    public void Method45() {
        int n;
        if (KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc.Method490().world != null) return;
        Map map = this.Field8191;
        int n2 = (int)((long)-91096008 ^ (long)-91096008);
        if (!map.isEmpty()) {
            n = (int)-1818743525L ^ 0x93982D1A;
            return;
        }
        n = (int)((long)-1180693823 ^ (long)-1180693823);
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method488(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Object object;
        Object object22;
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        for (Object object22 : KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc.Method490().world.loadedEntityList) {
            if (!(object22 instanceof EntityEnderPearl)) continue;
            object = "adding ender pearl";
            int n = (int)-2053211297L ^ 0x859E7B5F;
            System.out.println(object);
            if (this.Field8191.containsKey(object22)) {
                ArrayList arrayList = (ArrayList)this.Field8191.get(object22);
                if (arrayList == null) continue;
                Vec3d vec3d = ((EntityEnderPearl)object22).getPositionVector();
                Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"entity.positionVector");
                arrayList.add(new KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vec3d));
                continue;
            }
            object = this.Field8191;
            Vec3d vec3d = ((EntityEnderPearl)object22).getPositionVector();
            Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"entity.positionVector");
            ArrayList arrayList = new ArrayList(CollectionsKt.listOf((Object)new KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vec3d)));
            int n2 = (int)-1531091227L ^ 0xA4BD66E5;
            object.put(object22, arrayList);
        }
        object22 = new HashSet();
        for (EntityEnderPearl entityEnderPearl : this.Field8191.keySet()) {
            Object v = this.Field8191.get(entityEnderPearl);
            if (v == null) {
                Intrinsics.throwNpe();
            }
            if (((ArrayList)v).isEmpty()) {
                ((HashSet)object22).add(entityEnderPearl);
            }
            HashSet<KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi> hashSet = new HashSet<KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi>();
            Object v2 = this.Field8191.get(entityEnderPearl);
            if (v2 == null) {
                Intrinsics.throwNpe();
            }
            for (KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi : (ArrayList)v2) {
                IBONRcQCNUBg2NBpVpVQf61ykmVfU03E iBONRcQCNUBg2NBpVpVQf61ykmVfU03E = kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5767();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field8186;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"removeTime");
                if (!iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method2797(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method369())) continue;
                String string = "removing vector";
                int n = (int)960766481L ^ 0x39442211;
                System.out.println((Object)string);
                hashSet.add(kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            }
            Object v3 = this.Field8191.get(entityEnderPearl);
            if (v3 == null) {
                Intrinsics.throwNpe();
            }
            ((ArrayList)v3).removeAll((Collection)hashSet);
        }
        object = ((HashSet)object22).iterator();
        while (object.hasNext()) {
            EntityEnderPearl entityEnderPearl;
            entityEnderPearl = (EntityEnderPearl)object.next();
            this.Field8191.remove(entityEnderPearl);
        }
        double d = KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc.Method490().renderManager.viewerPosX;
        double d2 = KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc.Method490().renderManager.viewerPosY;
        double d3 = KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc.Method490().renderManager.viewerPosZ;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field8183;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"test2");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
            d = KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc.Method490().renderManager.renderPosX;
            d2 = KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc.Method490().renderManager.renderPosY;
            d3 = KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc.Method490().renderManager.renderPosZ;
        }
        GL11.glPushMatrix();
        GL11.glDisable((int)((int)((long)1991155175 ^ (long)1991151622)));
        GL11.glBlendFunc((int)(((int)74546817L ^ 0x4717F00) << 1), (int)((int)((long)-123907502 ^ (long)-123907759)));
        GL11.glEnable((int)(((int)318866705L ^ 0x130180E0) << 1));
        GL11.glDisable((int)((int)-1507959217L ^ 0xA61E553E));
        GL11.glDisable((int)((int)((long)-2076911271 ^ (long)-2076910712) << 2));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field8184;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"depth");
        GL11.glDepthMask((boolean)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365());
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field8182;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"test1");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) {
            KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc.Method490().entityRenderer.disableLightmap();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field8185;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"lineWidth");
        GL11.glLineWidth((float)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method368());
        GlStateManager.resetColor();
        GL11.glBegin((int)((int)2094948628L ^ 0x7CDE6115));
        for (EntityEnderPearl entityEnderPearl : this.Field8191.keySet()) {
            int n;
            GL11.glBegin((int)((int)((long)165683756 ^ (long)165683757)));
            int n3 = (int)1718543610L ^ 0x666EE4FB;
            Object v = this.Field8191.get(entityEnderPearl);
            if (v == null) {
                Intrinsics.throwNpe();
            }
            if (n3 <= (n = ((ArrayList)v).size())) {
                while (true) {
                    Object v4 = this.Field8191.get(entityEnderPearl);
                    if (v4 == null) {
                        Intrinsics.throwNpe();
                    }
                    Object e = ((ArrayList)v4).get(n3);
                    Intrinsics.checkExpressionValueIsNotNull(e, (String)"map[key]!![index]");
                    KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)e;
                    Object v5 = this.Field8191.get(entityEnderPearl);
                    if (v5 == null) {
                        Intrinsics.throwNpe();
                    }
                    Object e2 = ((ArrayList)v5).get(n3 - (int)((long)2009993556 ^ (long)2009993557));
                    Intrinsics.checkExpressionValueIsNotNull(e2, (String)"map[key]!![index - 1]");
                    KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = (KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)e2;
                    NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("" + kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5768().x + (((int)309494817L ^ 0x12728420) << 5) + kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5768().y + ((int)((long)138504351 ^ (long)138504350) << 5) + kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5768().z);
                    this.Method489(n3).Method3632();
                    GL11.glVertex3d((double)(kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5768().x - d), (double)(kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5768().y - d2), (double)(kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5768().z - d3));
                    GL11.glVertex3d((double)(kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method5768().x - d), (double)(kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method5768().y - d2), (double)(kpNUdBCRodPqI9gUNrNoki9SZRQpyrzc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method5768().z - d3));
                    if (n3 == n) break;
                    ++n3;
                }
            }
            GL11.glEnd();
        }
        GL11.glDisable((int)((int)((long)2059642771 ^ (long)2059641442) << 1));
        GL11.glEnable((int)((int)((long)681034088 ^ (long)681036937)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field8184;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"depth");
        GL11.glDepthMask((!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method365() ? (int)((long)-1327831273 ^ (long)-1327831274) : (int)((long)1892876082 ^ (long)1892876082)) != 0);
        GL11.glDisable((int)(((int)2139497001L ^ 0x7F862270) << 5));
        GL11.glPopMatrix();
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method489(int n) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field8188;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"gradient");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.GradientModes");
        }
        switch (eGpjZ9WURaqUDHfTvGyS5cpHQw5WmYvE.Field11549[((abbi5WXwBhAC2jwfVuZJg478P13czAOh)enum_).ordinal()]) {
            case 1: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"colorVal");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method339();
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"colorVal.colour");
                return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            }
            case 2: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field8189;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"gradientDiff");
                int n2 = n * qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method335();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"colorVal");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"colorVal.colour");
                float f = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Method3621();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"colorVal");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"colorVal.colour");
                Color color = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4720(n2, f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5.Method3622());
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"colorVal");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"colorVal.colour");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(color, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6.Method3631()));
                return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            }
            case 3: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field8189;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"gradientDiff");
                int n3 = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4707(n * qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method335());
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"colorVal");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, (String)"colorVal.colour");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4729(n3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7.Method3631()));
                return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            }
            case 4: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"colorVal");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method339();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"colorVal");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11.Method339().Method3611(Float.intBitsToFloat((int)((long)679792892 ^ (long)369414396)));
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = this.Field8189;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"gradientDiff");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10 = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4705(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9, n * qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12.Method335());
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10, (String)"ColorUtils.twoColorEffec\u2026tDiff.valInt).toDouble())");
                Color color = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10.Method3625();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13, (String)"colorVal");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11, (String)"colorVal.colour");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(color, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11.Method3631()));
                return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    public KpNUdBCRodPqI9gUNrNoki9SZRQpyrzc() {
        super("PearlTracer", "Sure?", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    public static final Minecraft Method490() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method491(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1151131063 ^ (long)1151131063);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)92547772L ^ 0x5842A43);
            int n2 = (int)((long)96796451 ^ (long)96796496);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1709841125 ^ (long)-1709834896) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

