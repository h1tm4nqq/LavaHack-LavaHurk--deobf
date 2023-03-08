//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.viaversion.viabackwards.api.*;
import java.io.*;
import java.util.logging.*;

public class Class245 implements ViaBackwardsPlatform
{
    private final File Field9074;
    private String Field9075 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class245(final File parent) {
        this.init(this.Field9074 = new File(parent, "ViaBackwards"));
    }
    
    public Logger getLogger() {
        return Class1979.Method7320().Method7322();
    }
    
    public void disable() {
    }
    
    public boolean isOutdated() {
        return false;
    }
    
    public File getDataFolder() {
        return new File(this.Field9074, "config.yml");
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2CA5 ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
