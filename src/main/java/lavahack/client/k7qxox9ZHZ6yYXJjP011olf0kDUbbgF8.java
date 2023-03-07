/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/features/hud/modules/CurrentConfig;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class k7qxox9ZHZ6yYXJjP011olf0kDUbbgF8
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12190 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1991051767 ^ (long)1991051766)));
    private String Field12191 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3991(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        this.Method274(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
        String string = "Current Config" + TextFormatting.GRAY + ": " + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16250 != null ? leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16250 : "null");
        double d = this.Method267();
        double d2 = this.Method268();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12190;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"astolfo");
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, d, d2, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-1877590932 ^ (long)-1877590923) << 2, ((int)395437771L ^ 0x1791E6D2) << 2) : (int)476527774L ^ 0xE398C361);
        this.Method273(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string));
    }

    public k7qxox9ZHZ6yYXJjP011olf0kDUbbgF8() {
        super("CurrentConfig", "Shows your current config.", ((int)1757292577L ^ 0x68BE2820) != 0);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-960419347L ^ 0xC6C129ED;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-477050015L ^ 0xE390CB9E);
            int n2 = ((int)673599628L ^ 0x2826509D) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1031538238 ^ (long)-1031548197) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

