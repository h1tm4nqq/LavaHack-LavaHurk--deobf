/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import lavahack.client.Bh7UPn9kduaXneKZgVjOdasjD4iI2v1d;
import lavahack.client.OXnmHkicoKSXO07qPVZZlEOZLMS63HK3;
import lavahack.client.wM07y2BxCt9eVGDtwvMqXydBjA9ENj3q;

public class sKZRMJsRV3pOk2JRQEPFCMzc35ZaIiDE {
    private final Bh7UPn9kduaXneKZgVjOdasjD4iI2v1d Field15237 = new Bh7UPn9kduaXneKZgVjOdasjD4iI2v1d();
    private int Field15238;

    public void Method6122(URL uRL, URL uRL2) throws IOException {
        OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3 = OXnmHkicoKSXO07qPVZZlEOZLMS63HK3.Method6773("mappings/mappings.csv");
        JarFile jarFile = new JarFile(uRL.getFile());
        FileOutputStream fileOutputStream = new FileOutputStream(uRL2.getFile());
        Object var6_6 = null;
        JarOutputStream jarOutputStream = new JarOutputStream(fileOutputStream);
        Object var8_8 = null;
        Enumeration<JarEntry> enumeration = jarFile.entries();
        while (enumeration.hasMoreElements()) {
            JarEntry jarEntry = enumeration.nextElement();
            this.Method6123(jarEntry, jarOutputStream, jarFile, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
        }
        if (jarOutputStream != null) {
            if (var8_8 != null) {
                jarOutputStream.close();
            } else {
                jarOutputStream.close();
            }
        }
        if (fileOutputStream == null) return;
        if (var6_6 != null) {
            fileOutputStream.close();
            return;
        }
        fileOutputStream.close();
    }

    protected void Method6123(JarEntry jarEntry, JarOutputStream jarOutputStream, JarFile jarFile, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) throws IOException {
        InputStream inputStream = jarFile.getInputStream(jarEntry);
        Object var6_6 = null;
        jarOutputStream.putNextEntry(new JarEntry(jarEntry.getName()));
        if (jarEntry.getName().endsWith(".class")) {
            byte[] byArray = wM07y2BxCt9eVGDtwvMqXydBjA9ENj3q.Method2410(inputStream);
            jarOutputStream.write(this.Field15237.Method5495(byArray, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3));
        } else {
            wM07y2BxCt9eVGDtwvMqXydBjA9ENj3q.Method2411(inputStream, jarOutputStream);
        }
        jarOutputStream.flush();
        jarOutputStream.closeEntry();
        if (inputStream == null) return;
        if (var6_6 != null) {
            inputStream.close();
            return;
        }
        inputStream.close();
    }

    private static String Method6124(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)477572623 ^ (long)477572623);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1177976140L ^ 0xB9C9824B);
            int n2 = ((int)37703287L ^ 0x23F4E06) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1175389458 ^ (long)1175395037) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

