//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import java.net.*;

public class Class787 extends Class1655
{
    private final File Field11326;
    private final String Field11327;
    private int Field11328;
    
    public Class787(final File field11326, final ClassLoader classLoader) throws Class1843 {
        super(field11326.getPath(), Method3275(field11326), classLoader);
        this.Field11326 = field11326;
        this.Field11327 = field11326.getAbsolutePath();
    }
    
    public Class787(final String pathname, final ClassLoader classLoader) throws Class1843 {
        this(new File(pathname), classLoader);
    }
    
    public Class787(final URL url, final ClassLoader classLoader) throws Class1843 {
        super(url.toString(), url, classLoader);
        this.Field11326 = new File(url.getPath());
        this.Field11327 = this.Field11326.getAbsolutePath();
    }
    
    private static URL Method3275(final File file) throws Class1843 {
        return file.toURI().toURL();
    }
    
    public File Method3276() {
        return this.Field11326;
    }
    
    public String Method3277() {
        return this.Field11327;
    }
}
