//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class2008;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class815;
import lavahack.client.Class868;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/features/module/render/ItemESPRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color1", "correct", "glowingEntities", "Ljava/util/HashSet;", "Lnet/minecraft/entity/Entity;", "Lkotlin/collections/HashSet;", "interpolate", "itemName", "limit", "nameRenderDistance", "outlineWidth", "render", "renderDistance", "renderMode", "textColor", "onDisable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc"})
public final class Class1219
extends Class42 {
    private final Class44 Field13522 = this.Method23(new Class44("Limit", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4641240890982006784L), true));
    private final Class44 Field13523 = this.Method23(new Class44("ItemName", (Class42)this, false));
    private final Class44 Field13524 = this.Method23(new Class44("NameRenderDistance", (Class42)this, Double.longBitsToDouble((long)609969734 ^ 0x40200000245B6646L), 1.0, Double.longBitsToDouble(4629137466983448576L), false));
    private final Class44 Field13525 = this.Method23(new Class44("Render", (Class42)this, "Box", CollectionsKt.listOf((Object[])new String[]{"Box", "Glow"})));
    private final Class44 Field13526 = this.Method23(new Class44("RenderDistance", (Class42)this, Double.longBitsToDouble((long)867845836 ^ 0x4020000033BA46CCL), 1.0, Double.longBitsToDouble(4636737291354636288L), false));
    private final Class44 Field13527 = this.Method23(new Class44("Render Mode", (Class42)this, Class2008.Field17214));
    private final Class44 Field13528 = this.Method23(new Class44("OutlineWidth", (Class42)this, Double.longBitsToDouble((long)1572520002 ^ 0x400000005DBAC042L), 1.0, Double.longBitsToDouble((long)1969570166 ^ 0x4014000075654176L), false));
    private final Class44 Field13529 = this.Method23(new Class44("Color", (Class42)this, "Color", new Class2027(255, 255, 255, 120)));
    private final Class44 Field13530 = this.Method23(new Class44("SecondColor", (Class42)this, "SecondColor", new Class2027(255, 255, 255, 120)));
    private final Class44 Field13531 = this.Method23(new Class44("TextColor", (Class42)this, "TextColor", new Class2027(255, 255, 255, 255)));
    private final Class44 Field13532 = this.Method23(new Class44("Correct", (Class42)this, false));
    private final Class44 Field13533 = this.Method23(new Class44("Interpolate", (Class42)this, false));
    private final HashSet Field13534 = new HashSet(64);
    private String Field13535 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4917(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        if (Class1219.Method4918().world == null) return;
        if (Class1219.Method4918().player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        int n = 0;
        List list = Class1219.Method4918().world.loadedEntityList;
        Intrinsics.checkExpressionValueIsNotNull((Object)list, (String)"mc.world.loadedEntityList");
        Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) {
                Class44 class44 = this.Field13522;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"limit");
                if (n > class44.Method335()) {
                    return;
                }
                double d = entity.getDistance((Entity)Class1219.Method4918().player);
                Class44 class442 = this.Field13526;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"renderDistance");
                if (!(d > class442.Method367())) {
                    Class44 class443 = this.Field13525;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"render");
                    if (class443.Method359().equals("Glow")) {
                        entity.glowing = true;
                        this.Field13534.add(entity);
                    } else {
                        if (this.Field13534.contains(entity)) {
                            this.Field13534.remove(entity);
                        }
                        AxisAlignedBB axisAlignedBB = entity.boundingBox;
                        Class44 class444 = this.Field13533;
                        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"interpolate");
                        if (class444.Method365()) {
                            double d2 = entity.lastTickPosX;
                            double d3 = entity.lastTickPosY;
                            double d4 = entity.lastTickPosZ;
                            double d5 = (double)entity.width / Double.longBitsToDouble(0x4000000000000000L);
                            float f = entity.height;
                            Vec3d vec3d = Class394.Method1942(entity, renderWorldLastEvent.getPartialTicks());
                            double d6 = vec3d.x;
                            double d7 = vec3d.y;
                            double d8 = vec3d.z;
                            axisAlignedBB = new AxisAlignedBB(d2 - d5 + d6, d3 + d7, d4 - d5 + d8, d2 + d5 + d6, d3 + (double)f + d7, d4 + d5 + d8);
                        }
                        axisAlignedBB = Class815.Method3447(axisAlignedBB);
                        Class44 class445 = this.Field13532;
                        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"correct");
                        if (class445.Method365()) {
                            axisAlignedBB = axisAlignedBB.grow(Double.longBitsToDouble(4590429028186199163L));
                            axisAlignedBB = axisAlignedBB.offset(0.0, Double.longBitsToDouble(4597814931575086776L), 0.0);
                        }
                        Class44 class446 = this.Field13528;
                        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"outlineWidth");
                        float f = class446.Method368();
                        Class44 class447 = this.Field13529;
                        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"color");
                        Class2027 class2027 = class447.Method339();
                        Class44 class448 = this.Field13530;
                        Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"color1");
                        Class2027 class20272 = class448.Method339();
                        Class44 class449 = this.Field13527;
                        Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"renderMode");
                        Enum enum_ = class449.Method341();
                        if (enum_ == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.Rendering.Mode");
                        }
                        Class815.Method3446(axisAlignedBB, f, class2027, class20272, (Class2008)enum_);
                    }
                    Class44 class4410 = this.Field13523;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"itemName");
                    if (class4410.Method365()) {
                        double d9 = entity.getDistance((Entity)Class1219.Method4918().player);
                        Class44 class4411 = this.Field13524;
                        Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"nameRenderDistance");
                        if (!(d9 > class4411.Method367())) {
                            ItemStack itemStack = ((EntityItem)entity).getItem();
                            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"entity.item");
                            String string = itemStack.getDisplayName();
                            Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"entity.item.displayName");
                            AxisAlignedBB axisAlignedBB = entity.boundingBox;
                            Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"entity.boundingBox");
                            Class44 class4412 = this.Field13531;
                            Intrinsics.checkExpressionValueIsNotNull((Object)class4412, (String)"textColor");
                            Class2027 class2027 = class4412.Method339();
                            Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"textColor.colour");
                            new Class868(string, axisAlignedBB, class2027).Method1186(renderWorldLastEvent.getPartialTicks());
                        }
                    }
                }
            }
            ++n;
        }
    }

    @Override
    public void Method39() {
        super.Method39();
        Iterator iterator = this.Field13534.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            entity.glowing = false;
        }
    }

    public Class1219() {
        super("ItemESPRewrite", Class97.Field8342);
    }

    public static final Minecraft Method4918() {
        return Class42.Field8052;
    }

    public static final void Method4919(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 11;
            cArray2[n] = (char)(cArray[n] ^ (0x3340 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

