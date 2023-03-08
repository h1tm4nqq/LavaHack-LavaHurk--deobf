//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class813 extends Class158
{
    private static Class813 Field11476;
    private String Field11477;
    private boolean Field11478;
    private String Field11479 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class813() {
        super("music");
        this.Method445(new Class1368[] { (Class1368)new Class578((Class158)this), (Class1368)new Class428((Class158)this), (Class1368)new Class1565((Class158)this), (Class1368)new Class509((Class158)this), (Class1368)new Class2113((Class158)this), (Class1368)new Class1833((Class158)this), (Class1368)new Class2003((Class158)this) });
        this.Field11477 = "";
        this.Field11478 = false;
        Class813.Field11476 = this;
    }
    
    public void Method443(final String s, final String[] array) {
        if (array.length < 1) {
            return;
        }
        final Class1368 method444 = this.Method444(array[0]);
        if (method444 == null) {
            return;
        }
        method444.Method443(s, array);
    }
    
    public String Method447() {
        return "null";
    }
    
    public String Method448() {
        return "null";
    }
    
    private static String Method3419(final String[] array, final int n) {
        final StringBuilder sb = new StringBuilder(Method3420(n, array));
        for (int i = 0; i < array.length; ++i) {
            if (i == array.length - 1) {
                sb.append(array[i]);
            }
            else {
                sb.append(array[i]);
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    
    private static int Method3420(final int n, final String[] array) {
        int n2 = 0;
        for (int i = n; i < array.length; ++i) {
            n2 += array[i].length();
        }
        return n2 + array.length;
    }
    
    static boolean Method3421(final Class813 class813, final boolean field11478) {
        return class813.Field11478 = field11478;
    }
    
    static boolean Method3422(final Class813 class813) {
        return class813.Field11478;
    }
    
    static String Method3423(final String[] array, final int n) {
        return Method3419(array, n);
    }
    
    static Class813 Method3424() {
        return Class813.Field11476;
    }
    
    static String Method3425(final Class813 class813, final String field11477) {
        return class813.Field11477 = field11477;
    }
    
    static String Method3426(final Class813 class813) {
        return class813.Field11477;
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x50BE ^ 0x52));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
