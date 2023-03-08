//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1120
{
    Field13036("Bedrock", 0), 
    Field13037("Obsidian", 1), 
    Field13038("Mix", 2);
    
    private static final Class1120[] Field13039;
    private int Field13040;
    
    private Class1120(final String name, final int ordinal) {
    }
    
    static {
        Field13039 = new Class1120[] { Class1120.Field13036, Class1120.Field13037, Class1120.Field13038 };
    }
    
    private static String Method4568(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1267 ^ 0x0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
