//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.PacketBuffer
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.j22yWA1783NfsZKLUhZpmvyHOL7lU7gI;
import net.minecraft.network.PacketBuffer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/AbstractC2SPacketString;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "id", "", "(I)V", "string", "", "(ILjava/lang/String;)V", "readInnerBuffer", "", "buffer", "Lnet/minecraft/network/PacketBuffer;", "toString", "writeInnerBuffer", "kisman.cc"})
public abstract class zLWgoGbC3Bef7eIpZkUOApdn9fq0Eqwl
extends j22yWA1783NfsZKLUhZpmvyHOL7lU7gI {
    private String Field14805;
    private String Field14806 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void readInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        String string = packetBuffer.readString((int)343490760L ^ 0x14793F37);
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"buffer.readString(Short.MAX_VALUE.toInt())");
        this.Field14805 = string;
    }

    @Override
    public void writeInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        packetBuffer.writeString(this.Field14805);
    }

    @NotNull
    @NotNull
    public String toString() {
        return this.Field14805;
    }

    public zLWgoGbC3Bef7eIpZkUOApdn9fq0Eqwl(int n, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"string");
        super(n);
        this.Field14805 = string;
    }

    public zLWgoGbC3Bef7eIpZkUOApdn9fq0Eqwl(int n) {
        this(n, "");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2042245808 ^ (long)-2042245808);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2032881307L ^ 0x792B4E64);
            int n2 = (int)((long)713844623 ^ (long)713844658);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1356166577L ^ 0xAF2AC926 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

