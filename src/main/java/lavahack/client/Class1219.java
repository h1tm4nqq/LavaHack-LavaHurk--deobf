//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import kotlin.*;
import java.util.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.eventhandler.*;
import kotlin.collections.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001a" }, d2 = { "Lcom/kisman/cc/features/module/render/ItemESPRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color1", "correct", "glowingEntities", "Ljava/util/HashSet;", "Lnet/minecraft/entity/Entity;", "Lkotlin/collections/HashSet;", "interpolate", "itemName", "limit", "nameRenderDistance", "outlineWidth", "render", "renderDistance", "renderMode", "textColor", "onDisable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc" })
public final class Class1219 extends Class42
{
    private final Class44 Field13522;
    private final Class44 Field13523;
    private final Class44 Field13524;
    private final Class44 Field13525;
    private final Class44 Field13526;
    private final Class44 Field13527;
    private final Class44 Field13528;
    private final Class44 Field13529;
    private final Class44 Field13530;
    private final Class44 Field13531;
    private final Class44 Field13532;
    private final Class44 Field13533;
    private final HashSet Field13534;
    private String Field13535 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method4917(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        if (Method4918().world == null || Method4918().player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        int n = 0;
        final List loadedEntityList = Method4918().world.loadedEntityList;
        Intrinsics.checkExpressionValueIsNotNull((Object)loadedEntityList, "mc.world.loadedEntityList");
        for (final Entity o : (List<Entity>)loadedEntityList) {
            if (o instanceof EntityItem) {
                final int n2 = n;
                final Class44 field13522 = this.Field13522;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13522, "limit");
                if (n2 > field13522.Method335()) {
                    break;
                }
                final double n3 = o.getDistance((Entity)Method4918().player);
                final Class44 field13523 = this.Field13526;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13523, "renderDistance");
                if (n3 <= field13523.Method367()) {
                    final Class44 field13524 = this.Field13525;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13524, "render");
                    if (field13524.Method359().equals("Glow")) {
                        o.glowing = true;
                        this.Field13534.add(o);
                    }
                    else {
                        if (this.Field13534.contains(o)) {
                            this.Field13534.remove(o);
                        }
                        AxisAlignedBB boundingBox = o.boundingBox;
                        final Class44 field13525 = this.Field13533;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field13525, "interpolate");
                        if (field13525.Method365()) {
                            final double lastTickPosX = o.lastTickPosX;
                            final double lastTickPosY = o.lastTickPosY;
                            final double lastTickPosZ = o.lastTickPosZ;
                            final double n4 = o.width / Double.longBitsToDouble(4611686018427387904L);
                            final float height = o.height;
                            final Vec3d method1942 = Class394.Method1942(o, renderWorldLastEvent.getPartialTicks());
                            final double x = method1942.x;
                            final double y = method1942.y;
                            final double z = method1942.z;
                            boundingBox = new AxisAlignedBB(lastTickPosX - n4 + x, lastTickPosY + y, lastTickPosZ - n4 + z, lastTickPosX + n4 + x, lastTickPosY + height + y, lastTickPosZ + n4 + z);
                        }
                        AxisAlignedBB axisAlignedBB = Class815.Method3447(boundingBox);
                        final Class44 field13526 = this.Field13532;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field13526, "correct");
                        if (field13526.Method365()) {
                            axisAlignedBB = axisAlignedBB.grow(Double.longBitsToDouble(4590429028186199163L)).offset(0.0, Double.longBitsToDouble(4597814931575086776L), 0.0);
                        }
                        final AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
                        final Class44 field13527 = this.Field13528;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field13527, "outlineWidth");
                        final float method1943 = field13527.Method368();
                        final Class44 field13528 = this.Field13529;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field13528, "color");
                        final Class2027 method1944 = field13528.Method339();
                        final Class44 field13529 = this.Field13530;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field13529, "color1");
                        final Class2027 method1945 = field13529.Method339();
                        final Class44 field13530 = this.Field13527;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field13530, "renderMode");
                        final Enum method1946 = field13530.Method341();
                        if (method1946 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.Rendering.Mode");
                        }
                        Class815.Method3446(axisAlignedBB2, method1943, method1944, method1945, (Class2008)method1946);
                    }
                    final Class44 field13531 = this.Field13523;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13531, "itemName");
                    if (field13531.Method365()) {
                        final double n5 = o.getDistance((Entity)Method4918().player);
                        final Class44 field13532 = this.Field13524;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field13532, "nameRenderDistance");
                        if (n5 <= field13532.Method367()) {
                            final ItemStack getItem = ((EntityItem)o).getItem();
                            Intrinsics.checkExpressionValueIsNotNull((Object)getItem, "entity.item");
                            final String getDisplayName = getItem.getDisplayName();
                            Intrinsics.checkExpressionValueIsNotNull((Object)getDisplayName, "entity.item.displayName");
                            final AxisAlignedBB boundingBox2 = o.boundingBox;
                            Intrinsics.checkExpressionValueIsNotNull((Object)boundingBox2, "entity.boundingBox");
                            final Class44 field13533 = this.Field13531;
                            Intrinsics.checkExpressionValueIsNotNull((Object)field13533, "textColor");
                            final Class2027 method1947 = field13533.Method339();
                            Intrinsics.checkExpressionValueIsNotNull((Object)method1947, "textColor.colour");
                            new Class868(getDisplayName, boundingBox2, method1947).Method1186(renderWorldLastEvent.getPartialTicks());
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
        final Iterator<Entity> iterator = this.Field13534.iterator();
        while (iterator.hasNext()) {
            iterator.next().glowing = false;
        }
    }
    
    public Class1219() {
        super("ItemESPRewrite", Class97.Field8342);
        this.Field13522 = this.Method23(new Class44("Limit", this, 0.0, 0.0, Double.longBitsToDouble(4641240890982006784L), true));
        this.Field13523 = this.Method23(new Class44("ItemName", this, false));
        this.Field13524 = this.Method23(new Class44("NameRenderDistance", this, Double.longBitsToDouble((long)609969734 ^ 0x40200000245B6646L), 1.0, Double.longBitsToDouble(4629137466983448576L), false));
        this.Field13525 = this.Method23(new Class44("Render", this, "Box", CollectionsKt.listOf((Object[])new String[] { "Box", "Glow" })));
        this.Field13526 = this.Method23(new Class44("RenderDistance", this, Double.longBitsToDouble((long)867845836 ^ 0x4020000033BA46CCL), 1.0, Double.longBitsToDouble(4636737291354636288L), false));
        this.Field13527 = this.Method23(new Class44("Render Mode", this, Class2008.Field17214));
        this.Field13528 = this.Method23(new Class44("OutlineWidth", this, Double.longBitsToDouble((long)1572520002 ^ 0x400000005DBAC042L), 1.0, Double.longBitsToDouble((long)1969570166 ^ 0x4014000075654176L), false));
        this.Field13529 = this.Method23(new Class44("Color", this, "Color", new Class2027(255, 255, 255, 120)));
        this.Field13530 = this.Method23(new Class44("SecondColor", this, "SecondColor", new Class2027(255, 255, 255, 120)));
        this.Field13531 = this.Method23(new Class44("TextColor", this, "TextColor", new Class2027(255, 255, 255, 255)));
        this.Field13532 = this.Method23(new Class44("Correct", this, false));
        this.Field13533 = this.Method23(new Class44("Interpolate", this, false));
        this.Field13534 = new HashSet(64);
    }
    
    public static final Minecraft Method4918() {
        return Class42.Field8052;
    }
    
    public static final void Method4919(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3340 ^ 0xB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
