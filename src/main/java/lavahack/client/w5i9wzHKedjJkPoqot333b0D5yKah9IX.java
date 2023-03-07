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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh;
import lavahack.client.j22yWA1783NfsZKLUhZpmvyHOL7lU7gI;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketBuffer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketBindFeature;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "()V", "name", "", "(Ljava/lang/String;)V", "binder", "Lcom/kisman/cc/features/Binder;", "getName", "()Ljava/lang/String;", "setName", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "writeInnerBuffer", "kisman.cc"})
public final class w5i9wzHKedjJkPoqot333b0D5yKah9IX
extends j22yWA1783NfsZKLUhZpmvyHOL7lU7gI {
    private final g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh Field11890;
    @NotNull
    private String Field11891;
    private String Field11892 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void readInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        this.Field11890.Method9(packetBuffer.readInt());
        this.Field11890.Method11(packetBuffer.readInt());
        Enum enum_ = packetBuffer.readEnumValue(ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)enum_, (String)"buffer.readEnumValue(BindType::class.java)");
        this.Field11890.Method13((ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K)enum_);
        this.Field11890.Method15(packetBuffer.readBoolean());
    }

    @Override
    public void writeInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        packetBuffer.writeInt(this.Field11890.Method8());
        packetBuffer.writeInt(this.Field11890.Method10());
        packetBuffer.writeEnumValue((Enum)this.Field11890.Method12());
        packetBuffer.writeBoolean(this.Field11890.Method14());
    }

    @Override
    public void execute(@NotNull @NotNull NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, (String)"manager");
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162(this.Field11891);
        if (wjjBVRrUqJUKhloA7ANknrTEODhuGa0J == null) return;
        wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method9(this.Field11890.Method8());
        wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method11(this.Field11890.Method10());
        wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method13(this.Field11890.Method12());
        wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method15(this.Field11890.Method14());
    }

    @NotNull
    @NotNull
    public final String Method3830() {
        return this.Field11891;
    }

    public final void Method3831(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field11891 = string;
    }

    public w5i9wzHKedjJkPoqot333b0D5yKah9IX(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        super(((int)303270476L ^ 0x12138A4F) << 1);
        this.Field11891 = string;
        this.Field11890 = new g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh(this.Field11891, ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068, (int)((long)-835453116 ^ (long)835453115), (int)((long)-756758332 ^ (long)756758331), (boolean)((long)1886053449 ^ (long)1886053449));
    }

    public w5i9wzHKedjJkPoqot333b0D5yKah9IX() {
        this("name");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1314894027L ^ 0x4E5FB0CB;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1446700898L ^ 0xA9C51861);
            int n2 = (int)((long)490177504 ^ (long)490177431);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)173798526 ^ (long)173796173) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

