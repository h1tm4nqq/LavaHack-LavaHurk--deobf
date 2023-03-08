//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.concurrent.*;

public class Class1424
{
    private static final Map Field14622;
    private static final Map Field14623;
    private String Field14624 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Class1866 Method5688(final String s) {
        return Class1424.Field14622.get(s);
    }
    
    public static Class1866 Method5689(final Class clazz) {
        return Class1424.Field14623.get(clazz);
    }
    
    static {
        Field14622 = new ConcurrentHashMap();
        Field14623 = new ConcurrentHashMap();
        Class1424.Field14622.put("cmd", Class1575::new);
        Class1424.Field14623.put(Class1575.class, Class1575::new);
    }
    
    private static String Method5690(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3D75 ^ 0x6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
