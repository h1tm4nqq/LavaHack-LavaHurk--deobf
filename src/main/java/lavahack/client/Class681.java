//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public abstract class Class681 extends Class1357
{
    private int Field10888;
    
    public void Method2870(final Class1260 class1260) throws Class23 {
        if (class1260 instanceof Class1446 && (class1260.Method1614() || class1260.Method1615())) {
            throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
        }
        if (class1260 instanceof Class929 && (class1260.Method1613() || class1260.Method1614() || class1260.Method1615())) {
            throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
        }
    }
    
    private static String Method2875(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6FBA ^ 0xDA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
