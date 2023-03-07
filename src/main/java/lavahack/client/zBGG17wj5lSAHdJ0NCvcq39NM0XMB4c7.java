/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.awt.Font;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/Debug/FallbackableFontTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "font", "Lcom/kisman/cc/util/render/customfont/FallbackableFont;", "getFont", "()Lcom/kisman/cc/util/render/customfont/FallbackableFont;", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class zBGG17wj5lSAHdJ0NCvcq39NM0XMB4c7
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @NotNull
    private final I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N Field10339;
    private String Field10340 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N Method2459() {
        return this.Field10339;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method2460(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        this.Field10339.Method759("\u041f\u0440\u0438\u0432\u0435\u0442 uww!", Double.longBitsToDouble(0x2D93653ADEDC783DL ^ 0x6DCA653ADEDC783DL), Double.longBitsToDouble((long)993502834 ^ 0x405900003B37A672L), (int)((long)1379500060 ^ (long)-1379500061), (boolean)((long)870878814 ^ (long)870878815));
    }

    public zBGG17wj5lSAHdJ0NCvcq39NM0XMB4c7() {
        super("FallbackableFontTest", "Test of fallback fonts", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
        Font font = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4739("comfortaa-bold", ((int)-2078990840L ^ 0x84151E01) << 1);
        Intrinsics.checkExpressionValueIsNotNull((Object)font, (String)"CustomFontUtil.getFontTTF(\"comfortaa-bold\", 18)");
        Font font2 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4739("futura-normal", ((int)-2049870128L ^ 0x85D176D9) << 1);
        Intrinsics.checkExpressionValueIsNotNull((Object)font2, (String)"CustomFontUtil.getFontTTF(\"futura-normal\", 18)");
        this.Field10339 = new I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N(font, font2);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1567910310L ^ 0xA28B965A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1498313842L ^ 0xA6B18B71);
            int n2 = (int)((long)1994058652 ^ (long)1994058529);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)893331311 ^ (long)893344544) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

