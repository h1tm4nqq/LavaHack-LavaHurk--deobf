//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import java.util.jar.*;
import java.util.*;
import java.util.zip.*;
import java.io.*;

public class Class1551
{
    private final Class1387 Field15237;
    private int Field15238;
    
    public Class1551() {
        this.Field15237 = new Class1387();
    }
    
    public void Method6122(final URL url, final URL url2) throws IOException {
        final Class1790 method6773 = Class1790.Method6773("mappings/mappings.csv");
        final JarFile jarFile = new JarFile(url.getFile());
        final FileOutputStream out = new FileOutputStream(url2.getFile());
        final Object o = null;
        final JarOutputStream jarOutputStream = new JarOutputStream(out);
        final Object o2 = null;
        final Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            this.Method6123(entries.nextElement(), jarOutputStream, jarFile, method6773);
        }
        if (jarOutputStream != null) {
            if (o2 != null) {
                jarOutputStream.close();
            }
            else {
                jarOutputStream.close();
            }
        }
        if (out != null) {
            if (o != null) {
                out.close();
            }
            else {
                out.close();
            }
        }
    }
    
    protected void Method6123(final JarEntry ze, final JarOutputStream jarOutputStream, final JarFile jarFile, final Class1790 class1790) throws IOException {
        final InputStream inputStream = jarFile.getInputStream(ze);
        final Object o = null;
        jarOutputStream.putNextEntry(new JarEntry(ze.getName()));
        if (ze.getName().endsWith(".class")) {
            jarOutputStream.write(this.Field15237.Method5495(Class530.Method2410(inputStream), class1790));
        }
        else {
            Class530.Method2411(inputStream, jarOutputStream);
        }
        jarOutputStream.flush();
        jarOutputStream.closeEntry();
        if (inputStream != null) {
            if (o != null) {
                inputStream.close();
            }
            else {
                inputStream.close();
            }
        }
    }
    
    private static String Method6124(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7F3C ^ 0xE2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
