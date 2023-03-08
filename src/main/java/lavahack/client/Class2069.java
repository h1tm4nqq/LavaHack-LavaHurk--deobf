//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class2069
{
    public static final String Field17443;
    public static final String Field17444;
    public static final String Field17445;
    private int Field17446;
    
    static {
        Field17445 = "schematica.command.replace.success";
        Field17444 = "schematica.command.replace.noSchematic";
        Field17443 = "schematica.command.replace.usage";
    }
    
    private static String Method7584(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7A35 ^ 0x75));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
