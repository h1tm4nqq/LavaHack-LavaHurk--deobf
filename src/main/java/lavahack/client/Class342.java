//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraftforge.client.event.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.entity.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\u0019\u001aB\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0017H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u001b" }, d2 = { "Lcom/kisman/cc/features/module/render/Trails;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "delay", "fade", "fadeDelay", "lineWidth", "positions", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/render/Trails$Trace;", "Lkotlin/collections/ArrayList;", "timer", "Lcom/kisman/cc/util/TimerUtils;", "trace", "onEnable", "", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "render", "Lcom/kisman/cc/features/module/render/Trails$TracePos;", "Companion", "Trace", "TracePos", "kisman.cc" })
public final class Class342 extends Class42
{
    private final Class44 Field9411;
    private final Class44 Field9412;
    private final Class44 Field9413;
    private final Class44 Field9414;
    private final Class44 Field9415;
    private final Class650 Field9416;
    private final ArrayList Field9417;
    private Class487 Field9418;
    @NotNull
    private static final Vec3d Field9419;
    public static final Class1880 Field9420;
    private String Field9421 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method38() {
        super.Method38();
        this.Field9416.Method2801();
        this.Field9417.clear();
        this.Field9418 = null;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method1680(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        final Class650 field9416 = this.Field9416;
        final Class44 field9417 = this.Field9412;
        Intrinsics.checkExpressionValueIsNotNull((Object)field9417, "delay");
        if (field9416.Method2797(field9417.Method369())) {
            final EntityPlayerSP player = Method1682().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            final Vec3d getPositionVector = player.getPositionVector();
            if (this.Field9418 == null) {
                final int n = 0;
                final String s = null;
                final WorldProvider provider = Method1682().world.provider;
                Intrinsics.checkExpressionValueIsNotNull((Object)provider, "mc.world.provider");
                final DimensionType getDimensionType = provider.getDimensionType();
                Intrinsics.checkExpressionValueIsNotNull((Object)getDimensionType, "mc.world.provider.dimensionType");
                final Vec3d vec3d = getPositionVector;
                Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, "vec");
                this.Field9418 = new Class487(n, s, getDimensionType, vec3d, new ArrayList());
            }
            final Class487 field9418 = this.Field9418;
            if (field9418 == null) {
                Intrinsics.throwNpe();
            }
            final ArrayList method2257 = field9418.Method2257();
            final Vec3d vec3d2 = method2257.isEmpty() ? getPositionVector : method2257.get(method2257.size() - 1).Method3222();
            if (!((ArrayList<Class773>)method2257).isEmpty()) {}
            if (method2257.isEmpty() || !getPositionVector.equals((Object)vec3d2)) {
                final ArrayList<Class773> list = (ArrayList<Class773>)method2257;
                final Vec3d vec3d3 = getPositionVector;
                Intrinsics.checkExpressionValueIsNotNull((Object)vec3d3, "vec");
                final long currentTimeMillis = System.currentTimeMillis();
                final Class44 field9419 = this.Field9414;
                Intrinsics.checkExpressionValueIsNotNull((Object)field9419, "fadeDelay");
                list.add(new Class773(vec3d3, currentTimeMillis + field9419.Method335()));
            }
            this.Field9416.Method2801();
        }
        if (this.Field9418 != null) {
            Class815.Method3433();
            final Class44 field9420 = this.Field9415;
            Intrinsics.checkExpressionValueIsNotNull((Object)field9420, "lineWidth");
            GL11.glLineWidth(field9420.Method368());
            for (final Class487 class487 : this.Field9417) {
                GL11.glBegin(3);
                for (final Class773 class488 : class487.Method2257()) {
                    Intrinsics.checkExpressionValueIsNotNull((Object)class488, "tr");
                    this.Method1681(class488);
                }
                GL11.glEnd();
                final Class44 field9421 = this.Field9413;
                Intrinsics.checkExpressionValueIsNotNull((Object)field9421, "fade");
                if (field9421.Method365()) {
                    class487.Method2257().removeIf((Predicate)Class1305.Field13967);
                }
            }
            GL11.glBegin(3);
            final Class487 field9422 = this.Field9418;
            final ArrayList list2 = (field9422 != null) ? field9422.Method2257() : null;
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            for (final Class773 class489 : list2) {
                Intrinsics.checkExpressionValueIsNotNull((Object)class489, "tr");
                this.Method1681(class489);
            }
            final Class44 field9423 = this.Field9413;
            Intrinsics.checkExpressionValueIsNotNull((Object)field9423, "fade");
            if (field9423.Method365()) {
                final Class487 field9424 = this.Field9418;
                final ArrayList list3 = (field9424 != null) ? field9424.Method2257() : null;
                if (list3 == null) {
                    Intrinsics.throwNpe();
                }
                list3.removeIf(Class563.Field10398);
            }
            GL11.glEnd();
            Class815.Method3434();
        }
    }
    
