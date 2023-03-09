//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1218;
import lavahack.client.Class1859;
import lavahack.client.Class254;
import lavahack.client.Class347;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

@Class1859(mode=2)
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2={"Lcom/kisman/cc/features/nocom/modules/NoComMainModule;", "Lcom/kisman/cc/features/module/Module;", "()V", "ignore", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "latency", "loadChunks", "loadedChunks", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/ChunkPos;", "Lkotlin/collections/ArrayList;", "notify", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "startTime", "", "x", "y", "z", "onConnect", "", "event", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientConnectedToServerEvent;", "onDisable", "onEnable", "unloadChunks", "Companion", "kisman.cc"})
public final class Class615
extends Class42 {
    private final Class44 Field10614 = this.Method23(new Class44("X", (Class42)this, 0.0, Double.longBitsToDouble((long)1676228000 ^ 0xC08F400063E935A0L), Double.longBitsToDouble(4652007308841189376L), true));
    private final Class44 Field10615 = this.Method23(new Class44("Y", (Class42)this, 0.0, Double.longBitsToDouble((long)1936658342 ^ 0xC08F4000736F0FA6L), Double.longBitsToDouble(4652007308841189376L), true));
    private final Class44 Field10616 = this.Method23(new Class44("Z", (Class42)this, 0.0, Double.longBitsToDouble(-4571364728013586432L), Double.longBitsToDouble(4652007308841189376L), true));
    private final Class44 Field10617 = this.Method23(new Class44("Latency", (Class42)this, false));
    private final Class44 Field10618 = this.Method23(new Class44("Ignore Loaded", (Class42)this, true));
    private final Class44 Field10619 = this.Method23(new Class44("Load Chunk", (Class42)this, false));
    private final Class44 Field10620 = this.Method23(new Class44("Notify", (Class42)this, false));
    private final ArrayList Field10621 = new ArrayList();
    private long Field10622;
    private final Class618 Field10623 = new Class618((Class254)new Class1218(this), new Predicate[0]);
    private static final int Field10624 = 15;
    public static final Class347 Field10625 = new Class347(null);
    private String Field10626 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        if (Class615.Method2636().player == null) return;
        if (Class615.Method2636().world == null) {
            return;
        }
        Class44 class44 = this.Field10614;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"x");
        int n = class44.Method335();
        Class44 class442 = this.Field10615;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"y");
        int n2 = class442.Method335();
        Class44 class443 = this.Field10616;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"z");
        BlockPos blockPos = new BlockPos(n, n2, class443.Method335());
        this.Field10622 = System.currentTimeMillis();
        Class615.Method2636().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.UP));
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field10622 = -1L;
        this.Method2635();
    }

    private final void Method2634(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
        this.Method2635();
    }

    private final void Method2635() {
        if (Class615.Method2636().world != null) {
            for (ChunkPos chunkPos : this.Field10621) {
                Class615.Method2636().world.doPreChunk(chunkPos.x, chunkPos.z, false);
            }
        }
        this.Field10621.clear();
    }

    public Class615() {
        super("NoCom", "Main module of nocom", null);
    }

    static {
        Field10624 = 15;
    }

    public static final Minecraft Method2636() {
        return Class42.Field8052;
    }

    public static final void Method2637(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method2638(Class615 class615) {
        return class615.Field10618;
    }

    public static final ArrayList Method2639(Class615 class615) {
        return class615.Field10621;
    }

    public static final Class44 Method2640(Class615 class615) {
        return class615.Field10620;
    }

    public static final Class44 Method2641(Class615 class615) {
        return class615.Field10617;
    }

    public static final long Method2642(Class615 class615) {
        return class615.Field10622;
    }

    public static final void Method2643(Class615 class615, long l) {
        class615.Field10622 = l;
    }

    public static final Class44 Method2644(Class615 class615) {
        return class615.Field10619;
    }

    public static final int Method2645() {
        return Field10624;
    }

    public static final int Method2646() {
        Class347 class347 = Field10625;
        return Field10624;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 85;
            cArray2[n] = (char)(cArray[n] ^ (0x2465 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

