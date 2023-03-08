//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.awt.*;

public enum Class450
{
    Field9873("BOX", 0) {
        private String Field8351 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
        
        Class98(final String s, final int n) {
        }
        
        @Override
        void Method809(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2, final boolean b, final Object... array) {
            if (b) {
                Class815.Method3460(axisAlignedBB, color, color2);
            }
            else {
                Class815.Method3456(axisAlignedBB, color);
            }
        }
    }, 
    Field9874("OUTLINE", 1), 
    Field9875("WIRE", 2);
    
    private static final Class450[] Field9876;
    private int Field9877;
    
    private Class450(final String name, final int ordinal) {
    }
    
    abstract void Method809(final AxisAlignedBB p0, final Color p1, final Color p2, final boolean p3, final Object... p4);
    
    public void Method810(final AxisAlignedBB axisAlignedBB, final Color color, final Object... array) {
        this.Method809(axisAlignedBB, color, color, false, array);
    }
    
    public void Method811(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2, final Object... array) {
        this.Method809(axisAlignedBB, color, color2, true, array);
    }
    
    Class450(final String s, final int n, final Class1951 class1951) {
        this(s, n);
    }
    
    static {
        Field9876 = new Class450[] { Class450.Field9873, Class450.Field9874, Class450.Field9875 };
    }
    
    private static String Method812(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2D84 ^ 0x26));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
