/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.function.Consumer;

public class Class1244 {
    private String Field13641 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method5001(URLClassLoader uRLClassLoader, File file) throws Exception {
        URL uRL = file.toURI().toURL();
        Class1244.Method5002(uRLClassLoader, uRL);
    }

    public static void Method5002(URLClassLoader uRLClassLoader, URL uRL) throws Exception {
        Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
        method.setAccessible(true);
        method.invoke(uRLClassLoader, uRL);
    }

    public static void Method5003(Class clazz, Consumer consumer) {
        while (clazz != Object.class) {
            consumer.accept(clazz);
            clazz = clazz.getSuperclass();
        }
    }

    public static Object Method5004(Class clazz, Object object, int n) {
        Field field = clazz.getDeclaredFields()[n];
        field.setAccessible(true);
        return field.get(object);
    }

    public static void Method5005(Class clazz, Object object, int n, Object object2) {
        Field field = clazz.getDeclaredFields()[n];
        field.setAccessible(true);
        field.set(object, object2);
    }

    public static Field Method5006(Class clazz, String ... stringArray) throws NoSuchFieldException {
        int n = 0;
        String[] stringArray2 = stringArray;
        int n2 = stringArray2.length;
        if (n >= n2) throw new NoSuchFieldException("No Such field: " + clazz.getName() + "-> " + Arrays.toString(stringArray));
        String string = stringArray2[n];
        return clazz.getDeclaredField(string);
    }

    public static Method Method5007(Class clazz, String ... stringArray) {
        int n = 0;
        String[] stringArray2 = stringArray;
        int n2 = stringArray2.length;
        if (n >= n2) throw new RuntimeException("Couldn't find: " + Arrays.toString(stringArray));
        String string = stringArray2[n];
        return clazz.getDeclaredMethod(string, new Class[0]);
    }

    public static Method Method5008(Class clazz, String string, String string2, String string3, Class ... classArray) {
        return clazz.getMethod(string2, classArray);
    }

    public static String Method5009(String string) {
        return string.substring(string.lastIndexOf(".") + 1);
    }

    private static String Method5010(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 168;
            cArray2[n] = (char)(cArray[n] ^ (0x1677 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

