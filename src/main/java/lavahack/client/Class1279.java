//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import java.awt.*;
import kotlin.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/gui/MainGui$GuiGradient;", "", "()V", "drawScreen", "", "mouseX", "", "mouseY", "getEndColor", "Ljava/awt/Color;", "getStartColor", "kisman.cc" })
public final class Class1279
{
    private int Field13765;
    
    public final void Method5122(final int n, final int n2) {
        final Class44 field11796 = null.Field11796;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11796, "Config.instance.guiGradientBackground");
        if (field11796.Method365()) {
            Class753.drawAbstract(new Class211(new Class340(new double[] { 0.0, 0.0 }, new double[] { new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth_double(), 0.0 }, new double[] { new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth_double(), new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight_double() }, new double[] { 0.0, new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight_double() }), this.Method5123(), this.Method5124(), true));
        }
    }
    
    private final Color Method5123() {
        final Class44 field11799 = null.Field11799;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11799, "Config.instance.ggbStartColorMode");
        final Enum method341 = field11799.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.client.Config.GGBColorMode");
        }
        Color method343 = null;
        switch (Class2172.Field17941[((Class1512)method341).ordinal()]) {
            case 1: {
                final Class44 field11800 = null.Field11800;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11800, "Config.instance.ggbStartColor");
                final Class2027 method342 = field11800.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method342, "Config.instance.ggbStartColor.colour");
                Intrinsics.checkExpressionValueIsNotNull((Object)(method343 = method342.Method3625()), "Config.instance.ggbStartColor.colour.color");
                break;
            }
            case 2: {
                Color color;
                if (Minecraft.getMinecraft().currentScreen instanceof Class1419 || Minecraft.getMinecraft().currentScreen instanceof Class1748) {
                    final Class2027 method344 = Class1419.Method1228(0);
                    Intrinsics.checkExpressionValueIsNotNull((Object)method344, "HalqGui.getGradientColour(0)");
                    method343 = (color = method344.Method3625());
                }
                else {
                    final Class44 field11801 = null.Field11800;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field11801, "Config.instance.ggbStartColor");
                    final Class2027 method345 = field11801.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method345, "Config.instance.ggbStartColor.colour");
                    method343 = (color = method345.Method3625());
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)color, "if(Minecraft.getMinecraf\u2026lor\n                    }");
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return method343;
    }
    
    private final Color Method5124() {
        final Class44 field11801 = null.Field11801;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11801, "Config.instance.ggbEndColorMode");
        final Enum method341 = field11801.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.client.Config.GGBColorMode");
        }
        Color method343 = null;
        switch (Class2172.Field17942[((Class1512)method341).ordinal()]) {
            case 1: {
                final Class44 field11802 = null.Field11802;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11802, "Config.instance.ggbEndColor");
                final Class2027 method342 = field11802.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method342, "Config.instance.ggbEndColor.colour");
                Intrinsics.checkExpressionValueIsNotNull((Object)(method343 = method342.Method3625()), "Config.instance.ggbEndColor.colour.color");
                break;
            }
            case 2: {
                Color color;
                if (Minecraft.getMinecraft().currentScreen instanceof Class1419 || Minecraft.getMinecraft().currentScreen instanceof Class1748) {
                    final Class2027 method344 = Class1419.Method1228(0);
                    Intrinsics.checkExpressionValueIsNotNull((Object)method344, "HalqGui.getGradientColour(0)");
                    method343 = (color = method344.Method3625());
                }
                else {
                    final Class44 field11803 = null.Field11802;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field11803, "Config.instance.ggbEndColor");
                    final Class2027 method345 = field11803.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method345, "Config.instance.ggbEndColor.colour");
                    method343 = (color = method345.Method3625());
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)color, "if(Minecraft.getMinecraf\u2026lor\n                    }");
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return method343;
    }
    
    private static String Method5125(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x35C8 ^ 0xA0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
