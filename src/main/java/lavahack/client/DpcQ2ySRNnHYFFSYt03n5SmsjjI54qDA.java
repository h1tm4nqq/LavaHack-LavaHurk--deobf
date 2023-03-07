//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.NetworkManager
 */
package lavahack.client;

import lavahack.client.DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.network.NetworkManager;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
public class DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15188 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SyncItem", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-59508700L ^ 0xFC73F824) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15189 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ProcessPackets", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1819117849 ^ (long)1819117848)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15190 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sneak", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10627));
    public static final DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA Field15191 = new DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA();
    private String Field15192 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA() {
        super("AntiDesync", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    public void Method20() {
        if (DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.debug("AntiDesync on client tick post");
        if (this.Field15188.Method365()) {
            DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
        }
        ((DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field15190.Method341()).Method2647().Method1726(new Object[(int)183532405L ^ 0xAF07B75]);
        if (!this.Field15189.Method365()) return;
        this.Method6087();
    }

    private void Method6087() {
        NetworkManager networkManager = DpcQ2ySRNnHYFFSYt03n5SmsjjI54qDA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.connection.getNetworkManager();
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
        int n = (int)((long)1133335652 ^ (long)1133335652);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-16301936 ^ (long)-16301969);
            int n2 = (int)((long)1492450116 ^ (long)1492450183);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-283541038 ^ (long)-283538255) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

