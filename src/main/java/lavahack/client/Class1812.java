//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.RayTraceResult
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.util.math.RayTraceResult;

public class Class1812
extends Class42 {
    private String Field16338 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1812() {
        super("AutoMine", Class97.Field8341);
    }

    @Override
    public void Method45() {
        if (Class1812.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1812.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        RayTraceResult rayTraceResult = Class1812.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver;
        if (rayTraceResult == null) {
            return;
        }
        Class1812.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.onPlayerDamageBlock(rayTraceResult.getBlockPos(), rayTraceResult.sideHit);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x5B7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

