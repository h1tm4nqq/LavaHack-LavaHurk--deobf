//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public class Class2045 extends Class1563
{
    public static HashMap Field17384;
    public char Field17385;
    public String Field17386;
    private String Field17387 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2045() {
        this.Field17385 = '-';
        this.Field17386 = "" + this.Field17385;
        this.Method7563();
    }
    
    public void Method7563() {
        this.Method7564((Class158)new Class1627());
        this.Method7564((Class158)new Class1490());
        this.Method7564((Class158)new Class150());
        this.Method7564((Class158)new Class140());
        this.Method7564((Class158)new Class1343());
        this.Method7564(new Class891());
        this.Method7564(new Class916());
        this.Method7564((Class158)new Class1962());
        this.Method7564(new Class485());
        this.Method7564(new Class554());
        this.Method7564(new Class995());
        this.Method7564(new Class276());
        this.Method7564(new Class809());
        this.Method7564((Class158)new Class1519());
        this.Method7564((Class158)new Class1628());
        this.Method7564(new Class375());
        this.Method7564((Class158)new Class1723());
        this.Method7564(new Class811());
        this.Method7564(new Class538());
        this.Method7564(new Class51());
        this.Method7564(new Class215());
        this.Method7564((Class158)new Class1986());
        this.Method7564(new Class813());
    }
    
    private void Method7564(final Class158 value) {
        Class2045.Field17384.put(value.Method442(), value);
    }
    
    public void Method7565(final String... a) {
        for (final Class158 class158 : Class2045.Field17384.values()) {
            if (class158.Method442().trim().equalsIgnoreCase(a[0].trim())) {
                class158.Method443(Arrays.toString(a), a);
                return;
            }
        }
        this.Method438("Cannot resolve internal command: §c" + a[0]);
    }
    
    public void Method7566(final String s) {
        final String trim = s.trim().substring(Character.toString(this.Field17385).length()).trim();
        final boolean contains = trim.trim().contains(" ");
        final String str = contains ? trim.split(" ")[0] : trim.trim();
        final String[] array = contains ? trim.substring(str.length()).trim().split(" ") : new String[0];
        for (final Class158 class158 : Class2045.Field17384.values()) {
            if (class158.Method442().trim().equalsIgnoreCase(str.trim())) {
                class158.Method443(trim, array);
                return;
            }
        }
        this.Method438("Cannot resolve internal command: §c" + str);
    }
    
    public void Method7567(final String s) {
        final boolean contains = s.trim().contains(" ");
        final String str = contains ? s.split(" ")[0] : s.trim();
        final String[] array = contains ? s.substring(str.length()).trim().split(" ") : new String[0];
        for (final Class158 class158 : Class2045.Field17384.values()) {
            if (class158.Method442().trim().equalsIgnoreCase(str.trim())) {
                class158.Method443(s, array);
                return;
            }
        }
        this.Method438("Cannot resolve internal command: §c" + str);
    }
    
    static {
        Class2045.Field17384 = new HashMap();
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4E9E ^ 0x58));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
