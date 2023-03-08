//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import org.lwjgl.input.*;
import java.util.concurrent.*;

public class Class1607
{
    private static final Map Field15507;
    private String Field15508 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static boolean Method6270(final int i) {
        if (Class218.Field8954.Method1264()) {
            return Class1607.Field15507.getOrDefault(i, false);
        }
        return Mouse.isButtonDown(i);
    }
    
    public static void Method6271(final int i, final boolean b) {
        Class1607.Field15507.put(i, b);
    }
    
    public static int Method6272() {
        return Mouse.getX();
    }
    
    public static int Method6273() {
        return Mouse.getY();
    }
    
    public static int Method6274() {
        return Mouse.getDWheel();
    }
    
    public static void Method6275(final boolean grabbed) {
        Mouse.setGrabbed(grabbed);
    }
    
    public static void Method6276() {
        Class1607.Field15507.clear();
    }
    
    static {
        Field15507 = new ConcurrentHashMap();
    }
}
