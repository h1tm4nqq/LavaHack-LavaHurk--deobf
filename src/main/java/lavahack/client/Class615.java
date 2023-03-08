//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraft.util.math.*;
import java.util.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Class1859(mode = 2)
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001d" }, d2 = { "Lcom/kisman/cc/features/nocom/modules/NoComMainModule;", "Lcom/kisman/cc/features/module/Module;", "()V", "ignore", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "latency", "loadChunks", "loadedChunks", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/ChunkPos;", "Lkotlin/collections/ArrayList;", "notify", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "startTime", "", "x", "y", "z", "onConnect", "", "event", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientConnectedToServerEvent;", "onDisable", "onEnable", "unloadChunks", "Companion", "kisman.cc" })
public final class Class615 extends Class42
{
    private final Class44 Field10614;
    private final Class44 Field10615;
    private final Class44 Field10616;
    private final Class44 Field10617;
    private final Class44 Field10618;
    private final Class44 Field10619;
    private final Class44 Field10620;
    private final ArrayList Field10621;
    private long Field10622;
    private final Class618 Field10623;
    private static final int Field10624;
    public static final Class347 Field10625;
    private String Field10626 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method38() {
        super.Method38();
        if (Method2636().player == null || Method2636().world == null) {
            return;
        }
        final Class44 field10614 = this.Field10614;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10614, "x");
        final int method335 = field10614.Method335();
        final Class44 field10615 = this.Field10615;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10615, "y");
        final int method336 = field10615.Method335();
        final Class44 field10616 = this.Field10616;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10616, "z");
        final BlockPos blockPos = new BlockPos(method335, method336, field10616.Method335());
        this.Field10622 = System.currentTimeMillis();
        Method2636().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.START_DESTROY_BLOCK, blockPos, EnumFacing.UP));
    }
    
    public void Method39() {
        super.Method39();
        this.Field10622 = -1L;
        this.Method2635();
    }
    
    private final void Method2634(final FMLNetworkEvent$ClientConnectedToServerEvent fmlNetworkEvent$ClientConnectedToServerEvent) {
        this.Method2635();
    }
    
    private final void Method2635() {
        if (Method2636().world != null) {
            for (final ChunkPos chunkPos : this.Field10621) {
                Method2636().world.doPreChunk(chunkPos.x, chunkPos.z, false);
            }
        }
        this.Field10621.clear();
    }
    
    public Class615() {
        super("NoCom", "Main module of nocom", (Class97)null);
        this.Field10614 = this.Method23(new Class44("X", (Class42)this, 0.0, Double.longBitsToDouble((long)1676228000 ^ 0xC08F400063E935A0L), Double.longBitsToDouble(4652007308841189376L), true));
        this.Field10615 = this.Method23(new Class44("Y", (Class42)this, 0.0, Double.longBitsToDouble((long)1936658342 ^ 0xC08F4000736F0FA6L), Double.longBitsToDouble(4652007308841189376L), true));
        this.Field10616 = this.Method23(new Class44("Z", (Class42)this, 0.0, Double.longBitsToDouble(-4571364728013586432L), Double.longBitsToDouble(4652007308841189376L), true));
        this.Field10617 = this.Method23(new Class44("Latency", (Class42)this, false));
        this.Field10618 = this.Method23(new Class44("Ignore Loaded", (Class42)this, true));
        this.Field10619 = this.Method23(new Class44("Load Chunk", (Class42)this, false));
        this.Field10620 = this.Method23(new Class44("Notify", (Class42)this, false));
        this.Field10621 = new ArrayList();
        this.Field10623 = new Class618((Class254)new Class1218(this), new Predicate[0]);
    }
    
    static {
        Field10624 = 15;
        Field10625 = new Class347((DefaultConstructorMarker)null);
        Field10624 = 15;
    }
    
    public static final Minecraft Method2636() {
        return Class42.Field8052;
    }
    
    public static final void Method2637(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method2638(final Class615 class615) {
        return class615.Field10618;
    }
    
    public static final ArrayList Method2639(final Class615 class615) {
        return class615.Field10621;
    }
    
    public static final Class44 Method2640(final Class615 class615) {
        return class615.Field10620;
    }
    
    public static final Class44 Method2641(final Class615 class615) {
        return class615.Field10617;
    }
    
    public static final long Method2642(final Class615 class615) {
        return class615.Field10622;
    }
    
    public static final void Method2643(final Class615 class615, final long field10622) {
        class615.Field10622 = field10622;
    }
    
    public static final Class44 Method2644(final Class615 class615) {
        return class615.Field10619;
    }
    
    public static final int Method2645() {
        return Class615.Field10624;
    }
    
    public static final int Method2646() {
        Class615.Field10625;
        return Class615.Field10624;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2465 ^ 0x55));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
