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

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class650;
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
import lavahack.client.Class1172;
import lavahack.client.Class1393;
import lavahack.client.Class1445;
import lavahack.client.Class1887;
import lavahack.client.Class1996;
import lavahack.client.Class2075;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class833;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Class1887
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u001bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000RJ\u0010\f\u001a>\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\rj\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011`\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2={"Lcom/kisman/cc/features/module/render/PearlTracer;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "colorVal", "Lcom/kisman/cc/settings/Setting;", "depth", "gradient", "gradientDiff", "lineWidth", "map", "Ljava/util/HashMap;", "Lnet/minecraft/entity/item/EntityEnderPearl;", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/render/PearlTracer$VectorWithTimer;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "removeTime", "test1", "test2", "getColour", "Lcom/kisman/cc/util/Colour;", "index", "", "onEnable", "", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "update", "VectorWithTimer", "kisman.cc"})
public final class Class58
extends Class42 {
    private final Class44 Field8182 = this.Method23(new Class44("Test 1", (Class42)this, false));
    private final Class44 Field8183 = this.Method23(new Class44("Test 2", (Class42)this, false));
    private final Class44 Field8184 = this.Method23(new Class44("Depth", (Class42)this, false));
    private final Class44 Field8185 = this.Method23(new Class44("Line Width", (Class42)this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(0x4014000000000000L), false));
    private final Class44 Field8186 = this.Method23(new Class44("Remove Time", (Class42)this, Double.longBitsToDouble(4652007308841189376L), Double.longBitsToDouble((long)53096632 ^ 0x40590000032A30B8L), Double.longBitsToDouble((long)1738552090 ^ 0x40B3880067A0331AL), Class467.Field9943));
    private final Class1996 Field8187 = this.Method24(new Class1996(new Class44("Color", this)));
    private final Class44 Field8188 = this.Method23(this.Field8187.Method7405(new Class44("Gradient", (Class42)this, Class2075.Field17489)));
    private final Class44 Field8189 = this.Method23(this.Field8187.Method7405(new Class44("Diff", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)470005118 ^ 0x408F40001C03B57EL), Class467.Field9943)));
    private final Class44 Field8190 = this.Method23(this.Field8187.Method7405(new Class44("Color", (Class42)this, "Color", new Class2027(-1))));
    private final HashMap Field8191 = new HashMap();
    private int Field8192;

    @Override
    public void Method38() {
        super.Method38();
        this.Field8191.clear();
    }

    @Override
    public void Method45() {
        if (Class58.Method490().world != null) return;
        Map map = this.Field8191;
        boolean bl = false;
        if (map.isEmpty()) return;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method488(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Object object;
        Object object22;
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        for (Object object22 : Class58.Method490().world.loadedEntityList) {
            if (!(object22 instanceof EntityEnderPearl)) continue;
            object = "adding ender pearl";
            boolean bl = false;
            System.out.println(object);
            if (this.Field8191.containsKey(object22)) {
                ArrayList arrayList = (ArrayList)this.Field8191.get(object22);
                if (arrayList == null) continue;
                Vec3d vec3d = ((EntityEnderPearl)object22).getPositionVector();
                Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"entity.positionVector");
                arrayList.add(new Class1445(vec3d));
                continue;
            }
            object = this.Field8191;
            Vec3d vec3d = ((EntityEnderPearl)object22).getPositionVector();
            Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"entity.positionVector");
            ArrayList arrayList = new ArrayList(CollectionsKt.listOf((Object)new Class1445(vec3d)));
            boolean bl2 = false;
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
            HashSet<Class1445> hashSet = new HashSet<Class1445>();
            Object v2 = this.Field8191.get(entityEnderPearl);
            if (v2 == null) {
                Intrinsics.throwNpe();
            }
            for (Class1445 class1445 : (ArrayList)v2) {
                Class650 class650 = class1445.Method5767();
                Class44 class44 = this.Field8186;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"removeTime");
                if (!class650.Method2797(class44.Method369())) continue;
                String string = "removing vector";
                boolean bl = false;
                System.out.println((Object)string);
                hashSet.add(class1445);
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
        double d = Class58.Method490().renderManager.viewerPosX;
        double d2 = Class58.Method490().renderManager.viewerPosY;
        double d3 = Class58.Method490().renderManager.viewerPosZ;
        Class44 class44 = this.Field8183;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"test2");
        if (class44.Method365()) {
            d = Class58.Method490().renderManager.renderPosX;
            d2 = Class58.Method490().renderManager.renderPosY;
            d3 = Class58.Method490().renderManager.renderPosZ;
        }
        GL11.glPushMatrix();
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)2884);
        Class44 class442 = this.Field8184;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"depth");
        GL11.glDepthMask((boolean)class442.Method365());
        Class44 class443 = this.Field8182;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"test1");
        if (class443.Method365()) {
            Class58.Method490().entityRenderer.disableLightmap();
        }
        Class44 class444 = this.Field8185;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"lineWidth");
        GL11.glLineWidth((float)class444.Method368());
        GlStateManager.resetColor();
        GL11.glBegin((int)1);
        for (EntityEnderPearl entityEnderPearl : this.Field8191.keySet()) {
            int n;
            GL11.glBegin((int)1);
            int n2 = 1;
            Object v = this.Field8191.get(entityEnderPearl);
            if (v == null) {
                Intrinsics.throwNpe();
            }
            if (n2 <= (n = ((ArrayList)v).size())) {
                while (true) {
                    Object v4 = this.Field8191.get(entityEnderPearl);
                    if (v4 == null) {
                        Intrinsics.throwNpe();
                    }
                    Object e = ((ArrayList)v4).get(n2);
                    Intrinsics.checkExpressionValueIsNotNull(e, (String)"map[key]!![index]");
                    Class1445 class1445 = (Class1445)e;
                    Object v5 = this.Field8191.get(entityEnderPearl);
                    if (v5 == null) {
                        Intrinsics.throwNpe();
                    }
                    Object e2 = ((ArrayList)v5).get(n2 - 1);
                    Intrinsics.checkExpressionValueIsNotNull(e2, (String)"map[key]!![index - 1]");
                    Class1445 class14452 = (Class1445)e2;
                    Class1393.Method5505().Method1886("" + class1445.Method5768().x + ' ' + class1445.Method5768().y + ' ' + class1445.Method5768().z);
                    this.Method489(n2).Method3632();
                    GL11.glVertex3d((double)(class1445.Method5768().x - d), (double)(class1445.Method5768().y - d2), (double)(class1445.Method5768().z - d3));
                    GL11.glVertex3d((double)(class14452.Method5768().x - d), (double)(class14452.Method5768().y - d2), (double)(class14452.Method5768().z - d3));
                    if (n2 == n) break;
                    ++n2;
                }
            }
            GL11.glEnd();
        }
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        Class44 class445 = this.Field8184;
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"depth");
        GL11.glDepthMask((!class445.Method365() ? 1 : 0) != 0);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
    }

    private final Class2027 Method489(int n) {
        Class44 class44 = this.Field8188;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"gradient");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.GradientModes");
        }
        switch (Class833.Field11549[((Class2075)enum_).ordinal()]) {
            case 1: {
                Class44 class442 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"colorVal");
                Class2027 class2027 = class442.Method339();
                Class2027 class20272 = class2027;
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"colorVal.colour");
                return class20272;
            }
            case 2: {
                Class44 class443 = this.Field8189;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"gradientDiff");
                int n2 = n * class443.Method335();
                Class44 class444 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"colorVal");
                Class2027 class2027 = class444.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"colorVal.colour");
                float f = class2027.Method3621();
                Class44 class445 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"colorVal");
                Class2027 class20273 = class445.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"colorVal.colour");
                Color color = Class1172.Method4720(n2, f, class20273.Method3622());
                Class44 class446 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"colorVal");
                Class2027 class20274 = class446.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class20274, (String)"colorVal.colour");
                Class2027 class20272 = new Class2027(Class1172.Method4728(color, class20274.Method3631()));
                return class20272;
            }
            case 3: {
                Class44 class447 = this.Field8189;
                Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"gradientDiff");
                int n3 = Class1172.Method4707(n * class447.Method335());
                Class44 class448 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"colorVal");
                Class2027 class2027 = class448.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"colorVal.colour");
                Class2027 class20272 = new Class2027(Class1172.Method4729(n3, class2027.Method3631()));
                return class20272;
            }
            case 4: {
                Class44 class449 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"colorVal");
                Class2027 class2027 = class449.Method339();
                Class44 class4410 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"colorVal");
                Class2027 class20275 = class4410.Method339().Method3611(Float.intBitsToFloat(1048576000));
                Class44 class4411 = this.Field8189;
                Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"gradientDiff");
                Class2027 class20276 = Class1172.Method4705(class2027, class20275, n * class4411.Method335());
                Intrinsics.checkExpressionValueIsNotNull((Object)class20276, (String)"ColorUtils.twoColorEffec\u2026tDiff.valInt).toDouble())");
                Color color = class20276.Method3625();
                Class44 class4412 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)class4412, (String)"colorVal");
                Class2027 class20277 = class4412.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class20277, (String)"colorVal.colour");
                Class2027 class20272 = new Class2027(Class1172.Method4728(color, class20277.Method3631()));
                return class20272;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    public Class58() {
        super("PearlTracer", "Sure?", Class97.Field8342);
    }

    public static final Minecraft Method490() {
        return Class42.Field8052;
    }

    public static final void Method491(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 115;
            cArray2[n] = (char)(cArray[n] ^ (0x186B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

