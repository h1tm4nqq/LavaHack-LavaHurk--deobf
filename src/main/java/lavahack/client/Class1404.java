//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.util.*;

public enum Class1404
{
    Field14352("Cev", 0, (List)Collections.singletonList(new Vec3i(0, 2, 0))), 
    Field14353("Civ", 1, (List)Arrays.asList(new Vec3i(1, 2, 0), new Vec3i(-1, 2, 0), new Vec3i(0, 2, 1), new Vec3i(0, 2, -1), new Vec3i(1, 2, 1), new Vec3i(-1, 2, -1), new Vec3i(1, 2, -1), new Vec3i(-1, 2, 1)));
    
    public final List Field14354;
    private static final Class1404[] Field14355;
    private int Field14356;
    
    private Class1404(final String name, final int ordinal, final List field14354) {
        this.Field14354 = field14354;
    }
    
    static {
        Field14355 = new Class1404[] { Class1404.Field14352, Class1404.Field14353 };
    }
    
    private static String Method5535(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D03 ^ 0x77));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
