//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0015" }, d2 = { "Lcom/kisman/cc/features/module/Debug/ScreenShaders;", "Lcom/kisman/cc/features/module/Module;", "()V", "alphaFactor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "directionX", "directionY", "radius", "radiusFactor", "shader", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/module/Debug/ScreenShaders$Shader;", "test", "testAlpha", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "Shader", "kisman.cc" })
public final class Class915 extends Class42
{
    private final Class1303 Field11876;
    private final Class44 Field11877;
    private final Class44 Field11878;
    private final Class44 Field11879;
    private final Class44 Field11880;
    private final Class44 Field11881;
    private final Class44 Field11882;
    private final Class44 Field11883;
    private final Class44 Field11884;
    private int Field11885;
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method3827(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        final Class44 field11883 = this.Field11883;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11883, "test");
        if (field11883.Method365()) {
            final double longBitsToDouble = Double.longBitsToDouble(4636737291354636288L);
            final double longBitsToDouble2 = Double.longBitsToDouble((long)906436050 ^ 0x4059000036071DD2L);
            final double longBitsToDouble3 = Double.longBitsToDouble((long)741482052 ^ 0x405900002C321E44L);
            final double longBitsToDouble4 = Double.longBitsToDouble((long)810746700 ^ 0x405900003053034CL);
            final int r = 255;
            final int g = 255;
            final int b = 255;
            final Class44 field11884 = this.Field11884;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11884, "testAlpha");
            Class753.drawRectWH(longBitsToDouble, longBitsToDouble2, longBitsToDouble3, longBitsToDouble4, new Color(r, g, b, field11884.Method335()).getRGB());
        }
        switch (Class271.Field9198[((Class1110)this.Field11876.Method341()).ordinal()]) {
            case 1: {
                final float intBitsToFloat = Float.intBitsToFloat(1120403456);
                final float intBitsToFloat2 = Float.intBitsToFloat(1120403456);
                final float intBitsToFloat3 = Float.intBitsToFloat(1128792064);
                final float intBitsToFloat4 = Float.intBitsToFloat(1128792064);
                final Class44 field11885 = this.Field11877;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11885, "color");
                final Class2027 method339 = field11885.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method339, "color.colour");
                final int method340 = method339.Method3626();
                final Class44 field11886 = this.Field11878;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11886, "radius");
                Class753.drawRoundedRect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, method340, field11886.Method368());
                break;
            }
            case 2: {
                final float intBitsToFloat5 = Float.intBitsToFloat(1120403456);
                final float intBitsToFloat6 = Float.intBitsToFloat(1120403456);
                final float intBitsToFloat7 = Float.intBitsToFloat(1128792064);
                final float intBitsToFloat8 = Float.intBitsToFloat(1128792064);
                final Class44 field11887 = this.Field11877;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11887, "color");
                final Class2027 method341 = field11887.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method341, "color.colour");
                final int method342 = method341.Method3626();
                final Class44 field11888 = this.Field11878;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11888, "radius");
                final float method343 = field11888.Method368();
                final Class44 field11889 = this.Field11880;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11889, "alphaFactor");
                Class753.drawRoundedRect1(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, method342, method343, field11889.Method368());
                break;
            }
            case 3: {
                final float intBitsToFloat9 = Float.intBitsToFloat(1120403456);
                final float intBitsToFloat10 = Float.intBitsToFloat(1120403456);
                final float intBitsToFloat11 = Float.intBitsToFloat(1128792064);
                final float intBitsToFloat12 = Float.intBitsToFloat(1128792064);
                final Class44 field11890 = this.Field11878;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11890, "radius");
                final float method344 = field11890.Method368();
                final Class44 field11891 = this.Field11879;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11891, "radiusFactor");
                final float method345 = field11891.Method368();
                final Class44 field11892 = this.Field11881;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11892, "directionX");
                final float method346 = field11892.Method368();
                final Class44 field11893 = this.Field11882;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11893, "directionY");
                Class753.drawBlur(intBitsToFloat9, intBitsToFloat10, intBitsToFloat11, intBitsToFloat12, method344, method345, method346, field11893.Method368());
                break;
            }
        }
    }
    
    public Class915() {
        super("ScreenShaders", "Test of new rounded rect & blur shaders", Class97.Field8345);
        this.Field11876 = new Class1303("Shader", (Class42)this, (Enum)Class1110.Field12996).Method5303();
        this.Field11877 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
        this.Field11878 = this.Method23(new Class44("Radius", (Class42)this, 1.0, Double.longBitsToDouble((long)391256513 ^ 0x3FB999998ECB805BL), Double.longBitsToDouble((long)524615386 ^ 0x401400001F44FEDAL), false));
        this.Field11879 = this.Method23(new Class44("Radius Factor", (Class42)this, Double.longBitsToDouble((long)821448887 ^ 0x3FB99999A96FC92DL), Double.longBitsToDouble((long)945341793 ^ 0x3FB99999A1C15CFBL), Double.longBitsToDouble((long)1622305788 ^ 0x4000000060B26BFCL), false));
        this.Field11880 = this.Method23(new Class44("Alpha Factor", (Class42)this, 0.0, 0.0, 1.0, false));
        this.Field11881 = this.Method23(new Class44("Direction X", (Class42)this, 1.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble(4611686018427387904L), false));
        this.Field11882 = this.Method23(new Class44("Direction Y", (Class42)this, 1.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble((long)2130889807 ^ 0x400000007F02CC4FL), false));
        this.Field11883 = this.Method23(new Class44("Test", (Class42)this, false));
        this.Field11884 = this.Method23(new Class44("Test Alpha", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4643176031446892544L), true));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x182D ^ 0x58));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
