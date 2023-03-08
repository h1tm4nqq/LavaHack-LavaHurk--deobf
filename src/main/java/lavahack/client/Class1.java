//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public class Class1 implements Class172
{
    private byte[] Field7824;
    private TreeMap Field7825;
    private int Field7826;
    
    public Class1() {
        this.Field7825 = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
    }
    
    @Override
    public Iterator Method1() {
        return Collections.unmodifiableSet(this.Field7825.keySet()).iterator();
    }
    
    @Override
    public String Method2(final String key) {
        final String s = this.Field7825.get(key);
        if (s == null) {
            return "";
        }
        return s;
    }
    
    @Override
    public byte[] Method4() {
        return this.Field7824;
    }
    
    @Override
    public void Method5(final byte[] field7824) {
        this.Field7824 = field7824;
    }
    
    @Override
    public void Method6(final String key, final String value) {
        this.Field7825.put(key, value);
    }
    
    @Override
    public boolean Method3(final String key) {
        return this.Field7825.containsKey(key);
    }
    
    private static String Method7(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2F94 ^ 0xE6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
