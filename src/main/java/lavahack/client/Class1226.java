//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016?\u0006\u0002\u0010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006?\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketRiddenEntityPos;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "()V", "entityID", "", "x", "", "y", "z", "(IDDD)V", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "writeInnerBuffer", "kisman.cc" })
public final class Class1226 extends Class716
{
    private int Field13566;
    private double Field13567;
    private double Field13568;
    private double Field13569;
    private String Field13570 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void readInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
        this.Field13566 = packetBuffer.readVarInt();
        this.Field13567 = packetBuffer.readDouble();
        this.Field13568 = packetBuffer.readDouble();
        this.Field13569 = packetBuffer.readDouble();
    }
    
    public void writeInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
        packetBuffer.writeVarInt(this.Field13566);
        packetBuffer.writeDouble(this.Field13567);
        packetBuffer.writeDouble(this.Field13568);
        packetBuffer.writeDouble(this.Field13569);
    }
    
    public void execute(@NotNull @NotNull final NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, "manager");
        Class2142.Field17803.addScheduledTask((Runnable)new Class537(this));
    }
    
    public Class1226(final int field13566, final double field13567, final double field13568, final double field13569) {
        super(4);
        this.Field13566 = field13566;
        this.Field13567 = field13567;
        this.Field13568 = field13568;
        this.Field13569 = field13569;
    }
    
    public Class1226() {
        this(-1, 0.0, 0.0, 0.0);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x15C0 ^ 0x9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
