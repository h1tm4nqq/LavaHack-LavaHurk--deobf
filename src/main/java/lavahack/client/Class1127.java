//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.concurrent.*;

public final class Class1127
{
    private static final Map Field13121;
    private static final Map Field13122;
    private String Field13123 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Class2099 Method4617(final String s) {
        return Class1127.Field13121.get(s);
    }
    
    public static Class2099 Method4618(final Class clazz) {
        return Class1127.Field13122.get(clazz);
    }
    
    static {
        Field13121 = new ConcurrentHashMap();
        Field13122 = new ConcurrentHashMap();
        Class1127.Field13121.put("key", Class1698::new);
        Class1127.Field13122.put(Class1698.class, Class1698::new);
    }
    
    private static String Method4619(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4DB8 ^ 0xB6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
