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

public class Qb7S3VTi0GeBVQ7mOv2V9Y5DYrlMkFQH {
    private String Field13641 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method5001(URLClassLoader uRLClassLoader, File file) throws Exception {
        URL uRL = file.toURI().toURL();
        Qb7S3VTi0GeBVQ7mOv2V9Y5DYrlMkFQH.Method5002(uRLClassLoader, uRL);
    }

    public static void Method5002(URLClassLoader uRLClassLoader, URL uRL) throws Exception {
        Class[] classArray = new Class[(int)-114825663L ^ 0xF927E640];
        classArray[(int)((long)1815854289 ^ (long)1815854289)] = URL.class;
        Method method = URLClassLoader.class.getDeclaredMethod("addURL", classArray);
        method.setAccessible((boolean)((long)-613618764 ^ (long)-613618763));
        Object[] objectArray = new Object[(int)((long)1116883213 ^ (long)1116883212)];
        objectArray[(int)1043602787L ^ 0x3E341D63] = uRL;
        method.invoke(uRLClassLoader, objectArray);
    }

    public static void Method5003(Class clazz, Consumer consumer) {
        while (clazz != Object.class) {
            consumer.accept(clazz);
            clazz = clazz.getSuperclass();
        }
    }

    public static Object Method5004(Class clazz, Object object, int n) {
        Field field = clazz.getDeclaredFields()[n];
        field.setAccessible((boolean)((long)-594190282 ^ (long)-594190281));
        return field.get(object);
    }

    public static void Method5005(Class clazz, Object object, int n, Object object2) {
        Field field = clazz.getDeclaredFields()[n];
        field.setAccessible((boolean)((long)40661496 ^ (long)40661497));
        field.set(object, object2);
    }

    public static Field Method5006(Class clazz, String ... stringArray) throws NoSuchFieldException {
        int n = (int)((long)752220611 ^ (long)752220611);
        String[] stringArray2 = stringArray;
        int n2 = stringArray2.length;
        if (n >= n2) throw new NoSuchFieldException("No Such field: " + clazz.getName() + "-> " + Arrays.toString(stringArray));
        String string = stringArray2[n];
        return clazz.getDeclaredField(string);
    }

    public static Method Method5007(Class clazz, String ... stringArray) {
        int n = (int)((long)1598920526 ^ (long)1598920526);
        String[] stringArray2 = stringArray;
        int n2 = stringArray2.length;
        if (n >= n2) throw new RuntimeException("Couldn't find: " + Arrays.toString(stringArray));
        String string = stringArray2[n];
        return clazz.getDeclaredMethod(string, new Class[(int)1475208527L ^ 0x57EDE54F]);
    }

    public static Method Method5008(Class clazz, String string, String string2, String string3, Class ... classArray) {
        return clazz.getMethod(string2, classArray);
    }

    public static String Method5009(String string) {
        return string.substring(string.lastIndexOf(".") + (int)((long)1548208384 ^ (long)1548208385));
    }

    private static String Method5010(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1994174206L ^ 0x89235102;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-958263670L ^ 0xC6E20E75);
            int n2 = (int)((long)1055545197 ^ (long)1055545208) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)682306960 ^ (long)682310631) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

