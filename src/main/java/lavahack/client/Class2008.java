//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.awt.*;
import java.util.*;

public enum Class2008
{
    Field17211("OUTLINE", 0, false, new Class450[] { Class450.Field9874 }), 
    Field17212("BOX", 1, false, new Class450[] { Class450.Field9873 }), 
    Field17213("WIRE", 2, false, new Class450[] { Class450.Field9875 }), 
    Field17214("BOX_OUTLINE", 3, false, new Class450[] { Class450.Field9873, Class450.Field9874 }), 
    Field17215("BOX_WIRE", 4, false, new Class450[] { Class450.Field9873, Class450.Field9875 }), 
    Field17216("WIRE_OUTLINE", 5, false, new Class450[] { Class450.Field9874, Class450.Field9875 }), 
    Field17217("BOX_WIRE_OUTLINE", 6, false, new Class450[] { Class450.Field9873, Class450.Field9874, Class450.Field9875 }), 
    Field17218("WIRE_GRADIENT", 7, true, new Class450[] { Class450.Field9875 }), 
    Field17219("BOX_GRADIENT", 8, true, new Class450[] { Class450.Field9873 }), 
    Field17220("OUTLINE_GRADIENT", 9, true, new Class450[] { Class450.Field9874 }), 
    Field17221("BOX_OUTLINE_GRADIENT", 10, true, new Class450[] { Class450.Field9873, Class450.Field9874 }), 
    Field17222("BOX_WIRE_GRADIENT", 11, true, new Class450[] { Class450.Field9873, Class450.Field9875 }), 
    Field17223("WIRE_OUTLINE_GRADIENT", 12, true, new Class450[] { Class450.Field9874, Class450.Field9875 }), 
    Field17224("BOX_WIRE_OUTLINE_GRADIENT", 13, true, new Class450[] { Class450.Field9873, Class450.Field9874, Class450.Field9875, Class450.Field9873 });
    
    public final ArrayList Field17225;
    public final boolean Field17226;
    private static final Class2008[] Field17227;
    private String Field17228 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class2008(final String name, final int ordinal, final boolean field17226, final Class450... a) {
        this.Field17226 = field17226;
        this.Field17225 = new ArrayList((Collection<? extends E>)Arrays.asList(a));
    }
    
    public void Method7456(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2, final Color color3, final Color color4, final Color color5, final Color color6, final boolean b, final Object... array) {
        for (final Class450 class450 : this.Field17225) {
            if (class450 == Class450.Field9875) {
                class450.Method809(axisAlignedBB, color5, color6, this.Field17226, array);
            }
            else {
                Class815.Method3432(b);
                if (this.Field17226) {
                    Class815.Method3440();
                }
                if (class450 == Class450.Field9873) {
                    class450.Method809(axisAlignedBB, color, color2, this.Field17226, array);
                }
                else if (class450 == Class450.Field9874) {
                    class450.Method809(axisAlignedBB, color3, color4, this.Field17226, array);
                }
                if (this.Field17226) {
                    Class815.Method3441();
                }
                Class815.Method3435(b);
            }
        }
    }
    
    static {
        Field17227 = new Class2008[] { Class2008.Field17211, Class2008.Field17212, Class2008.Field17213, Class2008.Field17214, Class2008.Field17215, Class2008.Field17216, Class2008.Field17217, Class2008.Field17218, Class2008.Field17219, Class2008.Field17220, Class2008.Field17221, Class2008.Field17222, Class2008.Field17223, Class2008.Field17224 };
    }
    
    private static String Method7457(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xCF5 ^ 0xEF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
