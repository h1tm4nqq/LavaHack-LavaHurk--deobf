//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class448
{
    Field9863("INVENTORY", 0), 
    Field9864("HOTBAR", 1), 
    Field9865("CRAFTING", 2);
    
    private static final Class448[] Field9866;
    private String Field9867 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class448(final String name, final int ordinal) {
    }
    
    static {
        Field9866 = new Class448[] { Class448.Field9863, Class448.Field9864, Class448.Field9865 };
    }
    
    private static String Method2146(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x30B6 ^ 0x44));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
