//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import net.minecraft.client.gui.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.network.*;
import org.jetbrains.annotations.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Class1859(mode = 2)
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0005?\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\u0016\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020*H\u0016R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0019\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e?\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e?\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004?\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0019\u0010\u001e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0016\u0010 \u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0019\u0010#\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\u0019\u0010%\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0007R\u0019\u0010'\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0007?\u00063" }, d2 = { "Lcom/kisman/cc/features/nocom/modules/NoComTrackerModule;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoSpiral", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getAutoSpiral", "()Lcom/kisman/cc/settings/Setting;", "autoSpiralGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "beatPos", "Lnet/minecraft/util/math/BlockPos;", "debug", "getDebug", "debugErrors", "getDebugErrors", "isBeating", "", "notify", "getNotify", "player", "Lcom/kisman/cc/features/nocom/modules/tracker/TrackedPlayer;", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "renderDistance", "getRenderDistance", "spiralAutoDisable", "spiralChunkStep", "getSpiralChunkStep", "spiralPPT", "getSpiralPPT", "spiralRange", "spiralTrigger", "getSpiralTrigger", "timeOut", "getTimeOut", "x", "getX", "z", "getZ", "onDisable", "", "onEnable", "print", "message", "", "handler", "Lcom/kisman/cc/util/chat/cubic/AbstractChatMessage;", "update", "Companion", "kisman.cc" })
public final class Class504 extends Class42
{
    private final Class44 Field10102;
    private final Class44 Field10103;
    private final Class44 Field10104;
    private final Class44 Field10105;
    private final Class44 Field10106;
    private final Class44 Field10107;
    private final Class44 Field10108;
    private final Class44 Field10109;
    private final Class1996 Field10110;
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
    
