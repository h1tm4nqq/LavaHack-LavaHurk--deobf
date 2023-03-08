//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1357 implements Class899
{
    private String Field14185 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method2866(final Class1260 class1260) throws Class23 {
    }
    
    @Override
    public void Method2867(final Class1260 class1260) {
    }
    
    @Override
    public boolean Method2868(final String s) {
        return true;
    }
    
    @Override
    public boolean Method2869(final String s) {
        return true;
    }
    
    @Override
    public void Method2870(final Class1260 class1260) throws Class23 {
        if (class1260.Method1613() || class1260.Method1614() || class1260.Method1615()) {
            throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
        }
    }
    
    @Override
    public String Method2871() {
        return "";
    }
    
    @Override
    public String Method2872() {
        return "";
    }
    
    @Override
    public Class899 Method2873() {
        return new Class1357();
    }
    
    @Override
    public void Method2874() {
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
    
    private static String Method2875(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2A3A ^ 0x35));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
