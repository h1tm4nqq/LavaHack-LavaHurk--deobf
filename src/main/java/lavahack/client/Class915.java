/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1110;
import lavahack.client.Class1303;
import lavahack.client.Class271;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class753;
import lavahack.client.Class97;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/features/module/Debug/ScreenShaders;", "Lcom/kisman/cc/features/module/Module;", "()V", "alphaFactor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "directionX", "directionY", "radius", "radiusFactor", "shader", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/module/Debug/ScreenShaders$Shader;", "test", "testAlpha", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "Shader", "kisman.cc"})
public final class Class915
extends Class42 {
    private final Class1303 Field11876 = new Class1303("Shader", (Class42)this, Class1110.Field12996).Method5303();
    private final Class44 Field11877 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
    private final Class44 Field11878 = this.Method23(new Class44("Radius", (Class42)this, 1.0, Double.longBitsToDouble((long)391256513 ^ 0x3FB999998ECB805BL), Double.longBitsToDouble((long)524615386 ^ 0x401400001F44FEDAL), false));
    private final Class44 Field11879 = this.Method23(new Class44("Radius Factor", (Class42)this, Double.longBitsToDouble((long)821448887 ^ 0x3FB99999A96FC92DL), Double.longBitsToDouble((long)945341793 ^ 0x3FB99999A1C15CFBL), Double.longBitsToDouble((long)1622305788 ^ 0x4000000060B26BFCL), false));
    private final Class44 Field11880 = this.Method23(new Class44("Alpha Factor", (Class42)this, 0.0, 0.0, 1.0, false));
    private final Class44 Field11881 = this.Method23(new Class44("Direction X", (Class42)this, 1.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble(0x4000000000000000L), false));
    private final Class44 Field11882 = this.Method23(new Class44("Direction Y", (Class42)this, 1.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble((long)2130889807 ^ 0x400000007F02CC4FL), false));
    private final Class44 Field11883 = this.Method23(new Class44("Test", (Class42)this, false));
    private final Class44 Field11884 = this.Method23(new Class44("Test Alpha", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4643176031446892544L), true));
    private int Field11885;

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3827(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        Class44 class44 = this.Field11883;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"test");
        if (class44.Method365()) {
            double d = Double.longBitsToDouble(4636737291354636288L);
            double d2 = Double.longBitsToDouble((long)906436050 ^ 0x4059000036071DD2L);
            double d3 = Double.longBitsToDouble((long)741482052 ^ 0x405900002C321E44L);
            double d4 = Double.longBitsToDouble((long)810746700 ^ 0x405900003053034CL);
            Class44 class442 = this.Field11884;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"testAlpha");
            Class753.drawRectWH(d, d2, d3, d4, new Color(255, 255, 255, class442.Method335()).getRGB());
        }
        switch (Class271.Field9198[((Class1110)this.Field11876.Method341()).ordinal()]) {
            case 1: {
                float f = Float.intBitsToFloat(1120403456);
                float f2 = Float.intBitsToFloat(1120403456);
                float f3 = Float.intBitsToFloat(1128792064);
                float f4 = Float.intBitsToFloat(1128792064);
                Class44 class443 = this.Field11877;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"color");
                Class2027 class2027 = class443.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"color.colour");
                int n = class2027.Method3626();
                Class44 class444 = this.Field11878;
                Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"radius");
                Class753.drawRoundedRect(f, f2, f3, f4, n, class444.Method368());
                return;
            }
            case 2: {
                float f = Float.intBitsToFloat(1120403456);
                float f5 = Float.intBitsToFloat(1120403456);
                float f6 = Float.intBitsToFloat(1128792064);
                float f7 = Float.intBitsToFloat(1128792064);
                Class44 class445 = this.Field11877;
                Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"color");
                Class2027 class2027 = class445.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"color.colour");
                int n = class2027.Method3626();
                Class44 class446 = this.Field11878;
                Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"radius");
                float f8 = class446.Method368();
                Class44 class447 = this.Field11880;
                Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"alphaFactor");
                Class753.drawRoundedRect1(f, f5, f6, f7, n, f8, class447.Method368());
                return;
            }
            case 3: {
                float f = Float.intBitsToFloat(1120403456);
                float f9 = Float.intBitsToFloat(1120403456);
                float f10 = Float.intBitsToFloat(1128792064);
                float f11 = Float.intBitsToFloat(1128792064);
                Class44 class448 = this.Field11878;
                Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"radius");
                float f12 = class448.Method368();
                Class44 class449 = this.Field11879;
                Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"radiusFactor");
                float f13 = class449.Method368();
                Class44 class4410 = this.Field11881;
                Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"directionX");
                float f14 = class4410.Method368();
                Class44 class4411 = this.Field11882;
                Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"directionY");
                Class753.drawBlur(f, f9, f10, f11, f12, f13, f14, class4411.Method368());
                return;
            }
        }
    }

    public Class915() {
        super("ScreenShaders", "Test of new rounded rect & blur shaders", Class97.Field8345);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 88;
            cArray2[n] = (char)(cArray[n] ^ (0x182D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

