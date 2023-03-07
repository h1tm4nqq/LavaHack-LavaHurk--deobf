//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ConcurrentSet
 *  kotlin.Metadata
 *  kotlin.collections.SetsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketClientSettings
 *  net.minecraft.network.play.client.CPacketClientStatus
 *  net.minecraft.network.play.client.CPacketCloseWindow
 *  net.minecraft.network.play.client.CPacketConfirmTeleport
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketInput
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.client.CPacketPlayer$PositionRotation
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerAbilities
 *  net.minecraft.network.play.client.CPacketSeenAdvancements
 *  net.minecraft.network.play.client.CPacketSteerBoat
 *  net.minecraft.network.play.client.CPacketVehicleMove
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import io.netty.util.internal.ConcurrentSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketClientSettings;
import net.minecraft.network.play.client.CPacketClientStatus;
import net.minecraft.network.play.client.CPacketCloseWindow;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketInput;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerAbilities;
import net.minecraft.network.play.client.CPacketSeenAdvancements;
import net.minecraft.network.play.client.CPacketSteerBoat;
import net.minecraft.network.play.client.CPacketVehicleMove;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0005J\u0012\u0010\u0012\u001a\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\tJ\u0012\u0010\u0014\u001a\u00020\u00052\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u0015\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/pingbypass/server/managers/PacketManager;", "", "()V", "allow", "Ljava/lang/ThreadLocal;", "", "kotlin.jvm.PlatformType", "authorized", "Lio/netty/util/internal/ConcurrentSet;", "Lnet/minecraft/network/Packet;", "blackList", "", "Ljava/lang/Class;", "send", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "allowAllOnThisThread", "", "authorize", "packet", "isUnAuthorized", "noThreadLocalFlag", "onClientTick", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "kisman.cc"})
public final class Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4 {
    private static final ThreadLocal Field9208;
    private static final ConcurrentSet Field9209;
    private static final Set Field9210;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9211;
    public static final Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4 Field9212;
    private int Field9213;

    @SubscribeEvent
    @SubscribeEvent
    public final void Method1461(@NotNull @NotNull TickEvent.ClientTickEvent clientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientTickEvent, (String)"event");
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player != null) {
            if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world != null) return;
        }
        Field9209.clear();
    }

    public final boolean Method1462(@NotNull @NotNull Packet packet) {
        boolean bl;
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
        if (!Field9209.remove((Object)packet)) {
            bl = (int)29815990L ^ 0x1C6F4B7;
            return bl;
        }
        bl = (int)1303012172L ^ 0x4DAA634C;
        return bl;
    }

    public final boolean Method1463() {
        int n;
        if (!((Boolean)Field9208.get()).booleanValue()) {
            n = (int)((long)679364879 ^ (long)679364878);
            return n != 0;
        }
        n = (int)191850457L ^ 0xB6F67D9;
        return n != 0;
    }

    public final void Method1464(boolean bl) {
        Field9208.set(bl);
    }

    public final void Method1465(@NotNull @NotNull Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
        if (!xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1254()) return;
        Field9209.add((Object)packet);
    }

    private Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4() {
    }

    static {
        Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4 y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4;
        Field9212 = y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4 = new Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4();
        Field9208 = ThreadLocal.withInitial(Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14363);
        Field9209 = new ConcurrentSet();
        Object[] objectArray = new Class[((int)757300409L ^ 0x2D237CBE) << 1];
        objectArray[(int)-1272073422L ^ 0xB42DB332] = CPacketPlayer.class;
        objectArray[(int)528545616L ^ 0x1F80F751] = CPacketPlayer.Position.class;
        objectArray[(int)((long)1606486558 ^ (long)1606486559) << 1] = CPacketPlayer.PositionRotation.class;
        objectArray[(int)((long)2137341218 ^ (long)2137341217)] = CPacketPlayer.Rotation.class;
        objectArray[(int)((long)-2135879858 ^ (long)-2135879857) << 2] = CPacketConfirmTeleport.class;
        objectArray[(int)-1480845960L ^ 0xA7BC157D] = CPacketInput.class;
        objectArray[((int)818515467L ^ 0x30C98E08) << 1] = CPacketVehicleMove.class;
        objectArray[(int)-828002899L ^ 0xCEA5ADAA] = CPacketSteerBoat.class;
        objectArray[(int)((long)-1197840509 ^ (long)-1197840510) << 3] = CPacketClientSettings.class;
        objectArray[(int)((long)151694832 ^ (long)151694841)] = CPacketClientStatus.class;
        objectArray[(int)((long)-1558606446 ^ (long)-1558606441) << 1] = CPacketPlayerAbilities.class;
        objectArray[(int)((long)-749286074 ^ (long)-749286067)] = CPacketEntityAction.class;
        objectArray[((int)-1553449515L ^ 0xA3683DD6) << 2] = CPacketSeenAdvancements.class;
        objectArray[(int)-1312597829L ^ 0xB1C358B6] = CPacketCloseWindow.class;
        Field9210 = SetsKt.setOf((Object[])objectArray);
        Field9211 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10489, new Predicate[(int)((long)-1743981537 ^ (long)-1743981537)]);
        MinecraftForge.EVENT_BUS.register((Object)y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field9211);
    }

    public static final Set Method1466(Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4 y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4) {
        Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4 y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx42 = y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4;
        return Field9210;
    }

    private static String Method1467(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1774264793 ^ (long)1774264793);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)675754525 ^ (long)675754722);
            int n2 = (int)((long)894509846 ^ (long)894510029);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)255031970 ^ (long)255019519) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

