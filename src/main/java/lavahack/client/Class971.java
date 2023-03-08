//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.world.gen.structure.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

@Class1887
public class Class971 extends Class42
{
    public static MapGenStronghold Field12169;
    private String Field12170 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class971() {
        super("PreciseStrongholdFinder", Class97.Field8344);
    }
    
    public void Method38() {
        super.Method38();
        if (Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (Class971.Field12169 == null) {
            Class1393.Method5504().Method1886("Could not resolve the chunk generator");
            return;
        }
        final BlockPos getNearestStructurePos = Class971.Field12169.getNearestStructurePos((World)Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new BlockPos(Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class971.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), true);
        if (getNearestStructurePos == null) {
            Class1393.Method5504().Method1886("Error whilst finding a stronghold");
            return;
        }
        Class1393.Method5503().Method1886("Successfully found a stronghold at: X: " + getNearestStructurePos.getX() + ", Y: " + getNearestStructurePos.getY() + ", Z: " + getNearestStructurePos.getZ());
        this.Method22();
    }
    
    static {
        Class971.Field12169 = null;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7AB8 ^ 0x1A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
