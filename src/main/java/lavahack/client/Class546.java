//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.PacketBuffer
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1477;
import lavahack.client.Class716;
import lavahack.client.Class726;
import lavahack.client.Class96;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketFriend;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "()V", "event", "Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "(Lcom/kisman/cc/event/events/client/friend/FriendEvent;)V", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "writeInnerBuffer", "kisman.cc"})
public final class Class546
extends Class716 {
    private Class1477 Field10320;
    private String Field10321 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void readInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        String string = packetBuffer.readString(Short.MAX_VALUE);
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"buffer.readString(Short.MAX_VALUE.toInt())");
        Enum enum_ = packetBuffer.readEnumValue(Class96.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)enum_, (String)"buffer.readEnumValue(FriendEvent.Type::class.java)");
        this.Field10320 = new Class1477(string, (Class96)enum_);
    }

    @Override
    public void writeInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        Class1477 class1477 = this.Field10320;
        String string = class1477 != null ? class1477.Method5918() : null;
        if (string == null) {
            Intrinsics.throwNpe();
        }
        packetBuffer.writeString(string);
        Class1477 class14772 = this.Field10320;
        Class96 class96 = class14772 != null ? class14772.Method5919() : null;
        if (class96 == null) {
            Intrinsics.throwNpe();
        }
        packetBuffer.writeEnumValue((Enum)class96);
    }

    @Override
    public void execute(@NotNull @NotNull NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, (String)"manager");
        Class1477 class1477 = this.Field10320;
        if ((class1477 != null ? class1477.Method5919() : null) == Class96.Field8334) {
            Class1477 class14772 = this.Field10320;
            Class726.Field11086.Method3040(class14772 != null ? class14772.Method5918() : null);
            return;
        }
        Class1477 class14773 = this.Field10320;
        if ((class14773 != null ? class14773.Method5919() : null) != Class96.Field8335) return;
        Class1477 class14774 = this.Field10320;
        Class726.Field11086.Method3041(class14774 != null ? class14774.Method5918() : null);
    }

    public Class546(@Nullable @Nullable Class1477 class1477) {
        super(0);
        this.Field10320 = class1477;
    }

    public Class546() {
        this(null);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 228;
            cArray2[n] = (char)(cArray[n] ^ (0x7B80 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

