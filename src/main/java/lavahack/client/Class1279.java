//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1419;
import lavahack.client.Class1512;
import lavahack.client.Class1748;
import lavahack.client.Class211;
import lavahack.client.Class2172;
import lavahack.client.Class340;
import lavahack.client.Class44;
import lavahack.client.Class753;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/gui/MainGui$GuiGradient;", "", "()V", "drawScreen", "", "mouseX", "", "mouseY", "getEndColor", "Ljava/awt/Color;", "getStartColor", "kisman.cc"})
public final class Class1279 {
    private int Field13765;

    public final void Method5122(int n, int n2) {
        Class44 class44 = null.Field11796;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Config.instance.guiGradientBackground");
        if (!class44.Method365()) return;
        Class753.drawAbstract(new Class211(new Class340(new double[]{0.0, 0.0}, new double[]{new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth_double(), 0.0}, new double[]{new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth_double(), new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight_double()}, new double[]{0.0, new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight_double()}), this.Method5123(), this.Method5124(), true));
    }

    private final Color Method5123() {
        Class44 class44 = null.Field11799;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Config.instance.ggbStartColorMode");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.client.Config.GGBColorMode");
        }
        switch (Class2172.Field17941[((Class1512)enum_).ordinal()]) {
            case 1: {
                Class44 class442 = null.Field11800;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Config.instance.ggbStartColor");
                Class2027 class2027 = class442.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"Config.instance.ggbStartColor.colour");
                Color color = class2027.Method3625();
                Color color2 = color;
                Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"Config.instance.ggbStartColor.colour.color");
                return color2;
            }
            case 2: {
                Color color;
                if (Minecraft.getMinecraft().currentScreen instanceof Class1419 || Minecraft.getMinecraft().currentScreen instanceof Class1748) {
                    Class2027 class2027 = Class1419.Method1228(0);
                    Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"HalqGui.getGradientColour(0)");
                    color = class2027.Method3625();
                } else {
                    Class44 class443 = null.Field11800;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Config.instance.ggbStartColor");
                    Class2027 class2027 = class443.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"Config.instance.ggbStartColor.colour");
                    color = class2027.Method3625();
                }
                Color color2 = color;
                Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"if(Minecraft.getMinecraf\u2026lor\n                    }");
                return color2;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Color Method5124() {
        Class44 class44 = null.Field11801;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Config.instance.ggbEndColorMode");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.client.Config.GGBColorMode");
        }
        switch (Class2172.Field17942[((Class1512)enum_).ordinal()]) {
            case 1: {
                Class44 class442 = null.Field11802;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Config.instance.ggbEndColor");
                Class2027 class2027 = class442.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"Config.instance.ggbEndColor.colour");
                Color color = class2027.Method3625();
                Color color2 = color;
                Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"Config.instance.ggbEndColor.colour.color");
                return color2;
            }
            case 2: {
                Color color;
                if (Minecraft.getMinecraft().currentScreen instanceof Class1419 || Minecraft.getMinecraft().currentScreen instanceof Class1748) {
                    Class2027 class2027 = Class1419.Method1228(0);
                    Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"HalqGui.getGradientColour(0)");
                    color = class2027.Method3625();
                } else {
                    Class44 class443 = null.Field11802;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Config.instance.ggbEndColor");
                    Class2027 class2027 = class443.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"Config.instance.ggbEndColor.colour");
                    color = class2027.Method3625();
                }
                Color color2 = color;
                Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"if(Minecraft.getMinecraf\u2026lor\n                    }");
                return color2;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    private static String Method5125(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 160;
            cArray2[n] = (char)(cArray[n] ^ (0x35C8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

