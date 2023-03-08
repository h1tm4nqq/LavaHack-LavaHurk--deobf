//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;

public class Class1195
{
    public static final String Field13415;
    public static final Class1195 Field13416;
    public static final String Field13417;
    public static final Class1195 Field13418;
    public static final String Field13419;
    public static final Class1195 Field13420;
    private final String Field13421;
    private String Field13422 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1195(final String field13421) {
        this.Field13421 = field13421;
    }
    
    public String Method4812() {
        return this.Field13421;
    }
    
    public boolean Method4813() {
        return this.Field13421.equals("jar");
    }
    
    public boolean Method4814() {
        return this.Field13421.equals("class");
    }
    
    public boolean Method4815() {
        return this.Field13421.equals("intellij");
    }
    
    public static Class1195 Method4816() {
        final URL resource = Thread.currentThread().getContextClassLoader().getResource("com/kisman/cc");
        if (resource == null) {
            throw new Error("Impossible state reached");
        }
        if (resource.getProtocol().equals("file")) {
            return Class1195.Field13418;
        }
        if (resource.getProtocol().equals("jar")) {
            return Class1195.Field13416;
        }
        if (System.getProperty("java.class.path").contains("idea_rt.jar")) {
            return Class1195.Field13420;
        }
        throw new RuntimeException("Could not resolve the current environment");
    }
    
    static {
        Field13419 = "intellij";
        Field13417 = "class";
        Field13415 = "jar";
        Field13416 = new Class1195("jar");
        Field13418 = new Class1195("class");
        Field13420 = new Class1195("intellij");
    }
    
    private static String Method4817(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xE4B ^ 0x7A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
