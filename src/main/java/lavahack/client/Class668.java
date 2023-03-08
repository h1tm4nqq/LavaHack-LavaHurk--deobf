//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;

public enum Class668
{
    Field10833("DOWN", 0, 0, -1, 0), 
    Field10834("UP", 1, 0, 1, 0), 
    Field10835("NORTH", 2, 0, 0, -1), 
    Field10836("EAST", 3, 1, 0, 0), 
    Field10837("SOUTH", 4, 0, 0, 1), 
    Field10838("WEST", 5, -1, 0, 0);
    
    private final int Field10839;
    private final int Field10840;
    private final int Field10841;
    private static final Class668[] Field10842;
    private String Field10843 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class668(final String name, final int ordinal, final int field10839, final int field10840, final int field10841) {
        this.Field10839 = field10839;
        this.Field10840 = field10840;
        this.Field10841 = field10841;
    }
    
    public BlockPos Method2846(final BlockPos blockPos) {
        return blockPos.add(this.Field10839, this.Field10840, this.Field10841);
    }
    
    public BlockPos Method2847(final BlockPos blockPos, final int n) {
        return blockPos.add(this.Field10839 * n, 0, this.Field10841 * n);
    }
    
    public BlockPos Method2848(final BlockPos blockPos, final int n) {
        return blockPos.add(-this.Field10839 * n, 0, -this.Field10841 * n);
    }
    
    public BlockPos Method2849(final BlockPos blockPos, final int n) {
        return blockPos.add(this.Field10841 * n, 0, -this.Field10839 * n);
    }
    
    public BlockPos Method2850(final BlockPos blockPos, final int n) {
        return blockPos.add(-this.Field10841 * n, 0, this.Field10839 * n);
    }
    
    static {
        Field10842 = new Class668[] { Class668.Field10833, Class668.Field10834, Class668.Field10835, Class668.Field10836, Class668.Field10837, Class668.Field10838 };
    }
    
    private static String Method2851(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1295 ^ 0x58));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
