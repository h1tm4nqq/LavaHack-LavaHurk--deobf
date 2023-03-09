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

import lavahack.client.Class1393;
import lavahack.client.Class1887;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.MapGenStronghold;

@Class1887
public class Class971
extends Class42 {
    public static MapGenStronghold Field12169 = null;
    private String Field12170 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class971() {
        super("PreciseStrongholdFinder", Class97.Field8344);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (Field12169 == null) {
            Class1393.Method5504().Method1886("Could not resolve the chunk generator");
            return;
        }
        BlockPos blockPos = Field12169.getNearestStructurePos((World)Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new BlockPos(Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), true);
        if (blockPos == null) {
            Class1393.Method5504().Method1886("Error whilst finding a stronghold");
            return;
        }
        Class1393.Method5503().Method1886("Successfully found a stronghold at: X: " + blockPos.getX() + ", Y: " + blockPos.getY() + ", Z: " + blockPos.getZ());
        this.Method22();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 26;
            cArray2[n] = (char)(cArray[n] ^ (0x7AB8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

