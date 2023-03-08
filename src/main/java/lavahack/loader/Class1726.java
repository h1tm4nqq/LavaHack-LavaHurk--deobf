//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

public class Class1726 implements Class1720
{
    private int Field15928;
    
    public void Method6571(final Class1926 class1926) throws Class902 {
    }
    
    public void Method6572(final Class1926 class1926) {
    }
    
    public boolean Method6573(final String s) {
        return true;
    }
    
    public boolean Method6574(final String s) {
        return true;
    }
    
    public void Method6575(final Class1926 class1926) throws Class902 {
        if (class1926.Method77() || class1926.Method78() || class1926.Method79()) {
            throw new Class939("bad rsv RSV1: " + class1926.Method77() + " RSV2: " + class1926.Method78() + " RSV3: " + class1926.Method79());
        }
    }
    
    public String Method6576() {
        return "";
    }
    
    public String Method6577() {
        return "";
    }
    
    public Class1720 Method6578() {
        return (Class1720)new Class1726();
    }
    
    public void Method6579() {
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass());
    }
    
    private static String Method6597(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1749 ^ 0xBF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
