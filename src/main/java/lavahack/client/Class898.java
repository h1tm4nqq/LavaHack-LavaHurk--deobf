//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.util.math.*;

public class Class898
{
    private static final String Field11765;
    private String Field11766 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Vec3d Method3736(final Entity entity, final double n) {
        return entity.getPositionVector().add(new Vec3d(entity.motionX * n, entity.motionY * n, entity.motionZ * n));
    }
    
    static {
        Field11765 = "fdee323e-7f0c-4c15-8d1c-0f277442342a";
    }
    
    private static String Method3737(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xA74 ^ 0xB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
