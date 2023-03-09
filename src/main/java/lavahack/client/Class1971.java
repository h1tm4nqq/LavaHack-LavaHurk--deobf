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
import lavahack.client.Class1393;
import lavahack.client.Class1740;
import lavahack.client.Class42;
import lavahack.client.Class471;
import lavahack.client.Class97;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/features/module/Debug/PacketIDGetterTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "packetReceived", "Lnet/minecraft/network/Packet;", "direction", "Lnet/minecraft/network/EnumPacketDirection;", "id", "", "packet", "buff", "Lio/netty/buffer/ByteBuf;", "Companion", "kisman.cc"})
public final class Class1971
extends Class42 {
    @Nullable
    private static Class1971 Field17074;
    public static final Class471 Field17075;
    private int Field17076;

    @Nullable
    @Nullable
    public final Packet Method7301(@NotNull @NotNull EnumPacketDirection enumPacketDirection, int n, @NotNull @NotNull Packet packet, @Nullable @Nullable ByteBuf byteBuf) {
        Intrinsics.checkParameterIsNotNull((Object)enumPacketDirection, (String)"direction");
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
        if (!this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG) return packet;
        if (!(packet instanceof CPacketPlayer.Position)) return packet;
        Class1740 class1740 = Class1393.Method5505();
        StringBuilder stringBuilder = new StringBuilder().append("CPacketPlayer.Position id1(").append(n).append("), id2(").append(EnumConnectionState.getById((int)0).getPacketId(enumPacketDirection, packet)).append("), id3(");
        EnumConnectionState enumConnectionState = EnumConnectionState.getFromPacket((Packet)packet);
        Intrinsics.checkExpressionValueIsNotNull((Object)enumConnectionState, (String)"EnumConnectionState.getFromPacket(packet)");
        class1740.Method1886(stringBuilder.append(enumConnectionState.getId()).append(')').toString());
        this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = false;
        return packet;
    }

    public Class1971() {
        super("PacketIDGetterTest", "Test for rdupe command.", Class97.Field8345);
        Field17074 = this;
    }

    static {
        Field17075 = new Class471(null);
    }

    public static final Class1971 Method7302() {
        return Field17074;
    }

    public static final void Method7303(Class1971 class1971) {
        Field17074 = class1971;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 128;
            cArray2[n] = (char)(cArray[n] ^ (0x2611 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

