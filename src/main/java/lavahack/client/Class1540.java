//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.NetworkManager
 */
package lavahack.client;

import lavahack.client.Class1796;
import lavahack.client.Class2012;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class616;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.network.NetworkManager;

@Class2012
public class Class1540
extends Class42 {
    private final Class44 Field15188 = this.Method23(new Class44("SyncItem", (Class42)this, false));
    private final Class44 Field15189 = this.Method23(new Class44("ProcessPackets", (Class42)this, true));
    private final Class44 Field15190 = this.Method23(new Class44("Sneak", (Class42)this, Class616.Field10627));
    public static final Class1540 Field15191 = new Class1540();
    private String Field15192 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1540() {
        super("AntiDesync", Class97.Field8341);
    }

    public void Method20() {
        if (Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1796.Field16243.debug("AntiDesync on client tick post");
        if (this.Field15188.Method365()) {
            Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
        }
        ((Class616)this.Field15190.Method341()).Method2647().Method1726(new Object[0]);
        if (!this.Field15189.Method365()) return;
        this.Method6087();
    }

    private void Method6087() {
        NetworkManager networkManager = Class1540.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.connection.getNetworkManager();
        if (networkManager.isChannelOpen()) {
            networkManager.processReceivedPackets();
            return;
        }
        networkManager.handleDisconnection();
    }

    static Minecraft Method6088() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method6089() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method6090() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method6091() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method6092() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method6093() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method6094() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method6095() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method6096() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method6097() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 195;
            cArray2[n] = (char)(cArray[n] ^ (0x6B18 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

