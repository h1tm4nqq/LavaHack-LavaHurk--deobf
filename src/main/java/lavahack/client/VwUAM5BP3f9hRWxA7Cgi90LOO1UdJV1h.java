//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.structure.MapGenStronghold
 */
package lavahack.client;

import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.MapGenStronghold;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
public class VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static MapGenStronghold Field12169 = null;
    private String Field12170 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h() {
        super("PreciseStrongholdFinder", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (Field12169 == null) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Could not resolve the chunk generator");
            return;
        }
        BlockPos blockPos = Field12169.getNearestStructurePos((World)VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new BlockPos(VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), (boolean)((long)494229279 ^ (long)494229278));
        if (blockPos == null) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Error whilst finding a stronghold");
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Successfully found a stronghold at: X: " + blockPos.getX() + ", Y: " + blockPos.getY() + ", Z: " + blockPos.getZ());
        this.Method22();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)897787391 ^ (long)897787391);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)252213950L ^ 0xF087A41);
            int n2 = (int)((long)-1428253059 ^ (long)-1428253072) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-2140425283L ^ 0x806BBCEA) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

