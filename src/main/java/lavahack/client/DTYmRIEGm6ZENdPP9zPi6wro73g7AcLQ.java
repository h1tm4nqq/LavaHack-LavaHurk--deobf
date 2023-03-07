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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/features/hud/modules/PearlCooldown;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "cooldownOnCC", "", "lastPearlTimestamp", "send", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "getCooldown", "getCurrentCooldown", "getXCoordByCooldown", "", "cooldown", "haveCooldown", "", "onDisable", "", "onEnable", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12523 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1664336377L ^ 0x6333C1F9) != 0));
    private final long Field12524 = 0x826EA62L & 0x2740FA65L;
    private long Field12525;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12526 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this), new Predicate[(int)-1266924132L ^ 0xB47C459C]);
    private String Field12527 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12526);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12526);
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4172(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        double d = this.Method267();
        double d2 = this.Method268();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12523;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"astolfo");
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Pearl Cooldown", d, d2, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-1366807076 ^ (long)-1366807099) << 2, ((int)1186987920L ^ 0x46BFFF89) << 2) : (int)((long)-895840073 ^ (long)895840072));
        this.Method273(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Pearl Cooldown"));
        this.Method274(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + (((int)-1817643049L ^ 0x93A8F7D6) << 1));
        double d3 = this.Method267();
        double d4 = this.Method268() + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + (double)((int)((long)-1407254963 ^ (long)-1407254964));
        double d5 = this.Method269();
        Color color = Color.GRAY;
        Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"Color.GRAY");
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(d3, d4, d5, 1.0, color.getRGB());
        double d6 = this.Method267();
        double d7 = this.Method268() + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + (double)((int)((long)460320883 ^ (long)460320882));
        double d8 = this.Method4174(this.Method4175());
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field12523;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"astolfo");
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(d6, d7, d8, 1.0, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)1386432901L ^ 0x52A3499C) << 2, ((int)1596412425L ^ 0x5F275210) << 2) : (int)-694086004L ^ 0x295EE973);
    }

    private final boolean Method4173() {
        int n;
        if (this.Method4175() >= this.Method4176()) {
            n = (int)-872958205L ^ 0xCBF7B702;
            return n != 0;
        }
        n = (int)((long)870869931 ^ (long)870869931);
        return n != 0;
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

    public DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ() {
        super("PearlCooldown", "Shows your pearl cooldown, very helps on crystalpvp.cc", ((int)-533582020L ^ 0xE0322F3D) != 0);
    }

    public static final boolean Method4177(DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ dTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ) {
        return dTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ.Method4173();
    }

    public static final Minecraft Method4178() {
        return qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2.Field13656;
    }

    public static final void Method4179(Minecraft minecraft) {
        qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2.Field13656 = minecraft;
    }

    public static final long Method4180(DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ dTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ) {
        return dTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ.Field12525;
    }

    public static final void Method4181(DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ dTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ, long l) {
        dTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ.Field12525 = l;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1523002371 ^ (long)1523002371);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)583021594L ^ 0x22C034E5);
            int n2 = (int)((long)-1366700166 ^ (long)-1366700139);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1668428254L ^ 0x9C8DB9CF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

