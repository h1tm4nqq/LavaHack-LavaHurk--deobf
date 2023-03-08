//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraft.block.*;

public class Class1778 extends Class42
{
    private final Class44 Field16152;
    private String Field16153 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1778() {
        super("WebLeave", "f", Class97.Field8344);
        this.Field16152 = this.Method23(new Class44("Height", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble((long)177267981 ^ 0x402400000A90E50DL), false));
    }
    
    @Override
    public void Method38() {
        if (Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + 1.0, Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById(30)) {
            Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field16152.Method367();
        }
        else if (Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById(30)) {
            Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
            Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field16152.Method367();
        }
        else {
            Class1393.Method5504().Method1886("Web not found!");
            super.Method21(false);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5883 ^ 0x4C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
