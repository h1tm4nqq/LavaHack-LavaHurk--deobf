//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.*;
import net.minecraft.client.*;

@Class2012
public class Class1540 extends Class42
{
    private final Class44 Field15188;
    private final Class44 Field15189;
    private final Class44 Field15190;
    public static final Class1540 Field15191;
    private String Field15192 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1540() {
        super("AntiDesync", Class97.Field8341);
        this.Field15188 = this.Method23(new Class44("SyncItem", this, false));
        this.Field15189 = this.Method23(new Class44("ProcessPackets", this, true));
        this.Field15190 = this.Method23(new Class44("Sneak", this, Class616.Field10627));
    }
    
    public void Method20() {
        if (Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1796.Field16243.debug("AntiDesync on client tick post");
        if (this.Field15188.Method365()) {
            Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
        }
        ((Class616)this.Field15190.Method341()).Method2647().Method1726(new Object[0]);
        if (this.Field15189.Method365()) {
            this.Method6087();
        }
    }
    
    private void Method6087() {
        final NetworkManager getNetworkManager = Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.connection.getNetworkManager();
        if (getNetworkManager.isChannelOpen()) {
            getNetworkManager.processReceivedPackets();
            return;
        }
        getNetworkManager.handleDisconnection();
    }
    
    static Minecraft Method6088() {
        return Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method6089() {
        return Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method6090() {
        return Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method6091() {
        return Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method6092() {
        return Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method6093() {
        return Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method6094() {
        return Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method6095() {
        return Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method6096() {
        return Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method6097() {
        return Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static {
        Field15191 = new Class1540();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6B18 ^ 0xC3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
