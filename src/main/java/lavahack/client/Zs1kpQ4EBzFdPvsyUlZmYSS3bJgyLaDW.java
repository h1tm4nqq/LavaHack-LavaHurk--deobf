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
 *  net.minecraft.network.play.server.SPacketCustomPayload
 */
package lavahack.client;

import io.netty.buffer.Unpooled;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m;
import lavahack.client.LTbhbQo3grN6q1aSF3R7wYrDoCXT717a;
import lavahack.client.LTbhbQo3grN6q1aSF3R7wYrDoCXT717a$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.Zs1kpQ4EBzFdPvsyUlZmYSS3bJgyLaDW$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.SPacketCustomPayload;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\rB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/S2CPacket;", "Lnet/minecraft/network/play/server/SPacketCustomPayload;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/PingBypassPacket;", "Lnet/minecraft/network/play/INetHandlerPlayClient;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/IPacket;", "id", "", "(I)V", "getId", "writePacketData", "", "buf", "Lnet/minecraft/network/PacketBuffer;", "Companion", "kisman.cc"})
public abstract class Zs1kpQ4EBzFdPvsyUlZmYSS3bJgyLaDW
extends SPacketCustomPayload
implements DRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m,
LTbhbQo3grN6q1aSF3R7wYrDoCXT717a {
    private final int Field16300;
    private static final SPacketCustomPayload Field16301;
    public static final Zs1kpQ4EBzFdPvsyUlZmYSS3bJgyLaDW$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16302;
    private String Field16303 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public int Method740() {
        Integer n = this.Method741().getPacketId(EnumPacketDirection.CLIENTBOUND, (Packet)Field16301);
        Intrinsics.checkExpressionValueIsNotNull((Object)n, (String)"getState().getPacketId(E\u2026ection.CLIENTBOUND, SPCP)");
        return n;
    }

    public void writePacketData(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buf");
        PacketBuffer packetBuffer2 = this.getBufferData();
        Intrinsics.checkExpressionValueIsNotNull((Object)packetBuffer2, (String)"bufferData");
        PacketBuffer packetBuffer3 = packetBuffer2;
        int n = (int)((long)-150011488 ^ (long)-150011488);
        int n2 = (int)((long)-699161059 ^ (long)-699161059);
        int n3 = (int)1145303866L ^ 0x4443F33A;
        this.getBufferData().writeVarInt(this.Field16300);
        PacketBuffer packetBuffer4 = this.getBufferData();
        Intrinsics.checkExpressionValueIsNotNull((Object)packetBuffer4, (String)"bufferData");
        this.writeInnerBuffer(packetBuffer4);
        super.writePacketData(packetBuffer);
        Unit unit = Unit.INSTANCE;
    }

    public Zs1kpQ4EBzFdPvsyUlZmYSS3bJgyLaDW(int n) {
        super("PingBypass", new PacketBuffer(Unpooled.buffer()));
        this.Field16300 = n;
    }

    static {
        Field16302 = new Zs1kpQ4EBzFdPvsyUlZmYSS3bJgyLaDW$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
        Field16301 = new SPacketCustomPayload();
    }

    @Override
    @NotNull
    @NotNull
    public EnumConnectionState Method741() {
        return LTbhbQo3grN6q1aSF3R7wYrDoCXT717a$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2477(this);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1194010644L ^ 0xB8D4D7EC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1182445999L ^ 0xB9854EAE);
            int n2 = (int)-1293591152L ^ 0xB2E55D23;
            cArray2[n] = (char)(cArray[n] ^ (((int)38946648L ^ 0x252701D) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

