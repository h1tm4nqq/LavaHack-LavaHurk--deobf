//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class242
{
    public static final String Field9052;
    public static final String Field9053;
    public static final String Field9054;
    public static final String Field9055;
    public static final String Field9056;
    public static final String Field9057;
    public static final String Field9058;
    public static final String Field9059;
    public static final String Field9060;
    public static final String Field9061;
    public static final String Field9062;
    public static final String Field9063;
    public static final String Field9064;
    public static final String Field9065;
    public static final String Field9066;
    public static final String Field9067;
    public static final String Field9068;
    private int Field9069;
    
    static {
        Field9068 = "ExtendedMetadata";
        Field9067 = "Entities";
        Field9066 = "TileEntities";
        Field9065 = "SchematicaMapping";
        Field9064 = "Height";
        Field9063 = "Length";
        Field9062 = "Width";
        Field9061 = "Add";
        Field9060 = "AddBlocks";
        Field9059 = "Data";
        Field9058 = "Blocks";
        Field9057 = "Icon";
        Field9056 = "Structure";
        Field9055 = "Alpha";
        Field9054 = "Classic";
        Field9053 = "Materials";
        Field9052 = "Schematic";
    }
    
    private static String Method1322(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x722E ^ 0x39));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
