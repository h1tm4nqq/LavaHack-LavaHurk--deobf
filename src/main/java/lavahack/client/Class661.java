//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016?\u0006\u0002\u0010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004?\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/s2c/S2CPacketActualServer;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/S2CPacket;", "()V", "ip", "", "(Ljava/lang/String;)V", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "writeInnerBuffer", "kisman.cc" })
public final class Class661 extends Class1800
{
    private final String Field10814;
    private String Field10815 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void readInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
    }
    
    public void writeInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
    }
    
    public void execute(@NotNull @NotNull final NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, "manager");
    }
    
    public Class661(@Nullable @Nullable final String field10814) {
        super(1);
        this.Field10814 = field10814;
    }
    
    public Class661() {
        this(null);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4B04 ^ 0xE7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
