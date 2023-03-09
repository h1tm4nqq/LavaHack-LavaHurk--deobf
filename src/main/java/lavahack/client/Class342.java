//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.DimensionType
 *  net.minecraft.world.WorldProvider
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1305;
import lavahack.client.Class1880;
import lavahack.client.Class334;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class487;
import lavahack.client.Class563;
import lavahack.client.Class773;
import lavahack.client.Class815;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0017H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2={"Lcom/kisman/cc/features/module/render/Trails;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "delay", "fade", "fadeDelay", "lineWidth", "positions", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/render/Trails$Trace;", "Lkotlin/collections/ArrayList;", "timer", "Lcom/kisman/cc/util/TimerUtils;", "trace", "onEnable", "", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "render", "Lcom/kisman/cc/features/module/render/Trails$TracePos;", "Companion", "Trace", "TracePos", "kisman.cc"})
public final class Class342
extends Class42 {
    private final Class44 Field9411 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
    private final Class44 Field9412 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble((long)728799967 ^ 0x402400002B709ADFL), 1.0, Double.longBitsToDouble((long)1521765716 ^ 0x408F40005AB44D54L), Class467.Field9943));
    private final Class44 Field9413 = this.Method23(new Class44("Fade", (Class42)this, true));
    private final Class44 Field9414 = this.Method23(new Class44("Fade Delay", (Class42)this, Double.longBitsToDouble(4647503709213818880L), Double.longBitsToDouble(0x4024000000000000L), Double.longBitsToDouble(4666723172467343360L), Class467.Field9943).Method313(new Class334(this)));
    private final Class44 Field9415 = this.Method23(new Class44("Line Width", (Class42)this, 1.0, Double.longBitsToDouble((long)2142244066 ^ 0x3FB99999E6299578L), Double.longBitsToDouble((long)1666183002 ^ 0x40140000634FEF5AL), false));
    private final Class650 Field9416 = new Class650();
    private final ArrayList Field9417 = new ArrayList();
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
    public final void Method1680(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Object object;
        Object object2;
        Iterator<Class773> iterator;
        Object object32;
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        Class44 class44 = this.Field9412;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"delay");
        if (this.Field9416.Method2797(class44.Method369())) {
            EntityPlayerSP entityPlayerSP = Class342.Method1682().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            object32 = entityPlayerSP.getPositionVector();
            if (this.Field9418 == null) {
                WorldProvider worldProvider = Class342.Method1682().world.provider;
                Intrinsics.checkExpressionValueIsNotNull((Object)worldProvider, (String)"mc.world.provider");
                DimensionType dimensionType = worldProvider.getDimensionType();
                Intrinsics.checkExpressionValueIsNotNull((Object)dimensionType, (String)"mc.world.provider.dimensionType");
                Object object4 = object32;
                Intrinsics.checkExpressionValueIsNotNull((Object)object4, (String)"vec");
                this.Field9418 = new Class487(0, null, dimensionType, (Vec3d)object4, new ArrayList());
            }
            Class487 class487 = this.Field9418;
            if (class487 == null) {
                Intrinsics.throwNpe();
            }
            object2 = ((ArrayList)((Object)(iterator = class487.Method2257()))).isEmpty() ? object32 : ((Class773)((ArrayList)((Object)iterator)).get(((ArrayList)((Object)iterator)).size() - 1)).Method3222();
            object = (Collection)((Object)iterator);
            boolean bl = false;
            boolean bl2 = !object.isEmpty();
            if (((ArrayList)((Object)iterator)).isEmpty() || !object32.equals(object2)) {
                Object object5 = object32;
                Intrinsics.checkExpressionValueIsNotNull((Object)object5, (String)"vec");
                long l = System.currentTimeMillis();
                Class44 class442 = this.Field9414;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"fadeDelay");
                ((ArrayList)((Object)iterator)).add(new Class773((Vec3d)object5, l + (long)class442.Method335()));
            }
            this.Field9416.Method2801();
        }
        if (this.Field9418 == null) return;
        Class815.Method3433();
        Class44 class443 = this.Field9415;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"lineWidth");
        GL11.glLineWidth((float)class443.Method368());
        for (Object object32 : this.Field9417) {
            GL11.glBegin((int)3);
            object = ((Class487)object32).Method2257().iterator();
            while (object.hasNext()) {
                Object object6 = object2 = (Class773)object.next();
                Intrinsics.checkExpressionValueIsNotNull((Object)object6, (String)"tr");
                this.Method1681((Class773)object6);
            }
            GL11.glEnd();
            Class44 class444 = this.Field9413;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"fade");
            if (!class444.Method365()) continue;
            ((Class487)object32).Method2257().removeIf(Class1305.Field13967);
        }
        GL11.glBegin((int)3);
        Class487 class487 = this.Field9418;
        ArrayList arrayList = class487 != null ? class487.Method2257() : null;
        if (arrayList == null) {
            Intrinsics.throwNpe();
        }
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object object7 = object32 = (Class773)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)object7, (String)"tr");
            this.Method1681((Class773)object7);
        }
        Class44 class445 = this.Field9413;
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"fade");
        if (class445.Method365()) {
            Class487 class4872 = this.Field9418;
            ArrayList arrayList2 = class4872 != null ? class4872.Method2257() : null;
            if (arrayList2 == null) {
                Intrinsics.throwNpe();
            }
            arrayList2.removeIf(Class563.Field10398);
        }
        GL11.glEnd();
        Class815.Method3434();
    }

    private final void Method1681(Class773 class773) {
        float f;
        Class44 class44 = this.Field9413;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"fade");
        if (class44.Method365()) {
            Class44 class442 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"color");
            float f2 = class442.Method339().Field17328;
            Class44 class443 = this.Field9414;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"fadeDelay");
            float f3 = f2 / (float)class443.Method335() * (float)(class773.Method3224() - System.currentTimeMillis());
            Class44 class444 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"color");
            float f4 = MathHelper.clamp((float)f3, (float)0.0f, (float)class444.Method339().Field17327);
            Class44 class445 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"color");
            f = f4 / class445.Method339().Field17327;
        } else {
            Class44 class446 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"color");
            f = class446.Method339().Field17328;
        }
        float f5 = f;
        Class44 class447 = this.Field9411;
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"color");
        float f6 = class447.Method339().Field17325;
        Class44 class448 = this.Field9411;
        Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"color");
        float f7 = class448.Method339().Field17326;
        Class44 class449 = this.Field9411;
        Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"color");
        GL11.glColor4f((float)f6, (float)f7, (float)class449.Method339().Field17327, (float)f5);
        GL11.glVertex3d((double)(class773.Method3222().x - Class342.Method1682().renderManager.renderPosX), (double)(class773.Method3222().y - Class342.Method1682().renderManager.renderPosY), (double)(class773.Method3222().z - Class342.Method1682().renderManager.renderPosZ));
    }

    public Class342() {
        super("Trails", "nice", Class97.Field8342);
    }

    static {
        Field9420 = new Class1880(null);
        Field9419 = new Vec3d(Double.longBitsToDouble(0x4020000000000000L), Double.longBitsToDouble((long)716096434 ^ 0x405000002AAEC3B2L), Double.longBitsToDouble(0x4020000000000000L));
    }

    public static final Minecraft Method1682() {
        return Class42.Field8052;
    }

    public static final void Method1683(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method1684(Class342 class342) {
        return class342.Field9413;
    }

    public static final Vec3d Method1685() {
        return Field9419;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 4;
            cArray2[n] = (char)(cArray[n] ^ (0x4052 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

