/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class278 {
    private int Field9216;

    private static String Method1470(String string) throws IOException {
        URL uRL = new URL(string);
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.addRequestProperty("User-Agent", "Mozilla");
        InputStream inputStream = uRLConnection.getInputStream();
        String string2 = new BufferedReader(new InputStreamReader(inputStream)).readLine();
        inputStream.close();
        return string2;
    }

    public static Map Method1471() throws IOException {
        return new HashMap();
    }

    public static String Method1472(String string, String string2, String string3) throws IOException {
        return "Unsupported";
    }

    public static String Method1473(String string) throws IOException {
        return "Unsupported";
    }

    public static String Method1474(Map map, String string) {
        String string2;
        Iterator iterator = map.keySet().iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!((String)map.get(string2 = (String)iterator.next())).equalsIgnoreCase(string));
        return string2;
    }

    public static String Method1475(Map map, String string) {
        String string2;
        String string3;
        Iterator iterator = map.entrySet().iterator();
        do {
            if (!iterator.hasNext()) return null;
            Map.Entry entry = iterator.next();
            string2 = (String)entry.getKey();
            string3 = (String)map.get(entry.getKey());
            if (!string2.equalsIgnoreCase(string)) continue;
            return string2;
        } while (!string3.equalsIgnoreCase(string));
        return string2;
    }

    private static String Method1476(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 149;
            cArray2[n] = (char)(cArray[n] ^ (0x21B3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

