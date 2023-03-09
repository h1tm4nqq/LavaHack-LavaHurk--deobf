//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.network.play.client.CPacketPlayer;

public class Class1874
extends Class42 {
    private boolean Field16601 = false;
    @Class1801
    private final Class618 Field16602 = new Class618(this::Method6971, new Predicate[0]);
    private String Field16603 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1874() {
        super("Ghost", "Allows you to walk after death, after disabling you are respawn", Class97.Field8344);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field16602);
        this.Field16601 = false;
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field16602);
        if (Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.respawnPlayer();
        }
        this.Field16601 = false;
    }

    @Override
    public void Method45() {
        if (Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() != 0.0f) return;
        Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setHealth(Float.intBitsToFloat(1101004800));
        Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isDead = false;
        this.Field16601 = true;
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.displayGuiScreen(null);
        Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPositionAndUpdate(Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }

    private void Method6971(Class805 class805) {
        if (!this.Field16601) return;
        if (!(class805.Method982() instanceof CPacketPlayer)) return;
        class805.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 127;
            cArray2[n] = (char)(cArray[n] ^ (0x2825 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

