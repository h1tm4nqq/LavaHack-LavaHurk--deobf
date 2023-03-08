//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016?\u0006\u0002\u0010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004?\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketFriend;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "()V", "event", "Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "(Lcom/kisman/cc/event/events/client/friend/FriendEvent;)V", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "writeInnerBuffer", "kisman.cc" })
public final class Class546 extends Class716
{
    private Class1477 Field10320;
    private String Field10321 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void readInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
        final String readString = packetBuffer.readString(32767);
        Intrinsics.checkExpressionValueIsNotNull((Object)readString, "buffer.readString(Short.MAX_VALUE.toInt())");
        final Enum readEnumValue = packetBuffer.readEnumValue((Class)Class96.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)readEnumValue, "buffer.readEnumValue(FriendEvent.Type::class.java)");
        this.Field10320 = new Class1477(readString, (Class96)readEnumValue);
    }
    
    public void writeInnerBuffer(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buffer");
        final Class1477 field10320 = this.Field10320;
        final String s = (field10320 != null) ? field10320.Method5918() : null;
        if (s == null) {
            Intrinsics.throwNpe();
        }
        packetBuffer.writeString(s);
        final Class1477 field10321 = this.Field10320;
        final Class96 class96 = (field10321 != null) ? field10321.Method5919() : null;
        if (class96 == null) {
            Intrinsics.throwNpe();
        }
        packetBuffer.writeEnumValue((Enum)class96);
    }
    
    public void execute(@NotNull @NotNull final NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, "manager");
        final Class1477 field10320 = this.Field10320;
        if (((field10320 != null) ? field10320.Method5919() : null) == Class96.Field8334) {
            final Class726 field10321 = Class726.Field11086;
            final Class1477 field10322 = this.Field10320;
            field10321.Method3040((field10322 != null) ? field10322.Method5918() : null);
        }
        else {
            final Class1477 field10323 = this.Field10320;
            if (((field10323 != null) ? field10323.Method5919() : null) == Class96.Field8335) {
                final Class726 field10324 = Class726.Field11086;
                final Class1477 field10325 = this.Field10320;
                field10324.Method3041((field10325 != null) ? field10325.Method5918() : null);
            }
        }
    }
    
    public Class546(@Nullable @Nullable final Class1477 field10320) {
        super(0);
        this.Field10320 = field10320;
    }
    
    public Class546() {
        this(null);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7B80 ^ 0xE4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
