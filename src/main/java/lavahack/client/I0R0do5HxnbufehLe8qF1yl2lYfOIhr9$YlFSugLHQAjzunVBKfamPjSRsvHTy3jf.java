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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
import lavahack.client.gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.r7R6Aj9RLuoURisX3RBfeS6ZoORUmeu8;
import lavahack.client.sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI;
import lavahack.client.vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/gui/MainGui$GuiGradient;", "", "()V", "drawScreen", "", "mouseX", "", "mouseY", "getEndColor", "Ljava/awt/Color;", "getStartColor", "kisman.cc"})
public final class I0R0do5HxnbufehLe8qF1yl2lYfOIhr9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    private int Field13765;

    public final void Method5122(int n, int n2) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = null.Field11796;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Config.instance.guiGradientBackground");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        double[] dArray = new double[(int)((long)2112331149 ^ (long)2112331148) << 1];
        dArray[(int)((long)-2134463867 ^ (long)-2134463867)] = 0.0;
        dArray[(int)-1236322054L ^ 0xB64F38FB] = 0.0;
        double[] dArray2 = new double[(int)((long)348283535 ^ (long)348283534) << 1];
        dArray2[(int)((long)-1543535810 ^ (long)-1543535810)] = new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth_double();
        dArray2[(int)((long)2041388601 ^ (long)2041388600)] = 0.0;
        double[] dArray3 = new double[(int)((long)-1043490728 ^ (long)-1043490727) << 1];
        dArray3[(int)((long)496003350 ^ (long)496003350)] = new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth_double();
        dArray3[(int)((long)826553331 ^ (long)826553330)] = new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight_double();
        double[] dArray4 = new double[((int)619642425L ^ 0x24EEFE38) << 1];
        dArray4[(int)((long)1495142804 ^ (long)1495142804)] = 0.0;
        dArray4[(int)((long)2066044062 ^ (long)2066044063)] = new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight_double();
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract(new gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3(new Jl14CJNmtWTqlp58umYadtnd800b2Vd0(dArray, dArray2, dArray3, dArray4), this.Method5123(), this.Method5124(), ((int)-1169873549L ^ 0xBA452572) != 0));
    }

    private final Color Method5123() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = null.Field11799;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Config.instance.ggbStartColorMode");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.client.Config.GGBColorMode");
        }
        switch (r7R6Aj9RLuoURisX3RBfeS6ZoORUmeu8.Field17941[((vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)enum_).ordinal()]) {
            case 1: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = null.Field11800;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Config.instance.ggbStartColor");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"Config.instance.ggbStartColor.colour");
                Color color = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3625();
                Color color2 = color;
                Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"Config.instance.ggbStartColor.colour.color");
                return color2;
            }
            case 2: {
                Color color;
                if (Minecraft.getMinecraft().currentScreen instanceof zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4 || Minecraft.getMinecraft().currentScreen instanceof sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI) {
                    vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228((int)1927629897L ^ 0x72E54C49);
                    Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"HalqGui.getGradientColour(0)");
                    color = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3625();
                } else {
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = null.Field11800;
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Config.instance.ggbStartColor");
                    vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"Config.instance.ggbStartColor.colour");
                    color = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Method3625();
                }
                Color color2 = color;
                Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"if(Minecraft.getMinecraf\u2026lor\n                    }");
                return color2;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Color Method5124() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = null.Field11801;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Config.instance.ggbEndColorMode");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.client.Config.GGBColorMode");
        }
        switch (r7R6Aj9RLuoURisX3RBfeS6ZoORUmeu8.Field17942[((vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)enum_).ordinal()]) {
            case 1: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = null.Field11802;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Config.instance.ggbEndColor");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"Config.instance.ggbEndColor.colour");
                Color color = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3625();
                Color color2 = color;
                Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"Config.instance.ggbEndColor.colour.color");
                return color2;
            }
            case 2: {
                Color color;
                if (Minecraft.getMinecraft().currentScreen instanceof zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4 || Minecraft.getMinecraft().currentScreen instanceof sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI) {
                    vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228((int)1724998795L ^ 0x66D1648B);
                    Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"HalqGui.getGradientColour(0)");
                    color = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3625();
                } else {
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = null.Field11802;
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Config.instance.ggbEndColor");
                    vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"Config.instance.ggbEndColor.colour");
                    color = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Method3625();
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
        int n = (int)-1909886518L ^ 0x8E2971CA;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-784250297L ^ 0xD1414AB8);
            int n2 = ((int)-263269403L ^ 0xF04ED3E0) << 5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1077536469 ^ (long)1077534828) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

