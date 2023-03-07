//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
public class EHIb7viCA0aRujQNuPKOKemoN35kJU5y
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private int Field10885;

    public EHIb7viCA0aRujQNuPKOKemoN35kJU5y() {
        super("AutoRespawn", "Automatically respawn after death", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    @Override
    public void Method45() {
        if (EHIb7viCA0aRujQNuPKOKemoN35kJU5y.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (EHIb7viCA0aRujQNuPKOKemoN35kJU5y.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (EHIb7viCA0aRujQNuPKOKemoN35kJU5y.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() != 0.0f) return;
        EHIb7viCA0aRujQNuPKOKemoN35kJU5y.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.respawnPlayer();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1428286000 ^ (long)1428286000);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1553046129 ^ (long)-1553046160);
            int n2 = ((int)-394161817L ^ 0xE881916E) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1421772100L ^ 0x54BE9607) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

