/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field15076 = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Custom", (int)-409777018L ^ 0xE7934C86);
    public static final /* enum */ vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field15077 = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("SynsWithGui", (int)-807033344L ^ 0xCFE5A601);
    private static final vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field15078;
    private int Field15079;

    public static vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field15078.clone();
    }

    public static vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[((int)505339315L ^ 0x1E1EDDB2) << 1];
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)530364339 ^ (long)530364339)] = Field15076;
        vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)1488115540L ^ 0x58B2D755] = Field15077;
        Field15078 = vNwMQOkzIGVDlF5h3tsZOhvEUnRBZPDl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method6041(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1932772606 ^ (long)1932772606);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1131254404 ^ (long)-1131254397);
            int n2 = (int)((long)-576505456 ^ (long)-576505381);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2118640468 ^ (long)2118641447) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

