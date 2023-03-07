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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.TaEbeLsBElvWfXtIlVzRcbQvV3iW6Vqn;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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
public final class fcCbVayqNPfs3vA2dekvyZB6GZp74lr5
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13522 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Limit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x27E7A356316BC980L ^ 0x678EA356316BC980L), ((int)-545719360L ^ 0xDF78FBC1) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13523 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ItemName", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2146837606 ^ (long)2146837606)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13524 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NameRenderDistance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)609969734 ^ 0x40200000245B6646L), 1.0, Double.longBitsToDouble(0x38036D3A86B87A85L ^ 0x783D6D3A86B87A85L), ((int)-640571704L ^ 0xD9D1A6C8) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13525;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13526;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13527;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13528;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13529;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13530;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13531;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13532;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13533;
    private final HashSet Field13534;
    private String Field13535 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4917(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        if (fcCbVayqNPfs3vA2dekvyZB6GZp74lr5.Method4918().world == null) return;
        if (fcCbVayqNPfs3vA2dekvyZB6GZp74lr5.Method4918().player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        int n = (int)-1038592493L ^ 0xC2185613;
        List list = fcCbVayqNPfs3vA2dekvyZB6GZp74lr5.Method4918().world.loadedEntityList;
        Intrinsics.checkExpressionValueIsNotNull((Object)list, (String)"mc.world.loadedEntityList");
        Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13522;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"limit");
                if (n > qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()) {
                    return;
                }
                double d = entity.getDistance((Entity)fcCbVayqNPfs3vA2dekvyZB6GZp74lr5.Method4918().player);
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field13526;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"renderDistance");
                if (!(d > qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367())) {
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field13525;
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"render");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method359().equals("Glow")) {
                        entity.glowing = (int)((long)148121994 ^ (long)148121995);
                        this.Field13534.add(entity);
                    } else {
                        if (this.Field13534.contains(entity)) {
                            this.Field13534.remove(entity);
                        }
                        AxisAlignedBB axisAlignedBB = entity.boundingBox;
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field13533;
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"interpolate");
                        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) {
                            double d2 = entity.lastTickPosX;
                            double d3 = entity.lastTickPosY;
                            double d4 = entity.lastTickPosZ;
                            double d5 = (double)entity.width / Double.longBitsToDouble(0xD4B3F7E6F71B8EC3L ^ 0x94B3F7E6F71B8EC3L);
                            float f = entity.height;
                            Vec3d vec3d = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1942(entity, renderWorldLastEvent.getPartialTicks());
                            double d6 = vec3d.x;
                            double d7 = vec3d.y;
                            double d8 = vec3d.z;
                            axisAlignedBB = new AxisAlignedBB(d2 - d5 + d6, d3 + d7, d4 - d5 + d8, d2 + d5 + d6, d3 + (double)f + d7, d4 + d5 + d8);
                        }
                        axisAlignedBB = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(axisAlignedBB);
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field13532;
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"correct");
                        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) {
                            axisAlignedBB = axisAlignedBB.grow(Double.longBitsToDouble(0xC62C2448645EE31BL ^ 0xF9985EA923F0F760L));
                            axisAlignedBB = axisAlignedBB.offset(0.0, Double.longBitsToDouble(0x60FF396F3314669FL ^ 0x5F31813ED8917827L), 0.0);
                        }
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field13528;
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"outlineWidth");
                        float f = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method368();
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field13529;
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"color");
                        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method339();
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = this.Field13530;
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"color1");
                        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method339();
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = this.Field13527;
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"renderMode");
                        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method341();
                        if (enum_ == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.Rendering.Mode");
                        }
                        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3446(axisAlignedBB, f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)enum_);
                    }
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = this.Field13523;
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"itemName");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11.Method365()) {
                        double d9 = entity.getDistance((Entity)fcCbVayqNPfs3vA2dekvyZB6GZp74lr5.Method4918().player);
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = this.Field13524;
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"nameRenderDistance");
                        if (!(d9 > qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12.Method367())) {
                            ItemStack itemStack = ((EntityItem)entity).getItem();
                            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"entity.item");
                            String string = itemStack.getDisplayName();
                            Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"entity.item.displayName");
                            AxisAlignedBB axisAlignedBB = entity.boundingBox;
                            Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"entity.boundingBox");
                            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13 = this.Field13531;
                            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13, (String)"textColor");
                            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13.Method339();
                            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"textColor.colour");
                            new TaEbeLsBElvWfXtIlVzRcbQvV3iW6Vqn(string, axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4).Method1186(renderWorldLastEvent.getPartialTicks());
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
            entity.glowing = (int)((long)-1079239758 ^ (long)-1079239758);
        }
    }

    public fcCbVayqNPfs3vA2dekvyZB6GZp74lr5() {
        super("ItemESPRewrite", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        Object[] objectArray = new String[((int)1274297159L ^ 0x4BF43B46) << 1];
        objectArray[(int)((long)1033984541 ^ (long)1033984541)] = "Box";
        objectArray[(int)-209108784L ^ 0xF38940D1] = "Glow";
        this.Field13525 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Box", CollectionsKt.listOf((Object[])objectArray)));
        this.Field13526 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RenderDistance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)867845836 ^ 0x4020000033BA46CCL), 1.0, Double.longBitsToDouble(0x2645EE526952599BL ^ 0x661CEE526952599BL), ((int)482146954L ^ 0x1CBCFA8A) != 0));
        this.Field13527 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17214));
        this.Field13528 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("OutlineWidth", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1572520002 ^ 0x400000005DBAC042L), 1.0, Double.longBitsToDouble((long)1969570166 ^ 0x4014000075654176L), ((int)-1113123882L ^ 0xBDA713D6) != 0));
        this.Field13529 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-1801110580L ^ 0x94A53B33, (int)((long)-910132351 ^ (long)-910132354), (int)-1470600008L ^ 0xA8586C47, (int)((long)1197698924 ^ (long)1197698915) << 3)));
        this.Field13530 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SecondColor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "SecondColor", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1418397136 ^ (long)1418396975), (int)((long)-2127809497 ^ (long)-2127809320), (int)1197949755L ^ 0x476743C4, ((int)-742614808L ^ 0xD3BC98E7) << 3)));
        this.Field13531 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TextColor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "TextColor", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)78194345 ^ (long)78194262), (int)((long)1455798275 ^ (long)1455798524), (int)((long)-1228173049 ^ (long)-1228172808), (int)((long)1380994974 ^ (long)1380994913))));
        this.Field13532 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Correct", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2060547403L ^ 0x852E8AB5) != 0));
        this.Field13533 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Interpolate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-914637707 ^ (long)-914637707)));
        this.Field13534 = new HashSet(((int)-888316307L ^ 0xCB0D5E6C) << 6);
    }

    public static final Minecraft Method4918() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4919(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)428940469 ^ (long)428940469);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1837457792 ^ (long)-1837457793);
            int n2 = (int)361400354L ^ 0x158A8829;
            cArray2[n] = (char)(cArray[n] ^ (((int)1357225274L ^ 0x50E59DF7) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

