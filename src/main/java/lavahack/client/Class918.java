//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016?\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004?\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005?\u0006\u0013" }, d2 = { "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketBindFeature;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "()V", "name", "", "(Ljava/lang/String;)V", "binder", "Lcom/kisman/cc/features/Binder;", "getName", "()Ljava/lang/String;", "setName", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "writeInnerBuffer", "kisman.cc" })
public final class Class918 extends Class716
{
    private final Class1929 Field11890;
    @NotNull
    private String Field11891;
    private String Field11892 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void readInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
        this.Field11890.Method9(packetBuffer.readInt());
        this.Field11890.Method11(packetBuffer.readInt());
        final Class1929 field11890 = this.Field11890;
        final Enum readEnumValue = packetBuffer.readEnumValue((Class)Class955.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)readEnumValue, "buffer.readEnumValue(BindType::class.java)");
        field11890.Method13((Class955)readEnumValue);
        this.Field11890.Method15(packetBuffer.readBoolean());
    }
    
    public void writeInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
        packetBuffer.writeInt(this.Field11890.Method8());
        packetBuffer.writeInt(this.Field11890.Method10());
        packetBuffer.writeEnumValue((Enum)this.Field11890.Method12());
        packetBuffer.writeBoolean(this.Field11890.Method14());
    }
    
    public void execute(@NotNull @NotNull final NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, "manager");
        final Class42 method1162 = Class1796.Field16241.Field16254.Method1162(this.Field11891);
        if (method1162 != null) {
            method1162.Method9(this.Field11890.Method8());
            method1162.Method11(this.Field11890.Method10());
            method1162.Method13(this.Field11890.Method12());
            method1162.Method15(this.Field11890.Method14());
        }
    }
    
    @NotNull
    @NotNull
    public final String Method3830() {
        return this.Field11891;
    }
    
    public final void Method3831(@NotNull @NotNull final String field11891) {
        Intrinsics.checkParameterIsNotNull((Object)field11891, "<set-?>");
        this.Field11891 = field11891;
    }
    
    public Class918(@NotNull @NotNull final String field11891) {
        Intrinsics.checkParameterIsNotNull((Object)field11891, "name");
        super(6);
        this.Field11891 = field11891;
        this.Field11890 = new Class1929(this.Field11891, Class955.Field12068, -1, -1, false);
    }
    
    public Class918() {
        this("name");
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3E66 ^ 0x77));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
