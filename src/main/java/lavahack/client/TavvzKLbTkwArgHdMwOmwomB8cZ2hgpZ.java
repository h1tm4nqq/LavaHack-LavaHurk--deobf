/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
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
import lavahack.client.OXnmHkicoKSXO07qPVZZlEOZLMS63HK3;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.sKZRMJsRV3pOk2JRQEPFCMzc35ZaIiDE;

public class TavvzKLbTkwArgHdMwOmwomB8cZ2hgpZ
extends sKZRMJsRV3pOk2JRQEPFCMzc35ZaIiDE {
    private String Field16531 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public File[] Method6945(Collection collection) throws IOException, URISyntaxException {
        File[] fileArray = new File[collection.size()];
        int n = (int)((long)-253310399 ^ (long)-253310399);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            File file = (File)iterator.next();
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("Remapping: " + file.getName());
            URL uRL = agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3706(file.toURI());
            String string = uRL.toString();
            string = string.substring((int)-2043850956L ^ 0x862D4F34, string.length() - (((int)1897306140L ^ 0x7116981D) << 2)) + "-vanilla.jar";
            URL uRL2 = agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3705(string);
            this.Method6122(uRL, uRL2);
            File file2 = new File(uRL2.toURI());
            fileArray[n++] = file2;
        }
        return fileArray;
    }

    @Override
    protected void Method6123(JarEntry jarEntry, JarOutputStream jarOutputStream, JarFile jarFile, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) throws IOException {
        if (!jarEntry.getName().equals("META-INF/MANIFEST.MF")) {
            super.Method6123(jarEntry, jarOutputStream, jarFile, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
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
        int n = (int)-1217094552L ^ 0xB7749C68;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-823851750L ^ 0xCEE505E5);
            int n2 = ((int)-1381098679L ^ 0xADAE1B26) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1733979822 ^ (long)1733984167) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

