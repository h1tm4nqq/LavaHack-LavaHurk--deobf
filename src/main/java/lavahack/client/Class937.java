//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.network.INetHandler
 *  net.minecraft.network.Packet
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.network.play.client.CPacketCustomPayload
 */
package lavahack.client;

import io.netty.buffer.Unpooled;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPacketCustomPayload;

public class Class937 {
    private static final Minecraft Field12002 = Minecraft.getMinecraft();
    private static final NetHandlerPlayClient Field12003 = Class937.Field12002.player.connection;
    private static final INetHandler Field12004 = Field12003.getNetworkManager().getNetHandler();
    private String Field12005 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static INetHandler Method3871() {
        return Field12004;
    }

    public static void Method3872(Packet packet) {
        packet.processPacket(Field12004);
    }

    public static void Method3873(Packet packet) {
        Field12003.sendPacket(packet);
    }

    public static void Method3874() {
        Random random = new Random();
        byte[] byArray = new byte[random.nextInt(64)];
        int n = 0;
        while (true) {
            if (n >= byArray.length) {
                PacketBuffer packetBuffer = new PacketBuffer(Unpooled.copiedBuffer((byte[])byArray));
                CPacketCustomPayload cPacketCustomPayload = new CPacketCustomPayload("", packetBuffer);
                Field12003.sendPacket((Packet)cPacketCustomPayload);
                return;
            }
            byArray[n] = (byte)random.nextInt(256);
            ++n;
        }
    }

    public static void Method3875(byte[] byArray) {
        Field12003.sendPacket((Packet)new CPacketCustomPayload("", new PacketBuffer(Unpooled.copiedBuffer((byte[])byArray))));
    }

    public static CPacketCustomPayload Method3876(byte[] byArray) {
        return new CPacketCustomPayload("", new PacketBuffer(Unpooled.copiedBuffer((byte[])byArray)));
    }

    public static PacketBuffer Method3877(byte[] byArray) {
        return new PacketBuffer(Unpooled.copiedBuffer((byte[])byArray));
    }

    public static PacketBuffer Method3878(byte[] byArray) {
        return new PacketBuffer(Unpooled.wrappedBuffer((byte[])byArray));
    }

    private static String Method3879(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 66;
            cArray2[n] = (char)(cArray[n] ^ (0x3F3A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

