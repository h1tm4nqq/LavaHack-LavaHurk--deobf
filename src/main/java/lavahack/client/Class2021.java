//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class2021 implements Class424
{
    private final Object[] Field17300;
    private final Class[] Field17301;
    private String Field17302 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2021(final Object[] field17300, final Class[] field17301) {
        this.Field17300 = field17300;
        this.Field17301 = field17301;
    }
    
    @Override
    public Object Method2054(final int n) {
        final Class clazz = this.Field17301[n];
        final Object obj = this.Field17300[n];
        final Class<?> class1 = obj.getClass();
        if (!clazz.isAssignableFrom(class1)) {
            throw new IllegalArgumentException("Argument types don't match: " + clazz.getName() + " " + class1.getName());
        }
        return clazz.cast(obj);
    }
    
    private static String Method7480(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1935 ^ 0xEE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
