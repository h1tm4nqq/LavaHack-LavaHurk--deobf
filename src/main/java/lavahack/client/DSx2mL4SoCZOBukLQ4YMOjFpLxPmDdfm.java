//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.RayTraceResult
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.util.math.RayTraceResult;

public class DSx2mL4SoCZOBukLQ4YMOjFpLxPmDdfm
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field16338 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public DSx2mL4SoCZOBukLQ4YMOjFpLxPmDdfm() {
        super("AutoMine", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    @Override
    public void Method45() {
        if (DSx2mL4SoCZOBukLQ4YMOjFpLxPmDdfm.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (DSx2mL4SoCZOBukLQ4YMOjFpLxPmDdfm.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        RayTraceResult rayTraceResult = DSx2mL4SoCZOBukLQ4YMOjFpLxPmDdfm.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver;
        if (rayTraceResult == null) {
            return;
        }
        DSx2mL4SoCZOBukLQ4YMOjFpLxPmDdfm.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.onPlayerDamageBlock(rayTraceResult.getBlockPos(), rayTraceResult.sideHit);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1720172606 ^ (long)1720172606);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1735003539 ^ (long)-1735003502);
            int n2 = (int)((long)-1239878082 ^ (long)-1239878089) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1660599349 ^ (long)1660598658) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

