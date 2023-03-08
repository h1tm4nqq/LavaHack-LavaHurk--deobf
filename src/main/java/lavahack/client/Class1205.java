//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1205
{
    Field13466("BEGIN_WAIT", 0, true), 
    Field13467("BEGIN", 1), 
    Field13468("CHUNK_WAIT", 2, true), 
    Field13469("CHUNK", 3), 
    Field13470("END_WAIT", 4, true), 
    Field13471("END", 5);
    
    private boolean Field13472;
    private static final Class1205[] Field13473;
    private String Field13474 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1205(final String name, final int ordinal) {
    }
    
    private Class1205(final String name, final int ordinal, final boolean field13472) {
        this.Field13472 = field13472;
    }
    
    public boolean Method4867() {
        return this.Field13472;
    }
    
    static {
        Field13473 = new Class1205[] { Class1205.Field13466, Class1205.Field13467, Class1205.Field13468, Class1205.Field13469, Class1205.Field13470, Class1205.Field13471 };
    }
    
    private static String Method4868(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5A4D ^ 0xCA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
