//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.potion.Potion
 */
package lavahack.client;

import java.util.Objects;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.potion.Potion;

public class bMGO12KflhdmzFN9TDzU8ARYLZ7D362z
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private int Field11761;

    public bMGO12KflhdmzFN9TDzU8ARYLZ7D362z() {
        super("AntiWeakness", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    @Override
    public void Method45() {
        if (bMGO12KflhdmzFN9TDzU8ARYLZ7D362z.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (bMGO12KflhdmzFN9TDzU8ARYLZ7D362z.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!bMGO12KflhdmzFN9TDzU8ARYLZ7D362z.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(Objects.requireNonNull(Potion.getPotionFromResourceLocation((String)"weakness")))) return;
        bMGO12KflhdmzFN9TDzU8ARYLZ7D362z.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.removeActivePotionEffect(Potion.getPotionFromResourceLocation((String)"weakness"));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2002782913L ^ 0x77600AC1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-117282598L ^ 0xF9026825);
            int n2 = ((int)603822764L ^ 0x23FD9AA1) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2046254107 ^ (long)2046252198) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

