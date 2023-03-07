//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiDownloadTerrain
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.EO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.gIvxvpNAI6XugtMxK19p7peBbgdbr5DL;
import lavahack.client.ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.kuf37sLYG4IC7svenBai9Ct5aGFtOEqd;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@EO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8(mode=2)
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\u0016\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020*H\u0016R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0019\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0019\u0010\u001e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0016\u0010 \u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0019\u0010#\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\u0019\u0010%\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0007R\u0019\u0010'\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0007\u00a8\u00063"}, d2={"Lcom/kisman/cc/features/nocom/modules/NoComTrackerModule;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoSpiral", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getAutoSpiral", "()Lcom/kisman/cc/settings/Setting;", "autoSpiralGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "beatPos", "Lnet/minecraft/util/math/BlockPos;", "debug", "getDebug", "debugErrors", "getDebugErrors", "isBeating", "", "notify", "getNotify", "player", "Lcom/kisman/cc/features/nocom/modules/tracker/TrackedPlayer;", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "renderDistance", "getRenderDistance", "spiralAutoDisable", "spiralChunkStep", "getSpiralChunkStep", "spiralPPT", "getSpiralPPT", "spiralRange", "spiralTrigger", "getSpiralTrigger", "timeOut", "getTimeOut", "x", "getX", "z", "getZ", "onDisable", "", "onEnable", "print", "message", "", "handler", "Lcom/kisman/cc/util/chat/cubic/AbstractChatMessage;", "update", "Companion", "kisman.cc"})
public final class ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10102 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("X", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)1345635953 ^ 0xC08F40005034C671L), Double.longBitsToDouble(0x9A3AFE2EAB2A908EL ^ 0xDAB5BE2EAB2A908EL), (boolean)((long)-1619598433 ^ (long)-1619598434)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10103 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Z", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0xBC180B2210F656D9L ^ 0x7C974B2210F656D9L), Double.longBitsToDouble((long)1223751858 ^ 0x408F400048F0F8B2L), (boolean)((long)-1850641641 ^ (long)-1850641642)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10104 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Time Out", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x73D0E7479D324E4FL ^ 0x33736F479D324E4FL), Double.longBitsToDouble(0x6790EC51EF0714BAL ^ 0x27B4EC51EF0714BAL), Double.longBitsToDouble(0x44B020654CAA13F9L ^ 0x473A8654CAA13F9L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10105 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Debug", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-590672648L ^ 0xDCCB0CF8) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10106 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Debug Errors", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1338652487L ^ 0x4FCA3746) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10107 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Notify", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)100737340 ^ (long)100737341)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10108 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Distance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x141E16B30D40CDD4L ^ 0x540E16B30D40CDD4L), 1.0, Double.longBitsToDouble((long)1799556431 ^ 0x402000006B430D4FL), (boolean)((long)909176447 ^ (long)909176446)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10109 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Spiral", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)290894187 ^ (long)290894186)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field10110 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Spiral", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10111;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10112;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10113;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10114;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10115;
    private kuf37sLYG4IC7svenBai9Ct5aGFtOEqd Field10116;
    private BlockPos Field10117;
    private boolean Field10118;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10119;
    @Nullable
    private static ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 Field10120;
    public static final ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10121;
    private int Field10122;

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2317() {
        return this.Field10102;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2318() {
        return this.Field10103;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2319() {
        return this.Field10104;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2320() {
        return this.Field10105;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2321() {
        return this.Field10106;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2322() {
        return this.Field10107;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2323() {
        return this.Field10108;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2324() {
        return this.Field10109;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2325() {
        return this.Field10111;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2326() {
        return this.Field10112;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2327() {
        return this.Field10113;
    }

    @Override
    public void Method38() {
        super.Method38();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2329().player == null) return;
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2329().world == null) {
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field10102;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"x");
        int n = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field10103;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"z");
        this.Field10116 = new kuf37sLYG4IC7svenBai9Ct5aGFtOEqd(n, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335());
    }

    @Override
    public void Method39() {
        super.Method39();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2329().player == null) return;
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2329().world == null) return;
        if (this.Field10116 == null) return;
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503();
        kuf37sLYG4IC7svenBai9Ct5aGFtOEqd kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2 = this.Field10116;
        if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2 == null) {
            Intrinsics.throwNpe();
        }
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2.Method1886(kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2.Method4517());
    }

    @Override
    public void Method45() {
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2329().player == null) return;
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2329().world == null) return;
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2329().currentScreen instanceof GuiDownloadTerrain) {
            return;
        }
        if (this.Field10116 == null) {
            this.Method22();
        }
        kuf37sLYG4IC7svenBai9Ct5aGFtOEqd kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2 = this.Field10116;
        if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2 == null) {
            Intrinsics.throwNpe();
        }
        if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2.Method4502()) {
            kuf37sLYG4IC7svenBai9Ct5aGFtOEqd kuf37sLYG4IC7svenBai9Ct5aGFtOEqd3 = this.Field10116;
            if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd3 == null) {
                Intrinsics.throwNpe();
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field10115;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"spiralRange");
            if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd3.Method4506(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335())) return;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field10114;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"spiralAutoDisable");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) return;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field10106;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"debugErrors");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Spiral scan failed... disabling module rip");
            }
            this.Method22();
            return;
        }
        kuf37sLYG4IC7svenBai9Ct5aGFtOEqd kuf37sLYG4IC7svenBai9Ct5aGFtOEqd4 = this.Field10116;
        if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd4 == null) {
            Intrinsics.throwNpe();
        }
        if (kuf37sLYG4IC7svenBai9Ct5aGFtOEqd4.Method4508()) {
            this.Field10118 = (int)1360523385L ^ 0x5117F078;
        }
        if (!this.Field10118) return;
        EntityPlayerSP entityPlayerSP = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2329().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        this.Field10117 = entityPlayerSP.getPosition().down(((int)2089564616L ^ 0x7C8C39CD) << 1);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field10105;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"debug");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886("BEATING...");
        }
        NetHandlerPlayClient netHandlerPlayClient = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Method2329().player.connection;
        BlockPos blockPos = this.Field10117;
        if (blockPos == null) {
            Intrinsics.throwNpe();
        }
        netHandlerPlayClient.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, blockPos, EnumFacing.UP));
        this.Field10118 = (int)((long)-1373839614 ^ (long)-1373839614);
    }

    public final void Method2328(@NotNull @NotNull String string, @NotNull @NotNull gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        Intrinsics.checkParameterIsNotNull((Object)gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2, (String)"handler");
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2.Method1886(string);
    }

    public ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0() {
        super("Tracker", "tacks selected player.", null);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Spiral Trigger", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x1A10E3831C56F9FBL ^ 0x5A18E3831C56F9FBL), Double.longBitsToDouble((long)633320802 ^ 0x4000000025BFB562L), Double.longBitsToDouble(0x4E544BE65E6963E8L ^ 0xE1D4BE65E6963E8L), (boolean)((long)1327339312 ^ (long)1327339313)).Method355("Trigger");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Spiral Trigger\"\u2026true).setTitle(\"Trigger\")");
        this.Field10111 = this.Method23(this.Field10110.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Spiral PPT", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1896885680 ^ 0x4010000071102DB0L), 1.0, Double.longBitsToDouble((long)29079665 ^ 0x402E000001BBB871L), ((int)-961050899L ^ 0xC6B786EC) != 0).Method355("PPT");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Spiral PPT\", th\u2026.0, true).setTitle(\"PPT\")");
        this.Field10112 = this.Method23(this.Field10110.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Spiral Chunk Step", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xC14F0EA0F3AD3D87L ^ 0x814F0EA0F3AD3D87L), 1.0, Double.longBitsToDouble(0x6FC4026F70A69077L ^ 0x2FEA026F70A69077L), ((int)-30839246L ^ 0xFE296E33) != 0).Method355("Chunk Step");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Spiral Chunk St\u2026e).setTitle(\"Chunk Step\")");
        this.Field10113 = this.Method23(this.Field10110.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Spiral Auto Disable", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)3204855L ^ 0x30E6F6) != 0).Method355("Auto Off");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"Spiral Auto Dis\u2026rue).setTitle(\"Auto Off\")");
        this.Field10114 = this.Method23(this.Field10110.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Spiral Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x98499BD2288349C2L ^ 0xD8C6DBD2288349C2L), Double.longBitsToDouble((long)1738314957 ^ 0x40590000679C94CDL), Double.longBitsToDouble((long)1138586532 ^ 0x40C3880043DD73A4L), ((int)-891101483L ^ 0xCAE2DED4) != 0).Method355("Range");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"Spiral Range\", \u2026, true).setTitle(\"Range\")");
        this.Field10115 = this.Method23(this.Field10110.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6));
        Field10120 = this;
        this.Field10119 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this), new Predicate[(int)((long)-536926310 ^ (long)-536926310)]);
    }

    static {
        Field10121 = new ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    public static final Minecraft Method2329() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method2330(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final kuf37sLYG4IC7svenBai9Ct5aGFtOEqd Method2331(ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02) {
        return ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Field10116;
    }

    public static final void Method2332(ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02, kuf37sLYG4IC7svenBai9Ct5aGFtOEqd kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2) {
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Field10116 = kuf37sLYG4IC7svenBai9Ct5aGFtOEqd2;
    }

    public static final BlockPos Method2333(ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02) {
        return ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Field10117;
    }

    public static final void Method2334(ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02, BlockPos blockPos) {
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Field10117 = blockPos;
    }

    public static final ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 Method2335() {
        return Field10120;
    }

    public static final void Method2336(ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02) {
        Field10120 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1353207508L ^ 0xAF57B12C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1645070493 ^ (long)-1645070436);
            int n2 = (int)((long)1759215560 ^ (long)1759215481);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1406363235L ^ 0xAC2C88DA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

