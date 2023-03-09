//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.network.play.client.CPacketCustomPayload
 */
package lavahack.client;

import io.netty.buffer.Unpooled;
import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPacketCustomPayload;

public class Class1133
extends Class42 {
    public static Class1133 Field13139;
    @Class1801
    private final Class618 Field13140 = new Class618(Class1133::Method4628, new Predicate[0]);
    private int Field13141;

    public Class1133() {
        super("ForgeBypass", Class97.Field8341);
        Field13139 = this;
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field13140);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field13140);
    }

    private static void Method4628(Class805 class805) {
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isIntegratedServerRunning()) return;
        if (class805.Method982().getClass().getName().equals("net.minecraftforge.fml.common.network.internal.FMLProxyPacket")) {
            class805.Method158();
            return;
        }
        if (!(class805.Method982() instanceof CPacketCustomPayload)) return;
        if (!((CPacketCustomPayload)class805.Method982()).getChannelName().equalsIgnoreCase("MC|Brand")) return;
        ((CPacketCustomPayload)class805.Method982()).data = new PacketBuffer(Unpooled.buffer()).writeString("vanilla");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 0;
            cArray2[n] = (char)(cArray[n] ^ (0x4136 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

