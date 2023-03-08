//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraft.init.*;

public class Class709 extends Class42
{
    private final Class44 Field11022;
    private String Field11023 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class709() {
        super("WaterLeave", "WaterLeave", Class97.Field8344);
        this.Field11022 = this.Method23(new Class44("Heigth", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)1589989901 ^ 0x403400005EC5520DL), false));
    }
    
    public void Method38() {
        if (Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble((long)2035365071 ^ 0x3FEE66661F3752A9L), Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Blocks.WATER) {
            Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field11022.Method367();
            Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = true;
        }
        if (Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater() || Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInLava()) {
            Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = true;
        }
        super.Method21(false);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x74A4 ^ 0x1E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
