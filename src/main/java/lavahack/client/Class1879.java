//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;

public enum Class1879
{
    Field16665("NORTH", 0, new Vec3i(0, 0, -1)), 
    Field16666("WEST", 1, new Vec3i(-1, 0, 0)), 
    Field16667("SOUTH", 2, new Vec3i(0, 0, 1)), 
    Field16668("EAST", 3, new Vec3i(1, 0, 0));
    
    public Vec3i Field16669;
    private static final Class1879[] Field16670;
    private int Field16671;
    
    private Class1879(final String name, final int ordinal, final Vec3i field16669) {
        this.Field16669 = field16669;
    }
    
    static {
        Field16670 = new Class1879[] { Class1879.Field16665, Class1879.Field16666, Class1879.Field16667, Class1879.Field16668 };
    }
    
    private static String Method6974(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3540 ^ 0x4D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
