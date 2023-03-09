/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.Class886;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import lavahack.client.Class1551;
import lavahack.client.Class1790;
import lavahack.client.Class1796;

public class Class1851
extends Class1551 {
    private String Field16531 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public File[] Method6945(Collection collection) throws IOException, URISyntaxException {
        File[] fileArray = new File[collection.size()];
        int n = 0;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            File file = (File)iterator.next();
            Class1796.Field16243.info("Remapping: " + file.getName());
            URL uRL = Class886.Method3706(file.toURI());
            String string = uRL.toString();
            string = string.substring(0, string.length() - 4) + "-vanilla.jar";
            URL uRL2 = Class886.Method3705(string);
            this.Method6122(uRL, uRL2);
            File file2 = new File(uRL2.toURI());
            fileArray[n++] = file2;
        }
        return fileArray;
    }

    @Override
    protected void Method6123(JarEntry jarEntry, JarOutputStream jarOutputStream, JarFile jarFile, Class1790 class1790) throws IOException {
        if (!jarEntry.getName().equals("META-INF/MANIFEST.MF")) {
            super.Method6123(jarEntry, jarOutputStream, jarFile, class1790);
            return;
        }
        InputStream inputStream = jarFile.getInputStream(jarEntry);
        Object var6_6 = null;
        jarOutputStream.putNextEntry(new JarEntry(jarEntry.getName()));
        Manifest manifest = new Manifest(inputStream);
        Attributes attributes = manifest.getMainAttributes();
        attributes.put(new Attributes.Name("3arthh4ckVanilla"), "true");
        manifest.write(jarOutputStream);
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
            int n2 = 222;
            cArray2[n] = (char)(cArray[n] ^ (0x2212 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

