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
import lavahack.client.Class1796;
import lavahack.client.Class1929;
import lavahack.client.Class42;
import lavahack.client.Class716;
import lavahack.client.Class955;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketBuffer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketBindFeature;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "()V", "name", "", "(Ljava/lang/String;)V", "binder", "Lcom/kisman/cc/features/Binder;", "getName", "()Ljava/lang/String;", "setName", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "writeInnerBuffer", "kisman.cc"})
public final class Class918
extends Class716 {
    private final Class1929 Field11890;
    @NotNull
    private String Field11891;
    private String Field11892 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void readInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        this.Field11890.Method9(packetBuffer.readInt());
        this.Field11890.Method11(packetBuffer.readInt());
        Enum enum_ = packetBuffer.readEnumValue(Class955.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)enum_, (String)"buffer.readEnumValue(BindType::class.java)");
        this.Field11890.Method13((Class955)enum_);
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
        Class42 class42 = Class1796.Field16241.Field16254.Method1162(this.Field11891);
        if (class42 == null) return;
        class42.Method9(this.Field11890.Method8());
        class42.Method11(this.Field11890.Method10());
        class42.Method13(this.Field11890.Method12());
        class42.Method15(this.Field11890.Method14());
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

    public Class918(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        super(6);
        this.Field11891 = string;
        this.Field11890 = new Class1929(this.Field11891, Class955.Field12068, -1, -1, false);
    }

    public Class918() {
        this("name");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 119;
            cArray2[n] = (char)(cArray[n] ^ (0x3E66 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

