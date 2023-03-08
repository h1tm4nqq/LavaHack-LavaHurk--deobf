//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;
import com.kisman.cc.util.*;
import net.minecraft.network.play.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016?\u0006\u0002\u0010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004?\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0015" }, d2 = { "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketActualPos;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "()V", "x", "", "y", "z", "(DDD)V", "packetfly", "", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "valid", "packet", "Lnet/minecraft/network/play/client/CPacketPlayer;", "writeInnerBuffer", "kisman.cc" })
public final class Class86 extends Class716
{
    private boolean Field8288;
    private double Field8289;
    private double Field8290;
    private double Field8291;
    private String Field8292 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void readInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
        this.Field8289 = packetBuffer.readDouble();
        this.Field8290 = packetBuffer.readDouble();
        this.Field8291 = packetBuffer.readDouble();
        this.Field8288 = packetBuffer.readBoolean();
    }
    
    public void writeInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
        packetBuffer.writeDouble(this.Field8289);
        packetBuffer.writeDouble(this.Field8290);
        packetBuffer.writeDouble(this.Field8291);
        packetBuffer.writeBoolean(this.Field8288);
    }
    
    public void execute(@NotNull @NotNull final NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, "manager");
        Class2142.Field17803.addScheduledTask((Runnable)new Class1965(this));
    }
    
    public final boolean Method742(@NotNull @NotNull final CPacketPlayer cPacketPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayer, "packet");
        final double n = cPacketPlayer.getX(this.Field8289) - this.Field8289;
        final double n2 = cPacketPlayer.getX(this.Field8290) - this.Field8290;
        final double n3 = cPacketPlayer.getX(this.Field8291) - this.Field8291;
        final double n4 = n * n + n2 * n2 + n3 * n3;
        final Class44 method5552 = Class1409.Field14381.Method5552();
        Intrinsics.checkExpressionValueIsNotNull((Object)method5552, "PingBypass.positionRange");
        return n4 <= method5552.Method367();
    }
    
    public Class86(final double field8289, final double field8290, final double field8291) {
        super(2);
        this.Field8289 = field8289;
        this.Field8290 = field8290;
        this.Field8291 = field8291;
    }
    
    public Class86() {
        this(0.0, 0.0, 0.0);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6226 ^ 0xBC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
