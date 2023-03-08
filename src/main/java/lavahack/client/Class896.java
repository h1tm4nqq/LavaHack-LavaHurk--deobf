//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.potion.*;
import java.util.*;

public class Class896 extends Class42
{
    private int Field11761;
    
    public Class896() {
        super("AntiWeakness", Class97.Field8341);
    }
    
    public void Method45() {
        if (Class896.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class896.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class896.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive((Potion)Objects.requireNonNull(Potion.getPotionFromResourceLocation("weakness")))) {
            Class896.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.removeActivePotionEffect(Potion.getPotionFromResourceLocation("weakness"));
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x22F4 ^ 0xD0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
