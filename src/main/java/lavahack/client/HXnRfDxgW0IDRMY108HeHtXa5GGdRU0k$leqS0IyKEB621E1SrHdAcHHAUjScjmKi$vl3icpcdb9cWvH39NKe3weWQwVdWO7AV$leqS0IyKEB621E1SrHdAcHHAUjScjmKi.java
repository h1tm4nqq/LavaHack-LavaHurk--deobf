/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    public static final String Field17443;
    public static final String Field17444;
    public static final String Field17445;
    private int Field17446;

    static {
        Field17445 = "schematica.command.replace.success";
        Field17444 = "schematica.command.replace.noSchematic";
        Field17443 = "schematica.command.replace.usage";
    }

    private static String Method7584(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1219756848 ^ (long)1219756848);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-184447920 ^ (long)-184447825);
            int n2 = (int)((long)-435191593 ^ (long)-435191646);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1706869414L ^ 0x9A43476F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

