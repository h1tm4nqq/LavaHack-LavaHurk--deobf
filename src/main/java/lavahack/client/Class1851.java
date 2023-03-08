//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.*;
import java.net.*;
import java.util.zip.*;
import java.util.jar.*;
import java.io.*;

public class Class1851 extends Class1551
{
    private String Field16531 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public File[] Method6945(final Collection collection) throws IOException, URISyntaxException {
        final File[] array = new File[collection.size()];
        int n = 0;
        for (final File file : collection) {
            Class1796.Field16243.info("Remapping: " + file.getName());
            final URL method3706 = Class886.Method3706(file.toURI());
            final String string = method3706.toString();
            final URL method3707 = Class886.Method3705(string.substring(0, string.length() - 4) + "-vanilla.jar");
            this.Method6122(method3706, method3707);
            array[n++] = new File(method3707.toURI());
        }
        return array;
    }
    
    protected void Method6123(final JarEntry ze, final JarOutputStream out, final JarFile jarFile, final Class1790 class1790) throws IOException {
        if (ze.getName().equals("META-INF/MANIFEST.MF")) {
            final InputStream inputStream = jarFile.getInputStream(ze);
            final Object o = null;
            out.putNextEntry(new JarEntry(ze.getName()));
            final Manifest manifest = new Manifest(inputStream);
            manifest.getMainAttributes().put(new Attributes.Name("3arthh4ckVanilla"), "true");
            manifest.write(out);
            out.flush();
            out.closeEntry();
            if (inputStream != null) {
                if (o != null) {
                    inputStream.close();
                }
                else {
                    inputStream.close();
                }
            }
            return;
        }
        super.Method6123(ze, out, jarFile, class1790);
    }
    
    private static String Method6124(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2212 ^ 0xDE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
