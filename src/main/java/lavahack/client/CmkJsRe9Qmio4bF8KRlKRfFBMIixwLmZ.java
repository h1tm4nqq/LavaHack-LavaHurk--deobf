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
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ$1;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZOOLcxr6qh5vzX246oAdLMZUY3pjsnFp;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.t78OP2bAm0IpqKGogPcm5ldff27AWz8I;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/features/hud/modules/Speed;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "prevPosX", "", "prevPosZ", "speedUnit", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "onEnable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17796 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)4374726L ^ 0x42C0C7) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17797 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-1663178768L ^ 0x9CDDE70F, (int)526031299L ^ 0x1F5A993C, (int)((long)730419746 ^ (long)730419933), (int)1433265189L ^ 0x556DE4DA)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17798 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed Unit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, t78OP2bAm0IpqKGogPcm5ldff27AWz8I.Field14187));
    @NotNull
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field17799 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private double Field17800;
    private double Field17801;
    private String Field17802 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Method7712() {
        return this.Field17799;
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field17799.Method2801();
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method7713(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        int n;
        String string;
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        if (this.Field17799.Method2797(0x1483FCL & 0x1E800BE8L)) {
            this.Field17800 = CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ.Method7714().player.prevPosX;
            this.Field17801 = CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ.Method7714().player.prevPosZ;
        }
        double d = CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ.Method7714().player.posX - this.Field17800;
        double d2 = CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ.Method7714().player.posZ - this.Field17801;
        float f = MathHelper.sqrt((double)(d * d + d2 * d2));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field17798;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"speedUnit");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
        }
        switch (ZOOLcxr6qh5vzX246oAdLMZUY3pjsnFp.Field16995[((t78OP2bAm0IpqKGogPcm5ldff27AWz8I)enum_).ordinal()]) {
            case 1: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field17798;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"speedUnit");
                Enum enum_2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341();
                if (enum_2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
                }
                String string2 = ((t78OP2bAm0IpqKGogPcm5ldff27AWz8I)enum_2).Method5426().format(Float.valueOf(f * (float)(((int)1927066390L ^ 0x72DCB313) << 2)));
                string = string2;
                Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"(speedUnit.valEnum as Sp\u2026r.format((distance * 20))");
                break;
            }
            case 2: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field17798;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"speedUnit");
                Enum enum_3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method341();
                if (enum_3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
                }
                double d3 = (double)(f / (float)(((int)927030686L ^ 0x37415DE3) << 3)) / Double.longBitsToDouble(0xDF9E45ABA878BA1CL ^ 0xE1736521F2E9942EL);
                DecimalFormat decimalFormat = ((t78OP2bAm0IpqKGogPcm5ldff27AWz8I)enum_3).Method5426();
                int n2 = (int)((long)972672385 ^ (long)972672385);
                double d4 = Math.floor(d3);
                String string3 = decimalFormat.format(d4);
                string = string3;
                Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"(speedUnit.valEnum as Sp\u2026/ 1000) / (0.05 / 3600)))");
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        String string4 = string;
        StringBuilder stringBuilder = new StringBuilder().append("Speed: ").append(TextFormatting.GRAY).append(string4).append(((int)639304541L ^ 0x261B035C) << 5);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field17798;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"speedUnit");
        Enum enum_4 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method341();
        if (enum_4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
        }
        String string5 = stringBuilder.append(((t78OP2bAm0IpqKGogPcm5ldff27AWz8I)enum_4).Method5427()).toString();
        double d5 = this.Method267();
        double d6 = this.Method268();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field17796;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"astolfo");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) {
            n = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)1563018181 ^ (long)1563018204) << 2, ((int)1017451374L ^ 0x3CA51377) << 2);
        } else {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field17797;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"color");
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method339();
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color.colour");
            n = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3626();
        }
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string5, d5, d6, n);
        this.Method273(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string5));
        this.Method274(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
    }

    public CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ() {
        super("Speed", "Displays your current speed.", (boolean)((long)-580758840 ^ (long)-580758839));
        super.Method44(new CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ$1(this));
    }

    public static final Minecraft Method7714() {
        return qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2.Field13656;
    }

    public static final void Method7715(Minecraft minecraft) {
        qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2.Field13656 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7716(CmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ cmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ) {
        return cmkJsRe9Qmio4bF8KRlKRfFBMIixwLmZ.Field17798;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1512038360 ^ (long)-1512038360);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-537026483L ^ 0xDFFDA0B2);
            int n2 = (int)((long)-1632271204 ^ (long)-1632271135);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1261452653 ^ (long)1261450992) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

