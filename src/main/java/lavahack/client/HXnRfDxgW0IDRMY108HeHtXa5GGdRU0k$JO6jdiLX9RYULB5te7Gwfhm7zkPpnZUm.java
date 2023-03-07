/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm {
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

    private static String Method1322(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-475171991L ^ 0xE3AD7369;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2100551681 ^ (long)2100551934);
            int n2 = (int)((long)-1921294922 ^ (long)-1921294961);
            cArray2[n] = (char)(cArray[n] ^ (((int)721449100L ^ 0x2B00499B) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

