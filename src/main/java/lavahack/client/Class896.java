//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.potion.Potion
 */
package lavahack.client;

import java.util.Objects;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.potion.Potion;

public class Class896
extends Class42 {
    private int Field11761;

    public Class896() {
        super("AntiWeakness", Class97.Field8341);
    }

    @Override
    public void Method45() {
        if (Class896.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class896.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!Class896.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(Objects.requireNonNull(Potion.getPotionFromResourceLocation((String)"weakness")))) return;
        Class896.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.removeActivePotionEffect(Potion.getPotionFromResourceLocation((String)"weakness"));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 208;
            cArray2[n] = (char)(cArray[n] ^ (0x22F4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