    public void Method38() {
        super.Method38();
        if (Method2329().player == null || Method2329().world == null) {
            return;
        }
        final Class44 field10102 = this.Field10102;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10102, "x");
        final int method335 = field10102.Method335();
        final Class44 field10103 = this.Field10103;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10103, "z");
        this.Field10116 = new Class1101(method335, field10103.Method335());
    }
    
    public void Method39() {
        super.Method39();
        if (Method2329().player != null && Method2329().world != null && this.Field10116 != null) {
            final Class1740 method5503 = Class1393.Method5503();
            final Class1101 field10116 = this.Field10116;
            if (field10116 == null) {
                Intrinsics.throwNpe();
            }
            method5503.Method1886(field10116.Method4517());
        }
    }
    
    public void Method45() {
        if (Method2329().player == null || Method2329().world == null || Method2329().currentScreen instanceof GuiDownloadTerrain) {
            return;
        }
        if (this.Field10116 == null) {
            this.Method22();
        }
        final Class1101 field10116 = this.Field10116;
        if (field10116 == null) {
            Intrinsics.throwNpe();
        }
        if (field10116.Method4502()) {
            final Class1101 field10117 = this.Field10116;
            if (field10117 == null) {
                Intrinsics.throwNpe();
            }
            final Class44 field10118 = this.Field10115;
            Intrinsics.checkExpressionValueIsNotNull((Object)field10118, "spiralRange");
            if (!field10117.Method4506(field10118.Method335())) {
                final Class44 field10119 = this.Field10114;
                Intrinsics.checkExpressionValueIsNotNull((Object)field10119, "spiralAutoDisable");
                if (field10119.Method365()) {
                    final Class44 field10120 = this.Field10106;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field10120, "debugErrors");
                    if (field10120.Method365()) {
                        Class1393.Method5504().Method1886("Spiral scan failed... disabling module rip");
                    }
                    this.Method22();
                }
            }
            return;
        }
        final Class1101 field10121 = this.Field10116;
        if (field10121 == null) {
            Intrinsics.throwNpe();
        }
        if (field10121.Method4508()) {
            this.Field10118 = true;
        }
        if (this.Field10118) {
            final EntityPlayerSP player = Method2329().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            this.Field10117 = player.getPosition().down(10);
            final Class44 field10122 = this.Field10105;
            Intrinsics.checkExpressionValueIsNotNull((Object)field10122, "debug");
            if (field10122.Method365()) {
                Class1393.Method5506().Method1886("BEATING...");
            }
            final NetHandlerPlayClient connection = Method2329().player.connection;
            final CPacketPlayerDigging$Action abort_DESTROY_BLOCK = CPacketPlayerDigging$Action.ABORT_DESTROY_BLOCK;
            final BlockPos field10123 = this.Field10117;
            if (field10123 == null) {
                Intrinsics.throwNpe();
            }
            connection.sendPacket((Packet)new CPacketPlayerDigging(abort_DESTROY_BLOCK, field10123, EnumFacing.UP));
            this.Field10118 = false;
        }
    }
    
    public final void Method2328(@NotNull @NotNull final String s, @NotNull @NotNull final Class1740 class1740) {
        Intrinsics.checkParameterIsNotNull((Object)s, "message");
        Intrinsics.checkParameterIsNotNull((Object)class1740, "handler");
        class1740.Method1886(s);
    }
    
    public Class504() {
        super("Tracker", "tacks selected player.", (Class97)null);
        this.Field10102 = this.Method23(new Class44("X", (Class42)this, 0.0, Double.longBitsToDouble((long)1345635953 ^ 0xC08F40005034C671L), Double.longBitsToDouble(4652007308841189376L), true));
        this.Field10103 = this.Method23(new Class44("Z", (Class42)this, 0.0, Double.longBitsToDouble(-4571364728013586432L), Double.longBitsToDouble((long)1223751858 ^ 0x408F400048F0F8B2L), true));
        this.Field10104 = this.Method23(new Class44("Time Out", (Class42)this, Double.longBitsToDouble(4657715973212602368L), Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4666723172467343360L), Class467.Field9943));
        this.Field10105 = this.Method23(new Class44("Debug", (Class42)this, false));
        this.Field10106 = this.Method23(new Class44("Debug Errors", (Class42)this, true));
        this.Field10107 = this.Method23(new Class44("Notify", (Class42)this, true));
        this.Field10108 = this.Method23(new Class44("Render Distance", (Class42)this, Double.longBitsToDouble(4616189618054758400L), 1.0, Double.longBitsToDouble((long)1799556431 ^ 0x402000006B430D4FL), true));
        this.Field10109 = this.Method23(new Class44("Auto Spiral", (Class42)this, true));
        this.Field10110 = this.Method24(new Class1996(new Class44("Auto Spiral", (Class42)this)));
        final Class1996 field10110 = this.Field10110;
        final Class44 method355 = new Class44("Spiral Trigger", (Class42)this, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble((long)633320802 ^ 0x4000000025BFB562L), Double.longBitsToDouble(4632233691727265792L), true).Method355("Trigger");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Spiral Trigger\"\u2026true).setTitle(\"Trigger\")");
        this.Field10111 = this.Method23(field10110.Method7405(method355));
        final Class1996 field10111 = this.Field10110;
        final Class44 method356 = new Class44("Spiral PPT", (Class42)this, Double.longBitsToDouble((long)1896885680 ^ 0x4010000071102DB0L), 1.0, Double.longBitsToDouble((long)29079665 ^ 0x402E000001BBB871L), true).Method355("PPT");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"Spiral PPT\", th\u2026.0, true).setTitle(\"PPT\")");
        this.Field10112 = this.Method23(field10111.Method7405(method356));
        final Class1996 field10112 = this.Field10110;
        final Class44 method357 = new Class44("Spiral Chunk Step", (Class42)this, Double.longBitsToDouble(4611686018427387904L), 1.0, Double.longBitsToDouble(4624633867356078080L), true).Method355("Chunk Step");
        Intrinsics.checkExpressionValueIsNotNull((Object)method357, "Setting(\"Spiral Chunk St\u2026e).setTitle(\"Chunk Step\")");
        this.Field10113 = this.Method23(field10112.Method7405(method357));
        final Class1996 field10113 = this.Field10110;
        final Class44 method358 = new Class44("Spiral Auto Disable", (Class42)this, true).Method355("Auto Off");
        Intrinsics.checkExpressionValueIsNotNull((Object)method358, "Setting(\"Spiral Auto Dis\u2026rue).setTitle(\"Auto Off\")");
        this.Field10114 = this.Method23(field10113.Method7405(method358));
        final Class1996 field10114 = this.Field10110;
        final Class44 method359 = new Class44("Spiral Range", (Class42)this, Double.longBitsToDouble(4652007308841189376L), Double.longBitsToDouble((long)1738314957 ^ 0x40590000679C94CDL), Double.longBitsToDouble((long)1138586532 ^ 0x40C3880043DD73A4L), true).Method355("Range");
        Intrinsics.checkExpressionValueIsNotNull((Object)method359, "Setting(\"Spiral Range\", \u2026, true).setTitle(\"Range\")");
        this.Field10115 = this.Method23(field10114.Method7405(method359));
        Class504.Field10120 = this;
        this.Field10119 = new Class618((Class254)new Class657(this), new Predicate[0]);
    }
    
    static {
        Field10121 = new Class2043((DefaultConstructorMarker)null);
    }
    
    public static final Minecraft Method2329() {
        return Class42.Field8052;
    }
    
    public static final void Method2330(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class1101 Method2331(final Class504 class504) {
        return class504.Field10116;
    }
    
    public static final void Method2332(final Class504 class504, final Class1101 field10116) {
        class504.Field10116 = field10116;
    }
    
    public static final BlockPos Method2333(final Class504 class504) {
        return class504.Field10117;
    }
    
    public static final void Method2334(final Class504 class504, final BlockPos field10117) {
        class504.Field10117 = field10117;
    }
    
    public static final Class504 Method2335() {
        return Class504.Field10120;
    }
    
    public static final void Method2336(final Class504 field10120) {
        Class504.Field10120 = field10120;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1147 ^ 0xB1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
