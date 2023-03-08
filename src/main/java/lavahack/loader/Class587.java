//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.util.*;

public class Class587 implements Class1213
{
    private byte[] Field10491;
    private TreeMap Field10492;
    private String Field10493 = "TheKisDevs & LavaHack Development owns you";
    
    public Class587() {
        this.Field10492 = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
    }
    
    public Iterator Method179() {
        return Collections.unmodifiableSet(this.Field10492.keySet()).iterator();
    }
    
    public String Method180(final String key) {
        final String s = this.Field10492.get(key);
        if (s == null) {
            return "";
        }
        return s;
    }
    
    public byte[] Method182() {
        return this.Field10491;
    }
    
    public void Method183(final byte[] field10491) {
        this.Field10491 = field10491;
    }
    
    public void Method184(final String key, final String value) {
        this.Field10492.put(key, value);
    }
    
    public boolean Method181(final String key) {
        return this.Field10492.containsKey(key);
    }
    
    private static String Method185(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6DF1 ^ 0xB3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
