//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.EnumConnectionState
 *  net.minecraft.network.EnumPacketDirection
 *  net.minecraft.network.Packet
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.network.play.client.CPacketCustomPayload
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import io.netty.buffer.Unpooled;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m;
import lavahack.client.LTbhbQo3grN6q1aSF3R7wYrDoCXT717a;
import lavahack.client.LTbhbQo3grN6q1aSF3R7wYrDoCXT717a$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.j22yWA1783NfsZKLUhZpmvyHOL7lU7gI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPacketCustomPayload;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\rB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "Lnet/minecraft/network/play/client/CPacketCustomPayload;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/PingBypassPacket;", "Lnet/minecraft/network/play/INetHandlerPlayServer;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/IPacket;", "id", "", "(I)V", "getId", "writePacketData", "", "buf", "Lnet/minecraft/network/PacketBuffer;", "Companion", "kisman.cc"})
public abstract class j22yWA1783NfsZKLUhZpmvyHOL7lU7gI
extends CPacketCustomPayload
implements DRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m,
LTbhbQo3grN6q1aSF3R7wYrDoCXT717a {
    private final int Field11060;
    private static final Logger Field11061;
    private static final CPacketCustomPayload Field11062;
    public static final j22yWA1783NfsZKLUhZpmvyHOL7lU7gI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11063;
    private int Field11064;

    @Override
    public int Method740() {
        Integer n = this.Method741().getPacketId(EnumPacketDirection.SERVERBOUND, (Packet)Field11062);
        Intrinsics.checkExpressionValueIsNotNull((Object)n, (String)"getState().getPacketId(E\u2026ection.SERVERBOUND, CPCP)");
        return n;
    }

    public void writePacketData(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buf");
        PacketBuffer packetBuffer2 = this.getBufferData();
        Intrinsics.checkExpressionValueIsNotNull((Object)packetBuffer2, (String)"bufferData");
        PacketBuffer packetBuffer3 = packetBuffer2;
        int n = (int)-1370435020L ^ 0xAE50D234;
        int n2 = (int)185019745L ^ 0xB072D61;
        int n3 = (int)((long)1413064800 ^ (long)1413064800);
        this.getBufferData().writeVarInt(this.Field11060);
        PacketBuffer packetBuffer4 = this.getBufferData();
        Intrinsics.checkExpressionValueIsNotNull((Object)packetBuffer4, (String)"bufferData");
        this.writeInnerBuffer(packetBuffer4);
        super.writePacketData(packetBuffer);
        Unit unit = Unit.INSTANCE;
    }

    public j22yWA1783NfsZKLUhZpmvyHOL7lU7gI(int n) {
        super("PingBypass", new PacketBuffer(Unpooled.buffer()));
        this.Field11060 = n;
    }

    static {
        Field11063 = new j22yWA1783NfsZKLUhZpmvyHOL7lU7gI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
        Field11061 = LogManager.getLogger();
        Field11062 = new CPacketCustomPayload();
    }

    @Override
    @NotNull
    @NotNull
    public EnumConnectionState Method741() {
        return LTbhbQo3grN6q1aSF3R7wYrDoCXT717a$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2477(this);
    }

    public static final /* bridge */ /* synthetic */ Logger access$getLOGGER$cp() {
        return Field11061;
    }

    protected static final Logger getLOGGER() {
        j22yWA1783NfsZKLUhZpmvyHOL7lU7gI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi j22yWA1783NfsZKLUhZpmvyHOL7lU7gI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = Field11063;
        return Field11061;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1209823806L ^ 0xB7E38DC2;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-903528130L ^ 0xCA2541C1);
            int n2 = ((int)-1459281907L ^ 0xA9052020) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1510275931L ^ 0xA5FB3C82) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

