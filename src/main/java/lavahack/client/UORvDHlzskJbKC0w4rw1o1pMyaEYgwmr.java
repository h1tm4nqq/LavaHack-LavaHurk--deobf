//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.EnumConnectionState
 *  net.minecraft.network.EnumPacketDirection
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 */
package lavahack.client;

import io.netty.buffer.ByteBuf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.UORvDHlzskJbKC0w4rw1o1pMyaEYgwmr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.gIvxvpNAI6XugtMxK19p7peBbgdbr5DL;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/features/module/Debug/PacketIDGetterTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "packetReceived", "Lnet/minecraft/network/Packet;", "direction", "Lnet/minecraft/network/EnumPacketDirection;", "id", "", "packet", "buff", "Lio/netty/buffer/ByteBuf;", "Companion", "kisman.cc"})
public final class UORvDHlzskJbKC0w4rw1o1pMyaEYgwmr
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @Nullable
    private static UORvDHlzskJbKC0w4rw1o1pMyaEYgwmr Field17074;
    public static final UORvDHlzskJbKC0w4rw1o1pMyaEYgwmr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17075;
    private int Field17076;

    @Nullable
    @Nullable
    public final Packet Method7301(@NotNull @NotNull EnumPacketDirection enumPacketDirection, int n, @NotNull @NotNull Packet packet, @Nullable @Nullable ByteBuf byteBuf) {
        Intrinsics.checkParameterIsNotNull((Object)enumPacketDirection, (String)"direction");
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
        if (!this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG) return packet;
        if (!(packet instanceof CPacketPlayer.Position)) return packet;
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505();
        StringBuilder stringBuilder = new StringBuilder().append("CPacketPlayer.Position id1(").append(n).append("), id2(").append(EnumConnectionState.getById((int)((int)-2115198695L ^ 0x81ECA119)).getPacketId(enumPacketDirection, packet)).append("), id3(");
        EnumConnectionState enumConnectionState = EnumConnectionState.getFromPacket((Packet)packet);
        Intrinsics.checkExpressionValueIsNotNull((Object)enumConnectionState, (String)"EnumConnectionState.getFromPacket(packet)");
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2.Method1886(stringBuilder.append(enumConnectionState.getId()).append((char)((int)-1048459282L ^ 0xC181C7C7)).toString());
        this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = (int)((long)1231269359 ^ (long)1231269359);
        return packet;
    }

    public UORvDHlzskJbKC0w4rw1o1pMyaEYgwmr() {
        super("PacketIDGetterTest", "Test for rdupe command.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
        Field17074 = this;
    }

    static {
        Field17075 = new UORvDHlzskJbKC0w4rw1o1pMyaEYgwmr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    public static final UORvDHlzskJbKC0w4rw1o1pMyaEYgwmr Method7302() {
        return Field17074;
    }

    public static final void Method7303(UORvDHlzskJbKC0w4rw1o1pMyaEYgwmr uORvDHlzskJbKC0w4rw1o1pMyaEYgwmr) {
        Field17074 = uORvDHlzskJbKC0w4rw1o1pMyaEYgwmr;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-232290552 ^ (long)-232290552);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1066612279 ^ (long)-1066612426);
            int n2 = ((int)1370501069L ^ 0x51B02FCC) << 7;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2124041961 ^ (long)2124048632) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

