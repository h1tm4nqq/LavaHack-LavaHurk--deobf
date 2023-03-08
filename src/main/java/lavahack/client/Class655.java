//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.input.*;

public class Class655
{
    private String Field10802 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Class21 Method2822(final int n) {
        return (Class21)new Class1785(n);
    }
    
    public static Class684 Method2823(final int n) {
        return new Class1785(n).Method189();
    }
    
    public static Class816 Method2824(final int... array) {
        return (Class816)new Class1518(array);
    }
    
    public static Class816 Method2825(final Class21... array) {
        return (Class816)new Class1518(Method2828(array));
    }
    
    public static boolean Method2826(final int n) {
        return Method2827(n);
    }
    
    private static boolean Method2827(final int n) {
        return Keyboard.isKeyDown(n);
    }
    
    private static int[] Method2828(final Class21... array) {
        final int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i].Method188();
        }
        return array2;
    }
    
    static boolean Method2829(final int n) {
        return Method2827(n);
    }
}
