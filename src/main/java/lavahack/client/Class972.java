//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import java.util.*;
import net.minecraft.util.text.*;

public class Class972 extends Class42
{
    private final ConcurrentHashMap Field12171;
    private final List Field12172;
    private String Field12173 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class972() {
        super("BurrowCounter", "BurrowCounter", Class97.Field8343);
        this.Field12171 = new ConcurrentHashMap();
        this.Field12172 = new ArrayList();
    }
    
    public void Method45() {
        if (Class972.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class972.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        for (final EntityPlayer entityPlayer : Class972.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
            if (this.Field12172.contains(entityPlayer)) {
                continue;
            }
            if (!Class972.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(entityPlayer.posX, entityPlayer.posY + Double.longBitsToDouble(4596373779694328218L), entityPlayer.posZ)).getBlock().equals(Blocks.OBSIDIAN)) {
                continue;
            }
            this.Method3975(entityPlayer);
            this.Field12172.add(entityPlayer);
        }
    }
    
    private void Method3975(final EntityPlayer entityPlayer) {
        if (entityPlayer == null) {
            return;
        }
        if (this.Field12171.containsKey(entityPlayer)) {
            final int n = this.Field12171.get(entityPlayer) + 1;
            this.Field12171.put(entityPlayer, n);
            Class1393.Method5507().Method1886(entityPlayer.getName() + TextFormatting.DARK_RED + " has burrowed " + n + " times");
        }
        else {
            this.Field12171.put(entityPlayer, 1);
            Class1393.Method5507().Method1886(entityPlayer.getName() + TextFormatting.DARK_RED + " has burrowed");
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7721 ^ 0x79));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
