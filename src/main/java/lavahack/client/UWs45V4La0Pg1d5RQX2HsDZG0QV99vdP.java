//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;

public class UWs45V4La0Pg1d5RQX2HsDZG0QV99vdP
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final ConcurrentHashMap Field12171 = new ConcurrentHashMap();
    private final List Field12172 = new ArrayList();
    private String Field12173 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public UWs45V4La0Pg1d5RQX2HsDZG0QV99vdP() {
        super("BurrowCounter", "BurrowCounter", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    @Override
    public void Method45() {
        if (UWs45V4La0Pg1d5RQX2HsDZG0QV99vdP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (UWs45V4La0Pg1d5RQX2HsDZG0QV99vdP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Iterator iterator = UWs45V4La0Pg1d5RQX2HsDZG0QV99vdP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            EntityPlayer entityPlayer = (EntityPlayer)iterator.next();
            if (this.Field12172.contains(entityPlayer) || !UWs45V4La0Pg1d5RQX2HsDZG0QV99vdP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = new BlockPos(entityPlayer.posX, entityPlayer.posY + Double.longBitsToDouble(0x850478AE01FA7C89L ^ 0xBACDE1379863E513L), entityPlayer.posZ)).getBlock().equals(Blocks.OBSIDIAN)) continue;
            this.Method3975(entityPlayer);
            this.Field12172.add(entityPlayer);
        }
    }

    private void Method3975(EntityPlayer entityPlayer) {
        if (entityPlayer == null) {
            return;
        }
        if (this.Field12171.containsKey(entityPlayer)) {
            int n = (Integer)this.Field12171.get(entityPlayer) + (int)((long)-598922788 ^ (long)-598922787);
            this.Field12171.put(entityPlayer, n);
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886(entityPlayer.getName() + TextFormatting.DARK_RED + " has burrowed " + n + " times");
            return;
        }
        this.Field12171.put(entityPlayer, (int)((long)193575086 ^ (long)193575087));
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886(entityPlayer.getName() + TextFormatting.DARK_RED + " has burrowed");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1970265654L ^ 0x756FDE36;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)280734063 ^ (long)280734096);
            int n2 = (int)1778534959L ^ 0x6A024A56;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1452872272L ^ 0xA9669A91 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

