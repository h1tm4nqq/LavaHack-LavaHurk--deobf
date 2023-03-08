//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import java.io.*;
import java.util.*;

public class Class278
{
    private int Field9216;
    
    private static String Method1470(final String spec) throws IOException {
        final URLConnection openConnection = new URL(spec).openConnection();
        openConnection.addRequestProperty("User-Agent", "Mozilla");
        final InputStream inputStream = openConnection.getInputStream();
        final String line = new BufferedReader(new InputStreamReader(inputStream)).readLine();
        inputStream.close();
        return line;
    }
    
    public static Map Method1471() throws IOException {
        return new HashMap();
    }
    
    public static String Method1472(final String s, final String s2, final String s3) throws IOException {
        return "Unsupported";
    }
    
    public static String Method1473(final String s) throws IOException {
        return "Unsupported";
    }
    
    public static String Method1474(final Map map, final String anotherString) {
        for (final String s : map.keySet()) {
            if (((String)map.get(s)).equalsIgnoreCase(anotherString)) {
                return s;
            }
        }
        return null;
    }
    
    public static String Method1475(final Map map, final String s) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s2 = entry.getKey();
            final String s3 = (String)map.get(entry.getKey());
            if (s2.equalsIgnoreCase(s)) {
                return s2;
            }
            if (s3.equalsIgnoreCase(s)) {
                return s2;
            }
        }
        return null;
    }
    
    private static String Method1476(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x21B3 ^ 0x95));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
