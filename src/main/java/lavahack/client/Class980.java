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
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/features/hud/modules/CurrentConfig;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class Class980
extends Class1249 {
    private final Class44 Field12190 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private String Field12191 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3991(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        this.Method274(Class1178.Method4748());
        String string = "Current Config" + TextFormatting.GRAY + ": " + (Class1796.Field16250 != null ? Class1796.Field16250 : "null");
        double d = this.Method267();
        double d2 = this.Method268();
        Class44 class44 = this.Field12190;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"astolfo");
        Class1178.Method4745(string, d, d2, class44.Method365() ? Class1172.Method4709(100, 100) : -1);
        this.Method273(Class1178.Method4741(string));
    }

    public Class980() {
        super("CurrentConfig", "Shows your current config.", true);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 34;
            cArray2[n] = (char)(cArray[n] ^ (0x2B19 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

