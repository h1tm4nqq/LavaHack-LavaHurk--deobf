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
import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;

public class Class972
extends Class42 {
    private final ConcurrentHashMap Field12171 = new ConcurrentHashMap();
    private final List Field12172 = new ArrayList();
    private String Field12173 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class972() {
        super("BurrowCounter", "BurrowCounter", Class97.Field8343);
    }

    @Override
    public void Method45() {
        if (Class972.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class972.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Iterator iterator = Class972.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            EntityPlayer entityPlayer = (EntityPlayer)iterator.next();
            if (this.Field12172.contains(entityPlayer) || !Class972.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = new BlockPos(entityPlayer.posX, entityPlayer.posY + Double.longBitsToDouble(4596373779694328218L), entityPlayer.posZ)).getBlock().equals(Blocks.OBSIDIAN)) continue;
            this.Method3975(entityPlayer);
            this.Field12172.add(entityPlayer);
        }
    }

    private void Method3975(EntityPlayer entityPlayer) {
        if (entityPlayer == null) {
            return;
        }
        if (this.Field12171.containsKey(entityPlayer)) {
            int n = (Integer)this.Field12171.get(entityPlayer) + 1;
            this.Field12171.put(entityPlayer, n);
            Class1393.Method5507().Method1886(entityPlayer.getName() + TextFormatting.DARK_RED + " has burrowed " + n + " times");
            return;
        }
        this.Field12171.put(entityPlayer, 1);
        Class1393.Method5507().Method1886(entityPlayer.getName() + TextFormatting.DARK_RED + " has burrowed");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 121;
            cArray2[n] = (char)(cArray[n] ^ (0x7721 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

