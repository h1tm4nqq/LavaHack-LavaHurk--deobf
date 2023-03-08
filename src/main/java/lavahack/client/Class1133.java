//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.play.client.*;
import io.netty.buffer.*;
import net.minecraft.network.*;

public class Class1133 extends Class42
{
    public static Class1133 Field13139;
    @Class1801
    private final Class618 Field13140;
    private int Field13141;
    
    public Class1133() {
        super("ForgeBypass", Class97.Field8341);
        this.Field13140 = new Class618(Class1133::Method4628, new Predicate[0]);
        Class1133.Field13139 = this;
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field13140);
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field13140);
    }
    
    private static void Method4628(final Class805 class805) {
        if (!Class1133.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isIntegratedServerRunning()) {
            if (class805.Method982().getClass().getName().equals("net.minecraftforge.fml.common.network.internal.FMLProxyPacket")) {
                class805.Method158();
            }
            else if (class805.Method982() instanceof CPacketCustomPayload && ((CPacketCustomPayload)class805.Method982()).getChannelName().equalsIgnoreCase("MC|Brand")) {
                ((CPacketCustomPayload)class805.Method982()).data = new PacketBuffer(Unpooled.buffer()).writeString("vanilla");
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4136 ^ 0x0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
