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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.URQTeOoz12p8Tp1N5ZsNutfk8Ab5NShz;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.uTNHNbOTD4Ge3sROsUtKSqCNUBWL02ML$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/features/module/Debug/ScreenShaders;", "Lcom/kisman/cc/features/module/Module;", "()V", "alphaFactor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "directionX", "directionY", "radius", "radiusFactor", "shader", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/module/Debug/ScreenShaders$Shader;", "test", "testAlpha", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "Shader", "kisman.cc"})
public final class uTNHNbOTD4Ge3sROsUtKSqCNUBWL02ML
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field11876 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Shader", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, uTNHNbOTD4Ge3sROsUtKSqCNUBWL02ML$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12996).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11877 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1493512874 ^ (long)-1493512791), (int)138181629L ^ 0x83C7B02, (int)1452370432L ^ 0x56916AFF, (int)((long)52096782 ^ (long)52097009))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11878 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Radius", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)391256513 ^ 0x3FB999998ECB805BL), Double.longBitsToDouble((long)524615386 ^ 0x401400001F44FEDAL), ((int)-987991530L ^ 0xC51C7216) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11879 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Radius Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)821448887 ^ 0x3FB99999A96FC92DL), Double.longBitsToDouble((long)945341793 ^ 0x3FB99999A1C15CFBL), Double.longBitsToDouble((long)1622305788 ^ 0x4000000060B26BFCL), (boolean)((long)-1513526870 ^ (long)-1513526870)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11880 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Alpha Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, 1.0, (boolean)((long)1341815966 ^ (long)1341815966)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11881 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Direction X", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0xC8BCC3955C2F4D2EL ^ 0x8BCC3955C2F4D2EL), Double.longBitsToDouble(0xCB800710FA8E0CA7L ^ 0x8B800710FA8E0CA7L), ((int)-1376605769L ^ 0xADF2A9B7) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11882 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Direction Y", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0xD3DD9FF10C68B40DL ^ 0x13DD9FF10C68B40DL), Double.longBitsToDouble((long)2130889807 ^ 0x400000007F02CC4FL), (boolean)((long)-768561275 ^ (long)-768561275)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11883 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Test", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-844561450L ^ 0xCDA903D6) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11884 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Test Alpha", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x7CD41ED43D1807CBL ^ 0x3CBBFED43D1807CBL), (boolean)((long)-697697307 ^ (long)-697697308)));
    private int Field11885;

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3827(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field11883;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"test");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            double d = Double.longBitsToDouble(0xC9CCC8E1F15869F8L ^ 0x8995C8E1F15869F8L);
            double d2 = Double.longBitsToDouble((long)906436050 ^ 0x4059000036071DD2L);
            double d3 = Double.longBitsToDouble((long)741482052 ^ 0x405900002C321E44L);
            double d4 = Double.longBitsToDouble((long)810746700 ^ 0x405900003053034CL);
            int n = (int)((long)53409022 ^ (long)53408769);
            int n2 = (int)((long)-2044815988 ^ (long)-2044816013);
            int n3 = (int)986074066L ^ 0x3AC64B2D;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field11884;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"testAlpha");
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(d, d2, d3, d4, new Color(n, n2, n3, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335()).getRGB());
        }
        switch (URQTeOoz12p8Tp1N5ZsNutfk8Ab5NShz.Field9198[((uTNHNbOTD4Ge3sROsUtKSqCNUBWL02ML$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field11876.Method341()).ordinal()]) {
            case 1: {
                float f = Float.intBitsToFloat((int)1095736202L ^ 0x3879B8A);
                float f2 = Float.intBitsToFloat((int)1520712838L ^ 0x186C3C86);
                float f3 = Float.intBitsToFloat((int)((long)566165781 ^ (long)1660354837));
                float f4 = Float.intBitsToFloat((int)((long)956434580 ^ (long)2051672212));
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field11877;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"color");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color.colour");
                int n = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3626();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field11878;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"radius");
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect(f, f2, f3, f4, n, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method368());
                return;
            }
            case 2: {
                float f = Float.intBitsToFloat((int)((long)1957136746 ^ (long)913279338));
                float f5 = Float.intBitsToFloat((int)((long)1066640848 ^ (long)2103158224));
                float f6 = Float.intBitsToFloat((int)272216577L ^ 0x5371B201);
                float f7 = Float.intBitsToFloat((int)((long)1136572086 ^ (long)0xF6B6B6));
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field11877;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"color");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"color.colour");
                int n = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3626();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field11878;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"radius");
                float f8 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method368();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field11880;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"alphaFactor");
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect1(f, f5, f6, f7, n, f8, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method368());
                return;
            }
            case 3: {
                float f = Float.intBitsToFloat((int)((long)977328653 ^ (long)2022234637));
                float f9 = Float.intBitsToFloat(0x2DFDF9CA ^ 0x6F35F9CA);
                float f10 = Float.intBitsToFloat((int)((long)155129646 ^ (long)1249318702));
                float f11 = Float.intBitsToFloat(0x606034E4 ^ 0x232834E4);
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = this.Field11878;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"radius");
                float f12 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method368();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = this.Field11879;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"radiusFactor");
                float f13 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method368();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = this.Field11881;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"directionX");
                float f14 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11.Method368();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = this.Field11882;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"directionY");
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawBlur(f, f9, f10, f11, f12, f13, f14, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12.Method368());
                return;
            }
        }
    }

    public uTNHNbOTD4Ge3sROsUtKSqCNUBWL02ML() {
        super("ScreenShaders", "Test of new rounded rect & blur shaders", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)902503630 ^ (long)902503630);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)338855254 ^ (long)338855337);
            int n2 = (int)((long)-1724223342 ^ (long)-1724223335) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-592221188L ^ 0xDCB373D1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

