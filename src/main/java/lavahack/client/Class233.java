/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class233 {
    public static final String Field9016;
    public static final String Field9017;
    public static final String Field9018;
    public static final String Field9019;
    public static final String Field9020;
    public static final String Field9021;
    private String Field9022 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field9021 = "schematica.gui.done";
        Field9020 = "schematica.gui.off";
        Field9019 = "schematica.gui.on";
        Field9018 = "schematica.gui.z";
        Field9017 = "schematica.gui.y";
        Field9016 = "schematica.gui.x";
    }

    private static String Method1302(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 183;
            cArray2[n] = (char)(cArray[n] ^ (0x73E0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