    private final void Method1681(final Class773 class773) {
        final Class44 field9413 = this.Field9413;
        Intrinsics.checkExpressionValueIsNotNull((Object)field9413, "fade");
        float field9419;
        if (field9413.Method365()) {
            final Class44 field9414 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)field9414, "color");
            final float field9415 = field9414.Method339().Field17328;
            final Class44 field9416 = this.Field9414;
            Intrinsics.checkExpressionValueIsNotNull((Object)field9416, "fadeDelay");
            final float n = field9415 / field9416.Method335() * (class773.Method3224() - System.currentTimeMillis());
            final float n2 = 0.0f;
            final Class44 field9417 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)field9417, "color");
            final float clamp = MathHelper.clamp(n, n2, field9417.Method339().Field17327);
            final Class44 field9418 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)field9418, "color");
            field9419 = clamp / field9418.Method339().Field17327;
        }
        else {
            final Class44 field9420 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)field9420, "color");
            field9419 = field9420.Method339().Field17328;
        }
        final float n3 = field9419;
        final Class44 field9421 = this.Field9411;
        Intrinsics.checkExpressionValueIsNotNull((Object)field9421, "color");
        final float field9422 = field9421.Method339().Field17325;
        final Class44 field9423 = this.Field9411;
        Intrinsics.checkExpressionValueIsNotNull((Object)field9423, "color");
        final float field9424 = field9423.Method339().Field17326;
        final Class44 field9425 = this.Field9411;
        Intrinsics.checkExpressionValueIsNotNull((Object)field9425, "color");
        GL11.glColor4f(field9422, field9424, field9425.Method339().Field17327, n3);
        GL11.glVertex3d(class773.Method3222().x - Method1682().renderManager.renderPosX, class773.Method3222().y - Method1682().renderManager.renderPosY, class773.Method3222().z - Method1682().renderManager.renderPosZ);
    }
    
    public Class342() {
        super("Trails", "nice", Class97.Field8342);
        this.Field9411 = this.Method23(new Class44("Color", this, new Class2027(255, 255, 255, 255)));
        this.Field9412 = this.Method23(new Class44("Delay", this, Double.longBitsToDouble((long)728799967 ^ 0x402400002B709ADFL), 1.0, Double.longBitsToDouble((long)1521765716 ^ 0x408F40005AB44D54L), Class467.Field9943));
        this.Field9413 = this.Method23(new Class44("Fade", this, true));
        this.Field9414 = this.Method23(new Class44("Fade Delay", this, Double.longBitsToDouble(4647503709213818880L), Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4666723172467343360L), Class467.Field9943).Method313((Supplier)new Class334(this)));
        this.Field9415 = this.Method23(new Class44("Line Width", this, 1.0, Double.longBitsToDouble((long)2142244066 ^ 0x3FB99999E6299578L), Double.longBitsToDouble((long)1666183002 ^ 0x40140000634FEF5AL), false));
        this.Field9416 = new Class650();
        this.Field9417 = new ArrayList();
    }
    
    static {
        Field9420 = new Class1880((DefaultConstructorMarker)null);
        Field9419 = new Vec3d(Double.longBitsToDouble(4620693217682128896L), Double.longBitsToDouble((long)716096434 ^ 0x405000002AAEC3B2L), Double.longBitsToDouble(4620693217682128896L));
    }
    
    public static final Minecraft Method1682() {
        return Class42.Field8052;
    }
    
    public static final void Method1683(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method1684(final Class342 class342) {
        return class342.Field9413;
    }
    
    public static final Vec3d Method1685() {
        return Class342.Field9419;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4052 ^ 0x4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
