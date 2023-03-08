//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraft.world.*;

@Class1887
public class Class1192 extends Class42
{
    private int Field13399;
    
    public Class1192() {
        super("SafeWalk", Class97.Field8340);
    }
    
    @Override
    public void Method45() {
        if (Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final double n = Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Math.floor(Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
        final double n2 = Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Math.floor(Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        final BlockPos blockPos = new BlockPos(Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        final BlockPos north = blockPos.down().north();
        final BlockPos east = blockPos.down().east();
        final BlockPos south = blockPos.down().south();
        final BlockPos west = blockPos.down().west();
        if (n >= 1.0 && this.Method4805(east) && Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX > 0.0) {
            Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        }
        if (n <= 0.0 && this.Method4805(west) && Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY < 0.0) {
            Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        }
        if (n2 >= 1.0 && this.Method4805(south) && Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ > 0.0) {
            Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        if (n2 <= 0.0 && this.Method4805(north) && Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ < 0.0) {
            Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        Class1393.Method5505().Method1886("doing things");
    }
    
    private boolean Method4805(final BlockPos blockPos) {
        return Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6EBF ^ 0xC2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
