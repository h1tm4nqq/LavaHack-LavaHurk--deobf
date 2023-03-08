//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;

public class Class1812 extends Class42
{
    private String Field16338 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1812() {
        super("AutoMine", Class97.Field8341);
    }
    
    @Override
    public void Method45() {
        if (Class1812.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1812.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final RayTraceResult objectMouseOver = Class1812.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver;
        if (objectMouseOver == null) {
            return;
        }
        Class1812.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.onPlayerDamageBlock(objectMouseOver.getBlockPos(), objectMouseOver.sideHit);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5B7 ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
