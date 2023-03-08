//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import java.util.jar.*;

public class Class1695 extends Class1655
{
    private final JarURLConnection Field15856;
    private final JarFile Field15857;
    private String Field15858 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1695(final JarURLConnection field15856, final ClassLoader classLoader) throws Class1843 {
        super(field15856.toString(), field15856.getURL(), classLoader);
        this.Field15856 = field15856;
        this.Field15857 = field15856.getJarFile();
    }
    
    public Class1695(final JarURLConnection jarURLConnection) throws Class1843 {
        this(jarURLConnection, null);
    }
    
    public Class1695(final URL url, final ClassLoader classLoader) throws Class1843 {
        super(url.toString(), url, classLoader);
        final JarURLConnection field15856 = (JarURLConnection)url.openConnection();
        this.Field15856 = field15856;
        if (field15856 == null) {
            this.Field15857 = null;
            return;
        }
        this.Field15857 = field15856.getJarFile();
    }
    
    public JarURLConnection Method6501() {
        return this.Field15856;
    }
    
    public JarFile Method6502() {
        return this.Field15857;
    }
    
    public JarEntry Method6503(final String name) {
        return this.Field15857.getJarEntry(name);
    }
}
