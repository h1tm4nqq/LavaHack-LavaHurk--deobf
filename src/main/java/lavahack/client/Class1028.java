//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.net.*;
import java.io.*;

public class Class1028
{
    public static String Field12517;
    public static String Field12518;
    private int Field12519;
    
    public static String Method4167(final String s) {
        final ArrayList<String> list = new ArrayList<String>();
        String string = "";
        new Thread(new Class1666(s, list)).start();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            string += iterator.next();
        }
        return string;
    }
    
    public static void Method4168(final String s) {
        final ArrayList list = new ArrayList();
        new Thread(new Class1667(s)).start();
    }
    
    public static List Method4169(final String s) {
        final ArrayList list = new ArrayList();
        new Thread(new Class1668(s, list)).start();
        return list;
    }
    
    public static String Method4170(final String spec) {
        final ArrayList<String> list = new ArrayList<String>();
        String string = "";
        final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(spec).openConnection();
        httpURLConnection.addRequestProperty(Class1028.Field12517, Class1028.Field12518);
        String line;
        while ((line = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8")).readLine()) != null) {
            list.add(line);
        }
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            string += iterator.next();
        }
        return string;
    }
    
    static {
        Class1028.Field12517 = "User-Agent";
        Class1028.Field12518 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36";
    }
    
    private static String Method4171(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D54 ^ 0x41));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
