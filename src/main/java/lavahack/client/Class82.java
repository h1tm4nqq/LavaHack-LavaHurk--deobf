//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.concurrent.*;

public final class Class82
{
    private static final Map Field8278;
    private String Field8279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static boolean Method729(final Class1255 class1255) {
        if (Class82.Field8278.containsKey(class1255.Method5062())) {
            return false;
        }
        Class82.Field8278.put(class1255.Method5062(), class1255);
        return true;
    }
    
    public static boolean Method730(final Class1255 value) {
        return Class82.Field8278.remove(value.Method5062(), value);
    }
    
    public static Class1255 Method731(final String s) {
        return Class82.Field8278.remove(s);
    }
    
    public Class1255 Method732(final String s) {
        return Class82.Field8278.get(s);
    }
    
    public static Map Method733() {
        return Class82.Field8278;
    }
    
    static {
        Field8278 = new ConcurrentHashMap();
    }
}
