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

import java.awt.Color;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1443;
import lavahack.client.Class1796;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class753;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/features/hud/modules/PearlCooldown;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "cooldownOnCC", "", "lastPearlTimestamp", "send", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "getCooldown", "getCurrentCooldown", "getXCoordByCooldown", "", "cooldown", "haveCooldown", "", "onDisable", "", "onEnable", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class Class1031
extends Class1249 {
    private final Class44 Field12523 = this.Method23(new Class44("Astolfo", (Class42)this, false));
    private final long Field12524 = 60000L;
    private long Field12525;
    private final Class618 Field12526 = new Class618((Class254)new Class1443(this), new Predicate[0]);
    private String Field12527 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field12526);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field12526);
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4172(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        double d = this.Method267();
        double d2 = this.Method268();
        Class44 class44 = this.Field12523;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"astolfo");
        Class1178.Method4745("Pearl Cooldown", d, d2, class44.Method365() ? Class1172.Method4709(100, 100) : -1);
        this.Method273(Class1178.Method4741("Pearl Cooldown"));
        this.Method274(Class1178.Method4748() + 2);
        double d3 = this.Method267();
        double d4 = this.Method268() + (double)Class1178.Method4748() + 1.0;
        double d5 = this.Method269();
        Color color = Color.GRAY;
        Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"Color.GRAY");
        Class753.drawRectWH(d3, d4, d5, 1.0, color.getRGB());
        double d6 = this.Method267();
        double d7 = this.Method268() + (double)Class1178.Method4748() + 1.0;
        double d8 = this.Method4174(this.Method4175());
        Class44 class442 = this.Field12523;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"astolfo");
        Class753.drawRectWH(d6, d7, d8, 1.0, class442.Method365() ? Class1172.Method4709(100, 100) : -1);
    }

    private final boolean Method4173() {
        if (this.Method4175() < this.Method4176()) return false;
        return true;
    }

    private final double Method4174(long l) {
        return (double)(this.Method4176() / l) * this.Method269();
    }

    private final long Method4175() {
        return System.currentTimeMillis() - this.Field12525;
    }

    private final long Method4176() {
        return this.Field12524;
    }

    public Class1031() {
        super("PearlCooldown", "Shows your pearl cooldown, very helps on crystalpvp.cc", true);
    }

    public static final boolean Method4177(Class1031 class1031) {
        return class1031.Method4173();
    }

    public static final Minecraft Method4178() {
        return Class1249.Field13656;
    }

    public static final void Method4179(Minecraft minecraft) {
        Class1249.Field13656 = minecraft;
    }

    public static final long Method4180(Class1031 class1031) {
        return class1031.Field12525;
    }

    public static final void Method4181(Class1031 class1031, long l) {
        class1031.Field12525 = l;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 239;
            cArray2[n] = (char)(cArray[n] ^ (0x77ED ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

