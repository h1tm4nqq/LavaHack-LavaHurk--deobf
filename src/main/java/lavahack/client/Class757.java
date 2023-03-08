//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.concurrent.*;

public class Class757
{
    private static final Map Field11210;
    private String Field11211 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method3137(final Class906 class906, final String s) {
        Class757.Field11210.put(class906, s);
    }
    
    public static String Method3138(final Class906 class906) {
        return Class757.Field11210.get(class906);
    }
    
    static {
        Field11210 = new ConcurrentHashMap();
    }
}
