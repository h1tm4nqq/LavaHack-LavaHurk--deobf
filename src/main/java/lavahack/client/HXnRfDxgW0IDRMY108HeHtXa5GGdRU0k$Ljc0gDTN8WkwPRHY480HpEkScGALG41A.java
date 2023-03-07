/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    public static final String Field10219;
    public static final String Field10220;
    public static final String Field10221;
    public static final String Field10222;
    public static final String Field10223;
    public static final String Field10224;
    public static final String Field10225;
    public static final String Field10226;
    public static final String Field10227;
    public static final String Field10228;
    public static final String Field10229;
    private String Field10230 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field10229 = "schematica.key.pickBlock";
        Field10228 = "schematica.key.moveHere";
        Field10227 = "schematica.key.printerToggle";
        Field10226 = "schematica.key.renderToggle";
        Field10225 = "schematica.key.layerToggle";
        Field10224 = "schematica.key.layerDec";
        Field10223 = "schematica.key.layerInc";
        Field10222 = "schematica.key.control";
        Field10221 = "schematica.key.save";
        Field10220 = "schematica.key.load";
        Field10219 = "schematica.key.category";
    }

    private static String Method2398(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-874685838L ^ 0xCBDD5A72;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-303438101L ^ 0xEDE9E614);
            int n2 = (int)((long)582712829 ^ (long)582712768) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1556675415 ^ (long)-1556672908) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

