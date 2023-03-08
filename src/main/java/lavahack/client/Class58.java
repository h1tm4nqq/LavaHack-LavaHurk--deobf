//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import kotlin.collections.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraftforge.fml.common.eventhandler.*;
import com.kisman.cc.util.*;
import kotlin.*;
import java.awt.*;
import net.minecraft.client.*;

@Class1887
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u001bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000RJ\u0010\f\u001a>\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\rj\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011`\u0012X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000?\u0006!" }, d2 = { "Lcom/kisman/cc/features/module/render/PearlTracer;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "colorVal", "Lcom/kisman/cc/settings/Setting;", "depth", "gradient", "gradientDiff", "lineWidth", "map", "Ljava/util/HashMap;", "Lnet/minecraft/entity/item/EntityEnderPearl;", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/render/PearlTracer$VectorWithTimer;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "removeTime", "test1", "test2", "getColour", "Lcom/kisman/cc/util/Colour;", "index", "", "onEnable", "", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "update", "VectorWithTimer", "kisman.cc" })
public final class Class58 extends Class42
{
    private final Class44 Field8182;
    private final Class44 Field8183;
    private final Class44 Field8184;
    private final Class44 Field8185;
    private final Class44 Field8186;
    private final Class1996 Field8187;
    private final Class44 Field8188;
    private final Class44 Field8189;
    private final Class44 Field8190;
    private final HashMap Field8191;
    private int Field8192;
    
    public void Method38() {
        super.Method38();
        this.Field8191.clear();
    }
    
    public void Method45() {
        if (Method490().world == null) {
            if (!this.Field8191.isEmpty()) {}
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method488(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        for (final Entity entity : Method490().world.loadedEntityList) {
            if (entity instanceof EntityEnderPearl) {
                System.out.println((Object)"adding ender pearl");
                if (this.Field8191.containsKey(entity)) {
                    final ArrayList<Object> list = this.Field8191.get(entity);
                    if (list == null) {
                        continue;
                    }
                    final Vec3d getPositionVector = ((EntityEnderPearl)entity).getPositionVector();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getPositionVector, "entity.positionVector");
                    list.add(new Class1445(getPositionVector));
                }
                else {
                    final HashMap hashMap = this.Field8191;
                    final Vec3d getPositionVector2 = ((EntityEnderPearl)entity).getPositionVector();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getPositionVector2, "entity.positionVector");
                    hashMap.put(entity, new ArrayList(CollectionsKt.listOf((Object)new Class1445(getPositionVector2))));
                }
            }
        }
        final HashSet<EntityEnderPearl> set = new HashSet<EntityEnderPearl>();
        for (final EntityEnderPearl entityEnderPearl : this.Field8191.keySet()) {
            final Object value = this.Field8191.get(entityEnderPearl);
            if (value == null) {
                Intrinsics.throwNpe();
            }
            if (((ArrayList)value).isEmpty()) {
                set.add(entityEnderPearl);
            }
            final HashSet<Class1445> set2 = new HashSet<Class1445>();
            final Object value2 = this.Field8191.get(entityEnderPearl);
            if (value2 == null) {
                Intrinsics.throwNpe();
            }
            for (final Class1445 e : (ArrayList<Class1445>)value2) {
                final Class650 method5767 = e.Method5767();
                final Class44 field8186 = this.Field8186;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8186, "removeTime");
                if (method5767.Method2797(field8186.Method369())) {
                    System.out.println((Object)"removing vector");
                    set2.add(e);
                }
            }
            final Object value3 = this.Field8191.get(entityEnderPearl);
            if (value3 == null) {
                Intrinsics.throwNpe();
            }
            ((ArrayList)value3).removeAll(set2);
        }
        final Iterator<EntityEnderPearl> iterator4 = set.iterator();
        while (iterator4.hasNext()) {
            this.Field8191.remove(iterator4.next());
        }
        double n = Method490().renderManager.viewerPosX;
        double n2 = Method490().renderManager.viewerPosY;
        double n3 = Method490().renderManager.viewerPosZ;
        final Class44 field8187 = this.Field8183;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8187, "test2");
        if (field8187.Method365()) {
            n = Method490().renderManager.renderPosX;
            n2 = Method490().renderManager.renderPosY;
            n3 = Method490().renderManager.renderPosZ;
        }
        GL11.glPushMatrix();
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glDisable(2929);
        GL11.glDisable(2884);
        final Class44 field8188 = this.Field8184;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8188, "depth");
        GL11.glDepthMask(field8188.Method365());
        final Class44 field8189 = this.Field8182;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8189, "test1");
        if (field8189.Method365()) {
            Method490().entityRenderer.disableLightmap();
        }
        final Class44 field8190 = this.Field8185;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8190, "lineWidth");
        GL11.glLineWidth(field8190.Method368());
        GlStateManager.resetColor();
        GL11.glBegin(1);
        for (final EntityEnderPearl key : this.Field8191.keySet()) {
            GL11.glBegin(1);
            int index = 1;
            final Object value4 = this.Field8191.get(key);
            if (value4 == null) {
                Intrinsics.throwNpe();
            }
            final int size = ((ArrayList)value4).size();
            if (index <= size) {
                while (true) {
                    final Object value5 = this.Field8191.get(key);
                    if (value5 == null) {
                        Intrinsics.throwNpe();
                    }
                    final Object value6 = ((ArrayList<Object>)value5).get(index);
                    Intrinsics.checkExpressionValueIsNotNull(value6, "map[key]!![index]");
                    final Class1445 class1445 = (Class1445)value6;
                    final Object value7 = this.Field8191.get(key);
                    if (value7 == null) {
                        Intrinsics.throwNpe();
                    }
                    final Object value8 = ((ArrayList<Object>)value7).get(index - 1);
                    Intrinsics.checkExpressionValueIsNotNull(value8, "map[key]!![index - 1]");
                    final Class1445 class1446 = (Class1445)value8;
                    Class1393.Method5505().Method1886(new StringBuilder().append(class1445.Method5768().x).append(' ').append(class1445.Method5768().y).append(' ').append(class1445.Method5768().z).toString());
                    this.Method489(index).Method3632();
                    GL11.glVertex3d(class1445.Method5768().x - n, class1445.Method5768().y - n2, class1445.Method5768().z - n3);
                    GL11.glVertex3d(class1446.Method5768().x - n, class1446.Method5768().y - n2, class1446.Method5768().z - n3);
                    if (index == size) {
                        break;
                    }
                    ++index;
                }
            }
            GL11.glEnd();
        }
        GL11.glDisable(3042);
        GL11.glEnable(3553);
        final Class44 field8191 = this.Field8184;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8191, "depth");
        GL11.glDepthMask(!field8191.Method365());
        GL11.glDisable(2848);
        GL11.glPopMatrix();
    }
    
    private final Class2027 Method489(final int n) {
        final Class44 field8188 = this.Field8188;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8188, "gradient");
        final Enum method341 = field8188.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.GradientModes");
        }
        Class2027 method342 = null;
        switch (Class833.Field11549[((Class2075)method341).ordinal()]) {
            case 1: {
                final Class44 field8189 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8189, "colorVal");
                Intrinsics.checkExpressionValueIsNotNull((Object)(method342 = field8189.Method339()), "colorVal.colour");
                break;
            }
            case 2: {
                final Color method343;
                final Class2027 method344;
                method342 = new Class2027(Class1172.Method4728(method343, method344.Method3631()));
                final Class44 field8190 = this.Field8189;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8190, "gradientDiff");
                final int n2 = n * field8190.Method335();
                final Class44 field8191 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8191, "colorVal");
                final Class2027 method345 = field8191.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method345, "colorVal.colour");
                final float method346 = method345.Method3621();
                final Class44 field8192 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8192, "colorVal");
                final Class2027 method347 = field8192.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method347, "colorVal.colour");
                method343 = Class1172.Method4720(n2, method346, method347.Method3622());
                final Class44 field8193 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8193, "colorVal");
                method344 = field8193.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method344, "colorVal.colour");
                break;
            }
            case 3: {
                final int method348;
                final Class2027 method349;
                method342 = new Class2027(Class1172.Method4729(method348, method349.Method3631()));
                final Class44 field8194 = this.Field8189;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8194, "gradientDiff");
                method348 = Class1172.Method4707(n * field8194.Method335());
                final Class44 field8195 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8195, "colorVal");
                method349 = field8195.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method349, "colorVal.colour");
                break;
            }
            case 4: {
                final Color method350;
                final Class2027 method351;
                method342 = new Class2027(Class1172.Method4728(method350, method351.Method3631()));
                final Class44 field8196 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8196, "colorVal");
                final Class2027 method352 = field8196.Method339();
                final Class44 field8197 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8197, "colorVal");
                final Class2027 method353 = field8197.Method339().Method3611(Float.intBitsToFloat(1048576000));
                final Class44 field8198 = this.Field8189;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8198, "gradientDiff");
                final Class2027 method354 = Class1172.Method4705(method352, method353, (double)(n * field8198.Method335()));
                Intrinsics.checkExpressionValueIsNotNull((Object)method354, "ColorUtils.twoColorEffec\u2026tDiff.valInt).toDouble())");
                method350 = method354.Method3625();
                final Class44 field8199 = this.Field8190;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8199, "colorVal");
                method351 = field8199.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method351, "colorVal.colour");
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return method342;
    }
    
    public Class58() {
        super("PearlTracer", "Sure?", Class97.Field8342);
        this.Field8182 = this.Method23(new Class44("Test 1", (Class42)this, false));
        this.Field8183 = this.Method23(new Class44("Test 2", (Class42)this, false));
        this.Field8184 = this.Method23(new Class44("Depth", (Class42)this, false));
        this.Field8185 = this.Method23(new Class44("Line Width", (Class42)this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4617315517961601024L), false));
        this.Field8186 = this.Method23(new Class44("Remove Time", (Class42)this, Double.longBitsToDouble(4652007308841189376L), Double.longBitsToDouble((long)53096632 ^ 0x40590000032A30B8L), Double.longBitsToDouble((long)1738552090 ^ 0x40B3880067A0331AL), Class467.Field9943));
        this.Field8187 = this.Method24(new Class1996(new Class44("Color", (Class42)this)));
        this.Field8188 = this.Method23(this.Field8187.Method7405(new Class44("Gradient", (Class42)this, (Enum)Class2075.Field17489)));
        this.Field8189 = this.Method23(this.Field8187.Method7405(new Class44("Diff", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)470005118 ^ 0x408F40001C03B57EL), Class467.Field9943)));
        this.Field8190 = this.Method23(this.Field8187.Method7405(new Class44("Color", (Class42)this, "Color", new Class2027(-1))));
        this.Field8191 = new HashMap();
    }
    
    public static final Minecraft Method490() {
        return Class42.Field8052;
    }
    
    public static final void Method491(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x186B ^ 0x73));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
