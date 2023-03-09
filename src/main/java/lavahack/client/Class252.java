//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;

public class Class252
extends Class42 {
    private String Field9124 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class252() {
        super("AntiVanish", Class97.Field8344);
    }

    @Override
    public void Method45() {
        if (Class252.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class252.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class252.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(Entity::isInvisible).forEach(Class252::Method1366);
    }

    @Override
    public boolean Method52() {
        return true;
    }

    private static void Method1366(Entity entity) {
        entity.setInvisible(false);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 140;
            cArray2[n] = (char)(cArray[n] ^ (0x2820 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

