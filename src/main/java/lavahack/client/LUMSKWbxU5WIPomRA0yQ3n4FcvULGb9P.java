//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.XOu74v224lqSTQs7rEivUfpfdaXI1IJR;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/features/module/Debug/GLScissorTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "height", "", "opened", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "speed", "width", "y", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class LUMSKWbxU5WIPomRA0yQ3n4FcvULGb9P
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12413 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Opened", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-305731686 ^ (long)-305731685)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12414 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)261955649 ^ 0x3FA999999604B9DBL), Double.longBitsToDouble(0x7407663E3FE58985L ^ 0x4B831CDF784B9DFEL), Double.longBitsToDouble((long)165702367 ^ 0x3FC999999079F345L), (boolean)((long)-249742929 ^ (long)-249742929)));
    private final double Field12415 = Double.longBitsToDouble(0xD8CBCB6647E640FBL ^ 0x98EFCB6647E640FBL);
    private final double Field12416 = Double.longBitsToDouble((long)2128199152 ^ 0x405900007ED9BDF0L);
    private final double Field12417 = Double.longBitsToDouble(0x968C8BF242B4014AL ^ 0xD6F3CBF242B4014AL);
    private String Field12418 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4127(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        double d;
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(Double.longBitsToDouble((long)645984954 ^ 0x402400002680F2BAL), this.Field12415, Double.longBitsToDouble((long)1549862963 ^ 0x405900005C610833L), Double.longBitsToDouble((long)1496716806 ^ 0x402E000059361606L), (int)-762487130L ^ 0x2D72A159);
        GL11.glPushMatrix();
        GL11.glEnable((int)((int)-1199213345L ^ 0xB88578CE));
        ScaledResolution scaledResolution = new ScaledResolution(LUMSKWbxU5WIPomRA0yQ3n4FcvULGb9P.Method4128());
        int n = scaledResolution.getScaleFactor();
        double d2 = (double)scaledResolution.getScaledHeight() - (this.Field12415 + Double.longBitsToDouble(0x12F1F849CE34018CL ^ 0x52D5F849CE34018CL)) - this.Field12417;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12413;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"opened");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field12414;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"speed");
            d = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(this.Field12417, this.Field12417, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367());
        } else {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field12414;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"speed");
            d = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(0.0, this.Field12417, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method367());
        }
        double d3 = d;
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7009((int)((long)-278173381 ^ (long)-278173378) << 1, (int)((long)1042584410 ^ (long)1042584415) << 1, (int)this.Field12416, (int)d3);
        double d4 = Double.longBitsToDouble(0x5F768DF92B64C725L ^ 0x1FF44DF92B64C725L);
        double d5 = Double.longBitsToDouble((long)427367609 ^ 0x4082C00019791CB9L);
        Color color = Color.RED;
        Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"Color.RED");
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(1.0, 1.0, d4, d5, color.getRGB());
        GL11.glDisable((int)((int)-2131788176L ^ 0x80EF7261));
        GL11.glPopMatrix();
    }

    public LUMSKWbxU5WIPomRA0yQ3n4FcvULGb9P() {
        super("GLScissorTest", "Test of GL11.glScissor() for gui animations.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    public static final Minecraft Method4128() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4129(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-674765390L ^ 0xD7C7E5B2;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1759505521L ^ 0x97201370);
            int n2 = ((int)2078534540L ^ 0x7BE3EB91) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1436083283L ^ 0xAA6718EA) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

