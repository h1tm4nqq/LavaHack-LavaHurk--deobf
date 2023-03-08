//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import org.lwjgl.input.*;
import java.util.concurrent.*;

public class Class946
{
    private static final Map Field12040;
    private String Field12041 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static String Method3904(final int n) {
        return Keyboard.getKeyName(n);
    }
    
    public static void Method3905(final boolean b) {
        Keyboard.enableRepeatEvents(b);
    }
    
    public static boolean Method3906() {
        return Keyboard.getEventKeyState();
    }
    
    public static int Method3907() {
        return Keyboard.getEventKey();
    }
    
    public static char Method3908() {
        return Keyboard.getEventCharacter();
    }
    
    public static int Method3909(final String s) {
        return Keyboard.getKeyIndex(s);
    }
    
    public static boolean Method3910(final int i) {
        if (Class218.Field8954.Method1264()) {
            return Class946.Field12040.getOrDefault(i, false);
        }
        return Keyboard.isKeyDown(i);
    }
    
    static {
        Field12040 = new ConcurrentHashMap();
    }
}
