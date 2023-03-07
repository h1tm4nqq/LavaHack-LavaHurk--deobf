/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field14905 = new zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Always", (int)((long)1456514396 ^ (long)1456514396));
    public static final /* enum */ zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field14906 = new zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Smart", (int)-1178447355L ^ 0xB9C25204);
    private static final zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field14907;
    private String Field14908 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field14907.clone();
    }

    public static zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)553386758 ^ (long)553386759) << 1];
        zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)-463755603L ^ 0xE45BA6AD] = Field14905;
        zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)209612214 ^ (long)209612215)] = Field14906;
        Field14907 = zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method5923(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-749115782L ^ 0xD359667A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1774630812L ^ 0x9639489B);
            int n2 = (int)((long)-122946458 ^ (long)-122946475) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1087379598L ^ 0x40D01A9F) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

