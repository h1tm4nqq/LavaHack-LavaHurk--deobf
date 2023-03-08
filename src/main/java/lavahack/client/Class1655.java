//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;

public abstract class Class1655
{
    protected final String Field15703;
    protected final URL Field15704;
    protected final String Field15705;
    protected final String Field15706;
    protected final URLConnection Field15707;
    protected final ClassLoader Field15708;
    private int Field15709;
    
    public Class1655(final String s, final ClassLoader classLoader) throws Class1843 {
        this.Field15708 = ((classLoader != null) ? classLoader : Thread.currentThread().getContextClassLoader());
        final URL resource = this.Field15708.getResource(s);
        if (resource == null) {
            throw new Class1843();
        }
        this.Field15703 = s;
        this.Field15704 = resource;
        this.Field15705 = resource.getProtocol();
        this.Field15706 = resource.getPath();
        this.Field15707 = resource.openConnection();
    }
    
    public Class1655(final String s) throws Class1843 {
        this(s, Thread.currentThread().getContextClassLoader());
    }
    
    protected Class1655(final String field15703, final URL field15704, final ClassLoader classLoader) throws Class1843 {
        this.Field15708 = ((classLoader != null) ? classLoader : Thread.currentThread().getContextClassLoader());
        if (field15704 == null) {
            throw new Class1843();
        }
        this.Field15703 = field15703;
        this.Field15704 = field15704;
        this.Field15705 = field15704.getProtocol();
        this.Field15706 = field15704.getPath();
        this.Field15707 = field15704.openConnection();
    }
    
    protected Class1655(final String s, final URL url) throws Class1843 {
        this(s, url, null);
    }
    
    protected Class1655(final String field15703, final URL field15704, final URLConnection field15705, final ClassLoader field15706) {
        this.Field15703 = field15703;
        this.Field15704 = field15704;
        this.Field15705 = field15704.getProtocol();
        this.Field15706 = field15704.getProtocol();
        this.Field15707 = field15705;
        this.Field15708 = field15706;
    }
    
    protected Class1655(final String field15703, final URL field15704, final String field15705, final String field15706, final URLConnection field15707, final ClassLoader field15708) {
        this.Field15703 = field15703;
        this.Field15704 = field15704;
        this.Field15705 = field15705;
        this.Field15706 = field15706;
        this.Field15707 = field15707;
        this.Field15708 = field15708;
    }
    
    public String Method172() {
        return this.Field15703;
    }
    
    public URL Method173() {
        return this.Field15704;
    }
    
    public String Method174() {
        return this.Field15705;
    }
    
    public String Method175() {
        return this.Field15706;
    }
    
    public URLConnection Method176() {
        return this.Field15707;
    }
    
    public ClassLoader Method177() {
        return this.Field15708;
    }
    
    @Override
    public String toString() {
        return this.getClass().getName() + ":" + this.Field15704.toString() + ":" + this.Field15708.getClass().getName();
    }
    
    private static String Method178(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x31F0 ^ 0x84));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
