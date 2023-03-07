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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.EO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8;
import lavahack.client.IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

@EO07t74ygaxjSG6Y7XzAWcj6luS8mVJ8(mode=2)
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2={"Lcom/kisman/cc/features/nocom/modules/NoComMainModule;", "Lcom/kisman/cc/features/module/Module;", "()V", "ignore", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "latency", "loadChunks", "loadedChunks", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/ChunkPos;", "Lkotlin/collections/ArrayList;", "notify", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "startTime", "", "x", "y", "z", "onConnect", "", "event", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientConnectedToServerEvent;", "onDisable", "onEnable", "unloadChunks", "Companion", "kisman.cc"})
public final class IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10614 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("X", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)1676228000 ^ 0xC08F400063E935A0L), Double.longBitsToDouble(0xE1E426AE0B929D1DL ^ 0xA16B66AE0B929D1DL), (boolean)((long)-1712395115 ^ (long)-1712395116)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10615 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Y", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)1936658342 ^ 0xC08F4000736F0FA6L), Double.longBitsToDouble(0x6AEA4B4C7EC87DD3L ^ 0x2A650B4C7EC87DD3L), ((int)1946132194L ^ 0x73FF9EE3) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10616 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Z", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0x82ACB1325137FD90L ^ 0x4223F1325137FD90L), Double.longBitsToDouble(0xD19D5F296B539749L ^ 0x91121F296B539749L), ((int)1671036996L ^ 0x639A0045) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10617 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Latency", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)319589627L ^ 0x130C8CFB) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10618 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ignore Loaded", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1843392345 ^ (long)1843392344)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10619 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Load Chunk", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2041324104L ^ 0x8653DDB8) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10620 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Notify", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2055766386L ^ 0x7A888172) != 0));
    private final ArrayList Field10621 = new ArrayList();
    private long Field10622;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10623 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this), new Predicate[(int)((long)-1339150126 ^ (long)-1339150126)]);
    private static final int Field10624 = (int)1725471671L ^ 0x66D89BB8;
    public static final IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10625 = new IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    private String Field10626 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        if (IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().player == null) return;
        if (IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().world == null) {
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field10614;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"x");
        int n = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field10615;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"y");
        int n2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field10616;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"z");
        BlockPos blockPos = new BlockPos(n, n2, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method335());
        this.Field10622 = System.currentTimeMillis();
        IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.UP));
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field10622 = 0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL;
        this.Method2635();
    }

    private final void Method2634(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
        this.Method2635();
    }

    private final void Method2635() {
        if (IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().world != null) {
            for (ChunkPos chunkPos : this.Field10621) {
                IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Method2636().world.doPreChunk(chunkPos.x, chunkPos.z, ((int)1868974696L ^ 0x6F664A68) != 0);
            }
        }
        this.Field10621.clear();
    }

    public IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6() {
        super("NoCom", "Main module of nocom", null);
    }

    static {
        Field10624 = (int)((long)-1514041498 ^ (long)-1514041495);
    }

    public static final Minecraft Method2636() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method2637(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2638(IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6 ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6) {
        return ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Field10618;
    }

    public static final ArrayList Method2639(IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6 ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6) {
        return ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Field10621;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2640(IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6 ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6) {
        return ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Field10620;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2641(IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6 ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6) {
        return ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Field10617;
    }

    public static final long Method2642(IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6 ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6) {
        return ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Field10622;
    }

    public static final void Method2643(IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6 ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6, long l) {
        ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Field10622 = l;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2644(IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6 ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6) {
        return ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6.Field10619;
    }

    public static final int Method2645() {
        return Field10624;
    }

    public static final int Method2646() {
        IxCmTWNqonrT1aEfKEwU94YJ2BjoTjI6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ixCmTWNqonrT1aEfKEwU94YJ2BjoTjI6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = Field10625;
        return Field10624;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1008024204 ^ (long)1008024204);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-923262633L ^ 0xC8F821A8);
            int n2 = (int)((long)-69166109 ^ (long)-69166154);
            cArray2[n] = (char)(cArray[n] ^ ((int)380751706L ^ 0x16B1EB3F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

