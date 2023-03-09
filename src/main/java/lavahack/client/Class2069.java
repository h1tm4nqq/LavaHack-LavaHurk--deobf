/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class2069 {
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 117;
            cArray2[n] = (char)(cArray[n] ^ (0x7A35 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

