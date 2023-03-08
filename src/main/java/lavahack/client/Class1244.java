//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import java.net.*;
import java.util.function.*;
import java.lang.reflect.*;
import java.util.*;

public class Class1244
{
    private String Field13641 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method5001(final URLClassLoader urlClassLoader, final File file) throws Exception {
        Method5002(urlClassLoader, file.toURI().toURL());
    }
    
    public static void Method5002(final URLClassLoader obj, final URL url) throws Exception {
        final Method declaredMethod = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(obj, url);
    }
    
    public static void Method5003(Class superclass, final Consumer consumer) {
        while (superclass != Object.class) {
            consumer.accept(superclass);
            superclass = superclass.getSuperclass();
        }
    }
    
    public static Object Method5004(final Class clazz, final Object obj, final int n) {
        final Field field = clazz.getDeclaredFields()[n];
        field.setAccessible(true);
        return field.get(obj);
    }
    
    public static void Method5005(final Class clazz, final Object obj, final int n, final Object value) {
        final Field field = clazz.getDeclaredFields()[n];
        field.setAccessible(true);
        field.set(obj, value);
    }
    
    public static Field Method5006(final Class clazz, final String... a) throws NoSuchFieldException {
        final int length = a.length;
        final int n = 0;
        if (n < length) {
            return clazz.getDeclaredField(a[n]);
        }
        throw new NoSuchFieldException("No Such field: " + clazz.getName() + "-> " + Arrays.toString(a));
    }
    
    public static Method Method5007(final Class clazz, final String... a) {
        final int length = a.length;
        final int n = 0;
        if (n < length) {
            return clazz.getDeclaredMethod(a[n], (Class[])new Class[0]);
        }
        throw new RuntimeException("Couldn't find: " + Arrays.toString(a));
    }
    
    public static Method Method5008(final Class clazz, final String s, final String name, final String s2, final Class... parameterTypes) {
        return clazz.getMethod(name, (Class[])parameterTypes);
    }
    
    public static String Method5009(final String s) {
        return s.substring(s.lastIndexOf(".") + 1);
    }
    
    private static String Method5010(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1677 ^ 0xA8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
