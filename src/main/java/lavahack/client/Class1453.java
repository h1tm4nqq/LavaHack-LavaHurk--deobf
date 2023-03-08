//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.network.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/AbstractC2SPacketString;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "id", "", "(I)V", "string", "", "(ILjava/lang/String;)V", "readInnerBuffer", "", "buffer", "Lnet/minecraft/network/PacketBuffer;", "toString", "writeInnerBuffer", "kisman.cc" })
public abstract class Class1453 extends Class716
{
    private String Field14805;
    private String Field14806 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void readInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
        final String readString = packetBuffer.readString(32767);
        Intrinsics.checkExpressionValueIsNotNull((Object)readString, "buffer.readString(Short.MAX_VALUE.toInt())");
        this.Field14805 = readString;
    }
    
    public void writeInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
        packetBuffer.writeString(this.Field14805);
    }
    
    @NotNull
    @NotNull
    public String toString() {
        return this.Field14805;
    }
    
    public Class1453(final int n, @NotNull @NotNull final String field14805) {
        Intrinsics.checkParameterIsNotNull((Object)field14805, "string");
        super(n);
        this.Field14805 = field14805;
    }
    
    public Class1453(final int n) {
        this(n, "");
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4369 ^ 0x3D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
