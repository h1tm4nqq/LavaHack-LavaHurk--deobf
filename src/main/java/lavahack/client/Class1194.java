//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0005?\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001e" }, d2 = { "Lcom/kisman/cc/features/module/render/BlockHighlight;", "Lcom/kisman/cc/features/module/Module;", "Lcom/kisman/cc/util/interfaces/Drawable;", "()V", "bb", "Lnet/minecraft/util/math/AxisAlignedBB;", "ciGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "crystalInfo", "Lcom/kisman/cc/settings/Setting;", "crystalInfoColor", "crystalInfoTargetRange", "crystalInfoTerrain", "entities", "facing", "Lnet/minecraft/util/EnumFacing;", "hitSideOnly", "pattern", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "renderer", "Lcom/kisman/cc/features/module/render/BlockHighlight$IRenderer;", "draw", "", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "Companion", "IRenderer", "kisman.cc" })
public final class Class1194 extends Class42 implements Class1697
{
    private final Class44 Field13401;
    private final Class44 Field13402;
    private final Class1515 Field13403;
    private final Class1996 Field13404;
    private final Class44 Field13405;
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
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method4806(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        if (Method4807().objectMouseOver == null) {
            return;
        }
        final RayTraceResult objectMouseOver = Method4807().objectMouseOver;
        final RayTraceResult$Type typeOfHit = objectMouseOver.typeOfHit;
        AxisAlignedBB field13402 = null;
        Label_0160: {
            if (typeOfHit != null) {
                switch (Class2092.Field17546[typeOfHit.ordinal()]) {
                    case 1: {
                        final Class44 field13401 = this.Field13401;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field13401, "entities");
                        if (field13401.Method365()) {
                            final Entity entityHit = objectMouseOver.entityHit;
                            Intrinsics.checkExpressionValueIsNotNull((Object)entityHit, "hitObject.entityHit");
                            field13402 = entityHit.getEntityBoundingBox();
                            break Label_0160;
                        }
                        field13402 = null;
                        break Label_0160;
                    }
                    case 2: {
                        final Class1759 field13403 = Class1934.Field16968;
                        final WorldClient world = Method4807().world;
                        final RayTraceResult rayTraceResult = objectMouseOver;
                        Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult, "hitObject");
                        final AxisAlignedBB getSelectedBoundingBox = world.getBlockState(rayTraceResult.getBlockPos()).getSelectedBoundingBox((World)Method4807().world, objectMouseOver.getBlockPos());
                        Intrinsics.checkExpressionValueIsNotNull((Object)getSelectedBoundingBox, "mc.world.getBlockState(h\u2026orld, hitObject.blockPos)");
                        field13402 = field13403.Method6696(getSelectedBoundingBox).Method7190();
                        break Label_0160;
                    }
                }
            }
            field13402 = null;
        }
        this.Field13410 = field13402;
        EnumFacing field13404;
        if (objectMouseOver.typeOfHit == RayTraceResult$Type.ENTITY) {
            Entity renderViewEntity;
            if ((renderViewEntity = Method4807().renderViewEntity) == null) {
                renderViewEntity = (Entity)Method4807().player;
            }
            final Entity entity = renderViewEntity;
            final Vec3d getPositionEyes = entity.getPositionEyes(renderWorldLastEvent.getPartialTicks());
            final Entity entityHit2 = objectMouseOver.entityHit;
            if (entityHit2 == null) {
                return;
            }
            final Entity entity2 = entityHit2;
            final Entity entity3 = entity;
            Intrinsics.checkExpressionValueIsNotNull((Object)entity3, "viewEntity");
            final RayTraceResult calculateIntercept = entity2.getEntityBoundingBox().calculateIntercept(getPositionEyes, getPositionEyes.add(entity3.getLookVec().scale(Double.longBitsToDouble(4618441417868443648L))));
            if (calculateIntercept == null || (field13404 = calculateIntercept.sideHit) == null) {
                return;
            }
        }
        else {
            field13404 = objectMouseOver.sideHit;
        }
        this.Field13411 = field13404;
        if (this.Field13403.Method3791()) {
            final Class1950 field13405 = this.Field13409;
            final AxisAlignedBB field13406 = this.Field13410;
            final Class44 field13407 = this.Field13402;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13407, "hitSideOnly");
            field13405.Method4271(field13406, field13407.Method365() ? this.Field13411 : null, this.Field13403);
        }
        if (this.Field13410 != null) {
            final Class44 field13408 = this.Field13405;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13408, "crystalInfo");
            if (field13408.Method365() && objectMouseOver.typeOfHit == RayTraceResult$Type.BLOCK) {
                final Class44 field13409 = this.Field13408;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13409, "crystalInfoTargetRange");
                final EntityPlayer method1924 = Class394.Method1924(field13409.Method368());
                final StringBuilder sb = new StringBuilder();
                final StringCompanionObject instance = StringCompanionObject.INSTANCE;
                final String s = "%.1f";
                final Object[] array = { null };
                final int n = 0;
                final Class1757 field13410 = Class1955.Field17021;
                final Class44 field13411 = this.Field13407;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13411, "crystalInfoTerrain");
                final boolean method1925 = field13411.Method365();
                final RayTraceResult rayTraceResult2 = objectMouseOver;
                Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult2, "hitObject");
                final BlockPos getBlockPos = rayTraceResult2.getBlockPos();
                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockPos, "hitObject.blockPos");
                array[n] = field13410.Method6689(method1925, getBlockPos);
                final Object[] array2 = array;
                final StringBuilder sb2 = sb;
                final String format = s;
                final Object[] original = array2;
                final String format2 = String.format(format, Arrays.copyOf(original, original.length));
                Intrinsics.checkExpressionValueIsNotNull((Object)format2, "java.lang.String.format(format, *args)");
                final StringBuilder append = sb2.append(format2).append('/');
                String str;
                if (method1924 != null) {
                    final StringCompanionObject instance2 = StringCompanionObject.INSTANCE;
                    final String s2 = "%.1f";
                    final Object[] array3 = { null };
                    final int n2 = 0;
                    final Class1757 field13412 = Class1955.Field17021;
                    final Entity entity4 = (Entity)method1924;
                    final Class44 field13413 = this.Field13407;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13413, "crystalInfoTerrain");
                    final boolean method1926 = field13413.Method365();
                    final BlockPos getBlockPos2 = objectMouseOver.getBlockPos();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getBlockPos2, "hitObject.blockPos");
                    array3[n2] = field13412.Method6688(entity4, method1926, getBlockPos2);
                    final Object[] array4 = array3;
                    final String format3 = s2;
                    final Object[] original2 = array4;
                    final String format4 = String.format(format3, Arrays.copyOf(original2, original2.length));
                    Intrinsics.checkExpressionValueIsNotNull((Object)format4, "java.lang.String.format(format, *args)");
                    str = format4;
                }
                else {
                    str = "0.0";
                }
                final String string = append.append(str).toString();
                final BlockPos getBlockPos3 = objectMouseOver.getBlockPos();
                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockPos3, "hitObject.blockPos");
                final Class44 field13414 = this.Field13406;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13414, "crystalInfoColor");
                final Class2027 method1927 = field13414.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method1927, "crystalInfoColor.colour");
                new Class1366(string, getBlockPos3, method1927).Method1186(renderWorldLastEvent.getPartialTicks());
            }
        }
    }
    
    public void Method20() {
        final Class1950 field13409 = this.Field13409;
        final AxisAlignedBB field13410 = this.Field13410;
        final Class44 field13411 = this.Field13402;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13411, "hitSideOnly");
        field13409.Method4271(field13410, field13411.Method365() ? this.Field13411 : null, this.Field13403);
    }
    
    public Class1194() {
        super("BlockHighlight", "Highlights object you are looking at", Class97.Field8342);
        this.Field13401 = this.Method23(new Class44("Entities", this, false));
        this.Field13402 = this.Method23(new Class44("Hit Side Only", this, false));
        this.Field13403 = new Class1515(this).Method6042().Method6043();
        this.Field13404 = this.Method24(new Class1996(new Class44("Crystal Info", this)));
        this.Field13405 = this.Method23(this.Field13404.Method7405(new Class44("Crystal Info", this, false)));
        final Class1996 field13404 = this.Field13404;
        final Class44 method313 = new Class44("Crystal Info Color", this, "Crystal Info Color", new Class2027(255, 255, 255, 255)).Method313(new Class37(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method313, "Setting(\"Crystal Info Co\u2026 crystalInfo.valBoolean }");
        this.Field13406 = this.Method23(field13404.Method7405(method313));
        final Class1996 field13405 = this.Field13404;
        final Class44 method314 = new Class44("Crystal Info Terrain", this, false).Method313(new Class1656(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method314, "Setting(\"Crystal Info Te\u2026 crystalInfo.valBoolean }");
        this.Field13407 = this.Method23(field13405.Method7405(method314));
        final Class1996 field13406 = this.Field13404;
        final Class44 method315 = new Class44("Crystal Info Target Range", this, Double.longBitsToDouble(4624633867356078080L), 0.0, Double.longBitsToDouble(4626322717216342016L), true).Method313(new Class802(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method315, "Setting(\"Crystal Info Ta\u2026 crystalInfo.valBoolean }");
        this.Field13408 = this.Method23(field13406.Method7405(method315));
        this.Field13409 = (Class1950)new Class1044();
        Class1194.Field13412 = this;
    }
    
    static {
        Field13413 = new Class43(null);
    }
    
    public static final Minecraft Method4807() {
        return Class42.Field8052;
    }
    
    public static final void Method4808(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method4809(final Class1194 class1194) {
        return class1194.Field13405;
    }
    
    public static final Class1194 Method4810() {
        return Class1194.Field13412;
    }
    
    public static final void Method4811(final Class1194 field13412) {
        Class1194.Field13412 = field13412;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C61 ^ 0xBF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
