//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.block.*;
import net.minecraft.init.*;

public enum Class1072
{
    Field12727("Torch", 0) {
        private String Field10443 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
        
        Class573(final String s, final int n) {
        }
        
        @Override
        public Class1072 Method2519() {
            return Class573.Block;
        }
        
        @Override
        public Block Method2520() {
            return Blocks.REDSTONE_TORCH;
        }
    }, 
    Field12728("Block", 1) {
        private int Field10442;
        
        Class572(final String s, final int n) {
        }
        
        @Override
        public Class1072 Method2519() {
            return Class572.Torch;
        }
        
        @Override
        public Block Method2520() {
            return Blocks.REDSTONE_BLOCK;
        }
    };
    
    private static final Class1072[] Field12729;
    private String Field12730 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1072(final String name, final int ordinal) {
    }
    
    public Class1072 Method2519() {
        return null;
    }
    
    public Block Method2520() {
        return null;
    }
    
    Class1072(final String s, final int n, final Class573 class1072) {
        this(s, n);
    }
    
    static {
        Field12729 = new Class1072[] { Class1072.Field12727, Class1072.Field12728 };
    }
    
    private static String Method2521(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1EAD ^ 0x97));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
