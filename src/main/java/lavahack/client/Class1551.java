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
import lavahack.client.Class1387;
import lavahack.client.Class1790;
import lavahack.client.Class530;

public class Class1551 {
    private final Class1387 Field15237 = new Class1387();
    private int Field15238;

    public void Method6122(URL uRL, URL uRL2) throws IOException {
        Class1790 class1790 = Class1790.Method6773("mappings/mappings.csv");
        JarFile jarFile = new JarFile(uRL.getFile());
        FileOutputStream fileOutputStream = new FileOutputStream(uRL2.getFile());
        Object var6_6 = null;
        JarOutputStream jarOutputStream = new JarOutputStream(fileOutputStream);
        Object var8_8 = null;
        Enumeration<JarEntry> enumeration = jarFile.entries();
        while (enumeration.hasMoreElements()) {
            JarEntry jarEntry = enumeration.nextElement();
            this.Method6123(jarEntry, jarOutputStream, jarFile, class1790);
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

    protected void Method6123(JarEntry jarEntry, JarOutputStream jarOutputStream, JarFile jarFile, Class1790 class1790) throws IOException {
        InputStream inputStream = jarFile.getInputStream(jarEntry);
        Object var6_6 = null;
        jarOutputStream.putNextEntry(new JarEntry(jarEntry.getName()));
        if (jarEntry.getName().endsWith(".class")) {
            byte[] byArray = Class530.Method2410(inputStream);
            jarOutputStream.write(this.Field15237.Method5495(byArray, class1790));
        } else {
            Class530.Method2411(inputStream, jarOutputStream);
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 226;
            cArray2[n] = (char)(cArray[n] ^ (0x7F3C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

