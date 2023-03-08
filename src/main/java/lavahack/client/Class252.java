//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import java.util.function.*;

public class Class252 extends Class42
{
    private String Field9124 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class252() {
        super("AntiVanish", Class97.Field8344);
    }
    
    @Override
    public void Method45() {
        if (Class252.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class252.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class252.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(Entity::isInvisible).forEach(Class252::Method1366);
    }
    
    @Override
    public boolean Method52() {
        return true;
    }
    
    private static void Method1366(final Entity entity) {
        entity.setInvisible(false);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2820 ^ 0x8C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
