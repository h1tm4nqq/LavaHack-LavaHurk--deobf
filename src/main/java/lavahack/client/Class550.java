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
import lavahack.client.Class1178;
import lavahack.client.Class1354;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/Debug/FallbackableFontTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "font", "Lcom/kisman/cc/util/render/customfont/FallbackableFont;", "getFont", "()Lcom/kisman/cc/util/render/customfont/FallbackableFont;", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class Class550
extends Class42 {
    @NotNull
    private final Class1354 Field10339;
    private String Field10340 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1354 Method2459() {
        return this.Field10339;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method2460(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        this.Field10339.Method759("\u041f\u0440\u0438\u0432\u0435\u0442 uww!", Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble((long)993502834 ^ 0x405900003B37A672L), -1, true);
    }

    public Class550() {
        super("FallbackableFontTest", "Test of fallback fonts", Class97.Field8345);
        Font font = Class1178.Method4739("comfortaa-bold", 18);
        Intrinsics.checkExpressionValueIsNotNull((Object)font, (String)"CustomFontUtil.getFontTTF(\"comfortaa-bold\", 18)");
        Font font2 = Class1178.Method4739("futura-normal", 18);
        Intrinsics.checkExpressionValueIsNotNull((Object)font2, (String)"CustomFontUtil.getFontTTF(\"futura-normal\", 18)");
        this.Field10339 = new Class1354(font, font2);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 189;
            cArray2[n] = (char)(cArray[n] ^ (0x7C4F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

