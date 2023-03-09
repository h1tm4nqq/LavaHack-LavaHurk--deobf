/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1047;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1945;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/features/hud/modules/TextRadar;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "friendHighlight", "limit", "offsets", "range", "targetHighlight", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "toRender", "", "", "onEnable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "update", "kisman.cc"})
public final class Class295
extends Class1249 {
    private final Class44 Field9280 = this.Method23(new Class44("Offsets", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)90390130 ^ 0x4014000005633E72L), true));
    private final Class44 Field9281 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private final Class44 Field9282 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 0, 0, 0)));
    private final Class44 Field9283 = this.Method23(new Class44("Limit", (Class42)this, Double.longBitsToDouble((long)163098745 ^ 0x4024000009B8B079L), 1.0, Double.longBitsToDouble(4636737291354636288L), true));
    private final Class44 Field9284 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), 1.0, Double.longBitsToDouble(4636737291354636288L), true));
    private final Class44 Field9285 = this.Method23(new Class44("Friend Highlight", (Class42)this, true));
    private final Class44 Field9286 = this.Method23(new Class44("Target Highlight", (Class42)this, true));
    private final Class411 Field9287 = this.Method54();
    private List Field9288;
    private String Field9289 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field9287.Method2004();
        this.Field9288.clear();
    }

    @Override
    public void Method45() {
        this.Field9287.Method2005(new Class1945(this));
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method1547(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        this.Method273(0.0);
        this.Method274(0.0);
        int n = 0;
        Iterator iterator = ((Iterable)this.Field9288).iterator();
        while (iterator.hasNext()) {
            int n2;
            String string = (String)iterator.next();
            double d = this.Method267();
            double d2 = this.Method268();
            int n3 = Class1178.Method4748();
            Class44 class44 = this.Field9280;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"offsets");
            double d3 = d2 + (double)(n * (n3 + class44.Method335()));
            Class44 class442 = this.Field9281;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"astolfo");
            if (class442.Method365()) {
                n2 = Class1172.Method4709(100, 100);
            } else {
                Class44 class443 = this.Field9282;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"color");
                Class2027 class2027 = class443.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"color.colour");
                n2 = class2027.Method3626();
            }
            Class1178.Method4745(string, d, d3, n2);
            this.Method273(Class1047.Method4282(this.Method269(), Class1178.Method4741(string)));
            int n4 = Class1178.Method4748();
            Class44 class444 = this.Field9280;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"offsets");
            this.Method274((n + 1) * (n4 + class444.Method335()));
            ++n;
        }
    }

    public Class295() {
        super("TextRadar", "troll hack moment :sunglasses:", true);
        List list;
        Class295 class295 = this;
        boolean bl = false;
        class295.Field9288 = list = (List)new ArrayList();
    }

    public static final Minecraft Method1548() {
        return Class1249.Field13656;
    }

    public static final void Method1549(Minecraft minecraft) {
        Class1249.Field13656 = minecraft;
    }

    public static final Class44 Method1550(Class295 class295) {
        return class295.Field9284;
    }

    public static final Class44 Method1551(Class295 class295) {
        return class295.Field9283;
    }

    public static final Class44 Method1552(Class295 class295) {
        return class295.Field9285;
    }

    public static final Class44 Method1553(Class295 class295) {
        return class295.Field9286;
    }

    public static final List Method1554(Class295 class295) {
        return class295.Field9288;
    }

    public static final void Method1555(Class295 class295, List list) {
        class295.Field9288 = list;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 228;
            cArray2[n] = (char)(cArray[n] ^ (0x7ABC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

