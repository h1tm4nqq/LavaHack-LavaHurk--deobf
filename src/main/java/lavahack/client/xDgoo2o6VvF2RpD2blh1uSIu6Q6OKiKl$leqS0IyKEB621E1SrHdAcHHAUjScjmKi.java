//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.GlStateManager
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DWxN8wLIsLoeYiSaIuBiecHxwmChdruN;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl;
import net.minecraft.client.renderer.GlStateManager;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventItemRenderer;", "kotlin.jvm.PlatformType", "invoke"})
final class xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15979 = new xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private String Field15980 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6618((DWxN8wLIsLoeYiSaIuBiecHxwmChdruN)object);
    }

    public final void Method6618(DWxN8wLIsLoeYiSaIuBiecHxwmChdruN dWxN8wLIsLoeYiSaIuBiecHxwmChdruN) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Method4682(xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13248);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"handRotateX");
        GlStateManager.rotate((float)(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method368() * dWxN8wLIsLoeYiSaIuBiecHxwmChdruN.Field15601), (float)1.0f, (float)0.0f, (float)0.0f);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Method4683(xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13248);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"handRotateY");
        GlStateManager.rotate((float)(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method368() * dWxN8wLIsLoeYiSaIuBiecHxwmChdruN.Field15601), (float)0.0f, (float)1.0f, (float)0.0f);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Method4684(xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13248);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"handRotateZ");
        GlStateManager.rotate((float)(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method368() * dWxN8wLIsLoeYiSaIuBiecHxwmChdruN.Field15601), (float)0.0f, (float)0.0f, (float)1.0f);
    }

    xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    private static String Method6619(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1508347251L ^ 0xA618728D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-551321084L ^ 0xDF2382FB);
            int n2 = ((int)2108558013L ^ 0x7DAE0ABC) << 7;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-592206963 ^ (long)-592207630) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

