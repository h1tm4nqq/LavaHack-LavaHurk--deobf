//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class2012;
import lavahack.client.Class42;
import lavahack.client.Class97;

@Class2012
public class Class679
extends Class42 {
    private int Field10885;

    public Class679() {
        super("AutoRespawn", "Automatically respawn after death", Class97.Field8341);
    }

    @Override
    public void Method45() {
        if (Class679.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class679.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class679.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() != 0.0f) return;
        Class679.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.respawnPlayer();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 18;
            cArray2[n] = (char)(cArray[n] ^ (0x4D0C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

