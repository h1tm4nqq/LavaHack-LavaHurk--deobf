/*
 * Decompiled with CFR 0.152.
 */
package com.kisman.cc.loader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import sun.misc.Unsafe;

public class Class1214 {
    public static List Field13500 = Arrays.asList(".png", ".glsl", ".shader", ".frag", ".vert", ".jpg", ".ttf", ".json", ".csv", ".ScriptEngineFactory", ".IBaritoneProvider", ".fsh", ".vsh", ".shader", ".lang");
    private String Field13501 = "TheKisDevs & LavaHack Development owns you";

    public static boolean Method4882(String string) {
        String string2;
        Iterator iterator = Field13500.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!string.endsWith(string2 = (String)iterator.next()));
        return true;
    }

    public static boolean Method4883() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    public static boolean Method4884() {
        return System.getProperty("java.class.path").contains("idea_rt.jar");
    }

    public static byte[] Method4885(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[65535];
        int n = inputStream.read(byArray);
        while (n != -1) {
            byteArrayOutputStream.write(byArray, 0, n);
            n = inputStream.read(byArray);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void Method4886() {
        Unsafe unsafe = null;
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        unsafe = (Unsafe)field.get(null);
        Unsafe.class.getDeclaredMethod("putAddress", Long.TYPE, Long.TYPE).invoke(unsafe, 0L, 0L);
        Unsafe.class.getDeclaredMethod("freeMemory", Long.TYPE).invoke(unsafe, 0L);
    }

    public static String Method4887() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : System.getProperties().keySet()) {
            if (!(object instanceof String) || !Class1214.Method4888((String)object)) continue;
            stringBuilder.append(object).append("|").append(System.getProperty(object.toString())).append("&");
        }
        Iterator<Object> iterator = System.getenv().keySet().iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (String)iterator.next();
            if (!Class1214.Method4888((String)object)) continue;
            stringBuilder.append((String)object).append("|").append(System.getenv((String)object)).append("&");
        }
        return Class1214.Method4889(stringBuilder);
    }

    private static boolean Method4888(String string) {
        if (string.equals("line.separator")) return false;
        if (string.equals("java.class.path")) return false;
        if (string.equals("ESET_OPTIONS")) return false;
        if (string.equals("sun.java.command")) return false;
        return true;
    }

    public static String Method4889(Object object) {
        return object.toString().replaceAll(" ", "_");
    }

    public static Object Method4890(Object object, String string, Object ... objectArray) {
        Class[] classArray = new Class[objectArray.length];
        int n = 0;
        while (n < objectArray.length - 1) {
            classArray[n] = objectArray[n].getClass();
            ++n;
        }
        return object.getClass().getDeclaredMethod(string, classArray).invoke(object, objectArray);
    }

    public static Object Method4891(Object object, String string) {
        return object.getClass().getField(string).get(object);
    }

    public static String Method4892(String string) {
        return string.replaceAll("\\s", "");
    }

    public static void Method4893(String string, boolean bl) {
        JOptionPane.showMessageDialog(null, string, "LavaHack Loader 2.0", 0);
        if (!bl) return;
        Class1214.Method4886();
    }

    private static String Method4894(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 2;
            cArray2[n] = (char)(cArray[n] ^ (0x316C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

