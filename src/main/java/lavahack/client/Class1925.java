//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Arrays;
import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;

public class Class1925
extends Class42 {
    private final Class44 Field16935 = this.Method23(new Class44("Custom Pitch", (Class42)this, true));
    private final Class44 Field16936 = this.Method23(new Class44("LookPitch", (Class42)this, Double.longBitsToDouble((long)1261038792 ^ 0x405680004B29ECC8L), 0.0, Double.longBitsToDouble((long)600844875 ^ 0xC056800023D02A4BL), false).Method313(this.Field16935::Method365));
    private final Class44 Field16937 = this.Method23(new Class44("Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1848913247 ^ 0x405900006E342D5FL), Class467.Field9943));
    private final Class44 Field16938 = this.Method23(new Class44("SwitchMode", (Class42)this, "Packet", new ArrayList<String>(Arrays.asList("Packet", "Client"))));
    private final Class650 Field16939 = new Class650();
    private String Field16940 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1925() {
        super("SilentXP", "SilentXp", Class97.Field8338);
    }

    @Override
    public void Method38() {
        this.Field16939.Method2801();
    }

    @Override
    public void Method45() {
        if (!this.Field16939.Method2797(this.Field16937.Method335())) {
            return;
        }
        this.Field16939.Method2801();
        if (Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen != null) return;
        if (Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        int n = Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        int n2 = Class9.Method116(Items.EXPERIENCE_BOTTLE, 0, 9);
        if (n2 == -1) {
            Class1393.Method5504().Method1886("No XP in hotbar! Disabling!");
            this.Method37();
            return;
        }
        String string = this.Field16938.Method359();
        int n3 = -1;
        switch (string.hashCode()) {
            case -1911998296: {
                if (string.equals("Packet")) {
                    n3 = 0;
                }
                break;
            }
            case 2021122027: {
                if (string.equals("Client")) {
                    n3 = 1;
                }
                break;
            }
        }
        float f = Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        if (this.Field16935.Method365()) {
            Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = (float)this.Field16936.Method367();
        }
        Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, (float)this.Field16936.Method367(), true));
        Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
        if (this.Field16935.Method365()) {
            Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = f;
        }
        String string2 = this.Field16938.Method359();
        int n4 = -1;
        switch (string2.hashCode()) {
            case -1911998296: {
                if (!string2.equals("Packet")) return;
                return;
            }
            case 2021122027: {
                if (!string2.equals("Client")) return;
                return;
            }
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 58;
            cArray2[n] = (char)(cArray[n] ^ (0x37A6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

