/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class1566 {
    public static final String Field15297;
    public static final String Field15298;
    public static final String Field15299;
    public static final String Field15300;
    public static final String Field15301;
    public static final String Field15302;
    public static final String Field15303;
    public static final String Field15304;
    public static final String Field15305;
    public static final String Field15306;
    public static final String Field15307;
    public static final String Field15308;
    public static final String Field15309;
    public static final String Field15310;
    public static final String Field15311;
    public static final String Field15312;
    public static final String Field15313;
    public static final String Field15314;
    public static final String Field15315;
    public static final String Field15316;
    private String Field15317 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field15316 = "schematica.gui.materialdump";
        Field15315 = "schematica.gui.material";
        Field15314 = "schematica.gui.materialmissing";
        Field15313 = "schematica.gui.materialavailable";
        Field15312 = "schematica.gui.materialamount";
        Field15311 = "schematica.gui.materialname";
        Field15310 = "schematica.gui.";
        Field15309 = "schematica.gui.rotate";
        Field15308 = "schematica.gui.flip";
        Field15307 = "schematica.gui.movehere";
        Field15306 = "schematica.gui.show";
        Field15305 = "schematica.gui.hide";
        Field15304 = "schematica.gui.below";
        Field15303 = "schematica.gui.layers";
        Field15302 = "schematica.gui.all";
        Field15301 = "schematica.gui.unload";
        Field15300 = "schematica.gui.operations";
        Field15299 = "schematica.gui.printer";
        Field15298 = "schematica.gui.materials";
        Field15297 = "schematica.gui.moveschematic";
    }

    private static String Method6162(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 197;
            cArray2[n] = (char)(cArray[n] ^ (0x369A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

