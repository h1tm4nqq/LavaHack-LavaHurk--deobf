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
import lavahack.client.Class1101;
import lavahack.client.Class1393;
import lavahack.client.Class1740;
import lavahack.client.Class1859;
import lavahack.client.Class1996;
import lavahack.client.Class2043;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class618;
import lavahack.client.Class657;
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

@Class1859(mode=2)
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\u0016\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020*H\u0016R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0019\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0019\u0010\u001e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0016\u0010 \u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0019\u0010#\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\u0019\u0010%\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0007R\u0019\u0010'\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0007\u00a8\u00063"}, d2={"Lcom/kisman/cc/features/nocom/modules/NoComTrackerModule;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoSpiral", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getAutoSpiral", "()Lcom/kisman/cc/settings/Setting;", "autoSpiralGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "beatPos", "Lnet/minecraft/util/math/BlockPos;", "debug", "getDebug", "debugErrors", "getDebugErrors", "isBeating", "", "notify", "getNotify", "player", "Lcom/kisman/cc/features/nocom/modules/tracker/TrackedPlayer;", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "renderDistance", "getRenderDistance", "spiralAutoDisable", "spiralChunkStep", "getSpiralChunkStep", "spiralPPT", "getSpiralPPT", "spiralRange", "spiralTrigger", "getSpiralTrigger", "timeOut", "getTimeOut", "x", "getX", "z", "getZ", "onDisable", "", "onEnable", "print", "message", "", "handler", "Lcom/kisman/cc/util/chat/cubic/AbstractChatMessage;", "update", "Companion", "kisman.cc"})
public final class Class504
extends Class42 {
    private final Class44 Field10102 = this.Method23(new Class44("X", (Class42)this, 0.0, Double.longBitsToDouble((long)1345635953 ^ 0xC08F40005034C671L), Double.longBitsToDouble(4652007308841189376L), true));
    private final Class44 Field10103 = this.Method23(new Class44("Z", (Class42)this, 0.0, Double.longBitsToDouble(-4571364728013586432L), Double.longBitsToDouble((long)1223751858 ^ 0x408F400048F0F8B2L), true));
    private final Class44 Field10104 = this.Method23(new Class44("Time Out", (Class42)this, Double.longBitsToDouble(4657715973212602368L), Double.longBitsToDouble(0x4024000000000000L), Double.longBitsToDouble(4666723172467343360L), Class467.Field9943));
    private final Class44 Field10105 = this.Method23(new Class44("Debug", (Class42)this, false));
    private final Class44 Field10106 = this.Method23(new Class44("Debug Errors", (Class42)this, true));
    private final Class44 Field10107 = this.Method23(new Class44("Notify", (Class42)this, true));
    private final Class44 Field10108 = this.Method23(new Class44("Render Distance", (Class42)this, Double.longBitsToDouble(0x4010000000000000L), 1.0, Double.longBitsToDouble((long)1799556431 ^ 0x402000006B430D4FL), true));
    private final Class44 Field10109 = this.Method23(new Class44("Auto Spiral", (Class42)this, true));
    private final Class1996 Field10110 = this.Method24(new Class1996(new Class44("Auto Spiral", this)));
    private final Class44 Field10111;
    private final Class44 Field10112;
    private final Class44 Field10113;
    private final Class44 Field10114;
    private final Class44 Field10115;
    private Class1101 Field10116;
    private BlockPos Field10117;
    private boolean Field10118;
    private final Class618 Field10119;
    @Nullable
    private static Class504 Field10120;
    public static final Class2043 Field10121;
    private int Field10122;

    public final Class44 Method2317() {
        return this.Field10102;
    }

    public final Class44 Method2318() {
        return this.Field10103;
    }

    public final Class44 Method2319() {
        return this.Field10104;
    }

    public final Class44 Method2320() {
        return this.Field10105;
    }

    public final Class44 Method2321() {
        return this.Field10106;
    }

    public final Class44 Method2322() {
        return this.Field10107;
    }

    public final Class44 Method2323() {
        return this.Field10108;
    }

    public final Class44 Method2324() {
        return this.Field10109;
    }

    public final Class44 Method2325() {
        return this.Field10111;
    }

    public final Class44 Method2326() {
        return this.Field10112;
    }

    public final Class44 Method2327() {
        return this.Field10113;
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class504.Method2329().player == null) return;
        if (Class504.Method2329().world == null) {
            return;
        }
        Class44 class44 = this.Field10102;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"x");
        int n = class44.Method335();
        Class44 class442 = this.Field10103;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"z");
        this.Field10116 = new Class1101(n, class442.Method335());
    }

    @Override
    public void Method39() {
        super.Method39();
        if (Class504.Method2329().player == null) return;
        if (Class504.Method2329().world == null) return;
        if (this.Field10116 == null) return;
        Class1740 class1740 = Class1393.Method5503();
        Class1101 class1101 = this.Field10116;
        if (class1101 == null) {
            Intrinsics.throwNpe();
        }
        class1740.Method1886(class1101.Method4517());
    }

    @Override
    public void Method45() {
        if (Class504.Method2329().player == null) return;
        if (Class504.Method2329().world == null) return;
        if (Class504.Method2329().currentScreen instanceof GuiDownloadTerrain) {
            return;
        }
        if (this.Field10116 == null) {
            this.Method22();
        }
        Class1101 class1101 = this.Field10116;
        if (class1101 == null) {
            Intrinsics.throwNpe();
        }
        if (class1101.Method4502()) {
            Class1101 class11012 = this.Field10116;
            if (class11012 == null) {
                Intrinsics.throwNpe();
            }
            Class44 class44 = this.Field10115;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"spiralRange");
            if (class11012.Method4506(class44.Method335())) return;
            Class44 class442 = this.Field10114;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"spiralAutoDisable");
            if (!class442.Method365()) return;
            Class44 class443 = this.Field10106;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"debugErrors");
            if (class443.Method365()) {
                Class1393.Method5504().Method1886("Spiral scan failed... disabling module rip");
            }
            this.Method22();
            return;
        }
        Class1101 class11013 = this.Field10116;
        if (class11013 == null) {
            Intrinsics.throwNpe();
        }
        if (class11013.Method4508()) {
            this.Field10118 = true;
        }
        if (!this.Field10118) return;
        EntityPlayerSP entityPlayerSP = Class504.Method2329().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        this.Field10117 = entityPlayerSP.getPosition().down(10);
        Class44 class44 = this.Field10105;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"debug");
        if (class44.Method365()) {
            Class1393.Method5506().Method1886("BEATING...");
        }
        NetHandlerPlayClient netHandlerPlayClient = Class504.Method2329().player.connection;
        BlockPos blockPos = this.Field10117;
        if (blockPos == null) {
            Intrinsics.throwNpe();
        }
        netHandlerPlayClient.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, blockPos, EnumFacing.UP));
        this.Field10118 = false;
    }

    public final void Method2328(@NotNull @NotNull String string, @NotNull @NotNull Class1740 class1740) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        Intrinsics.checkParameterIsNotNull((Object)class1740, (String)"handler");
        class1740.Method1886(string);
    }

    public Class504() {
        super("Tracker", "tacks selected player.", null);
        Class44 class44 = new Class44("Spiral Trigger", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), Double.longBitsToDouble((long)633320802 ^ 0x4000000025BFB562L), Double.longBitsToDouble(0x4049000000000000L), true).Method355("Trigger");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Spiral Trigger\"\u2026true).setTitle(\"Trigger\")");
        this.Field10111 = this.Method23(this.Field10110.Method7405(class44));
        Class44 class442 = new Class44("Spiral PPT", (Class42)this, Double.longBitsToDouble((long)1896885680 ^ 0x4010000071102DB0L), 1.0, Double.longBitsToDouble((long)29079665 ^ 0x402E000001BBB871L), true).Method355("PPT");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Spiral PPT\", th\u2026.0, true).setTitle(\"PPT\")");
        this.Field10112 = this.Method23(this.Field10110.Method7405(class442));
        Class44 class443 = new Class44("Spiral Chunk Step", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 1.0, Double.longBitsToDouble(4624633867356078080L), true).Method355("Chunk Step");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Spiral Chunk St\u2026e).setTitle(\"Chunk Step\")");
        this.Field10113 = this.Method23(this.Field10110.Method7405(class443));
        Class44 class444 = new Class44("Spiral Auto Disable", (Class42)this, true).Method355("Auto Off");
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"Setting(\"Spiral Auto Dis\u2026rue).setTitle(\"Auto Off\")");
        this.Field10114 = this.Method23(this.Field10110.Method7405(class444));
        Class44 class445 = new Class44("Spiral Range", (Class42)this, Double.longBitsToDouble(4652007308841189376L), Double.longBitsToDouble((long)1738314957 ^ 0x40590000679C94CDL), Double.longBitsToDouble((long)1138586532 ^ 0x40C3880043DD73A4L), true).Method355("Range");
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(\"Spiral Range\", \u2026, true).setTitle(\"Range\")");
        this.Field10115 = this.Method23(this.Field10110.Method7405(class445));
        Field10120 = this;
        this.Field10119 = new Class618((Class254)new Class657(this), new Predicate[0]);
    }

    static {
        Field10121 = new Class2043(null);
    }

    public static final Minecraft Method2329() {
        return Class42.Field8052;
    }

    public static final void Method2330(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class1101 Method2331(Class504 class504) {
        return class504.Field10116;
    }

    public static final void Method2332(Class504 class504, Class1101 class1101) {
        class504.Field10116 = class1101;
    }

    public static final BlockPos Method2333(Class504 class504) {
        return class504.Field10117;
    }

    public static final void Method2334(Class504 class504, BlockPos blockPos) {
        class504.Field10117 = blockPos;
    }

    public static final Class504 Method2335() {
        return Field10120;
    }

    public static final void Method2336(Class504 class504) {
        Field10120 = class504;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 177;
            cArray2[n] = (char)(cArray[n] ^ (0x1147 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

