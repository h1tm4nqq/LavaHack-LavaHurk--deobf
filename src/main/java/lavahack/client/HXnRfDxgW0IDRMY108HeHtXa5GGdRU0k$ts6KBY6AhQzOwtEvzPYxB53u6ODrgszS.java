/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS {
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
        int n = (int)-294821860L ^ 0xEE6D601C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-345311939L ^ 0xEB6AF5C2);
            int n2 = (int)-1500618994L ^ 0xA68E5FB9;
            cArray2[n] = (char)(cArray[n] ^ (((int)-88137757L ^ 0xFABF1C7C) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

