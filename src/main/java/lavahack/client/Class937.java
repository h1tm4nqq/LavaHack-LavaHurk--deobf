//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.client.network.*;
import java.util.*;
import io.netty.buffer.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;

public class Class937
{
    private static final Minecraft Field12002;
    private static final NetHandlerPlayClient Field12003;
    private static final INetHandler Field12004;
    private String Field12005 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static INetHandler Method3871() {
        return Class937.Field12004;
    }
    
    public static void Method3872(final Packet packet) {
        packet.processPacket(Class937.Field12004);
    }
    
    public static void Method3873(final Packet packet) {
        Class937.Field12003.sendPacket(packet);
    }
    
    public static void Method3874() {
        final Random random = new Random();
        final byte[] array = new byte[random.nextInt(64)];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (byte)random.nextInt(256);
        }
        Class937.Field12003.sendPacket((Packet)new CPacketCustomPayload("", new PacketBuffer(Unpooled.copiedBuffer(array))));
    }
    
    public static void Method3875(final byte[] array) {
        Class937.Field12003.sendPacket((Packet)new CPacketCustomPayload("", new PacketBuffer(Unpooled.copiedBuffer(array))));
    }
    
    public static CPacketCustomPayload Method3876(final byte[] array) {
        return new CPacketCustomPayload("", new PacketBuffer(Unpooled.copiedBuffer(array)));
    }
    
    public static PacketBuffer Method3877(final byte[] array) {
        return new PacketBuffer(Unpooled.copiedBuffer(array));
    }
    
    public static PacketBuffer Method3878(final byte[] array) {
        return new PacketBuffer(Unpooled.wrappedBuffer(array));
    }
    
    static {
        Field12002 = Minecraft.getMinecraft();
        Field12003 = Class937.Field12002.player.connection;
        Field12004 = Class937.Field12003.getNetworkManager().getNetHandler();
    }
    
    private static String Method3879(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3F3A ^ 0x42));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
