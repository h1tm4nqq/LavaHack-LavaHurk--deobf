//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.play.server.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import io.netty.buffer.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\rB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/S2CPacket;", "Lnet/minecraft/network/play/server/SPacketCustomPayload;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/PingBypassPacket;", "Lnet/minecraft/network/play/INetHandlerPlayClient;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/IPacket;", "id", "", "(I)V", "getId", "writePacketData", "", "buf", "Lnet/minecraft/network/PacketBuffer;", "Companion", "kisman.cc" })
public abstract class Class1800 extends SPacketCustomPayload implements Class409, Class545
{
    private final int Field16300;
    private static final SPacketCustomPayload Field16301;
    public static final Class1349 Field16302;
    private String Field16303 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public int Method740() {
        final Integer getPacketId = this.Method741().getPacketId(EnumPacketDirection.CLIENTBOUND, (Packet)Class1800.Field16301);
        Intrinsics.checkExpressionValueIsNotNull((Object)getPacketId, "getState().getPacketId(E\u2026ection.CLIENTBOUND, SPCP)");
        return getPacketId;
    }
    
    public void writePacketData(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buf");
        Intrinsics.checkExpressionValueIsNotNull((Object)this.getBufferData(), "bufferData");
        this.getBufferData().writeVarInt(this.Field16300);
        final PacketBuffer getBufferData = this.getBufferData();
        Intrinsics.checkExpressionValueIsNotNull((Object)getBufferData, "bufferData");
        this.writeInnerBuffer(getBufferData);
        super.writePacketData(packetBuffer);
        final Unit instance = Unit.INSTANCE;
    }
    
    public Class1800(final int field16300) {
        super("PingBypass", new PacketBuffer(Unpooled.buffer()));
        this.Field16300 = field16300;
    }
    
    static {
        Field16302 = new Class1349((DefaultConstructorMarker)null);
        Field16301 = new SPacketCustomPayload();
    }
    
    @NotNull
    @NotNull
    public EnumConnectionState Method741() {
        return Class560.Method2477(this);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6E8A ^ 0xB3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
