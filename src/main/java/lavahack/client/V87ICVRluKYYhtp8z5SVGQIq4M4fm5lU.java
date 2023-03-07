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
import lavahack.client.ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU;
import lavahack.client.ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.j22yWA1783NfsZKLUhZpmvyHOL7lU7gI;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketFriend;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "()V", "event", "Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "(Lcom/kisman/cc/event/events/client/friend/FriendEvent;)V", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "writeInnerBuffer", "kisman.cc"})
public final class V87ICVRluKYYhtp8z5SVGQIq4M4fm5lU
extends j22yWA1783NfsZKLUhZpmvyHOL7lU7gI {
    private ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU Field10320;
    private String Field10321 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void readInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        String string = packetBuffer.readString((int)((long)-1322178099 ^ (long)-1322166734));
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"buffer.readString(Short.MAX_VALUE.toInt())");
        Enum enum_ = packetBuffer.readEnumValue(ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)enum_, (String)"buffer.readEnumValue(FriendEvent.Type::class.java)");
        this.Field10320 = new ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU(string, (ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)enum_);
    }

    @Override
    public void writeInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU = this.Field10320;
        String string = aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU != null ? aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU.Method5918() : null;
        if (string == null) {
            Intrinsics.throwNpe();
        }
        packetBuffer.writeString(string);
        ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU2 = this.Field10320;
        ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU2 != null ? aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU2.Method5919() : null;
        if (aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == null) {
            Intrinsics.throwNpe();
        }
        packetBuffer.writeEnumValue((Enum)aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
    }

    @Override
    public void execute(@NotNull @NotNull NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, (String)"manager");
        ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU = this.Field10320;
        if ((aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU != null ? aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU.Method5919() : null) == ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8334) {
            ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU2 = this.Field10320;
            n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3040(aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU2 != null ? aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU2.Method5918() : null);
            return;
        }
        ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU3 = this.Field10320;
        if ((aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU3 != null ? aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU3.Method5919() : null) != ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8335) return;
        ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU4 = this.Field10320;
        n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3041(aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU4 != null ? aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU4.Method5918() : null);
    }

    public V87ICVRluKYYhtp8z5SVGQIq4M4fm5lU(@Nullable @Nullable ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU) {
        super((int)941139571L ^ 0x3818A673);
        this.Field10320 = aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU;
    }

    public V87ICVRluKYYhtp8z5SVGQIq4M4fm5lU() {
        this(null);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1132931719L ^ 0xBC78D579;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1729583721 ^ (long)-1729583768);
            int n2 = (int)((long)-1264132974 ^ (long)-1264132949) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)936433665 ^ (long)936433910) << 7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

