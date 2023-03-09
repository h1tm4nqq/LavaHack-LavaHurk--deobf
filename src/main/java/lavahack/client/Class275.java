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

import com.kisman.cc.util.Class2142;
import io.netty.util.internal.ConcurrentSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1408;
import lavahack.client.Class1796;
import lavahack.client.Class218;
import lavahack.client.Class254;
import lavahack.client.Class586;
import lavahack.client.Class618;
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
public final class Class275 {
    private static final ThreadLocal Field9208;
    private static final ConcurrentSet Field9209;
    private static final Set Field9210;
    private static final Class618 Field9211;
    public static final Class275 Field9212;
    private int Field9213;

    @SubscribeEvent
    @SubscribeEvent
    public final void Method1461(@NotNull @NotNull TickEvent.ClientTickEvent clientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientTickEvent, (String)"event");
        if (Class2142.Field17803.player != null) {
            if (Class2142.Field17803.world != null) return;
        }
        Field9209.clear();
    }

    public final boolean Method1462(@NotNull @NotNull Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
        if (Field9209.remove((Object)packet)) return false;
        return true;
    }

    public final boolean Method1463() {
        if ((Boolean)Field9208.get() != false) return false;
        return true;
    }

    public final void Method1464(boolean bl) {
        Field9208.set(bl);
    }

    public final void Method1465(@NotNull @NotNull Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
        if (!Class218.Field8954.Method1254()) return;
        Field9209.add((Object)packet);
    }

    private Class275() {
    }

    static {
        Class275 class275;
        Field9212 = class275 = new Class275();
        Field9208 = ThreadLocal.withInitial(Class1408.Field14363);
        Field9209 = new ConcurrentSet();
        Field9210 = SetsKt.setOf((Object[])new Class[]{CPacketPlayer.class, CPacketPlayer.Position.class, CPacketPlayer.PositionRotation.class, CPacketPlayer.Rotation.class, CPacketConfirmTeleport.class, CPacketInput.class, CPacketVehicleMove.class, CPacketSteerBoat.class, CPacketClientSettings.class, CPacketClientStatus.class, CPacketPlayerAbilities.class, CPacketEntityAction.class, CPacketSeenAdvancements.class, CPacketCloseWindow.class});
        Field9211 = new Class618((Class254)Class586.Field10489, new Predicate[0]);
        MinecraftForge.EVENT_BUS.register((Object)class275);
        Class1796.Field16242.Method706(Field9211);
    }

    public static final Set Method1466(Class275 class275) {
        Class275 class2752 = class275;
        return Field9210;
    }

    private static String Method1467(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 219;
            cArray2[n] = (char)(cArray[n] ^ (0x335D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

