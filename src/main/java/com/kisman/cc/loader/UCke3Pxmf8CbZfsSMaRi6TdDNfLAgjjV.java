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

public class UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV {
    public static List Field13500;
    private String Field13501 = "TheKisDevs & LavaHack Development owns you";

    public static boolean Method4882(String string) {
        String string2;
        Iterator iterator = Field13500.iterator();
        do {
            if (!iterator.hasNext()) return (int)((long)1346009580 ^ (long)1346009580) != 0;
        } while (!string.endsWith(string2 = (String)iterator.next()));
        return ((int)156185114L ^ 0x94F321B) != 0;
    }

    public static boolean Method4883() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    public static boolean Method4884() {
        return System.getProperty("java.class.path").contains("idea_rt.jar");
    }

    public static byte[] Method4885(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[(int)((long)-443823604 ^ (long)-443861517)];
        int n = inputStream.read(byArray);
        while (n != (int)((long)-896931096 ^ (long)896931095)) {
            byteArrayOutputStream.write(byArray, (int)-1410418823L ^ 0xABEEB779, n);
            n = inputStream.read(byArray);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void Method4886() {
        Unsafe unsafe = null;
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible((boolean)((long)-501215211 ^ (long)-501215212));
        unsafe = (Unsafe)field.get(null);
        Class[] classArray = new Class[((int)-1552534384L ^ 0xA3763491) << 1];
        classArray[(int)-1430526809L ^ 0xAABBE4A7] = Long.TYPE;
        classArray[(int)-609583339L ^ 0xDBAA7F14] = Long.TYPE;
        Object[] objectArray = new Object[((int)-69448233L ^ 0xFBDC4DD6) << 1];
        objectArray[(int)((long)30568111 ^ (long)30568111)] = 0L;
        objectArray[(int)((long)-1749061901 ^ (long)-1749061902)] = 0L;
        Unsafe.class.getDeclaredMethod("putAddress", classArray).invoke(unsafe, objectArray);
        Class[] classArray2 = new Class[(int)((long)452874824 ^ (long)452874825)];
        classArray2[(int)((long)-1937451623 ^ (long)-1937451623)] = Long.TYPE;
        Object[] objectArray2 = new Object[(int)1509292161L ^ 0x59F5F880];
        objectArray2[(int)-1364952980L ^ 0xAEA4786C] = 0L;
        Unsafe.class.getDeclaredMethod("freeMemory", classArray2).invoke(unsafe, objectArray2);
    }

    public static String Method4887() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : System.getProperties().keySet()) {
            if (!(object instanceof String) || !UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4888((String)object)) continue;
            stringBuilder.append(object).append("|").append(System.getProperty(object.toString())).append("&");
        }
        Iterator<Object> iterator = System.getenv().keySet().iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (String)iterator.next();
            if (!UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4888((String)object)) continue;
            stringBuilder.append((String)object).append("|").append(System.getenv((String)object)).append("&");
        }
        return UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4889(stringBuilder);
    }

    private static boolean Method4888(String string) {
        int n;
        if (!(string.equals("line.separator") || string.equals("java.class.path") || string.equals("ESET_OPTIONS") || string.equals("sun.java.command"))) {
            n = (int)((long)1465718281 ^ (long)1465718280);
            return n != 0;
        }
        n = (int)-1841639637L ^ 0x923ACF2B;
        return n != 0;
    }

    public static String Method4889(Object object) {
        return object.toString().replaceAll(" ", "_");
    }

    public static Object Method4890(Object object, String string, Object ... objectArray) {
        Class[] classArray = new Class[objectArray.length];
        int n = (int)((long)1203979881 ^ (long)1203979881);
        while (n < objectArray.length - (int)((long)-1370969991 ^ (long)-1370969992)) {
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
        JOptionPane.showMessageDialog(null, string, "LavaHack Loader 2.0", (int)((long)-474587839 ^ (long)-474587839));
        if (!bl) return;
        UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4886();
    }

    static {
        String[] stringArray = new String[(int)((long)1121395745 ^ (long)1121395758)];
        stringArray[(int)((long)1391179319 ^ (long)1391179319)] = ".png";
        stringArray[(int)((long)-1337155062 ^ (long)-1337155061)] = ".glsl";
        stringArray[((int)-1864123914L ^ 0x90E3B9F7) << 1] = ".shader";
        stringArray[(int)-1280594099L ^ 0xB3ABAF4E] = ".frag";
        stringArray[((int)-489133367L ^ 0xE2D86AC8) << 2] = ".vert";
        stringArray[(int)((long)-759569198 ^ (long)-759569193)] = ".jpg";
        stringArray[(int)((long)1465739759 ^ (long)1465739756) << 1] = ".ttf";
        stringArray[(int)((long)2054785403 ^ (long)2054785404)] = ".json";
        stringArray[(int)((long)-1310837536 ^ (long)-1310837535) << 3] = ".csv";
        stringArray[(int)((long)387643858 ^ (long)387643867)] = ".ScriptEngineFactory";
        stringArray[((int)-2126747817L ^ 0x813C6752) << 1] = ".IBaritoneProvider";
        stringArray[(int)((long)-1258563158 ^ (long)-1258563167)] = ".fsh";
        stringArray[((int)-653782656L ^ 0xD9081183) << 2] = ".vsh";
        stringArray[(int)817709989L ^ 0x30BD43A8] = ".shader";
        stringArray[(int)((long)538156420 ^ (long)538156419) << 1] = ".lang";
        Field13500 = Arrays.asList(stringArray);
    }

    private static String Method4894(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1646379352 ^ (long)-1646379352);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1509199858 ^ (long)-1509199631);
            int n2 = (int)((long)-1556278019 ^ (long)-1556278020) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-423612479L ^ 0xE6C0239A) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

