//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import io.netty.buffer.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005?\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b?\u0006\r" }, d2 = { "Lcom/kisman/cc/features/module/Debug/PacketIDGetterTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "packetReceived", "Lnet/minecraft/network/Packet;", "direction", "Lnet/minecraft/network/EnumPacketDirection;", "id", "", "packet", "buff", "Lio/netty/buffer/ByteBuf;", "Companion", "kisman.cc" })
public final class Class1971 extends Class42
{
    @Nullable
    private static Class1971 Field17074;
    public static final Class471 Field17075;
    private int Field17076;
    
    @Nullable
    @Nullable
    public final Packet Method7301(@NotNull @NotNull final EnumPacketDirection enumPacketDirection, final int i, @NotNull @NotNull final Packet packet, @Nullable @Nullable final ByteBuf byteBuf) {
        Intrinsics.checkParameterIsNotNull((Object)enumPacketDirection, "direction");
        Intrinsics.checkParameterIsNotNull((Object)packet, "packet");
        if (this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG && packet instanceof CPacketPlayer$Position) {
            final Class1740 method5505 = Class1393.Method5505();
            final StringBuilder append = new StringBuilder().append("CPacketPlayer.Position id1(").append(i).append("), id2(").append(EnumConnectionState.getById(0).getPacketId(enumPacketDirection, packet)).append("), id3(");
            final EnumConnectionState getFromPacket = EnumConnectionState.getFromPacket(packet);
            Intrinsics.checkExpressionValueIsNotNull((Object)getFromPacket, "EnumConnectionState.getFromPacket(packet)");
            method5505.Method1886(append.append(getFromPacket.getId()).append(')').toString());
            this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = false;
        }
        return packet;
    }
    
    public Class1971() {
        super("PacketIDGetterTest", "Test for rdupe command.", Class97.Field8345);
        Class1971.Field17074 = this;
    }
    
    static {
        Field17075 = new Class471(null);
    }
    
    public static final Class1971 Method7302() {
        return Class1971.Field17074;
    }
    
    public static final void Method7303(final Class1971 field17074) {
        Class1971.Field17074 = field17074;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2611 ^ 0x80));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
