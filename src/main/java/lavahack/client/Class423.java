//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraft.util.*;

public class Class423 extends Class42
{
    private int Field9774;
    private String Field9775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class423() {
        super("TowerTest", Class97.Field8345);
    }
    
    public void Method38() {
        if (Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        this.Field9774 = (int)Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
    }
    
    public void Method39() {
        this.Field9774 = 0;
    }
    
    public void Method45() {
        if (Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if ((int)Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY <= this.Field9774) {
            return;
        }
        final BlockPos blockPos = new BlockPos(Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            Class1036.Method4208(new BlockPos(Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ).down(), EnumHand.MAIN_HAND, false, false);
        }
        if (Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            this.Field9774 = blockPos.getY();
        }
        else {
            Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(-4624656385354214932L);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x75BB ^ 0x2B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
