//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class1296
{
    public static final String Field13922;
    public static final String Field13923;
    public static final String Field13924;
    public static final String Field13925;
    private int Field13926;
    
    static {
        Field13925 = "schematica.message.invalidPropertyForBlock";
        Field13924 = "schematica.message.invalidProperty";
        Field13923 = "schematica.message.invalidBlock";
        Field13922 = "schematica.message.togglePrinter";
    }
    
    private static String Method5265(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x815 ^ 0x15));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
